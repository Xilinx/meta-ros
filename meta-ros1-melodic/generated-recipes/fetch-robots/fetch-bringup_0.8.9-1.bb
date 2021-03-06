# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Bringup for fetch"
AUTHOR = "Eric Relson <erelson@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1fcc2f243daac9b962ca04b90988c4f3"

ROS_CN = "fetch_robots"
ROS_BPN = "fetch_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    depth-image-proc \
    diagnostic-aggregator \
    fetch-description \
    fetch-drivers \
    fetch-moveit-config \
    fetch-navigation \
    fetch-open-auto-dock \
    fetch-teleop \
    graft \
    image-proc \
    joy \
    openni2-launch \
    ps3joy \
    robot-state-publisher \
    sensor-msgs \
    sick-tim \
    sound-play \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fetchrobotics-gbp/fetch_robots-release/archive/release/melodic/fetch_bringup/0.8.9-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fetch_bringup"
SRC_URI = "git://github.com/fetchrobotics-gbp/fetch_robots-release;${ROS_BRANCH};protocol=https"
SRCREV = "fc782e40649d8d0287a0f47aaf95c666042c8473"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
