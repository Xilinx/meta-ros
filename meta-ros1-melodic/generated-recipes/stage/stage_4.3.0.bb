# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Mobile robot simulator http://rtv.github.com/Stage"
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Richard Vaughan <vaughan@sfu.ca>"
HOMEPAGE = "http://rtv.github.com/Stage"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

ROS_CN = "stage"
ROS_BPN = "stage"

ROS_BUILD_DEPENDS = " \
    fltk \
    gtk+ \
    jpeg \
    libtool \
    mesa \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    fltk \
    gtk+ \
    jpeg \
    mesa \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    fltk \
    gtk+ \
    jpeg \
    mesa \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/stage-release/archive/release/melodic/stage/4.3.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/stage"
SRC_URI = "git://github.com/ros-gbp/stage-release;${ROS_BRANCH};protocol=https"
SRCREV = "ee98d472a5dce094f09dce29faa5b799561284e4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
