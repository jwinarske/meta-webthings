# Copyright (C) 2020 Savoir-Faire Linux
#
# SPDX-License-Identifier: GPL-2.0-only
#
# This bbclass builds and installs an npm package to the target. The package
# sources files should be fetched in the calling recipe by using the SRC_URI
# variable. The ${S} variable should be updated depending of your fetcher.
#
# Usage:
#  SRC_URI = "..."
#  inherit npm_run_build
#
# ... for the rest see npm.bbclass


inherit npm

python npm_run_build_do_configure() {
    """
    Step one: configure the npm cache and the main npm package

    Every dependencies have been fetched and patched in the source directory.
    They have to be packed (this remove unneeded files) and added to the npm
    cache to be available for the next step.

    The main package and its associated manifest file and shrinkwrap file have
    to be configured to take into account these cached dependencies.

    [SV] copied from npm.bbclass and extended to run npm i, npm run build before 
    packing the main package.
    """
    import base64
    import copy
    import json
    import re
    import shlex
    import tempfile
    from bb.fetch2.npm import NpmEnvironment
    from bb.fetch2.npm import npm_unpack
    from bb.fetch2.npmsw import foreach_dependencies
    from bb.progress import OutOfProgressHandler

    bb.utils.remove(d.getVar("NPM_CACHE"), recurse=True)
    bb.utils.remove(d.getVar("NPM_PACKAGE"), recurse=True)

    env = NpmEnvironment(d, configs=npm_global_configs(d))

    def _npm_cache_add(tarball):
        """Run 'npm cache add' for a specified tarball"""
        cmd = "npm cache add %s" % shlex.quote(tarball)
        env.run(cmd)

    def _npm_integrity(tarball):
        """Return the npm integrity of a specified tarball"""
        sha512 = bb.utils.sha512_file(tarball)
        return "sha512-" + base64.b64encode(bytes.fromhex(sha512)).decode()

    def _npm_version(tarball):
        """Return the version of a specified tarball"""
        regex = r"-(\d+\.\d+\.\d+(-.*)?(\+.*)?)\.tgz"
        return re.search(regex, tarball).group(1)

    def _npmsw_dependency_dict(orig, deptree):
        """
        Return the sub dictionary in the 'orig' dictionary corresponding to the
        'deptree' dependency tree. This function follows the shrinkwrap file
        format.
        """
        ptr = orig
        for dep in deptree:
            if "dependencies" not in ptr:
                ptr["dependencies"] = {}
            ptr = ptr["dependencies"]
            if dep not in ptr:
                ptr[dep] = {}
            ptr = ptr[dep]
        return ptr

    # Manage the manifest file and shrinkwrap files
    orig_manifest_file = d.expand("${S}/package.json")
    orig_shrinkwrap_file = d.expand("${S}/npm-shrinkwrap.json")
    cached_manifest_file = d.expand("${NPM_PACKAGE}/package.json")
    cached_shrinkwrap_file = d.expand("${NPM_PACKAGE}/npm-shrinkwrap.json")

    with open(orig_manifest_file, "r") as f:
        orig_manifest = json.load(f)

    cached_manifest = copy.deepcopy(orig_manifest)
    cached_manifest.pop("dependencies", None)
    cached_manifest.pop("devDependencies", None)

    with open(orig_shrinkwrap_file, "r") as f:
        orig_shrinkwrap = json.load(f)

    cached_shrinkwrap = copy.deepcopy(orig_shrinkwrap)
    cached_shrinkwrap.pop("dependencies", None)

    # Manage the dependencies
    progress = OutOfProgressHandler(d, r"^(\d+)/(\d+)$")
    progress_total = 1 # also count the main package
    progress_done = 0

    def _count_dependency(name, params, deptree):
        nonlocal progress_total
        progress_total += 1

    def _cache_dependency(name, params, deptree):
        destsubdirs = [os.path.join("node_modules", dep) for dep in deptree]
        destsuffix = os.path.join(*destsubdirs)
        with tempfile.TemporaryDirectory() as tmpdir:
            # Add the dependency to the npm cache
            destdir = os.path.join(d.getVar("S"), destsuffix)
            tarball = npm_pack(env, destdir, tmpdir)
            _npm_cache_add(tarball)
            # Add its signature to the cached shrinkwrap
            dep = _npmsw_dependency_dict(cached_shrinkwrap, deptree)
            dep["version"] = _npm_version(tarball)
            dep["integrity"] = _npm_integrity(tarball)
            if params.get("dev", False):
                dep["dev"] = True
            # Display progress
            nonlocal progress_done
            progress_done += 1
            progress.write("%d/%d" % (progress_done, progress_total))

    dev = bb.utils.to_boolean(d.getVar("NPM_INSTALL_DEV"), False)
    foreach_dependencies(orig_shrinkwrap, _count_dependency, dev)
    foreach_dependencies(orig_shrinkwrap, _cache_dependency, dev)

    # Configure the main package
    with tempfile.TemporaryDirectory() as tmpdir:
        # install all (native) build dependencies:
        print("RUNNING NPM BUILD STEP %s" % os.getcwd() )
        ret = os.system("npm i")
        print("ret %d" % ret)
        # run build step:
        out = env.run("npm run build", args=[], workdir=d.getVar("S"))
        print(out)
        tarball = npm_pack(env, d.getVar("S"), tmpdir)
        npm_unpack(tarball, d.getVar("NPM_PACKAGE"), d)

    # Configure the cached manifest file and cached shrinkwrap file
    def _update_manifest(depkey):
        for name in orig_manifest.get(depkey, {}):
            version = cached_shrinkwrap["dependencies"][name]["version"]
            if depkey not in cached_manifest:
                cached_manifest[depkey] = {}
            cached_manifest[depkey][name] = version

    _update_manifest("dependencies")

    if dev:
        _update_manifest("devDependencies")

    with open(cached_manifest_file, "w") as f:
        json.dump(cached_manifest, f, indent=2)

    with open(cached_shrinkwrap_file, "w") as f:
        json.dump(cached_shrinkwrap, f, indent=2)
}

EXPORT_FUNCTIONS do_configure