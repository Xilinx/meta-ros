# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "RQT plugin for monitoring ROS processes."
AUTHOR = "Dan Lazewatsky <dan@lazewatsky.com>"
ROS_AUTHOR = "Dan Lazewatsky <dan@lazewatsky.com>"
HOMEPAGE = "http://wiki.ros.org/rqt_top"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_top"
ROS_BPN = "rqt_top"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-psutil \
    python-qt-binding \
    rospy \
    rqt-gui \
    rqt-gui-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-psutil \
    python-qt-binding \
    rospy \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rqt_top-release/archive/release/melodic/rqt_top/0.4.8-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_top"
SRC_URI = "git://github.com/ros-gbp/rqt_top-release;${ROS_BRANCH};protocol=https"
SRCREV = "aaa70490032c0ea2b63cd62b400a595b54d273d9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
