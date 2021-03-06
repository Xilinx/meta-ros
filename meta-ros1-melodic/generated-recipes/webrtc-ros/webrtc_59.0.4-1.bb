# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "WebRTC Native API"
AUTHOR = "Timo Röhling <timo.roehling@fkie.fraunhofer.de>"
ROS_AUTHOR = "Mitchell Wills <mwills@wpi.edu>"
HOMEPAGE = "http://wiki.ros.org/webrtc"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "webrtc_ros"
ROS_BPN = "webrtc"

ROS_BUILD_DEPENDS = " \
    alsa-lib \
    glib-2.0 \
    gtk+ \
    gtk+3 \
    pulseaudio \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
    git-native \
    wget-native \
"

ROS_EXPORT_DEPENDS = " \
    alsa-lib \
    glib-2.0 \
    gtk+ \
    gtk+3 \
    pulseaudio \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    alsa-lib \
    glib-2.0 \
    gtk+ \
    gtk+3 \
    pulseaudio \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/RobotWebTools-release/webrtc_ros-release/archive/release/melodic/webrtc/59.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/webrtc"
SRC_URI = "git://github.com/RobotWebTools-release/webrtc_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "ccab2879497a0aca8e3ef4745085d600537d6413"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
