# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS device driver for the Vedder VESC open source motor driver."
AUTHOR = "Johannes Betz <joebetz@seas.upenn.edu>"
ROS_AUTHOR = "Michael T. Boulet <boulet@ll.mit.edu>"
HOMEPAGE = "http://www.ros.org/wiki/vesc_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "vesc"
ROS_BPN = "vesc_driver"

ROS_BUILD_DEPENDS = " \
    nodelet \
    pluginlib \
    roscpp \
    roslint \
    serial \
    std-msgs \
    vesc-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    nodelet \
    pluginlib \
    roscpp \
    serial \
    std-msgs \
    vesc-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nodelet \
    pluginlib \
    roscpp \
    serial \
    std-msgs \
    vesc-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/f1tenth/vesc-release/archive/release/melodic/vesc_driver/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/vesc_driver"
SRC_URI = "git://github.com/f1tenth/vesc-release;${ROS_BRANCH};protocol=https"
SRCREV = "c2667af97f7ea9470c41299ce190d4760a6d3e9f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
