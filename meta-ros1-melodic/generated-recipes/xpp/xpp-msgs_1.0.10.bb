# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS messages used in the XPP framework."
AUTHOR = "Alexander W. Winkler <alexander.w.winkler@gmail.com>"
ROS_AUTHOR = "Alexander W. Winkler"
HOMEPAGE = "http://github.com/leggedrobotics/xpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "xpp"
ROS_BPN = "xpp_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-generation \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-generation \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_msgs/1.0.10-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/xpp_msgs"
SRC_URI = "git://github.com/leggedrobotics/xpp-release;${ROS_BRANCH};protocol=https"
SRCREV = "f1d22ef72cdfea300b685d689a08c26223ebcda4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
