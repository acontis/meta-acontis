SUMMARY = "acontis atemsys user mode driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

SRC_URI = "file://Makefile \
           file://atemsys.c \
           file://atemsys.h \
           file://COPYING \
          "
S = "${WORKDIR}"

export KERNELDIR="${KERNEL_SRC}"

# inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
