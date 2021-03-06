# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launch files and configuration files needed to run the calibration pipeline on PR2. This package is      still experimental. Expect large changes tp occur."
AUTHOR = "Dave Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://www.ros.org/wiki/pr2_calibration_launch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_calibration"
ROS_BPN = "pr2_calibration_launch"

ROS_BUILD_DEPENDS = " \
    calibration-estimation \
    calibration-launch \
    calibration-msgs \
    geometry-msgs \
    image-cb-detector \
    image-view \
    kdl-parser \
    laser-cb-detector \
    laser-joint-processor \
    laser-joint-projector \
    message-generation \
    monocam-settler \
    pr2-dense-laser-snapshotter \
    pr2-teleop \
    python-orocos-kdl \
    robot-mechanism-controllers \
    rospy \
    rostest \
    sensor-msgs \
    stereo-image-proc \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    calibration-estimation \
    calibration-launch \
    calibration-msgs \
    geometry-msgs \
    image-cb-detector \
    image-view \
    kdl-parser \
    laser-cb-detector \
    laser-joint-processor \
    laser-joint-projector \
    message-runtime \
    monocam-settler \
    pr2-dense-laser-snapshotter \
    pr2-teleop \
    python-orocos-kdl \
    robot-mechanism-controllers \
    rospy \
    rostest \
    sensor-msgs \
    stereo-image-proc \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    calibration-estimation \
    calibration-launch \
    calibration-msgs \
    geometry-msgs \
    image-cb-detector \
    image-view \
    kdl-parser \
    laser-cb-detector \
    laser-joint-processor \
    laser-joint-projector \
    message-runtime \
    monocam-settler \
    pr2-dense-laser-snapshotter \
    pr2-teleop \
    python-orocos-kdl \
    robot-mechanism-controllers \
    rospy \
    rostest \
    sensor-msgs \
    stereo-image-proc \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UNR-RoboticsResearchLab/pr2_calibration-release/archive/release/melodic/pr2_calibration_launch/1.0.11-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_calibration_launch"
SRC_URI = "git://github.com/UNR-RoboticsResearchLab/pr2_calibration-release;${ROS_BRANCH};protocol=https"
SRCREV = "92465ec68d5a918cafdaab1eb3843b2cd0ce10c1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
