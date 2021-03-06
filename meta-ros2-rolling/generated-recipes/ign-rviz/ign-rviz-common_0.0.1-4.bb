# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Common libraries for ign_rviz and ign_rviz_plugins"
AUTHOR = "Sarathkrishnan Ramesh <sarathkrishnan99@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License, Version 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_CN = "ign_rviz"
ROS_BPN = "ign_rviz_common"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-gui5} \
    ${ROS_UNRESOLVED_DEP-ignition-math6} \
    geometry-msgs \
    rclcpp \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-gui5} \
    ${ROS_UNRESOLVED_DEP-ignition-math6} \
    geometry-msgs \
    rclcpp \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-gui5} \
    ${ROS_UNRESOLVED_DEP-ignition-math6} \
    geometry-msgs \
    rclcpp \
    tf2-geometry-msgs \
    tf2-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ign_rviz-release/archive/release/rolling/ign_rviz_common/0.0.1-4.tar.gz
ROS_BRANCH ?= "branch=release/rolling/ign_rviz_common"
SRC_URI = "git://github.com/ros2-gbp/ign_rviz-release;${ROS_BRANCH};protocol=https"
SRCREV = "9e9d7a7c46ed3e9b5d14ca3dc0567fd89badf506"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
