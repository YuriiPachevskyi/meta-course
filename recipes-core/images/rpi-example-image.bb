# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

LICENSE = "CLOSED"

# Include modules in rootfs
IMAGE_INSTALL += " \
    kernel-modules \
    packagegroup-core \
"

IMAGE_FEATURES += "ssh-server-dropbear"
