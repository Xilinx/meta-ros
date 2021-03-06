# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A set of plugins for displaying occupancy information decoded from binary octomap messages."
AUTHOR = "Armin Hornung <armin@hornung.io>"
ROS_AUTHOR = "Julius Kammerl <jkammerl@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/octomap_rviz_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "octomap_rviz_plugins"
ROS_BPN = "octomap_rviz_plugins"

ROS_BUILD_DEPENDS = " \
    octomap \
    octomap-msgs \
    qtbase \
    roscpp \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    octomap \
    octomap-msgs \
    qtbase \
    roscpp \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/octomap_rviz_plugins-release/archive/release/noetic/octomap_rviz_plugins/0.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/octomap_rviz_plugins"
SRC_URI = "git://github.com/ros-gbp/octomap_rviz_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "78b0bbc4c2d2e4db30e5645620bd6c088e66b1e9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
