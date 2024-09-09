SUMMARY = "acontis atemsys user mode driver"
LICENSE = "GPL-2.0 WITH Linux-syscall-note"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

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
