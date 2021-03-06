# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A collection of ROS utilities for using WebRTC with ROS"
AUTHOR = "Timo Röhling <timo.roehling@fkie.fraunhofer.de>"
ROS_AUTHOR = "Mitchell Wills <mwills@wpi.edu>"
HOMEPAGE = "http://wiki.ros.org/webrtc_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "webrtc_ros"
ROS_BPN = "webrtc_ros"

ROS_BUILD_DEPENDS = " \
    async-web-server-cpp \
    cv-bridge \
    image-transport \
    message-generation \
    nodelet \
    roscpp \
    std-msgs \
    webrtc \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    async-web-server-cpp \
    cv-bridge \
    image-transport \
    message-runtime \
    nodelet \
    roscpp \
    std-msgs \
    webrtc \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    async-web-server-cpp \
    cv-bridge \
    image-transport \
    message-runtime \
    nodelet \
    roscpp \
    std-msgs \
    webrtc \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/RobotWebTools-release/webrtc_ros-release/archive/release/melodic/webrtc_ros/59.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/webrtc_ros"
SRC_URI = "git://github.com/RobotWebTools-release/webrtc_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "f77c6fc2ea8563c0bbe8626cc3f6ddd12e477a9a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
