# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "rqt_paramedit - a rqt plugin for editing parameters using qt_paramedit."
AUTHOR = "Christian Dornhege <c.dornhege@gmail.com>"
ROS_AUTHOR = "Christian Dornhege <c.dornhege@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rqt_paramedit"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_paramedit"
ROS_BPN = "rqt_paramedit"

ROS_BUILD_DEPENDS = " \
    qt-paramedit \
    qtbase \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    qt-paramedit \
    qtbase \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qt-paramedit \
    qtbase \
    roscpp \
    rqt-gui \
    rqt-gui-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/dornhege/rqt_paramedit-release/archive/release/melodic/rqt_paramedit/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_paramedit"
SRC_URI = "git://github.com/dornhege/rqt_paramedit-release;${ROS_BRANCH};protocol=https"
SRCREV = "b453b2a142aaf0a2d953c8828e3961c080ebadb8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
