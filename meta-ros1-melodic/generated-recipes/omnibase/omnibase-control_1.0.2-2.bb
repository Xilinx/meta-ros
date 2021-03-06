# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The omnibase_control package"
AUTHOR = "Harshal Deshpande <hardesh1deshpande@gmail.com>"
ROS_AUTHOR = "Harshal Deshpande <hardesh1deshpande@gmail.com>"
HOMEPAGE = "https://erc-bpgc.github.io/omnibase/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "omnibase"
ROS_BPN = "omnibase_control"

ROS_BUILD_DEPENDS = " \
    effort-controllers \
    geometry-msgs \
    joint-state-controller \
    joint-trajectory-controller \
    nav-msgs \
    position-controllers \
    roscpp \
    rospy \
    std-msgs \
    velocity-controllers \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    effort-controllers \
    geometry-msgs \
    joint-state-controller \
    joint-trajectory-controller \
    nav-msgs \
    position-controllers \
    roscpp \
    rospy \
    std-msgs \
    velocity-controllers \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    effort-controllers \
    geometry-msgs \
    joint-state-controller \
    joint-trajectory-controller \
    nav-msgs \
    position-controllers \
    roscpp \
    rospy \
    std-msgs \
    velocity-controllers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ERC-BPGC/omnibase-release/archive/release/melodic/omnibase_control/1.0.2-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/omnibase_control"
SRC_URI = "git://github.com/ERC-BPGC/omnibase-release;${ROS_BRANCH};protocol=https"
SRCREV = "2a2f8b79436cdaa50b852a4f815ff56c9ef1584d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
