# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The iirob_filters package implements following filters:       1) Low-Pass       2) Moving Mean       3) Gravity Compensation (used for force-torque sensors)       4) Threshold Filter       5) Kalman Filter"
AUTHOR = "Denis Štogl <denis.stogl@kit.edu>"
ROS_AUTHOR = "Denis Štogl <denis.stogl@kit.edu>"
HOMEPAGE = "http://wiki.ros.org/iirob_filters"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPLv3"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "iirob_filters"
ROS_BPN = "iirob_filters"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    eigen-conversions \
    filters \
    geometry-msgs \
    pluginlib \
    roscpp \
    rosparam-handler \
    rostest \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    eigen-conversions \
    filters \
    geometry-msgs \
    pluginlib \
    roscpp \
    rosparam-handler \
    rostest \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    eigen-conversions \
    filters \
    geometry-msgs \
    pluginlib \
    roscpp \
    rosparam-handler \
    rostest \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/KITrobotics/iirob_filters-release/archive/release/melodic/iirob_filters/0.9.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/iirob_filters"
SRC_URI = "git://github.com/KITrobotics/iirob_filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "62775261cf1488d4e28319190086121c1b625d73"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
