# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure    to represent the kinematic and dynamic parameters of a robot    mechanism. <tt>kdl_parser_py</tt> provides Python tools to construct a KDL    tree from an XML robot representation in URDF."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
ROS_AUTHOR = "Jonathan Bohren <jonathan.bohren@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/kdl_parser_py"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kdl_parser"
ROS_BPN = "kdl_parser_py"

ROS_BUILD_DEPENDS = " \
    orocos-kdl \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ${PYTHON_PN}-catkin-pkg-native \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    orocos-kdl \
    python-orocos-kdl \
    urdf \
    urdfdom-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    orocos-kdl \
    python-orocos-kdl \
    urdf \
    urdfdom-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/kdl_parser-release/archive/release/melodic/kdl_parser_py/1.13.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/kdl_parser_py"
SRC_URI = "git://github.com/ros-gbp/kdl_parser-release;${ROS_BRANCH};protocol=https"
SRCREV = "85f929346bad8c6967e6c1f5605dce3a19830614"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
