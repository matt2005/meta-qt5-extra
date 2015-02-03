SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=be254b9345b1c2ff33e1a6a96768f2fb \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRCREV = "4b5fa02f4b634961960aa9672aafef3369129a41"
S = "${WORKDIR}/git"

CMAKE_HIDE_ERROR[1] = "KF5Attica, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Attica, -S${includedir}, -S${STAGING_INCDIR}"

