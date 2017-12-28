require recipes-core/images/rpi-example-image.bb

LICENSE = "CLOSED"

# Include modules in rootfs
IMAGE_INSTALL += " \
    packagegroup-dev \
"
