# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Common utilities for interacting with AWS S3"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "rosbag_uploader"
ROS_BPN = "s3_common"

ROS_BUILD_DEPENDS = " \
    aws-common \
    boost \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
    boost \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
    boost \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/rosbag_uploader-release/archive/release/melodic/s3_common/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/s3_common"
SRC_URI = "git://github.com/aws-gbp/rosbag_uploader-release;${ROS_BRANCH};protocol=https"
SRCREV = "1a22efd70cdb184e2ca531eedf55dfb98f7e4c9c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
