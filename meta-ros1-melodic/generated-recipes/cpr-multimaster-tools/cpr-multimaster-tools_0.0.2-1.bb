# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Multi-master tools for configuration and message relaying"
AUTHOR = "Paul Bovbel <pbovbel@clearpath.ai>"
ROS_AUTHOR = "Paul Bovbel <pbovbel@clearpath.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cpr_multimaster_tools"
ROS_BPN = "cpr_multimaster_tools"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    clock-relay \
    message-relay \
    multimaster-launch \
    multimaster-msgs \
    tf2-relay \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/cpr_multimaster_tools/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cpr_multimaster_tools"
SRC_URI = "git://github.com/clearpath-gbp/cpr_multimaster_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "8a464a750587bfac009d5a16b2e08328dd32a249"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
