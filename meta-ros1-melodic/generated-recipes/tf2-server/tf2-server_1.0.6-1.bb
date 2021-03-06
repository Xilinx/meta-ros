# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "TF2 server that can provide transforms over separate TF topics"
AUTHOR = "Martin Pecka <peckama2@fel.cvut.cz>"
ROS_AUTHOR = "Martin Pecka <peckama2@fel.cvut.cz>"
HOMEPAGE = "https://github.com/peci1/tf2_server"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "tf2_server"
ROS_BPN = "tf2_server"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    nodelet \
    roscpp \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    nodelet \
    roscpp \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    nodelet \
    roscpp \
    rospy \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rostest \
    tf \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/peci1/tf2_server-release/archive/release/melodic/tf2_server/1.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/tf2_server"
SRC_URI = "git://github.com/peci1/tf2_server-release;${ROS_BRANCH};protocol=https"
SRCREV = "ca3b9a66bbf9155969dc0af986f362c6613e189d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
