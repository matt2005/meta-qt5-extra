SUMMARY = "Plugin based UI runtime used to write primary user interfaces"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    qtdeclarative \
    qtsvg \
    qtscript \
    qtquickcontrols2 \
    kirigami2 \
    kactivities \
    karchive \
    kconfig \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons \
    kcoreaddons-native \
    kdbusaddons \
    kdeclarative \
    kdoctools \
    kdoctools-native \
    kglobalaccel \
    kguiaddons \
    ki18n \
    kservice \
    kwindowsystem \
    kxmlgui \
    knotifications \
    kpackage \
    kpackage-native \
    kwayland \
    kauth-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e03ee53a6b5e0af40e4e2a283098d23a"
SRC_URI[sha256sum] = "b886aeee6691911ead25e6fd5631fa41ce2330b0fbbdc040717fa576bacae2ca"

FILES_${PN} += " \
    ${datadir}/kdevappwizard \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/platformqml \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/org/kde/plasma \
"
