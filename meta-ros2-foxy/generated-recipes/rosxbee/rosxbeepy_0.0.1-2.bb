# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "A ROS2 wrapper for xbee devices using digi-xbee python API"
AUTHOR = "Sudharsan <sudharsansci@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ROSXBeepy"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "TODO: License declaration"
LICENSE = "TODO-License-declaration"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=782925c2d55d09052e1842a0b4886802"

ROS_CN = "rosxbee"
ROS_BPN = "rosxbeepy"

ROS_BUILD_DEPENDS = " \
    rclpy \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    rclpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/Sudharsan10/ROSXBee-release/archive/release/foxy/rosxbeepy/0.0.1-2.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rosxbeepy"
SRC_URI = "git://github.com/Sudharsan10/ROSXBee-release;${ROS_BRANCH};protocol=https"
SRCREV = "7a075d99b2fede4f847eed3698e3373950e7fc18"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
