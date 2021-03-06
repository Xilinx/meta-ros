# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Collecting, tracking and generating statistics for ar markers from ar_track_alvar."
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "http://wiki.ros.org/yocs_ar_marker_tracking"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_ar_marker_tracking"

ROS_BUILD_DEPENDS = " \
    ar-track-alvar-msgs \
    geometry-msgs \
    roscpp \
    sensor-msgs \
    yaml-cpp \
    yocs-math-toolkit \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ar-track-alvar-msgs \
    geometry-msgs \
    roscpp \
    sensor-msgs \
    yaml-cpp \
    yocs-math-toolkit \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ar-track-alvar-msgs \
    geometry-msgs \
    roscpp \
    sensor-msgs \
    yaml-cpp \
    yocs-math-toolkit \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_ar_marker_tracking/0.8.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/yocs_ar_marker_tracking"
SRC_URI = "git://github.com/yujinrobot-release/yujin_ocs-release;${ROS_BRANCH};protocol=https"
SRCREV = "e7ccbec46089bbf915f94a7df333cd9b177be941"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
