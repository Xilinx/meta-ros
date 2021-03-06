# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The bullet library. See https://code.google.com/p/bullet"
AUTHOR = "Mario Prats <marioprats@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Check author's website"
LICENSE = "Check-authors-website"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=679c9cd200147a32831f0d7c812990b5"

ROS_CN = "uwsim_bullet"
ROS_BPN = "uwsim_bullet"

ROS_BUILD_DEPENDS = " \
    freeglut \
    libxext \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    freeglut \
    libxext \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    freeglut \
    libxext \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uji-ros-pkg/uwsim_bullet-release/archive/release/melodic/uwsim_bullet/2.82.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/uwsim_bullet"
SRC_URI = "git://github.com/uji-ros-pkg/uwsim_bullet-release;${ROS_BRANCH};protocol=https"
SRCREV = "ca5d14bb102a39304ad6330035e8660e722e7d53"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
