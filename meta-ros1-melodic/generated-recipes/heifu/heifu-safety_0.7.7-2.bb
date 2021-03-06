# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package enables an allowable safety zone to control the drone with a joystick."
AUTHOR = "Fábio Azevedo <fabio.azevedo@beyond-vision.pt>"
ROS_AUTHOR = "Fábio Azevedo <fabio.azevedo@beyond-vision.pt>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "heifu"
ROS_BPN = "heifu_safety"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    heifu-msgs \
    nav-msgs \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    heifu-msgs \
    nav-msgs \
    roscpp \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    heifu-msgs \
    nav-msgs \
    roscpp \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/BV-OpenSource/heifu-release/archive/release/melodic/heifu_safety/0.7.7-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/heifu_safety"
SRC_URI = "git://github.com/BV-OpenSource/heifu-release;${ROS_BRANCH};protocol=https"
SRCREV = "999204febb78a7c34e6b33bad95bcf9570b68ab7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
