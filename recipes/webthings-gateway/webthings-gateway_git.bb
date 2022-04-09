# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Web of Things gateway"
HOMEPAGE = "https://webthings.io"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   deb/debian/copyright
#   node_modules/@types/istanbul-lib-coverage/LICENSE
#   node_modules/@types/istanbul-lib-report/LICENSE
#   node_modules/@types/istanbul-reports/LICENSE
#   node_modules/@types/node/LICENSE
#   node_modules/@types/stack-utils/LICENSE
#   node_modules/@types/yargs/LICENSE
#   node_modules/@types/yargs-parser/LICENSE
#   node_modules/abbrev/LICENSE
#   node_modules/archiver-utils/node_modules/readable-stream/LICENSE
#   node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE
#   node_modules/asn1/LICENSE
#   node_modules/aws-sign2/LICENSE
#   node_modules/balanced-match/LICENSE.md
#   node_modules/bcrypt-pbkdf/LICENSE
#   node_modules/bcryptjs/LICENSE
#   node_modules/bl/LICENSE.md
#   node_modules/block-stream/LICENCE
#   node_modules/buffer-equal-constant-time/LICENSE.txt
#   node_modules/caseless/LICENSE
#   node_modules/colors/LICENSE
#   node_modules/config/LICENSE
#   node_modules/crc-32/LICENSE
#   node_modules/dashdash/LICENSE.txt
#   node_modules/detect-libc/LICENSE
#   node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/ecdsa-sig-formatter/LICENSE
#   node_modules/exit-on-epipe/LICENSE
#   node_modules/express-handlebars/LICENSE
#   node_modules/express-ws/LICENSE
#   node_modules/extsprintf/LICENSE
#   node_modules/forever-agent/LICENSE
#   node_modules/fs.realpath/LICENSE
#   node_modules/gateway-addon/LICENSE
#   node_modules/gateway-addon/schema/LICENSE
#   node_modules/glob/LICENSE
#   node_modules/http-proxy/LICENSE
#   node_modules/ieee754/LICENSE
#   node_modules/isstream/LICENSE.md
#   node_modules/jsbn/LICENSE
#   node_modules/json5/LICENSE.md
#   node_modules/jsprim/LICENSE
#   node_modules/lazystream/node_modules/readable-stream/LICENSE
#   node_modules/lodash.defaults/LICENSE
#   node_modules/lodash.difference/LICENSE
#   node_modules/lodash.flatten/LICENSE
#   node_modules/lodash.includes/LICENSE
#   node_modules/lodash.isboolean/LICENSE
#   node_modules/lodash.isinteger/LICENSE
#   node_modules/lodash.isnumber/LICENSE
#   node_modules/lodash.isplainobject/LICENSE
#   node_modules/lodash.isstring/LICENSE
#   node_modules/lodash.once/LICENSE
#   node_modules/lodash.union/LICENSE
#   node_modules/minizlib/LICENSE
#   node_modules/nan/LICENSE.md
#   node_modules/neo-async/LICENSE
#   node_modules/node-addon-api/LICENSE.md
#   node_modules/node-forge/LICENSE
#   node_modules/node-gyp/gyp/LICENSE
#   node_modules/node-pre-gyp/LICENSE
#   node_modules/oauth-sign/LICENSE
#   node_modules/printj/LICENSE
#   node_modules/printj/dist/LICENSE
#   node_modules/process-nextick-args/license.md
#   node_modules/qs/LICENSE
#   node_modules/rc/LICENSE.APACHE2
#   node_modules/rc/LICENSE.BSD
#   node_modules/readable-stream/LICENSE
#   node_modules/readdir-glob/LICENSE
#   node_modules/request/LICENSE
#   node_modules/request/node_modules/qs/LICENSE
#   node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/sax/LICENSE
#   node_modules/segfault-handler/LICENSE
#   node_modules/source-map/LICENSE
#   node_modules/sqlite3/LICENSE
#   node_modules/string_decoder/LICENSE
#   node_modules/string-format/LICENSE
#   node_modules/tar/node_modules/minizlib/LICENSE
#   node_modules/tunnel-agent/LICENSE
#   node_modules/tweetnacl/LICENSE
#   node_modules/uglify-js/LICENSE
#   node_modules/uri-js/LICENSE
#   node_modules/verror/LICENSE
#   node_modules/web-push/LICENSE
#   node_modules/winston-transport/node_modules/readable-stream/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & MIT & ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3 \
                    file://deb/debian/copyright;md5=282eedc40a1b64e253f54bca1ef40d25 \
                    file://node_modules/@babel/code-frame/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@babel/helper-validator-identifier/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@babel/highlight/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@dabh/diagnostics/LICENSE;md5=c306c558012a48012189a646e0635014 \
                    file://node_modules/@jest/console/LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1 \
                    file://node_modules/@jest/console/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@jest/console/node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@jest/console/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/@jest/console/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/@jest/console/node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@jest/console/node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@jest/types/LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1 \
                    file://node_modules/@jest/types/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@jest/types/node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@jest/types/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/@jest/types/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/@jest/types/node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@jest/types/node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/@types/istanbul-lib-coverage/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/istanbul-lib-report/LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5 \
                    file://node_modules/@types/istanbul-reports/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/node/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/stack-utils/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/yargs/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/@types/yargs-parser/LICENSE;md5=d4a904ca135bb7bc912156fee12726f0 \
                    file://node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/acme-client/LICENSE;md5=09d3fe23eb33adb12226cd1ac925e9c9 \
                    file://node_modules/ajv/LICENSE;md5=4973982316cdc12e988b814af2813df7 \
                    file://node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/archiver/LICENSE;md5=6de886fe021f2668e514b5d0e5629e58 \
                    file://node_modules/archiver-utils/LICENSE;md5=6a2fbc0984e7bbc2c40dd7f8f4c90906 \
                    file://node_modules/archiver-utils/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/are-we-there-yet/LICENSE;md5=039a23da29f56411e6d75d7b7bc9de13 \
                    file://node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/array-flatten/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/asn1.js/LICENSE;md5=e138bc0437c8b9e25b6609acbfc2f2ac \
                    file://node_modules/async/LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d \
                    file://node_modules/async-limiter/LICENSE;md5=4b83a79a0c223073786a52b5ece4619d \
                    file://node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/axios/LICENSE;md5=61ca8e74b70ea19443b95af4bd607999 \
                    file://node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/base64-js/LICENSE;md5=ea9187ca93cdc4f71219d1675712e908 \
                    file://node_modules/bcrypt-pbkdf/LICENSE;md5=aaf6ebb9d1b815768d32661e72bdd761 \
                    file://node_modules/bcryptjs/LICENSE;md5=d99a4f4253fea793a1256aef626aa6e5 \
                    file://node_modules/bindings/LICENSE.md;md5=471723f32516f18ef36e7ef63580e4a8 \
                    file://node_modules/bl/LICENSE.md;md5=455bc3781a009cf9a615e8622138814c \
                    file://node_modules/block-stream/LICENCE;md5=c695aba12d799c74e770d90e1c5d59aa \
                    file://node_modules/block-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/bluebird/LICENSE;md5=5dd221993f51ba714ddd208ff3b2ed01 \
                    file://node_modules/body-parser/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/body-parser/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/body-parser/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/buffer/LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0 \
                    file://node_modules/buffer-crc32/LICENSE;md5=b27a845c0955487ec9ca7b4ff7295b2b \
                    file://node_modules/buffer-equal-constant-time/LICENSE.txt;md5=effafd1e58e518742380952debd9b819 \
                    file://node_modules/busboy/LICENSE;md5=df3ad145c2acbfc4f246fa834a6675c7 \
                    file://node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/callsites/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/ci-info/LICENSE;md5=0c6fa9c682ce05a9a4da4f4a96cf42ec \
                    file://node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/color/LICENSE;md5=2fdebf76c074642a861bf45bf4a8258e \
                    file://node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/color-string/LICENSE;md5=330031db3ec2b47f6e9d7923b8e1f95b \
                    file://node_modules/colors/LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7 \
                    file://node_modules/colorspace/LICENSE.md;md5=c306c558012a48012189a646e0635014 \
                    file://node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/compress-commons/LICENSE;md5=51478cb9e7ab40d3d3616c3794ded96b \
                    file://node_modules/compressible/LICENSE;md5=ba0b78039307836d62c2c53de4218eb2 \
                    file://node_modules/compression/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/compression/node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/compression/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/compression/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/config/LICENSE;md5=bbda7dda495c6a1d2f2e4aae9ba17115 \
                    file://node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/content-disposition/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/content-type/LICENSE;md5=f4b767f006864f81a4901347fe4efdab \
                    file://node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/country-list/LICENSE;md5=48103e85546d83f90a7204f565b60cc9 \
                    file://node_modules/crc-32/LICENSE;md5=fe5367bf1b5a02e4baacc2567f485bf6 \
                    file://node_modules/crc32-stream/LICENSE;md5=51478cb9e7ab40d3d3616c3794ded96b \
                    file://node_modules/csv-parse/LICENSE;md5=7a5f7a182c5abef950bca5bd4f937320 \
                    file://node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/deep-extend/LICENSE;md5=827bb5781213ff1e9d2fe309bbfc0115 \
                    file://node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/delegates/License;md5=039225978c07bc42e8c0ef2f72b81c09 \
                    file://node_modules/depd/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/destroy/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/detect-libc/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://node_modules/dicer/LICENSE;md5=df3ad145c2acbfc4f246fa834a6675c7 \
                    file://node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/ecdsa-sig-formatter/LICENSE;md5=3e46e4245b62bb1fd440c50c12062a3d \
                    file://node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/enabled/LICENSE;md5=c306c558012a48012189a646e0635014 \
                    file://node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/escape-string-regexp/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/etag/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/eventemitter3/LICENSE;md5=4089df5313a98fce4a7ff1738a3e4f1a \
                    file://node_modules/exit-on-epipe/LICENSE;md5=6ce1149091029627236c6a2e5f9fd157 \
                    file://node_modules/express/LICENSE;md5=5513c00a5c36cd361da863dd9aa8875d \
                    file://node_modules/express/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/express/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/express-fileupload/LICENSE;md5=6c7e8d308b6178868ab5bf9a80e4a5ae \
                    file://node_modules/express-handlebars/LICENSE;md5=f4bf044f76c49f1141283dc9be4ed382 \
                    file://node_modules/express-handlebars/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/express-rate-limit/LICENSE;md5=d70516464ac6f67736e5d4d81b015d27 \
                    file://node_modules/express-ws/LICENSE;md5=3a133f552782a1e694ed13c57356190d \
                    file://node_modules/express-ws/node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/fast-deep-equal/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/fast-json-stable-stringify/LICENSE;md5=febe55307df96f60ad763842f5a8ca6f \
                    file://node_modules/fast-safe-stringify/LICENSE;md5=d06834a8b49bbad54ea80bd501ce4bdc \
                    file://node_modules/fecha/LICENSE;md5=f4f83e94071a71d564921579ec889591 \
                    file://node_modules/file-uri-to-path/LICENSE;md5=9513dc0b97137379cfabc81b60889174 \
                    file://node_modules/finalhandler/LICENSE;md5=b506956e5cbfbe0d04f8a5c40107ec89 \
                    file://node_modules/finalhandler/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/finalhandler/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/find/LICENSE;md5=38895c72a816781304e33d02980fef96 \
                    file://node_modules/fn.name/LICENSE;md5=d9584417fe22ac64739ce9eb464ef34c \
                    file://node_modules/follow-redirects/LICENSE;md5=2913574e921aefe1275cd5864b4f9b66 \
                    file://node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/forwarded/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/fresh/LICENSE;md5=373c2cf0978b37e434394a43b4cbbdb4 \
                    file://node_modules/fs-constants/LICENSE;md5=0033175ba371b569c73d23fd726c37e8 \
                    file://node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/fstream/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/fstream/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/gateway-addon/LICENSE;md5=9741c346eef56131163e13b9db1241b3 \
                    file://node_modules/gateway-addon/schema/LICENSE;md5=9741c346eef56131163e13b9db1241b3 \
                    file://node_modules/gauge/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/glob/LICENSE;md5=c727d36f28f2762b1011dd483aa1a191 \
                    file://node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://node_modules/handlebars/LICENSE;md5=99f14a0ee149e3c9d7b9a335d73c908f \
                    file://node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/har-validator/LICENSE;md5=6f7daec5e5143ffeb21745646b425ab2 \
                    file://node_modules/har-validator/node_modules/ajv/LICENSE;md5=4973982316cdc12e988b814af2813df7 \
                    file://node_modules/har-validator/node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/has-unicode/LICENSE;md5=2bab5b1c26e9c44fc4e489bb98cfb196 \
                    file://node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/http-errors/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/http-proxy/LICENSE;md5=764f642d46a24a68a7ef5e320b0a9a69 \
                    file://node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/ieee754/LICENSE;md5=56c3be003027d64d24ca6b69a2612f2f \
                    file://node_modules/ignore-walk/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/ip-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/ipaddr.js/LICENSE;md5=88f60a4b6e44cb849b5d907a7664c0ef \
                    file://node_modules/is-arrayish/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://node_modules/is-ci/LICENSE;md5=0c6fa9c682ce05a9a4da4f4a96cf42ec \
                    file://node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/is-stream/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/isexe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/jest-message-util/LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1 \
                    file://node_modules/jest-message-util/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-message-util/node_modules/braces/LICENSE;md5=ccdc0959f67943eb090f7e7c299621af \
                    file://node_modules/jest-message-util/node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-message-util/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/jest-message-util/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/jest-message-util/node_modules/fill-range/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/jest-message-util/node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-message-util/node_modules/is-number/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/jest-message-util/node_modules/micromatch/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/jest-message-util/node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-message-util/node_modules/to-regex-range/LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9 \
                    file://node_modules/jest-util/LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1 \
                    file://node_modules/jest-util/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-util/node_modules/braces/LICENSE;md5=ccdc0959f67943eb090f7e7c299621af \
                    file://node_modules/jest-util/node_modules/chalk/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-util/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/jest-util/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/jest-util/node_modules/fill-range/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/jest-util/node_modules/has-flag/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-util/node_modules/is-number/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/jest-util/node_modules/micromatch/LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b \
                    file://node_modules/jest-util/node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/jest-util/node_modules/to-regex-range/LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9 \
                    file://node_modules/js-tokens/LICENSE;md5=1d63bea73a26ffaf5e964ce74d3b83a5 \
                    file://node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/json-schema-traverse/LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b \
                    file://node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/json5/LICENSE.md;md5=d80f2808a405d641840b50a06f80e93c \
                    file://node_modules/jsonwebtoken/LICENSE;md5=c72fbd14008b582a9b8b9889460e8b31 \
                    file://node_modules/jsonwebtoken/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/jwa/LICENSE;md5=0d71cb15a801bf0e61cb2db5ba63dc6a \
                    file://node_modules/jws/LICENSE;md5=0d71cb15a801bf0e61cb2db5ba63dc6a \
                    file://node_modules/kuler/LICENSE;md5=07760fd1a905b41fefdc3763afb5dca5 \
                    file://node_modules/lazystream/LICENSE-MIT;md5=44d6d25a5dd108a624f4edf4c5e7c2a1 \
                    file://node_modules/lazystream/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/lodash.defaults/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lodash.difference/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lodash.flatten/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lodash.includes/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lodash.isboolean/LICENSE;md5=3229b60739f3d575a1e683f9d74102ea \
                    file://node_modules/lodash.isinteger/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lodash.isnumber/LICENSE;md5=3229b60739f3d575a1e683f9d74102ea \
                    file://node_modules/lodash.isplainobject/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lodash.isstring/LICENSE;md5=3229b60739f3d575a1e683f9d74102ea \
                    file://node_modules/lodash.once/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/lodash.union/LICENSE;md5=a3b2b7770df62392c164de4001b59f8f \
                    file://node_modules/logform/LICENSE;md5=69464058e29d977cf9b282e9d8a749e8 \
                    file://node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/lru-cache/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/media-typer/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/merge-descriptors/LICENSE;md5=aaf57ba8c5c9bf256fea7e943991a81a \
                    file://node_modules/methods/LICENSE;md5=c16a7dd9f946172f07086576d135d9d3 \
                    file://node_modules/mime/LICENSE;md5=8e8ea2ad138ce468f8570a0edbadea65 \
                    file://node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/minimalistic-assert/LICENSE;md5=d4e9cb27a3915b014b1f4c9c7d21912b \
                    file://node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/mkdirp/LICENSE;md5=f653359cc2be3ff55aa601d58d84c808 \
                    file://node_modules/moment/LICENSE;md5=397bb5fedab22612d8d69f1458a9321e \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/nan/LICENSE.md;md5=e6270b7774528599f2623a4aeb625829 \
                    file://node_modules/ncp/LICENSE.md;md5=9bf7541c2b42385117669c2b9ba8673a \
                    file://node_modules/needle/license.txt;md5=2fd561ba82cb42a5a9304f08b2506da4 \
                    file://node_modules/needle/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://node_modules/neo-async/LICENSE;md5=7996c7c8d89624a025e40e8b614de7e3 \
                    file://node_modules/nocache/LICENSE;md5=ed097214de2558954047ee5240f56290 \
                    file://node_modules/node-addon-api/LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a \
                    file://node_modules/node-fetch/LICENSE.md;md5=89fabe2fb10f72e48c2b3be506237d1e \
                    file://node_modules/node-forge/LICENSE;md5=3468e584d830bfb0ffd2d0af6e129136 \
                    file://node_modules/node-getopt/LICENSE-MIT;md5=33c74970d629510877c5d84a04100ca2 \
                    file://node_modules/node-gyp/LICENSE;md5=694e396551033371686c80d3a1a69e88 \
                    file://node_modules/node-gyp/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/node-gyp/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-gyp/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-gyp/node_modules/tar/LICENSE;md5=34c65f5b9b91f31827910d3b54bd6497 \
                    file://node_modules/node-gyp/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-gyp/gyp/LICENSE;md5=ab828cb8ce4c62ee82945a11247b6bbd \
                    file://node_modules/node-pre-gyp/LICENSE;md5=7e13c3cf883a44ebcc74a8f568c0f6fb \
                    file://node_modules/node-pre-gyp/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/node-pre-gyp/node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/node-pre-gyp/node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/normalize-path/LICENSE;md5=ccdc0959f67943eb090f7e7c299621af \
                    file://node_modules/npm-bundled/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/npm-normalize-package-bin/LICENSE;md5=89966567781ee3dc29aeca2d18a59501 \
                    file://node_modules/npm-packlist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/npmlog/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/object-hash/LICENSE;md5=5cdb72856f26dc0bd5700bad915275c0 \
                    file://node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/on-headers/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/one-time/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/os-homedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/os-tmpdir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/parseurl/LICENSE;md5=e7842ed4f188e53e53c3e8d9c4807e89 \
                    file://node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/path-to-regexp/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/performance-now/license.txt;md5=a07ae1b6dc33215d89a1281ee71c863c \
                    file://node_modules/picomatch/LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4 \
                    file://node_modules/pretty-format/LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1 \
                    file://node_modules/pretty-format/node_modules/ansi-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/pretty-format/node_modules/ansi-styles/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/pretty-format/node_modules/color-convert/LICENSE;md5=9bdadfc9fbb3ab8d5a6d591bdbd52811 \
                    file://node_modules/pretty-format/node_modules/color-name/LICENSE;md5=d301869b39e08b33665b7c4f16b8e41d \
                    file://node_modules/printj/LICENSE;md5=603da8c86614f63539f44d25b3a96b1c \
                    file://node_modules/printj/dist/LICENSE;md5=603da8c86614f63539f44d25b3a96b1c \
                    file://node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/promisepipe/LICENSE;md5=4f9309b2301792a6f3ca243e0d91ee6a \
                    file://node_modules/proxy-addr/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/psl/LICENSE;md5=2425d288296fae32e27553694ff40294 \
                    file://node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/range-parser/LICENSE;md5=d4246fb961a4f121eef5ffca47f0b010 \
                    file://node_modules/raw-body/LICENSE;md5=c970d30155ebbdb1903e6de8c0666e18 \
                    file://node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/react-is/LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1 \
                    file://node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/readdir-glob/LICENSE;md5=1b68cff15294bac8380a9df9ab8fa90e \
                    file://node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/request/node_modules/tough-cookie/LICENSE;md5=7189377a5215f1211b70cf2b9754841e \
                    file://node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/require-from-string/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://node_modules/requires-port/LICENSE;md5=4310a14e1d911cc6e4b5a34dbcbeaddd \
                    file://node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/segfault-handler/LICENSE;md5=28bd6085dd0eeff5d83e729fa3f15d0f \
                    file://node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/send/LICENSE;md5=df2b0938eba0709b77ac937e2d552b7a \
                    file://node_modules/send/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/send/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/send/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/serve-static/LICENSE;md5=27b1707520b14d0bc890f4e75cd387b0 \
                    file://node_modules/set-blocking/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/simple-swizzle/LICENSE;md5=5db33c6d7c83b57f204826cb21400b88 \
                    file://node_modules/slash/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/source-map/LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44 \
                    file://node_modules/speakeasy/LICENSE;md5=0262a8caad8da54b2c0e6f1058fa7d70 \
                    file://node_modules/sqlite3/LICENSE;md5=79558839a9db3e807e4ae6f8cd100c1c \
                    file://node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/stack-trace/License;md5=9fbf93f7a763e64c0a30207b5693bf75 \
                    file://node_modules/stack-utils/license;md5=552ddb2d1f0113e2b206a1abb641e3ab \
                    file://node_modules/stack-utils/node_modules/escape-string-regexp/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/statuses/LICENSE;md5=36e2bc837ce69a98cc33a9e140d457e5 \
                    file://node_modules/streamsearch/LICENSE;md5=df3ad145c2acbfc4f246fa834a6675c7 \
                    file://node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/string-format/LICENSE;md5=8681301813a651ebb57080b755eac61f \
                    file://node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/supports-color/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/tar/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/fs-minipass/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar/node_modules/minipass/LICENSE;md5=ff53df3ad94e5c618e230ab49ce310fa \
                    file://node_modules/tar/node_modules/minizlib/LICENSE;md5=d8a0ca0c46bfa01db064fa836f550966 \
                    file://node_modules/tar/node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/tar-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/text-hex/LICENSE;md5=d699750183031d92d152d4fb1270b705 \
                    file://node_modules/tmp/LICENSE;md5=4502395b4fdb20719bf54bfb416efe5d \
                    file://node_modules/toidentifier/LICENSE;md5=1a261071a044d02eb6f2bb47f51a3502 \
                    file://node_modules/triple-beam/LICENSE;md5=6662ccc5390189c4606fb6b2f726360b \
                    file://node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/uglify-js/LICENSE;md5=00b45202695de5cd110bd3c2927a0da2 \
                    file://node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/uri-js/LICENSE;md5=3b55dad4a98748003b5b423477713da1 \
                    file://node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/utils-merge/LICENSE;md5=1cf0906082187f374cb9a63c54eb782c \
                    file://node_modules/uuid/LICENSE.md;md5=353e680cdafd96bf30131cbb7b14a6e8 \
                    file://node_modules/vary/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://node_modules/web-push/LICENSE;md5=5f80ba88bb10332531ec38de724dea4e \
                    file://node_modules/web-push/node_modules/jwa/LICENSE;md5=0d71cb15a801bf0e61cb2db5ba63dc6a \
                    file://node_modules/web-push/node_modules/jws/LICENSE;md5=0d71cb15a801bf0e61cb2db5ba63dc6a \
                    file://node_modules/wide-align/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/winston/LICENSE;md5=124783bb03d1b801c23d11f07b62be0a \
                    file://node_modules/winston-daily-rotate-file/LICENSE;md5=1e426b0dc7b8970a20158014d244faac \
                    file://node_modules/winston-transport/LICENSE;md5=05a0729dc3291972c7b9e521a99a3c1f \
                    file://node_modules/winston-transport/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/ws/LICENSE;md5=95833e8f03687308b0584a377b9e12b0 \
                    file://node_modules/yallist/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/zip-stream/LICENSE;md5=51478cb9e7ab40d3d3616c3794ded96b \
                    file://package.json;md5=c7f126ca1569de81f5db9ad8287294c8 \
                    file://node_modules/@babel/code-frame/package.json;md5=5e2312af997edd97628f843af2a02843 \
                    file://node_modules/@babel/helper-validator-identifier/package.json;md5=19012a1bb670c71efee0370edfd11ae1 \
                    file://node_modules/@babel/highlight/package.json;md5=da8cd3676c0980492806f06d1c98d79e \
                    file://node_modules/@dabh/diagnostics/package.json;md5=645ea576697798a17013dfa2a49ec9b0 \
                    file://node_modules/@fluent/bundle/package.json;md5=466bc80bca11acf4c2f3f9e777d1e089 \
                    file://node_modules/@fluent/dom/package.json;md5=ab2d6b0269012b53ab2dd1c2f4f30944 \
                    file://node_modules/@jest/console/node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/@jest/console/node_modules/chalk/package.json;md5=300316f2f886e93742252367296574eb \
                    file://node_modules/@jest/console/node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/@jest/console/node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/@jest/console/node_modules/has-flag/package.json;md5=636dbe2c8d513ad850070def501122bf \
                    file://node_modules/@jest/console/node_modules/supports-color/package.json;md5=9bd5f75e8324cc8e0b633c59f1c4b60b \
                    file://node_modules/@jest/console/package.json;md5=209aac1af36c408fcd2e86650dbdcdea \
                    file://node_modules/@jest/types/node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/@jest/types/node_modules/chalk/package.json;md5=300316f2f886e93742252367296574eb \
                    file://node_modules/@jest/types/node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/@jest/types/node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/@jest/types/node_modules/has-flag/package.json;md5=636dbe2c8d513ad850070def501122bf \
                    file://node_modules/@jest/types/node_modules/supports-color/package.json;md5=9bd5f75e8324cc8e0b633c59f1c4b60b \
                    file://node_modules/@jest/types/package.json;md5=3dc9bdfecba4d4c7292070e2d03e1d0f \
                    file://node_modules/@types/istanbul-lib-coverage/package.json;md5=0068d8acf05dd01ceea5215851961374 \
                    file://node_modules/@types/istanbul-lib-report/package.json;md5=07955ca9e16ce3f2597e559a31e4d008 \
                    file://node_modules/@types/istanbul-reports/package.json;md5=50a79be68c600b6ae66ba6db04b4096c \
                    file://node_modules/@types/node/package.json;md5=bf12ba0538286913a4e3a72d88a2ce5c \
                    file://node_modules/@types/stack-utils/package.json;md5=aa9d2f7ffd62f43054bc1cc63acc9363 \
                    file://node_modules/@types/yargs/package.json;md5=22553ba07d3ca483ef24308ac2eabf98 \
                    file://node_modules/@types/yargs-parser/package.json;md5=270c6358682b6ca9ac59f6bf36f997cd \
                    file://node_modules/abbrev/package.json;md5=09144e5559c19012a5ad2b1cb548f188 \
                    file://node_modules/accepts/package.json;md5=e6b1f36c7fc3d4a53c34db28ed1fc745 \
                    file://node_modules/acme-client/package.json;md5=ede78405ffe41d24a4b01d1961bb7835 \
                    file://node_modules/agent-base/package.json;md5=a42525d35ca83a583af793fcb6780b56 \
                    file://node_modules/ajv/package.json;md5=f1bd43a223b5260fd60f5c112a9b783d \
                    file://node_modules/ansi-regex/package.json;md5=fbd3a8909a47de214c7288046091267c \
                    file://node_modules/ansi-styles/package.json;md5=50f97f15be9377b1110c7a68f76fff0f \
                    file://node_modules/aproba/package.json;md5=617442ed4770d06ac955969e7dcf7b98 \
                    file://node_modules/archiver/package.json;md5=b656d584f94d63b2a3e15ebeb6f72734 \
                    file://node_modules/archiver-utils/node_modules/readable-stream/package.json;md5=55d646ab9e50735393b18c874d0bd5ab \
                    file://node_modules/archiver-utils/package.json;md5=beb18d962a706c28d94b1a8f7c143a9c \
                    file://node_modules/are-we-there-yet/node_modules/readable-stream/package.json;md5=55d646ab9e50735393b18c874d0bd5ab \
                    file://node_modules/are-we-there-yet/package.json;md5=386ebd73fb9d607ee175b947082764ef \
                    file://node_modules/array-flatten/package.json;md5=cb1aa7f817100a03395dd0163bf6ebe9 \
                    file://node_modules/asn1/package.json;md5=0c5153fa7dfd857870bc28c3bacf921d \
                    file://node_modules/asn1.js/package.json;md5=a54dfbd54b4e617055d31ab92f33090a \
                    file://node_modules/assert-plus/package.json;md5=2b7930e340a2439c18ca9871c3dbb834 \
                    file://node_modules/async/package.json;md5=4352ed13333ee61619386feb1caf0bfd \
                    file://node_modules/async-limiter/package.json;md5=1023ed343652ddb4c1948df4c789fe8a \
                    file://node_modules/asynckit/package.json;md5=e1fcbbcbd664b4b2966883624fbad801 \
                    file://node_modules/aws-sign2/package.json;md5=f4b8ff99a798371a0647cdc9243723f6 \
                    file://node_modules/aws4/package.json;md5=d96c3cfaa1a1fe6cd87f289f5bff1cd5 \
                    file://node_modules/axios/package.json;md5=70bc2fc5ed5c0cd71876cb370937e20d \
                    file://node_modules/backo2/package.json;md5=e7a61da3e21b35ea61a828f7939198a6 \
                    file://node_modules/balanced-match/package.json;md5=a2181cb8cab70df2084e1bdce79a389b \
                    file://node_modules/base32.js/package.json;md5=f1d5026002d1cd748f3391590903caf1 \
                    file://node_modules/base64-js/package.json;md5=8c3c32ad06db4e10d96a32653de4f1c3 \
                    file://node_modules/bcrypt-pbkdf/package.json;md5=1950748932ca316ec58675f625809860 \
                    file://node_modules/bcryptjs/package.json;md5=e52225ac53aa6a08a7f2decc0d08baa1 \
                    file://node_modules/bindings/package.json;md5=17005447df8440e0e386849b8fa2b682 \
                    file://node_modules/bl/package.json;md5=1e2af87cfe880f938540dc16bed7982b \
                    file://node_modules/block-stream/package.json;md5=7b6a3c62899e98e27be3e9f68e778b91 \
                    file://node_modules/bluebird/package.json;md5=b553710e014be64b2dd8e8704279e93d \
                    file://node_modules/bn.js/package.json;md5=12cb21017598c83d4a5acdbd277f3499 \
                    file://node_modules/body-parser/node_modules/debug/package.json;md5=71a7656944ffe50cc27ebe02491ae49b \
                    file://node_modules/body-parser/node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/body-parser/package.json;md5=d733814bad2ae132f08ab3d55c77b6a8 \
                    file://node_modules/brace-expansion/package.json;md5=effd91994b1b7ddb8a33060ad4541e6a \
                    file://node_modules/buffer/package.json;md5=3220969a7bbdae1bc07082db98d43627 \
                    file://node_modules/buffer-crc32/package.json;md5=92a03a851f46c2053f1eda652d4d0193 \
                    file://node_modules/buffer-equal-constant-time/package.json;md5=ec70058745250afbc7f41c2c982da8ea \
                    file://node_modules/busboy/package.json;md5=bdb1b8a88038476a60a1778aac1a39df \
                    file://node_modules/bytes/package.json;md5=bb3cba8a8a870732b7eee0d2e4e29955 \
                    file://node_modules/cached-iterable/package.json;md5=b5e999918fc6e4b8a9e69da1120236dc \
                    file://node_modules/callsites/package.json;md5=895020d0e9d1e1993267a76b1c8732ca \
                    file://node_modules/caseless/package.json;md5=0b6c0d646d6be3e0439fd5c4cb50eb31 \
                    file://node_modules/chalk/package.json;md5=a21f60da989d4bf1cd5396df6c638a98 \
                    file://node_modules/chownr/package.json;md5=d01f1cdebdcc543145948a7070c8d012 \
                    file://node_modules/ci-info/package.json;md5=a9abb9620c493e5e0f2a1b1e17c74fa5 \
                    file://node_modules/code-point-at/package.json;md5=4e85e8a583ebac72e2065d9e576c92cf \
                    file://node_modules/color/package.json;md5=47b75c4ea12fe229f5da94f1751d3059 \
                    file://node_modules/color-convert/package.json;md5=51a202f6ab9b016f0f7219701f1f5e70 \
                    file://node_modules/color-name/package.json;md5=7599aecb8597ca603c711d49a83dab59 \
                    file://node_modules/color-string/package.json;md5=1062fbe82c4a849dfcd294d202c74177 \
                    file://node_modules/colors/package.json;md5=4327d7f964260e081ec682385f046758 \
                    file://node_modules/colorspace/package.json;md5=487594af64f072e733ff7b3bc0eff67d \
                    file://node_modules/combined-stream/package.json;md5=089f95f5df2908028bdbbe545ad5c0e3 \
                    file://node_modules/compress-commons/package.json;md5=c78a15a84cfb9beddc1349043e49feae \
                    file://node_modules/compressible/package.json;md5=2173f7f51c8e806f8c5bc11cd00d8af5 \
                    file://node_modules/compression/node_modules/bytes/package.json;md5=9e7bba10f4b0350726852fd24893878c \
                    file://node_modules/compression/node_modules/debug/package.json;md5=71a7656944ffe50cc27ebe02491ae49b \
                    file://node_modules/compression/node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/compression/package.json;md5=598d1a58c041798fca939a833973a4ea \
                    file://node_modules/concat-map/package.json;md5=85d8a674998927862b17adef4aa6a7b1 \
                    file://node_modules/config/package.json;md5=4f93a911f1cd85f6108aa982756707df \
                    file://node_modules/console-control-strings/package.json;md5=501cc4421445f05407dd447de932f200 \
                    file://node_modules/content-disposition/package.json;md5=7dd4be647ccfcb92d9943e73b26afced \
                    file://node_modules/content-type/package.json;md5=138f1013d1de872220bf2a2f2f052660 \
                    file://node_modules/cookie/package.json;md5=995f6fbcc9e40fa3f539a51194665ac6 \
                    file://node_modules/cookie-signature/package.json;md5=076c53814237236a9d1aa999f33ee501 \
                    file://node_modules/core-util-is/package.json;md5=685b947d7cae341b1e6f305b205da7ae \
                    file://node_modules/country-list/package.json;md5=996b9995925a6a0393d1dd548de939c4 \
                    file://node_modules/crc-32/package.json;md5=691a556a19c3a4b6fcf7760e5b5f41ec \
                    file://node_modules/crc32-stream/package.json;md5=2292752efbaeb76c1bde7ebbe509a8d8 \
                    file://node_modules/csv-parse/package.json;md5=e337685bc3dbbc520a38363d1c8a2dc0 \
                    file://node_modules/dashdash/package.json;md5=0ffb1aad4da09fac3c64eb3c09d10c49 \
                    file://node_modules/debug/package.json;md5=d084346a689161b3c5a11df81c28acc4 \
                    file://node_modules/deep-extend/package.json;md5=843d8bcf451f015c3a6b3930e0b6eaee \
                    file://node_modules/delayed-stream/package.json;md5=cd5e299bb3405995d7e81ead42d4949d \
                    file://node_modules/delegates/package.json;md5=fa4a364036777c0cf422bee58a0c4e2d \
                    file://node_modules/depd/package.json;md5=b6682ec09424cb14ad83a252a6748f35 \
                    file://node_modules/destroy/package.json;md5=ea66becf61cc69aece23e86ea3caf921 \
                    file://node_modules/detect-libc/package.json;md5=32bbf729c7ec55592eda945fda7f36bf \
                    file://node_modules/dicer/package.json;md5=33b7e559bf4ad34ba8f70d72d1fc693f \
                    file://node_modules/ecc-jsbn/package.json;md5=0ee3b1b336a7d241844622b050681563 \
                    file://node_modules/ecdsa-sig-formatter/package.json;md5=14210a580bbbb9a97e92b2a44735d4a1 \
                    file://node_modules/ee-first/package.json;md5=3ed21090e07ef5dd57729a77c4291cb9 \
                    file://node_modules/enabled/package.json;md5=20a2de7f7b543585c7b543d6a818e9f7 \
                    file://node_modules/encodeurl/package.json;md5=453a9bb10c91e0ec44f305b14e30ce82 \
                    file://node_modules/end-of-stream/package.json;md5=36be3e35e3740830415138528c4237d4 \
                    file://node_modules/escape-html/package.json;md5=e9c758769fec9883d5ce3d30b8ee1047 \
                    file://node_modules/escape-string-regexp/package.json;md5=6050cf06c06dcb38dce670ff96b21aa9 \
                    file://node_modules/etag/package.json;md5=fec91cc11e50ee734c65c2d703db3884 \
                    file://node_modules/eventemitter3/package.json;md5=37a5a3630ee54fc3fbab2baf08d7c53e \
                    file://node_modules/exit-on-epipe/package.json;md5=46f33817d087eaa748d59ef1a0d60086 \
                    file://node_modules/express/node_modules/debug/package.json;md5=71a7656944ffe50cc27ebe02491ae49b \
                    file://node_modules/express/node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/express/package.json;md5=bf6c1ca718319e619a9ebd41d5cbef6d \
                    file://node_modules/express-fileupload/package.json;md5=51d90041e60713bbe9375a1ddea53604 \
                    file://node_modules/express-handlebars/node_modules/graceful-fs/package.json;md5=e6ed8ee5ea4fb97e55c3e6a02efbd294 \
                    file://node_modules/express-handlebars/package.json;md5=1b9442013b1f2c77d44671ae9c805686 \
                    file://node_modules/express-rate-limit/package.json;md5=ecb4fbc900c0c610e045baca38926149 \
                    file://node_modules/express-ws/node_modules/ws/package.json;md5=a1b3eac4b5c4b482498662b3ea9d9e12 \
                    file://node_modules/express-ws/package.json;md5=a8aca956634e2c3de31b55c4f4b9b58a \
                    file://node_modules/extend/package.json;md5=5074ec873b4010df5203d20e73e65246 \
                    file://node_modules/extsprintf/package.json;md5=7c02b29c15d45f83ee155dc101993c76 \
                    file://node_modules/fast-deep-equal/package.json;md5=da1199afd6b2d7a1eaa9e30acd35f4e6 \
                    file://node_modules/fast-json-stable-stringify/package.json;md5=903a31da36d2259011d342196a9b1265 \
                    file://node_modules/fast-safe-stringify/package.json;md5=fa356d91f6a46ebd0cad8db8af5d2597 \
                    file://node_modules/fecha/package.json;md5=619c5bcad0b5f12baec2a472fdce60cf \
                    file://node_modules/file-stream-rotator/package.json;md5=c686d2c0988b658b962ba90a8e82a4b4 \
                    file://node_modules/file-uri-to-path/package.json;md5=65f30030f0e7b2eff552eaabd8bb1fe1 \
                    file://node_modules/finalhandler/node_modules/debug/package.json;md5=71a7656944ffe50cc27ebe02491ae49b \
                    file://node_modules/finalhandler/node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/finalhandler/package.json;md5=65618bd839fed72de71aea141e19e568 \
                    file://node_modules/find/package.json;md5=e12ded1a6c7c79bfaca16e63d4aa00a8 \
                    file://node_modules/fn.name/package.json;md5=eca907cd517111a73f4ad09dfde4b1de \
                    file://node_modules/follow-redirects/package.json;md5=1190d2057a0a823a0075f167d931cd7f \
                    file://node_modules/forever-agent/package.json;md5=71ca2080c34c1c0f241895916e86b3a9 \
                    file://node_modules/forwarded/package.json;md5=43c511e831e953c713743c5fc67aa990 \
                    file://node_modules/fresh/package.json;md5=193849cf18966de2814f4f6e85740069 \
                    file://node_modules/fs-constants/package.json;md5=4e7713db1ace1f383b9f5b99e37c799b \
                    file://node_modules/fs-minipass/package.json;md5=8b4599fada2a56483e99b98b5348361a \
                    file://node_modules/fs.realpath/package.json;md5=3aa3d67ce378e330e293496dd3b9a506 \
                    file://node_modules/fstream/node_modules/mkdirp/package.json;md5=3b5ba3c4a04a8b0520bd0d392cf1c48f \
                    file://node_modules/fstream/node_modules/rimraf/package.json;md5=c69fc8897c842f559f37a4e02455e90a \
                    file://node_modules/fstream/package.json;md5=b3f1aaa7913ab33da3fa06812782bfd7 \
                    file://node_modules/gateway-addon/package.json;md5=20275b010c708c007b99888c117f1450 \
                    file://node_modules/gauge/package.json;md5=ea229b587fee704faaf9431b96678324 \
                    file://node_modules/getpass/package.json;md5=37a5fcbc8b99a0676c8f83fc7169fe4a \
                    file://node_modules/glob/package.json;md5=7d0807efb6353ee0196cabbacbf210d7 \
                    file://node_modules/glob-to-regexp/package.json;md5=d693e899e2b53c31e861d95f340c5c29 \
                    file://node_modules/graceful-fs/package.json;md5=b31cf400f270df9d7173307ac050e826 \
                    file://node_modules/handlebars/package.json;md5=b3020bbac6402603504ff73f2cf49f41 \
                    file://node_modules/har-schema/package.json;md5=54d2c0fffb398fed596e246ee7a19829 \
                    file://node_modules/har-validator/node_modules/ajv/package.json;md5=bc185fb380e6969e7ae607dde40bc9c3 \
                    file://node_modules/har-validator/node_modules/json-schema-traverse/package.json;md5=e706b186146b3f00005442861f98c091 \
                    file://node_modules/har-validator/package.json;md5=ed1b063932b04bc4dde19bd9293415de \
                    file://node_modules/has-flag/package.json;md5=73cc8d1e96c19ce85a7abb8f9468a86c \
                    file://node_modules/has-unicode/package.json;md5=f14043c8a5d6df10d3671d83073d6883 \
                    file://node_modules/http_ece/package.json;md5=df0b5fec0eb72763dbe5f9710e95d002 \
                    file://node_modules/http-errors/node_modules/inherits/package.json;md5=74b2e77f5c27cdb14784f7f2512a1918 \
                    file://node_modules/http-errors/package.json;md5=18637d36709871c643fdd58b14332bf3 \
                    file://node_modules/http-proxy/package.json;md5=a65a0f1926ffbacf791a50d26ee2b718 \
                    file://node_modules/http-signature/package.json;md5=72db3ad4de36b5604debdf9e7bb78ff9 \
                    file://node_modules/https-proxy-agent/package.json;md5=06df0ea6fa292d84919d77ee3c130fdf \
                    file://node_modules/iconv-lite/package.json;md5=a8b97f25878ddc5419a9afe173037035 \
                    file://node_modules/ieee754/package.json;md5=c99ba1a776f9fbc9e23b4f0f7bfb7b0d \
                    file://node_modules/ignore-walk/package.json;md5=3c6476acb2be5ac3c88cdcca5b19623b \
                    file://node_modules/inflight/package.json;md5=85ba25624378c23e1ee9b33d3d103bf0 \
                    file://node_modules/inherits/package.json;md5=f73908dab55d4259f3ed052ce9fb2fbb \
                    file://node_modules/ini/package.json;md5=b613cca593420ef7097ea40ac8705690 \
                    file://node_modules/ip-regex/package.json;md5=9f935d92510dd5ff83843f759b9f09d6 \
                    file://node_modules/ipaddr.js/package.json;md5=17bc176c8d78f76c5e70cad7ba16a598 \
                    file://node_modules/is-arrayish/package.json;md5=f36e90dfef7a25040592b87ce36aba47 \
                    file://node_modules/is-ci/package.json;md5=1f51093fe4865ae9449536af4c4f3c39 \
                    file://node_modules/is-fullwidth-code-point/package.json;md5=6bd5a684a5081f2d099cb800cf53ebd6 \
                    file://node_modules/is-stream/package.json;md5=6eeac477476e9abde80201885e1b322d \
                    file://node_modules/is-typedarray/package.json;md5=018697ad65588671c2bdd7b3ec2bdef3 \
                    file://node_modules/isarray/package.json;md5=a490f11007b2cc9d19c4a250592c2e71 \
                    file://node_modules/isexe/package.json;md5=b7340828ee0e123814f9b855953de714 \
                    file://node_modules/isstream/package.json;md5=2c74d78c5b8e181e78e90b9a3e2fd0e0 \
                    file://node_modules/jest-message-util/node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/jest-message-util/node_modules/braces/package.json;md5=c92c38c5b1f115ca8c5e303328be6309 \
                    file://node_modules/jest-message-util/node_modules/chalk/package.json;md5=300316f2f886e93742252367296574eb \
                    file://node_modules/jest-message-util/node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/jest-message-util/node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/jest-message-util/node_modules/fill-range/package.json;md5=8943ae39664d5980b96ba476c006dd77 \
                    file://node_modules/jest-message-util/node_modules/has-flag/package.json;md5=636dbe2c8d513ad850070def501122bf \
                    file://node_modules/jest-message-util/node_modules/is-number/package.json;md5=41b5221636f534d987259e37635e1dd6 \
                    file://node_modules/jest-message-util/node_modules/micromatch/package.json;md5=78af05f6feafec13f6de437ce6ebf254 \
                    file://node_modules/jest-message-util/node_modules/supports-color/package.json;md5=9bd5f75e8324cc8e0b633c59f1c4b60b \
                    file://node_modules/jest-message-util/node_modules/to-regex-range/package.json;md5=31ccdd7dc49cec37d8982159ba163275 \
                    file://node_modules/jest-message-util/package.json;md5=678f365522b907ef14bbfae65fbb459e \
                    file://node_modules/jest-util/node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/jest-util/node_modules/braces/package.json;md5=c92c38c5b1f115ca8c5e303328be6309 \
                    file://node_modules/jest-util/node_modules/chalk/package.json;md5=300316f2f886e93742252367296574eb \
                    file://node_modules/jest-util/node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/jest-util/node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/jest-util/node_modules/fill-range/package.json;md5=8943ae39664d5980b96ba476c006dd77 \
                    file://node_modules/jest-util/node_modules/has-flag/package.json;md5=636dbe2c8d513ad850070def501122bf \
                    file://node_modules/jest-util/node_modules/is-number/package.json;md5=41b5221636f534d987259e37635e1dd6 \
                    file://node_modules/jest-util/node_modules/micromatch/package.json;md5=78af05f6feafec13f6de437ce6ebf254 \
                    file://node_modules/jest-util/node_modules/supports-color/package.json;md5=9bd5f75e8324cc8e0b633c59f1c4b60b \
                    file://node_modules/jest-util/node_modules/to-regex-range/package.json;md5=31ccdd7dc49cec37d8982159ba163275 \
                    file://node_modules/jest-util/package.json;md5=ac51fe097bb8a2f5a3ea6da8981e4792 \
                    file://node_modules/js-tokens/package.json;md5=022ec03d76e85da58a8ad1134290dfdf \
                    file://node_modules/jsbn/package.json;md5=a10cd005c4727beb0ca9b4f9fb37b441 \
                    file://node_modules/json-schema/package.json;md5=52088871554be9185eff18969e96948a \
                    file://node_modules/json-schema-traverse/package.json;md5=dcdda7e5bfd069db9eb37f3e1db806a7 \
                    file://node_modules/json-stringify-safe/package.json;md5=184d1a71034cb154ad7d1abf0e64e3a0 \
                    file://node_modules/json5/package.json;md5=c3c6a43ea9349efac3c8024f34884207 \
                    file://node_modules/jsonwebtoken/node_modules/semver/package.json;md5=735f6ede2a644d292066a9813d8b9da6 \
                    file://node_modules/jsonwebtoken/package.json;md5=27131efbc22dd9d60ef475603788a63e \
                    file://node_modules/jsprim/package.json;md5=9e330579d00de959cda1726ea6aa37ef \
                    file://node_modules/jwa/package.json;md5=00e2afefa27a42fa7b224047eda0a256 \
                    file://node_modules/jws/package.json;md5=075bacb983d06d28c5fe2f9b39407747 \
                    file://node_modules/kuler/package.json;md5=97efa0f5b0bbbcd07f58897d57d80dec \
                    file://node_modules/lazystream/node_modules/readable-stream/package.json;md5=55d646ab9e50735393b18c874d0bd5ab \
                    file://node_modules/lazystream/package.json;md5=c4cc72d0e792e3ec3181c30cbbd20514 \
                    file://node_modules/lodash.defaults/package.json;md5=1a3537c1a0ac525c4ace038a2143e827 \
                    file://node_modules/lodash.difference/package.json;md5=15c7e81fc09ef78bad68b445df455e29 \
                    file://node_modules/lodash.flatten/package.json;md5=1bd34f9aca4227c756da839b676a4c45 \
                    file://node_modules/lodash.includes/package.json;md5=4fadd2fcb37fee6cd7462c7c9d470dde \
                    file://node_modules/lodash.isboolean/package.json;md5=adb6560d20cd7160c4a915c7ec4a0079 \
                    file://node_modules/lodash.isinteger/package.json;md5=d0167ec46012a051dc7fb76243480420 \
                    file://node_modules/lodash.isnumber/package.json;md5=46281a3c10becd10a4c3f2ccd59063dc \
                    file://node_modules/lodash.isplainobject/package.json;md5=c988afb08b8837c4f248ede46e40da30 \
                    file://node_modules/lodash.isstring/package.json;md5=82e6319d78e45d6cb259d4e6ee90d8e5 \
                    file://node_modules/lodash.once/package.json;md5=a905be0ff2f3ba0b83d5d03a95490e34 \
                    file://node_modules/lodash.union/package.json;md5=fc8dddd3819dbbec34bcc27bf5fe4e40 \
                    file://node_modules/logform/package.json;md5=eaf8540c244b5c77be79076506958b4c \
                    file://node_modules/lru-cache/node_modules/yallist/package.json;md5=b15d27bf2cf04083fef9389ce68aa620 \
                    file://node_modules/lru-cache/package.json;md5=5facce3b29b46c909e27bd642d950a3f \
                    file://node_modules/media-typer/package.json;md5=127ce4abeb265c6eef7b45540241ca91 \
                    file://node_modules/merge-descriptors/package.json;md5=570e06d8ce0167e07a32ba70fdd56795 \
                    file://node_modules/methods/package.json;md5=8a9cbead0f83bf845207ad21534dfdfa \
                    file://node_modules/mime/package.json;md5=624ef11f91e60b224942ff81b13d10c6 \
                    file://node_modules/mime-db/package.json;md5=eab5056a3c4629072366c38ff6ae090f \
                    file://node_modules/mime-types/package.json;md5=b25a770f73509afc540ddf988ff226bc \
                    file://node_modules/minimalistic-assert/package.json;md5=06815cdb14ee48f498926fd51f1d6770 \
                    file://node_modules/minimatch/package.json;md5=b763d93b18d070a6449399d2e92d8c32 \
                    file://node_modules/minimist/package.json;md5=84505571ecc56b8071068f44de7c79b2 \
                    file://node_modules/minipass/package.json;md5=06016f1eb0e1b95822eabfc1b701b2e5 \
                    file://node_modules/minizlib/package.json;md5=aad8a7c127b3bd5bed2e9ddbe3800ee9 \
                    file://node_modules/mkdirp/package.json;md5=6a1f8790c34f10f8e970819eef841cd4 \
                    file://node_modules/moment/package.json;md5=5d9728f5a9fc2ae272061e8b08757505 \
                    file://node_modules/ms/package.json;md5=b3ea7267a23f72028e774742792b114a \
                    file://node_modules/nan/package.json;md5=3cfe1e5a98bb9fe54ff73d4aef6df453 \
                    file://node_modules/ncp/package.json;md5=088da46a36f3903be1b3007aaa401e7e \
                    file://node_modules/needle/node_modules/debug/package.json;md5=428aa7fa2bd4f273e5226f0c3c6ab6de \
                    file://node_modules/needle/package.json;md5=d9d0156d0e2dc5d8471e1e286765b913 \
                    file://node_modules/negotiator/package.json;md5=f532dffa79bfce9737c04201d64b5160 \
                    file://node_modules/neo-async/package.json;md5=93ff8db694cf72f4c7cb3aa6cab720e3 \
                    file://node_modules/nocache/package.json;md5=4752396744773fd1ffde68b87f555e37 \
                    file://node_modules/node-addon-api/package.json;md5=b570300df4894f1e7eca67970f5836ce \
                    file://node_modules/node-fetch/package.json;md5=46f12e9c0fffbd7cdaa7a2e91494d27d \
                    file://node_modules/node-forge/package.json;md5=1e0406b8aa8449a4882a57c987a8c9e2 \
                    file://node_modules/node-getopt/package.json;md5=a9881f1afd345dac46487dbb32cd605c \
                    file://node_modules/node-gyp/node_modules/mkdirp/package.json;md5=3b5ba3c4a04a8b0520bd0d392cf1c48f \
                    file://node_modules/node-gyp/node_modules/rimraf/package.json;md5=c69fc8897c842f559f37a4e02455e90a \
                    file://node_modules/node-gyp/node_modules/semver/package.json;md5=332793fc37ed92b7e36a256af9ba52ff \
                    file://node_modules/node-gyp/node_modules/tar/package.json;md5=d278ace652e28c583057153733d77899 \
                    file://node_modules/node-gyp/node_modules/which/package.json;md5=9db3fcd8026f288ba3aaad83200f5a35 \
                    file://node_modules/node-gyp/package.json;md5=bf0ec04fbefe4b858131d2c488ed5c5f \
                    file://node_modules/node-pre-gyp/node_modules/mkdirp/package.json;md5=3b5ba3c4a04a8b0520bd0d392cf1c48f \
                    file://node_modules/node-pre-gyp/node_modules/nopt/package.json;md5=5192f3f2450d866a1118c12915c38e37 \
                    file://node_modules/node-pre-gyp/node_modules/rimraf/package.json;md5=c69fc8897c842f559f37a4e02455e90a \
                    file://node_modules/node-pre-gyp/node_modules/semver/package.json;md5=735f6ede2a644d292066a9813d8b9da6 \
                    file://node_modules/node-pre-gyp/node_modules/tar/package.json;md5=352cdff8134633616c3ed6e32e7e9cf4 \
                    file://node_modules/node-pre-gyp/package.json;md5=2b9597f2ec85aa9bfb68c190fa922713 \
                    file://node_modules/nopt/package.json;md5=41ca7dc9f7e8f92e9acc64e258ff3dbb \
                    file://node_modules/normalize-path/package.json;md5=8a437fdddf8bae5cce39556e3f830975 \
                    file://node_modules/npm-bundled/package.json;md5=c2498bcf2e7ad506ecb8302187285ebc \
                    file://node_modules/npm-normalize-package-bin/package.json;md5=8beb5d87634212035f1a5fe378e22fe4 \
                    file://node_modules/npm-packlist/package.json;md5=ab91377f5b194a17b33fb4ea03e5705c \
                    file://node_modules/npmlog/package.json;md5=5052e259f267dea1afa387baced17891 \
                    file://node_modules/number-is-nan/package.json;md5=2b5b5a279c98be57ebafdaa605a14584 \
                    file://node_modules/oauth-sign/package.json;md5=7b1e2f118776b8af50278f4629cba165 \
                    file://node_modules/object-assign/package.json;md5=2854c33ba575a9ebc613d1a617ece277 \
                    file://node_modules/object-hash/package.json;md5=e53ebb4067faa989913d6eb06d234326 \
                    file://node_modules/on-finished/package.json;md5=d08696acafdda765ba2fe878b287912a \
                    file://node_modules/on-headers/package.json;md5=0d0e4b1e602b816bd9f1ed70f72a60c4 \
                    file://node_modules/once/package.json;md5=afb6ea3bdcad6397e11a71615bd06e3b \
                    file://node_modules/one-time/package.json;md5=3b1d2325ccd19319bf53a1346a5b34bc \
                    file://node_modules/os-homedir/package.json;md5=cfc8a815cbc6e35583981f3006bfabd5 \
                    file://node_modules/os-tmpdir/package.json;md5=20555f37b3809082d0562ce7f144a04a \
                    file://node_modules/osenv/package.json;md5=4690af52479190b37d7e5df62fa167d8 \
                    file://node_modules/parseurl/package.json;md5=5b1493bd775444f0994d0b1063db1900 \
                    file://node_modules/path-is-absolute/package.json;md5=ef6e018bdf67b82ab1285bc799b5367b \
                    file://node_modules/path-to-regexp/package.json;md5=19e58964462995e183c1cd8147a9b8a1 \
                    file://node_modules/performance-now/package.json;md5=ffd06b287f3c72ca8ca1abcdf43aab53 \
                    file://node_modules/picomatch/package.json;md5=7cdaee3083734e8c74f830b59140ca2f \
                    file://node_modules/pretty-format/node_modules/ansi-regex/package.json;md5=4ef3224a1d5ee3f0768bc26d95d38b26 \
                    file://node_modules/pretty-format/node_modules/ansi-styles/package.json;md5=ab7a71ab9f6b46acda83106c5f34e6e3 \
                    file://node_modules/pretty-format/node_modules/color-convert/package.json;md5=370b0177fdb4368f0a688ffa48559ecf \
                    file://node_modules/pretty-format/node_modules/color-name/package.json;md5=ef649e8b7be42bba6d4fa34aca7e126a \
                    file://node_modules/pretty-format/package.json;md5=6c67ebf296279a931746bc8953f53e42 \
                    file://node_modules/printj/package.json;md5=1e5231dafdf82f85f46989a53f52b960 \
                    file://node_modules/process-nextick-args/package.json;md5=6bd1fff965ff97b4aff54e6b4e382ed0 \
                    file://node_modules/promisepipe/package.json;md5=72ea6d8bb8a5cdcd5736df06f5eb19f2 \
                    file://node_modules/proxy-addr/package.json;md5=e99ed9f8aac6231b2559c5d17704b3e7 \
                    file://node_modules/psl/package.json;md5=53c8b1b2c58bc210351376f113307326 \
                    file://node_modules/punycode/package.json;md5=11e1d3e03bb34de07e247a480cebb0b0 \
                    file://node_modules/qs/package.json;md5=8cdc396d5a17cd69a677dce0fe432492 \
                    file://node_modules/range-parser/package.json;md5=89b7cc42d2831a8061361ca29545f837 \
                    file://node_modules/raw-body/package.json;md5=4ff24de48d62683b79d442e1672cec63 \
                    file://node_modules/rc/package.json;md5=dcf8f74e9fad2b9d45a0c5d70eba335d \
                    file://node_modules/react-is/package.json;md5=0cede8d60c2b68a6394694f1efa85552 \
                    file://node_modules/readable-stream/package.json;md5=3304d7c65a4909be72be1ee604ca8915 \
                    file://node_modules/readdir-glob/package.json;md5=952379a8f52c2aeaea663d320a03a13c \
                    file://node_modules/request/node_modules/form-data/package.json;md5=bd35e0b775988ee9080c108ad5aa2ee1 \
                    file://node_modules/request/node_modules/qs/package.json;md5=dabbbd0380e4fd44e4d49cceeda84119 \
                    file://node_modules/request/node_modules/tough-cookie/package.json;md5=fd096f2790eb11bb538a93611a2820ee \
                    file://node_modules/request/node_modules/uuid/package.json;md5=a114f1fa334f6add6b4e4b8c0ca6057b \
                    file://node_modules/request/package.json;md5=663c3e276e3ba0b503fc062d6ceb22e0 \
                    file://node_modules/require-from-string/package.json;md5=91cd056851e4b3e025a8a63c4b697092 \
                    file://node_modules/requires-port/package.json;md5=f1ff2488f865b4589c1a9e44e1cc0e72 \
                    file://node_modules/rimraf/package.json;md5=8a6e756a56b9dc8f8f70e4099b4e92a0 \
                    file://node_modules/safe-buffer/package.json;md5=bd7ef6f38f0ba20882d2601bd3ecaf11 \
                    file://node_modules/safer-buffer/package.json;md5=274d956f400350c9f6cf96d22cdda227 \
                    file://node_modules/sax/package.json;md5=4f338f842e93421a35e3ec9e051d650b \
                    file://node_modules/segfault-handler/package.json;md5=fff9c3268359741db1575d032ce35671 \
                    file://node_modules/semver/package.json;md5=a956eb74930c4c7232dbad51770d7719 \
                    file://node_modules/send/node_modules/debug/node_modules/ms/package.json;md5=cbd55880a650b56c3d5acddbbdbee9bc \
                    file://node_modules/send/node_modules/debug/package.json;md5=71a7656944ffe50cc27ebe02491ae49b \
                    file://node_modules/send/node_modules/ms/package.json;md5=83b5d192dde33fb41adda4ce8b9eb521 \
                    file://node_modules/send/package.json;md5=3645cd9d22c03f5bc9b3dddfe795b348 \
                    file://node_modules/serve-static/package.json;md5=d9c0bf270eb80f5b87045c69b8d6c79b \
                    file://node_modules/set-blocking/package.json;md5=e37224b4c865b4464d6d41b1f8a870a4 \
                    file://node_modules/setprototypeof/package.json;md5=1541c2199513a8830073d21fe710bb0b \
                    file://node_modules/signal-exit/package.json;md5=37c7ccfe57d64fc58b6c352c0cd59083 \
                    file://node_modules/simple-swizzle/package.json;md5=cab0b71a3d1f56f4207555d0828a9851 \
                    file://node_modules/slash/package.json;md5=da2cf538726a98a560e80ad1c876035d \
                    file://node_modules/source-map/package.json;md5=5f7feb368962c3130c5accf22ffd047c \
                    file://node_modules/speakeasy/package.json;md5=edd3009818d7b3bd411fca86cff2a4a1 \
                    file://node_modules/sqlite3/package.json;md5=272b6be0491ba24e65f4fe37a812a4ff \
                    file://node_modules/sshpk/package.json;md5=4ced8d334a4cd023e5b663c51ae88bc5 \
                    file://node_modules/stack-trace/package.json;md5=075663afd2a274ef74b88c7df49dec2c \
                    file://node_modules/stack-utils/node_modules/escape-string-regexp/package.json;md5=5480cda71be16961c520f64a79b35eac \
                    file://node_modules/stack-utils/package.json;md5=ecfcb60631823325bbeae6733accde56 \
                    file://node_modules/statuses/package.json;md5=ce09e65d18aa8425eac89e41fde1837a \
                    file://node_modules/streamsearch/package.json;md5=6da86aa1ad809dadbdeb8c7f54cc4f03 \
                    file://node_modules/string_decoder/package.json;md5=4a56e8c1789fe3bc13c55f8fec7e3ce2 \
                    file://node_modules/string-format/package.json;md5=60b689e684396f95e405bb3a99929251 \
                    file://node_modules/string-width/package.json;md5=97dfb4a5985832f6a8c070ca4481b96c \
                    file://node_modules/strip-ansi/package.json;md5=0b615dc471f5f434dd297c8655ed0c7f \
                    file://node_modules/strip-json-comments/package.json;md5=1dfad7430c94d2f136604def66ed9854 \
                    file://node_modules/supports-color/package.json;md5=79d88f702d689c72ebe1798d2853a96e \
                    file://node_modules/tar/node_modules/chownr/package.json;md5=8f7eeb8b80a6ebb304df487b88cbd703 \
                    file://node_modules/tar/node_modules/fs-minipass/package.json;md5=5391f566f8afb10ff27831ab50bff208 \
                    file://node_modules/tar/node_modules/minipass/package.json;md5=61e41d32eda6e2aa0e845ec4e6f79aaa \
                    file://node_modules/tar/node_modules/minizlib/package.json;md5=18063883e703c0f5da4521ecd2fedf57 \
                    file://node_modules/tar/node_modules/yallist/package.json;md5=b15d27bf2cf04083fef9389ce68aa620 \
                    file://node_modules/tar/package.json;md5=53cf8c7d357149f0e8a3d1dfa5364edd \
                    file://node_modules/tar-stream/package.json;md5=b4e9cc0d7745a075a2f9a572ad0fd845 \
                    file://node_modules/text-hex/package.json;md5=f1b3817b994ec9b47dd5653e7be2550d \
                    file://node_modules/tmp/package.json;md5=53801996486714d39067455e6764aca3 \
                    file://node_modules/toidentifier/package.json;md5=2ecc7acf5b134a92fbc0b0999a02f84d \
                    file://node_modules/traverse-chain/package.json;md5=253f86efe6105277f82059424376a722 \
                    file://node_modules/triple-beam/package.json;md5=17caf87bb40557ec8b3eda069f2d7187 \
                    file://node_modules/tunnel-agent/package.json;md5=36d88acec2f39b7b86a347a0d8117296 \
                    file://node_modules/tweetnacl/package.json;md5=d8e646711b5775f632423c9ece45bec4 \
                    file://node_modules/type-is/package.json;md5=ffa244d8a6f745a081a0cdde026879c9 \
                    file://node_modules/uglify-js/package.json;md5=17af6f9777ba29372b1f247bb84a43e1 \
                    file://node_modules/unpipe/package.json;md5=f8318a554ed98c6a030942e9c14aaac8 \
                    file://node_modules/uri-js/package.json;md5=ed6d85a25ab0dfd8a6c9a63442f9b77e \
                    file://node_modules/urlsafe-base64/package.json;md5=fa58bd272655db7071ad357576726565 \
                    file://node_modules/util-deprecate/package.json;md5=73e6c3ff1709538c921d13a75cae485d \
                    file://node_modules/utils-merge/package.json;md5=0230ade39b9c19f5fcc29ed02dff4afe \
                    file://node_modules/uuid/package.json;md5=3c702f857bc044bd466bd7f260c5c1b1 \
                    file://node_modules/vary/package.json;md5=3577fc17c1b964af7cfe2c17c73f84f3 \
                    file://node_modules/verror/package.json;md5=5721040ba86c8a3b64364ccd5576a208 \
                    file://node_modules/web-push/node_modules/jwa/package.json;md5=4776c65d9e7ffdffe1655ff0ed22ca26 \
                    file://node_modules/web-push/node_modules/jws/package.json;md5=74504aefdf3abee36c2e35b905252fbe \
                    file://node_modules/web-push/package.json;md5=a630853b1baddb9edb2532707bf7a893 \
                    file://node_modules/wide-align/package.json;md5=b408a19d562c2232e6d09bd6fc51a4a9 \
                    file://node_modules/winston/package.json;md5=41fa0d19d3f52648d56e6f499859f593 \
                    file://node_modules/winston-daily-rotate-file/package.json;md5=5f40ad189cbb728dead21be30e438da4 \
                    file://node_modules/winston-transport/node_modules/readable-stream/package.json;md5=55d646ab9e50735393b18c874d0bd5ab \
                    file://node_modules/winston-transport/package.json;md5=77f4a6f2c432437c28680723a3071cdb \
                    file://node_modules/wordwrap/package.json;md5=de042387ba8d3842c4c36e626516e03c \
                    file://node_modules/wrappy/package.json;md5=788804d507f3ed479ea7614fa7d3f1a5 \
                    file://node_modules/ws/package.json;md5=0ffa4b8ef1df8a513ccb093af5d18b54 \
                    file://node_modules/yallist/package.json;md5=cfcb34bc4394905533def53dbac8ad7a \
                    file://node_modules/zip-stream/package.json;md5=1f08c3fdf9638868fe9daeecfa59e155"

