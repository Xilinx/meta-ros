# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The swri_transform_util package contains utility functions and classes for      transforming between coordinate frames."
AUTHOR = "Marc Alban <malban@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_transform_util"

ROS_BUILD_DEPENDS = " \
    boost \
    cv-bridge \
    diagnostic-msgs \
    genpy \
    geographic-msgs \
    geometry-msgs \
    geos \
    gps-common \
    marti-nav-msgs \
    nodelet \
    proj \
    roscpp \
    rospy \
    swri-math-util \
    swri-nodelet \
    swri-roscpp \
    swri-yaml-util \
    tf \
    topic-tools \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ${PYTHON_PN}-setuptools-native \
    catkin-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cv-bridge \
    diagnostic-msgs \
    genpy \
    geographic-msgs \
    geometry-msgs \
    geos \
    gps-common \
    marti-nav-msgs \
    nodelet \
    proj \
    roscpp \
    rospy \
    swri-math-util \
    swri-nodelet \
    swri-roscpp \
    swri-yaml-util \
    tf \
    topic-tools \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-numpy \
    boost \
    cv-bridge \
    diagnostic-msgs \
    genpy \
    geographic-msgs \
    geometry-msgs \
    geos \
    gps-common \
    marti-nav-msgs \
    nodelet \
    proj \
    roscpp \
    rospy \
    sensor-msgs \
    swri-math-util \
    swri-nodelet \
    swri-roscpp \
    swri-yaml-util \
    tf \
    topic-tools \
    yaml-cpp \
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

# matches with: https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_transform_util/2.14.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/swri_transform_util"
SRC_URI = "git://github.com/swri-robotics-gbp/marti_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "131d46cb21c9dc9a3cd14b5ee148c311a75685ae"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
