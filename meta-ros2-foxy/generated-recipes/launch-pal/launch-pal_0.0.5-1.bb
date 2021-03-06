# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Utilities for launch files"
AUTHOR = "user <victor.lopez@pal-robotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=211ba54883815de9f52a3dcd9f281523"

ROS_CN = "launch_pal"
ROS_BPN = "launch_pal"

ROS_BUILD_DEPENDS = " \
    ament-index-python \
    launch \
    launch-ros \
    python3-pyyaml \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ament-index-python \
    launch \
    launch-ros \
    python3-pyyaml \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    launch \
    launch-ros \
    python3-pyyaml \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pal-gbp/launch_pal-release/archive/release/foxy/launch_pal/0.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/launch_pal"
SRC_URI = "git://github.com/pal-gbp/launch_pal-release;${ROS_BRANCH};protocol=https"
SRCREV = "55fbcbb719b314a1cf9895060d3f53463bf0e186"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
