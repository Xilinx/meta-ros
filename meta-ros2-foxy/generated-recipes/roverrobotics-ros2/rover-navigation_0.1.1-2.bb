# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Contains Rover navigation launch files"
AUTHOR = "Nick Padilla <nickpadilla@roverrobotics.com>"
ROS_AUTHOR = "Rover Robotics <info@roverrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "roverrobotics_ros2"
ROS_BPN = "rover_navigation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher \
    launch \
    launch-ros \
    nav2-amcl \
    nav2-behavior-tree \
    nav2-bt-navigator \
    nav2-controller \
    nav2-core \
    nav2-costmap-2d \
    nav2-dwb-controller \
    nav2-lifecycle-manager \
    nav2-map-server \
    nav2-msgs \
    nav2-navfn-planner \
    nav2-planner \
    nav2-recoveries \
    nav2-rviz-plugins \
    nav2-util \
    nav2-voxel-grid \
    nav2-waypoint-follower \
    rviz2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/RoverRobotics-release/roverrobotics_ros2-release/archive/release/foxy/rover_navigation/0.1.1-2.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rover_navigation"
SRC_URI = "git://github.com/RoverRobotics-release/roverrobotics_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "d029d37607000bea9fb8807a258992bee3c2774c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
