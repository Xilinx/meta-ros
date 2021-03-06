# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains the source code for testing and comparing trac_ik"
AUTHOR = "Patrick Beeson <pbeeson@traclabs.com>"
ROS_AUTHOR = "Patrick Beeson"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "trac_ik"
ROS_BPN = "trac_ik_examples"

ROS_BUILD_DEPENDS = " \
    boost \
    orocos-kdl \
    trac-ik-lib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    orocos-kdl \
    trac-ik-lib \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    orocos-kdl \
    trac-ik-lib \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_examples/1.5.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/trac_ik_examples"
SRC_URI = "git://github.com/traclabs/trac_ik-release;${ROS_BRANCH};protocol=https"
SRCREV = "9dcef813b8dbe695632793bda1aa3599810eb9ca"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
