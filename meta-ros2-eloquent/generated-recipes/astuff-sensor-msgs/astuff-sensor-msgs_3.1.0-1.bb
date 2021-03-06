# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Messages specific to AStuff-provided sensors."
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Joshua Whitley <jwhitley@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/astuff_sensor_msgs"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "astuff_sensor_msgs"
ROS_BPN = "astuff_sensor_msgs"

ROS_BUILD_DEPENDS = " \
    ros-environment \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    delphi-esr-msgs \
    delphi-srr-msgs \
    derived-object-msgs \
    ibeo-msgs \
    kartech-linear-actuator-msgs \
    mobileye-560-660-msgs \
    neobotix-usboard-msgs \
    pacmod-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/astuff/astuff_sensor_msgs-release/archive/release/eloquent/astuff_sensor_msgs/3.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/astuff_sensor_msgs"
SRC_URI = "git://github.com/astuff/astuff_sensor_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "4a3244703c68e6efece5c7f5634518f185128265"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
