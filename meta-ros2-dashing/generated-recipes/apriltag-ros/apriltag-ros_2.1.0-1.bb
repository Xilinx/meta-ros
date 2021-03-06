# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "AprilTag detection node"
AUTHOR = " <Rauch.Christian@gmx.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "apriltag_ros"
ROS_BPN = "apriltag_ros"

ROS_BUILD_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    libeigen \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    apriltag \
    apriltag-msgs \
    cv-bridge \
    image-transport \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/christianrauch/apriltag_ros-release/archive/release/dashing/apriltag_ros/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/apriltag_ros"
SRC_URI = "git://github.com/christianrauch/apriltag_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "7599fa1e936fd3bfa424e430857dffe395df7d7d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
