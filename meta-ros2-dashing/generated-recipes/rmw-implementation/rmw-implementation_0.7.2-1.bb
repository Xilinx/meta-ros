# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "The decision which ROS middleware implementation should be used for C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_implementation"
ROS_BPN = "rmw_implementation"

ROS_BUILD_DEPENDS = " \
    poco \
    poco-vendor \
    rcutils \
    rmw \
    rmw-connext-cpp \
    rmw-fastrtps-cpp \
    rmw-implementation-cmake \
    rmw-opensplice-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    poco \
    poco-vendor \
    rmw-implementation-cmake \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    poco \
    poco-vendor \
    rmw-implementation-cmake \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmw_implementation-release/archive/release/dashing/rmw_implementation/0.7.2-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rmw_implementation"
SRC_URI = "git://github.com/ros2-gbp/rmw_implementation-release;${ROS_BRANCH};protocol=https"
SRCREV = "22e2cd05b09b108ee205cec0b2f92d19ba7a2b37"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
