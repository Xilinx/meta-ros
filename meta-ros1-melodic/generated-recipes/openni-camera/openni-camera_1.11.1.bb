# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A ROS driver for OpenNI depth (+ RGB) cameras. These include:         Microsoft Kinect,        PrimeSense PSDK,        ASUS Xtion Pro and Pro Live      The driver publishes raw depth, RGB, and IR image streams."
AUTHOR = "Isaac I.Y. Saito <130s@2000.jukuin.keio.ac.jp>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/openni_camera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni_camera"
ROS_BPN = "openni_camera"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    libusb1 \
    log4cxx \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    libusb1 \
    log4cxx \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenni-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    libusb1 \
    log4cxx \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/openni_camera-release/archive/release/melodic/openni_camera/1.11.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/openni_camera"
SRC_URI = "git://github.com/ros-gbp/openni_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "d35f393d93e4ab13d368bc87cc5477b27c8eeb3f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
