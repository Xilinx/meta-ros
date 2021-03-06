# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "meshes for the Aldebaran Robotics NAO"
AUTHOR = "Maxime Busy <mbusy@softbankrobotics.com>"
ROS_AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
HOMEPAGE = "http://github.com/ros-naoqi/nao_meshes/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License"
LICENSE = "CC-BY-NC-ND-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=cc423ec78844eb7f9a98d5df4d0f6289"

ROS_CN = "nao_meshes"
ROS_BPN = "nao_meshes"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-java} \
"

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

# matches with: https://github.com/ros-naoqi/nao_meshes-release/archive/release/melodic/nao_meshes/0.1.12-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/nao_meshes"
SRC_URI = "git://github.com/ros-naoqi/nao_meshes-release;${ROS_BRANCH};protocol=https"
SRCREV = "4f1d3cb3fc0783eef61fbcd39aa1a35713f4775f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
