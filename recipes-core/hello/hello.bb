LICENSE = "CLOSED"

inherit cmake

SRCREV = "${AUTOREV}"
SRC_URI = " \
	git://github.com/YuriiPachevskyi/helloyocto.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"

DEPENDS = " \
	logging \
"
