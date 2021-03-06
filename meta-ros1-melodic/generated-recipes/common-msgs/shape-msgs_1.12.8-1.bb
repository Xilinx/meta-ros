# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains messages for defining shapes, such as simple solid     object primitives (cube, sphere, etc), planes, and meshes."
AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
ROS_AUTHOR = "Ioan Sucan <isucan@willowgarage.com>"
HOMEPAGE = "http://wiki.ros.org/shape_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "common_msgs"
ROS_BPN = "shape_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/shape_msgs/1.12.8-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/shape_msgs"
SRC_URI = "git://github.com/ros-gbp/common_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "105e42f64c9aebc156ee885463efbfd01a3b6ad9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
