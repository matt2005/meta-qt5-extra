SUMMARY = "KReversi is is a simple strategy game played against the computer"
DESCRIPTION = "KReversi is is a simple one player strategy game played against the computer"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kdoctools-native \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kdeclarative \
    ki18n \
    kiconthemes \
    kio \
    kxmlgui \
    kwidgetsaddons \
    kdoctools \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "d2cd2b50ac6d7d8e6fa9de70bcf1f70b"
SRC_URI[sha256sum] = "a4579c4000b0956aa4e204bf66cb9493673bfbc15c27ddeff170b5b4bb393c9c"
SRC_URI+="file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
"
