# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The pr2_self_test package"
AUTHOR = "David Feil-Seifer <dave@cse.unr.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "TODO"
LICENSE = "TODO-CATKIN-PACKAGE-LICENSE"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "pr2_self_test"
ROS_BPN = "pr2_self_test"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-qualification-controllers \
    pr2-bringup-tests \
    pr2-counterbalance-check \
    pr2-self-test-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-qualification-controllers \
    pr2-bringup-tests \
    pr2-counterbalance-check \
    pr2-self-test-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_self_test-release/archive/release/melodic/pr2_self_test/1.0.15-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_self_test"
SRC_URI = "git://github.com/pr2-gbp/pr2_self_test-release;${ROS_BRANCH};protocol=https"
SRCREV = "2268b8021d4a726fbd8e14a9c75f055157affe19"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
