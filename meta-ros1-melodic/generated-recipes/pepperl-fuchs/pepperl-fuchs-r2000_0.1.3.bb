# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The Pepperl+Fuchs R2000 laser range finder driver package"
AUTHOR = "Denis Dillenberger <denis.dillenberger@gmail.com>"
ROS_AUTHOR = "Denis Dillenberger <denis.dillenberger@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/pepperl_fuchs_r2000"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pepperl_fuchs"
ROS_BPN = "pepperl_fuchs_r2000"

ROS_BUILD_DEPENDS = " \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/dillenberger/pepperl_fuchs-release/archive/release/melodic/pepperl_fuchs_r2000/0.1.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pepperl_fuchs_r2000"
SRC_URI = "git://github.com/dillenberger/pepperl_fuchs-release;${ROS_BRANCH};protocol=https"
SRCREV = "42866a0b54e9869b575e72c1d1c9531365c9d357"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
