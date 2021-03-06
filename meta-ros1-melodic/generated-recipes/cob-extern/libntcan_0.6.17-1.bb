# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package wraps the libntcan to use it as a ros dependency."
AUTHOR = "Florian Weisshardt <fmw@ipa.fhg.de>"
ROS_AUTHOR = "Florian Weisshardt"
HOMEPAGE = "http://www.esd-electronics.com"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "proprietary"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=8904d09133e0eadd3d9a60ebfd4e2abe"

ROS_CN = "cob_extern"
ROS_BPN = "libntcan"

ROS_BUILD_DEPENDS = " \
    dpkg \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dpkg \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dpkg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_extern-release/archive/release/melodic/libntcan/0.6.17-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/libntcan"
SRC_URI = "git://github.com/ipa320/cob_extern-release;${ROS_BRANCH};protocol=https"
SRCREV = "7a58ecb3d5219280d8cd3e6a549e0383cdf9dfdc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
