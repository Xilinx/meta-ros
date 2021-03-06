# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Complete functionality tests for PR2. Contains utilities designed to test and verify devices, mechanicals and sensors."
AUTHOR = "David Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Kevin Watts"
HOMEPAGE = "http://ros.org/wiki/pr2_bringup_tests"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_self_test"
ROS_BPN = "pr2_bringup_tests"

ROS_BUILD_DEPENDS = " \
    camera-calibration \
    ethercat-trigger-controllers \
    image-view \
    pr2-bringup \
    pr2-controller-manager \
    pr2-mannequin-mode \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-calibration \
    ethercat-trigger-controllers \
    image-view \
    pr2-bringup \
    pr2-controller-manager \
    pr2-mannequin-mode \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-calibration \
    ethercat-trigger-controllers \
    image-view \
    pr2-bringup \
    pr2-controller-manager \
    pr2-mannequin-mode \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_self_test-release/archive/release/melodic/pr2_bringup_tests/1.0.15-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_bringup_tests"
SRC_URI = "git://github.com/pr2-gbp/pr2_self_test-release;${ROS_BRANCH};protocol=https"
SRCREV = "9e3c911e3f3f30b39382917769cb5bd0e52fcaf9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
