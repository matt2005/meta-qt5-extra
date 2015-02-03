SUMMARY = "Add support for global workspace shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    kconfig \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    ki18n \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRCREV = "f9eb427b293c40eec96784e059054bafd431c9bc"
S = "${WORKDIR}/git"

SRC_URI += "file://0001-HACK-Add-a-stub-runtime-implementation-to-enable-bui.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5GlobalAccel, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5GlobalAccel, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservices5"
