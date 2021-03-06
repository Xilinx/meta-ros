# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The denso robot bringup package includes launch files for starting denso robot nodes."
AUTHOR = "DENSO WAVE INCORPORATED <fa-support@denso-wave.com>"
ROS_AUTHOR = "DENSO WAVE INCORPORATED <fa-support@denso-wave.com>"
HOMEPAGE = "http://ros.org/wiki/denso_robot_bringup"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "denso_robot_ros"
ROS_BPN = "denso_robot_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DENSORobot/denso_robot_ros-release/archive/release/melodic/denso_robot_bringup/3.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/denso_robot_bringup"
SRC_URI = "git://github.com/DENSORobot/denso_robot_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "ede5c27f7cd5a958524936917f6428b41b586696"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
