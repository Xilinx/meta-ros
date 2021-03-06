# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>URDF Description package for FSRobo-R</p>     <p>This package contains configuration data, 3D models and launch files for FSRobo-R robot</p>"
AUTHOR = "F-ROSROBO <F-ROSROBO@fsi.co.jp>"
ROS_AUTHOR = "F-ROSROBO <F-ROSROBO@fsi.co.jp>"
HOMEPAGE = "http://wiki.ros.org/fsrobo_r_description"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fsrobo_r"
ROS_BPN = "fsrobo_r_description"

ROS_BUILD_DEPENDS = " \
    roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    joint-state-publisher \
    robot-state-publisher \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    joint-state-publisher \
    robot-state-publisher \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/FUJISOFT-Robotics/fsrobo_r-release/archive/release/melodic/fsrobo_r_description/0.7.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/fsrobo_r_description"
SRC_URI = "git://github.com/FUJISOFT-Robotics/fsrobo_r-release;${ROS_BRANCH};protocol=https"
SRCREV = "dd7fde1e645a0ec5aa7a01f7935a770e2b979c55"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
