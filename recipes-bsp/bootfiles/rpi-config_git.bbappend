FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-Enable-serial-port.patch"

do_install_append() {
    install -d ${D}/boot
    install -m 0644 ${S}/config.txt ${D}/boot
}

FILES_${PN} += "/boot/config.txt"
