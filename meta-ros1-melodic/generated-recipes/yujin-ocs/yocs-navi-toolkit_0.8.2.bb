# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Ros navigation utilities."
AUTHOR = "Daniel Stonier <stonier@yujinrobot.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "https://github.com/yujinrobot/yujin_ocs"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Yujin Robot"
LICENSE = "Yujin-Robot"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a9f99b3452a89416bf7474e0b60ab849"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_navi_toolkit"

ROS_BUILD_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    ecl-build \
    ecl-linear-algebra \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    ecl-build \
    ecl-linear-algebra \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    ecl-build \
    ecl-linear-algebra \
    nav-msgs \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_navi_toolkit/0.8.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/yocs_navi_toolkit"
SRC_URI = "git://github.com/yujinrobot-release/yujin_ocs-release;${ROS_BRANCH};protocol=https"
SRCREV = "1db3ffa9d9c608362f0239a2e501bb15f7206650"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
