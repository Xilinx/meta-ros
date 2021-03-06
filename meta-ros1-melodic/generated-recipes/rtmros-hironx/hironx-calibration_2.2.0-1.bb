# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launch and configuration files for calibrating hironx using the generic <a href="http://wiki.ros.org/calibration_setup_helper">calibration_setup_helper</a> package.     THIS FILE IS AUTOMATICALLY GENERATED BY:<br/>    <code>    rosrun calibration_setup_helper calibration_setup_helper.py `rospack find hironx_moveit_config`/HiroNX.urdf --base-link CHEST_JOINT0_Link --arm-tip-link RARM_JOINT5_Link --head-tip-link HEAD_JOINT1_Link --arm-controller=rarm_controller/command --head-controller=head_controller/command --head-camera-frame camera_rgb_optical_frame --head-camera-joint head_to_kinect_joint    </code>"
AUTHOR = "TORK <dev@opensource-robotics.tokyo.jp>"
ROS_AUTHOR = "Kei Okada"
HOMEPAGE = "http://ros.org/wiki/hironx_calibration"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtmros_hironx"
ROS_BPN = "hironx_calibration"

ROS_BUILD_DEPENDS = " \
    hironx-moveit-config \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    calibration-estimation \
    calibration-launch \
    hironx-moveit-config \
    kdl-parser \
    openni2-launch \
    orocos-kdl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    calibration-estimation \
    calibration-launch \
    hironx-moveit-config \
    kdl-parser \
    openni2-launch \
    orocos-kdl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtmros_hironx-release/archive/release/melodic/hironx_calibration/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/hironx_calibration"
SRC_URI = "git://github.com/tork-a/rtmros_hironx-release;${ROS_BRANCH};protocol=https"
SRCREV = "2f8dc3013bd971844af8b5f5c3fb4cabb93361b6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