SRC_URI = " \
    git://github.com/WebThingsIO/gateway.git;protocol=https;branch=master \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

DEPENDS += " \
    bluez \
    boost \
    curl \
    glib2 \
    libffi \
    libpng \
    libusb1 \
    udev \
    python3-pip \
    python3 \
    "

RDEPENDS += " \
    echo \
    bash \
    bluez \
    boost \
    curl \
    glib2 \
    libffi \
    libpng \
    libusb1 \
    make \
    npm \
    nvm \
    python3 \
    python3-pip \
    udev \
    "

# Modify these as desired
PV = "1.1.0+git${SRCPV}"
SRCREV = "4c600fc973effc9dad335f65c3dea243bd5da225"

S = "${WORKDIR}/git"

inherit npm

LICENSE_${PN} = "Unknown"
LICENSE_${PN}-babel-code-frame = "MIT"
LICENSE_${PN}-babel-helper-validator-identifier = "MIT"
LICENSE_${PN}-babel-highlight = "MIT"
LICENSE_${PN}-dabh-diagnostics = "MIT"
LICENSE_${PN}-fluent-bundle = "Unknown"
LICENSE_${PN}-fluent-dom = "Unknown"
LICENSE_${PN}-jest-console-ansi-styles = "MIT"
LICENSE_${PN}-jest-console-chalk = "MIT"
LICENSE_${PN}-jest-console-color-convert = "MIT"
LICENSE_${PN}-jest-console-color-name = "MIT"
LICENSE_${PN}-jest-console-has-flag = "MIT"
LICENSE_${PN}-jest-console-supports-color = "MIT"
LICENSE_${PN}-jest-console = "MIT"
LICENSE_${PN}-jest-types-ansi-styles = "MIT"
LICENSE_${PN}-jest-types-chalk = "MIT"
LICENSE_${PN}-jest-types-color-convert = "MIT"
LICENSE_${PN}-jest-types-color-name = "MIT"
LICENSE_${PN}-jest-types-has-flag = "MIT"
LICENSE_${PN}-jest-types-supports-color = "MIT"
LICENSE_${PN}-jest-types = "MIT"
LICENSE_${PN}-types-istanbul-lib-coverage = "Unknown"
LICENSE_${PN}-types-istanbul-lib-report = "Unknown"
LICENSE_${PN}-types-istanbul-reports = "Unknown"
LICENSE_${PN}-types-node = "Unknown"
LICENSE_${PN}-types-stack-utils = "Unknown"
LICENSE_${PN}-types-yargs = "Unknown"
LICENSE_${PN}-types-yargs-parser = "Unknown"
LICENSE_${PN}-abbrev = "Unknown"
LICENSE_${PN}-accepts = "MIT"
LICENSE_${PN}-acme-client = "MIT"
LICENSE_${PN}-agent-base = "Unknown"
LICENSE_${PN}-ajv = "MIT"
LICENSE_${PN}-ansi-regex = "MIT"
LICENSE_${PN}-ansi-styles = "MIT"
LICENSE_${PN}-aproba = "ISC"
LICENSE_${PN}-archiver = "MIT"
LICENSE_${PN}-archiver-utils-readable-stream = "Unknown"
LICENSE_${PN}-archiver-utils = "MIT"
LICENSE_${PN}-are-we-there-yet-readable-stream = "Unknown"
LICENSE_${PN}-are-we-there-yet = "ISC"
LICENSE_${PN}-array-flatten = "MIT"
LICENSE_${PN}-asn1 = "Unknown"
LICENSE_${PN}-asn1js = "MIT"
LICENSE_${PN}-assert-plus = "Unknown"
LICENSE_${PN}-async = "MIT"
LICENSE_${PN}-async-limiter = "MIT"
LICENSE_${PN}-asynckit = "MIT"
LICENSE_${PN}-aws-sign2 = "Unknown"
LICENSE_${PN}-aws4 = "MIT"
LICENSE_${PN}-axios = "MIT"
LICENSE_${PN}-backo2 = "Unknown"
LICENSE_${PN}-balanced-match = "Unknown"
LICENSE_${PN}-base32js = "Unknown"
LICENSE_${PN}-base64-js = "MIT"
LICENSE_${PN}-bcrypt-pbkdf = "Unknown"
LICENSE_${PN}-bcryptjs = "Unknown"
LICENSE_${PN}-bindings = "MIT"
LICENSE_${PN}-bl = "Unknown"
LICENSE_${PN}-block-stream = "Unknown ISC"
LICENSE_${PN}-bluebird = "MIT"
LICENSE_${PN}-bnjs = "Unknown"
LICENSE_${PN}-body-parser-debug = "MIT"
LICENSE_${PN}-body-parser-ms = "MIT"
LICENSE_${PN}-body-parser = "MIT"
LICENSE_${PN}-brace-expansion = "MIT"
LICENSE_${PN}-buffer = "MIT"
LICENSE_${PN}-buffer-crc32 = "MIT"
LICENSE_${PN}-buffer-equal-constant-time = "Unknown"
LICENSE_${PN}-busboy = "MIT"
LICENSE_${PN}-bytes = "MIT"
LICENSE_${PN}-cached-iterable = "Unknown"
LICENSE_${PN}-callsites = "MIT"
LICENSE_${PN}-caseless = "Unknown"
LICENSE_${PN}-chalk = "MIT"
LICENSE_${PN}-chownr = "ISC"
LICENSE_${PN}-ci-info = "MIT"
LICENSE_${PN}-code-point-at = "MIT"
LICENSE_${PN}-color = "MIT"
LICENSE_${PN}-color-convert = "MIT"
LICENSE_${PN}-color-name = "MIT"
LICENSE_${PN}-color-string = "MIT"
LICENSE_${PN}-colors = "Unknown"
LICENSE_${PN}-colorspace = "MIT"
LICENSE_${PN}-combined-stream = "MIT"
LICENSE_${PN}-compress-commons = "MIT"
LICENSE_${PN}-compressible = "MIT"
LICENSE_${PN}-compression-bytes = "MIT"
LICENSE_${PN}-compression-debug = "MIT"
LICENSE_${PN}-compression-ms = "MIT"
LICENSE_${PN}-compression = "MIT"
LICENSE_${PN}-concat-map = "MIT"
LICENSE_${PN}-config = "Unknown"
LICENSE_${PN}-console-control-strings = "ISC"
LICENSE_${PN}-content-disposition = "MIT"
LICENSE_${PN}-content-type = "MIT"
LICENSE_${PN}-cookie = "MIT"
LICENSE_${PN}-cookie-signature = "Unknown"
LICENSE_${PN}-core-util-is = "MIT"
LICENSE_${PN}-country-list = "MIT"
LICENSE_${PN}-crc-32 = "Unknown"
LICENSE_${PN}-crc32-stream = "MIT"
LICENSE_${PN}-csv-parse = "MIT"
LICENSE_${PN}-dashdash = "Unknown"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-deep-extend = "MIT"
LICENSE_${PN}-delayed-stream = "MIT"
LICENSE_${PN}-delegates = "MIT"
LICENSE_${PN}-depd = "MIT"
LICENSE_${PN}-destroy = "MIT"
LICENSE_${PN}-detect-libc = "Unknown"
LICENSE_${PN}-dicer = "MIT"
LICENSE_${PN}-ecc-jsbn = "MIT Unknown"
LICENSE_${PN}-ecdsa-sig-formatter = "Unknown"
LICENSE_${PN}-ee-first = "MIT"
LICENSE_${PN}-enabled = "MIT"
LICENSE_${PN}-encodeurl = "MIT"
LICENSE_${PN}-end-of-stream = "MIT"
LICENSE_${PN}-escape-html = "MIT"
LICENSE_${PN}-escape-string-regexp = "MIT"
LICENSE_${PN}-etag = "MIT"
LICENSE_${PN}-eventemitter3 = "MIT"
LICENSE_${PN}-exit-on-epipe = "Unknown"
LICENSE_${PN}-express-debug = "MIT"
LICENSE_${PN}-express-ms = "MIT"
LICENSE_${PN}-express = "MIT"
LICENSE_${PN}-express-fileupload = "MIT"
LICENSE_${PN}-express-handlebars-graceful-fs = "ISC"
LICENSE_${PN}-express-handlebars = "Unknown"
LICENSE_${PN}-express-rate-limit = "MIT"
LICENSE_${PN}-express-ws-ws = "MIT"
LICENSE_${PN}-express-ws = "Unknown"
LICENSE_${PN}-extend = "MIT"
LICENSE_${PN}-extsprintf = "Unknown"
LICENSE_${PN}-fast-deep-equal = "MIT"
LICENSE_${PN}-fast-json-stable-stringify = "MIT"
LICENSE_${PN}-fast-safe-stringify = "MIT"
LICENSE_${PN}-fecha = "MIT"
LICENSE_${PN}-file-stream-rotator = "Unknown"
LICENSE_${PN}-file-uri-to-path = "MIT"
LICENSE_${PN}-finalhandler-debug = "MIT"
LICENSE_${PN}-finalhandler-ms = "MIT"
LICENSE_${PN}-finalhandler = "MIT"
LICENSE_${PN}-find = "MIT"
LICENSE_${PN}-fnname = "MIT"
LICENSE_${PN}-follow-redirects = "MIT"
LICENSE_${PN}-forever-agent = "Unknown"
LICENSE_${PN}-forwarded = "MIT"
LICENSE_${PN}-fresh = "MIT"
LICENSE_${PN}-fs-constants = "MIT"
LICENSE_${PN}-fs-minipass = "ISC"
LICENSE_${PN}-fsrealpath = "Unknown"
LICENSE_${PN}-fstream-mkdirp = "MIT"
LICENSE_${PN}-fstream-rimraf = "ISC"
LICENSE_${PN}-fstream = "ISC"
LICENSE_${PN}-gateway-addon = "Unknown"
LICENSE_${PN}-gauge = "ISC"
LICENSE_${PN}-getpass = "MIT"
LICENSE_${PN}-glob = "Unknown"
LICENSE_${PN}-glob-to-regexp = "Unknown"
LICENSE_${PN}-graceful-fs = "ISC"
LICENSE_${PN}-handlebars = "MIT"
LICENSE_${PN}-har-schema = "ISC"
LICENSE_${PN}-har-validator-ajv = "MIT"
LICENSE_${PN}-har-validator-json-schema-traverse = "MIT"
LICENSE_${PN}-har-validator = "MIT"
LICENSE_${PN}-has-flag = "MIT"
LICENSE_${PN}-has-unicode = "ISC"
LICENSE_${PN}-httpece = "Unknown"
LICENSE_${PN}-http-errors-inherits = "ISC"
LICENSE_${PN}-http-errors = "MIT"
LICENSE_${PN}-http-proxy = "Unknown"
LICENSE_${PN}-http-signature = "MIT"
LICENSE_${PN}-https-proxy-agent = "Unknown"
LICENSE_${PN}-iconv-lite = "MIT"
LICENSE_${PN}-ieee754 = "Unknown"
LICENSE_${PN}-ignore-walk = "ISC"
LICENSE_${PN}-inflight = "ISC"
LICENSE_${PN}-inherits = "ISC"
LICENSE_${PN}-ini = "ISC"
LICENSE_${PN}-ip-regex = "MIT"
LICENSE_${PN}-ipaddrjs = "MIT"
LICENSE_${PN}-is-arrayish = "MIT"
LICENSE_${PN}-is-ci = "MIT"
LICENSE_${PN}-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-is-stream = "MIT"
LICENSE_${PN}-is-typedarray = "MIT"
LICENSE_${PN}-isarray = "Unknown"
LICENSE_${PN}-isexe = "ISC"
LICENSE_${PN}-isstream = "Unknown"
LICENSE_${PN}-jest-message-util-ansi-styles = "MIT"
LICENSE_${PN}-jest-message-util-braces = "MIT"
LICENSE_${PN}-jest-message-util-chalk = "MIT"
LICENSE_${PN}-jest-message-util-color-convert = "MIT"
LICENSE_${PN}-jest-message-util-color-name = "MIT"
LICENSE_${PN}-jest-message-util-fill-range = "MIT"
LICENSE_${PN}-jest-message-util-has-flag = "MIT"
LICENSE_${PN}-jest-message-util-is-number = "MIT"
LICENSE_${PN}-jest-message-util-micromatch = "MIT"
LICENSE_${PN}-jest-message-util-supports-color = "MIT"
LICENSE_${PN}-jest-message-util-to-regex-range = "MIT"
LICENSE_${PN}-jest-message-util = "MIT"
LICENSE_${PN}-jest-util-ansi-styles = "MIT"
LICENSE_${PN}-jest-util-braces = "MIT"
LICENSE_${PN}-jest-util-chalk = "MIT"
LICENSE_${PN}-jest-util-color-convert = "MIT"
LICENSE_${PN}-jest-util-color-name = "MIT"
LICENSE_${PN}-jest-util-fill-range = "MIT"
LICENSE_${PN}-jest-util-has-flag = "MIT"
LICENSE_${PN}-jest-util-is-number = "MIT"
LICENSE_${PN}-jest-util-micromatch = "MIT"
LICENSE_${PN}-jest-util-supports-color = "MIT"
LICENSE_${PN}-jest-util-to-regex-range = "MIT"
LICENSE_${PN}-jest-util = "MIT"
LICENSE_${PN}-js-tokens = "MIT"
LICENSE_${PN}-jsbn = "Unknown"
LICENSE_${PN}-json-schema = "Unknown"
LICENSE_${PN}-json-schema-traverse = "MIT"
LICENSE_${PN}-json-stringify-safe = "ISC"
LICENSE_${PN}-json5 = "Unknown"
LICENSE_${PN}-jsonwebtoken-semver = "ISC"
LICENSE_${PN}-jsonwebtoken = "MIT"
LICENSE_${PN}-jsprim = "Unknown"
LICENSE_${PN}-jwa = "MIT"
LICENSE_${PN}-jws = "MIT"
LICENSE_${PN}-kuler = "MIT"
LICENSE_${PN}-lazystream-readable-stream = "Unknown"
LICENSE_${PN}-lazystream = "MIT"
LICENSE_${PN}-lodashdefaults = "Unknown"
LICENSE_${PN}-lodashdifference = "Unknown"
LICENSE_${PN}-lodashflatten = "Unknown"
LICENSE_${PN}-lodashincludes = "Unknown"
LICENSE_${PN}-lodashisboolean = "Unknown"
LICENSE_${PN}-lodashisinteger = "Unknown"
LICENSE_${PN}-lodashisnumber = "Unknown"
LICENSE_${PN}-lodashisplainobject = "Unknown"
LICENSE_${PN}-lodashisstring = "Unknown"
LICENSE_${PN}-lodashonce = "Unknown"
LICENSE_${PN}-lodashunion = "Unknown"
LICENSE_${PN}-logform = "MIT"
LICENSE_${PN}-lru-cache-yallist = "ISC"
LICENSE_${PN}-lru-cache = "ISC"
LICENSE_${PN}-media-typer = "MIT"
LICENSE_${PN}-merge-descriptors = "MIT"
LICENSE_${PN}-methods = "MIT"
LICENSE_${PN}-mime = "MIT"
LICENSE_${PN}-mime-db = "MIT"
LICENSE_${PN}-mime-types = "MIT"
LICENSE_${PN}-minimalistic-assert = "ISC"
LICENSE_${PN}-minimatch = "ISC"
LICENSE_${PN}-minimist = "MIT"
LICENSE_${PN}-minipass = "ISC"
LICENSE_${PN}-minizlib = "Unknown"
LICENSE_${PN}-mkdirp = "MIT"
LICENSE_${PN}-moment = "MIT"
LICENSE_${PN}-ms = "MIT"
LICENSE_${PN}-nan = "Unknown"
LICENSE_${PN}-ncp = "MIT"
LICENSE_${PN}-needle-debug = "MIT"
LICENSE_${PN}-needle = "MIT"
LICENSE_${PN}-negotiator = "MIT"
LICENSE_${PN}-neo-async = "Unknown"
LICENSE_${PN}-nocache = "MIT"
LICENSE_${PN}-node-addon-api = "Unknown"
LICENSE_${PN}-node-fetch = "MIT"
LICENSE_${PN}-node-forge = "Unknown"
LICENSE_${PN}-node-getopt = "MIT"
LICENSE_${PN}-node-gyp-mkdirp = "MIT"
LICENSE_${PN}-node-gyp-rimraf = "ISC"
LICENSE_${PN}-node-gyp-semver = "ISC"
LICENSE_${PN}-node-gyp-tar = "ISC"
LICENSE_${PN}-node-gyp-which = "ISC"
LICENSE_${PN}-node-gyp = "MIT Unknown"
LICENSE_${PN}-node-pre-gyp-mkdirp = "MIT"
LICENSE_${PN}-node-pre-gyp-nopt = "ISC"
LICENSE_${PN}-node-pre-gyp-rimraf = "ISC"
LICENSE_${PN}-node-pre-gyp-semver = "ISC"
LICENSE_${PN}-node-pre-gyp-tar = "ISC"
LICENSE_${PN}-node-pre-gyp = "Unknown"
LICENSE_${PN}-nopt = "ISC"
LICENSE_${PN}-normalize-path = "MIT"
LICENSE_${PN}-npm-bundled = "ISC"
LICENSE_${PN}-npm-normalize-package-bin = "ISC"
LICENSE_${PN}-npm-packlist = "ISC"
LICENSE_${PN}-npmlog = "ISC"
LICENSE_${PN}-number-is-nan = "MIT"
LICENSE_${PN}-oauth-sign = "Unknown"
LICENSE_${PN}-object-assign = "MIT"
LICENSE_${PN}-object-hash = "MIT"
LICENSE_${PN}-on-finished = "MIT"
LICENSE_${PN}-on-headers = "MIT"
LICENSE_${PN}-once = "ISC"
LICENSE_${PN}-one-time = "MIT"
LICENSE_${PN}-os-homedir = "MIT"
LICENSE_${PN}-os-tmpdir = "MIT"
LICENSE_${PN}-osenv = "ISC"
LICENSE_${PN}-parseurl = "MIT"
LICENSE_${PN}-path-is-absolute = "MIT"
LICENSE_${PN}-path-to-regexp = "MIT"
LICENSE_${PN}-performance-now = "MIT"
LICENSE_${PN}-picomatch = "MIT"
LICENSE_${PN}-pretty-format-ansi-regex = "MIT"
LICENSE_${PN}-pretty-format-ansi-styles = "MIT"
LICENSE_${PN}-pretty-format-color-convert = "MIT"
LICENSE_${PN}-pretty-format-color-name = "MIT"
LICENSE_${PN}-pretty-format = "MIT"
LICENSE_${PN}-printj = "Unknown"
LICENSE_${PN}-process-nextick-args = "Unknown"
LICENSE_${PN}-promisepipe = "MIT"
LICENSE_${PN}-proxy-addr = "MIT"
LICENSE_${PN}-psl = "MIT"
LICENSE_${PN}-punycode = "MIT"
LICENSE_${PN}-qs = "Unknown"
LICENSE_${PN}-range-parser = "MIT"
LICENSE_${PN}-raw-body = "MIT"
LICENSE_${PN}-rc = "MIT Unknown"
LICENSE_${PN}-react-is = "MIT"
LICENSE_${PN}-readable-stream = "Unknown"
LICENSE_${PN}-readdir-glob = "Unknown"
LICENSE_${PN}-request-form-data = "MIT"
LICENSE_${PN}-request-qs = "Unknown"
LICENSE_${PN}-request-tough-cookie = "Unknown"
LICENSE_${PN}-request-uuid = "MIT"
LICENSE_${PN}-request = "Unknown"
LICENSE_${PN}-require-from-string = "MIT"
LICENSE_${PN}-requires-port = "MIT"
LICENSE_${PN}-rimraf = "ISC"
LICENSE_${PN}-safe-buffer = "MIT"
LICENSE_${PN}-safer-buffer = "MIT"
LICENSE_${PN}-sax = "Unknown"
LICENSE_${PN}-segfault-handler = "Unknown"
LICENSE_${PN}-semver = "ISC"
LICENSE_${PN}-send-debug-ms = "MIT"
LICENSE_${PN}-send-debug = "MIT"
LICENSE_${PN}-send-ms = "MIT"
LICENSE_${PN}-send = "MIT"
LICENSE_${PN}-serve-static = "MIT"
LICENSE_${PN}-set-blocking = "ISC"
LICENSE_${PN}-setprototypeof = "ISC"
LICENSE_${PN}-signal-exit = "ISC"
LICENSE_${PN}-simple-swizzle = "MIT"
LICENSE_${PN}-slash = "MIT"
LICENSE_${PN}-source-map = "Unknown"
LICENSE_${PN}-speakeasy = "MIT"
LICENSE_${PN}-sqlite3 = "Unknown"
LICENSE_${PN}-sshpk = "MIT"
LICENSE_${PN}-stack-trace = "MIT"
LICENSE_${PN}-stack-utils-escape-string-regexp = "MIT"
LICENSE_${PN}-stack-utils = "MIT"
LICENSE_${PN}-statuses = "MIT"
LICENSE_${PN}-streamsearch = "MIT"
LICENSE_${PN}-stringdecoder = "Unknown"
LICENSE_${PN}-string-format = "Unknown"
LICENSE_${PN}-string-width = "MIT"
LICENSE_${PN}-strip-ansi = "MIT"
LICENSE_${PN}-strip-json-comments = "MIT"
LICENSE_${PN}-supports-color = "MIT"
LICENSE_${PN}-tar-chownr = "ISC"
LICENSE_${PN}-tar-fs-minipass = "ISC"
LICENSE_${PN}-tar-minipass = "ISC"
LICENSE_${PN}-tar-minizlib = "Unknown"
LICENSE_${PN}-tar-yallist = "ISC"
LICENSE_${PN}-tar = "ISC"
LICENSE_${PN}-tar-stream = "MIT"
LICENSE_${PN}-text-hex = "MIT"
LICENSE_${PN}-tmp = "MIT"
LICENSE_${PN}-toidentifier = "MIT"
LICENSE_${PN}-traverse-chain = "Unknown"
LICENSE_${PN}-triple-beam = "MIT"
LICENSE_${PN}-tunnel-agent = "Unknown"
LICENSE_${PN}-tweetnacl = "Unknown"
LICENSE_${PN}-type-is = "MIT"
LICENSE_${PN}-uglify-js = "Unknown"
LICENSE_${PN}-unpipe = "MIT"
LICENSE_${PN}-uri-js = "Unknown"
LICENSE_${PN}-urlsafe-base64 = "Unknown"
LICENSE_${PN}-util-deprecate = "MIT"
LICENSE_${PN}-utils-merge = "MIT"
LICENSE_${PN}-uuid = "MIT"
LICENSE_${PN}-vary = "MIT"
LICENSE_${PN}-verror = "Unknown"
LICENSE_${PN}-web-push-jwa = "MIT"
LICENSE_${PN}-web-push-jws = "MIT"
LICENSE_${PN}-web-push = "Unknown"
LICENSE_${PN}-wide-align = "ISC"
LICENSE_${PN}-winston = "MIT"
LICENSE_${PN}-winston-daily-rotate-file = "MIT"
LICENSE_${PN}-winston-transport-readable-stream = "Unknown"
LICENSE_${PN}-winston-transport = "MIT"
LICENSE_${PN}-wordwrap = "MIT"
LICENSE_${PN}-wrappy = "ISC"
LICENSE_${PN}-ws = "MIT"
LICENSE_${PN}-yallist = "ISC"
LICENSE_${PN}-zip-stream = "MIT"
