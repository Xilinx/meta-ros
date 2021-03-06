# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The LIDAR Detection and Tracking of Moving Objects package"
AUTHOR = "Kostas Konstantinidis <kostaskonkk@gmail.com>"
ROS_AUTHOR = "Kostas Konstantinidis <kostaskonkk@gmail.com>"
HOMEPAGE = "https://github.com/kostaskonkk/datmo"
SECTION = "devel"
LICENSE = "BSD & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "datmo"
ROS_BPN = "datmo"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    libeigen \
    message-generation \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-geometry-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/kostaskonkk/datmo-release/archive/release/melodic/datmo/0.1.2-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/datmo"
SRC_URI = "git://github.com/kostaskonkk/datmo-release;${ROS_BRANCH};protocol=https"
SRCREV = "0a921021e84d65fa6589969d677a6b789bfcec74"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
