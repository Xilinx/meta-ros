# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Wrapper around libcurl, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/curl/curl"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & MIT"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_CN = "resource_retriever"
ROS_BPN = "libcurl_vendor"

ROS_BUILD_DEPENDS = " \
    curl \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    pkgconfig-native \
"

ROS_EXEC_DEPENDS = " \
    curl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/resource_retriever-release/archive/release/dashing/libcurl_vendor/2.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/libcurl_vendor"
SRC_URI = "git://github.com/ros2-gbp/resource_retriever-release;${ROS_BRANCH};protocol=https"
SRCREV = "c59c6ef15d37061b4587915ead218c8356617840"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
