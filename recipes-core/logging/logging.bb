LICENSE = "CLOSED"

PR = "${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = " \
    git://github.com/YuriiPachevskyi/logging.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"

inherit cmake

