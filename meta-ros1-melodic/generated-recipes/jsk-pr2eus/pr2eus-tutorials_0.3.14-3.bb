# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "pr2eus_tutorials"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/pr2eus_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_pr2eus"
ROS_BPN = "pr2eus_tutorials"

ROS_BUILD_DEPENDS = " \
    jsk-pcl-ros \
    pr2eus \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    jsk-interactive-marker \
    jsk-pcl-ros \
    pr2eus \
    roseus-tutorials \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    jsk-interactive-marker \
    jsk-pcl-ros \
    pr2eus \
    roseus-tutorials \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_pr2eus-release/archive/release/melodic/pr2eus_tutorials/0.3.14-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2eus_tutorials"
SRC_URI = "git://github.com/tork-a/jsk_pr2eus-release;${ROS_BRANCH};protocol=https"
SRCREV = "446c17a82fc15af80974345f630d3b9b8a420469"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
