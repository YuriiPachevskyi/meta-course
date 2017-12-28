LICENSE = "CLOSED"

inherit packagegroup

RDEPENDS_${PN} = " \
    oprofile \
    packagegroup-core-tools-debug \
    valgrind \
"
