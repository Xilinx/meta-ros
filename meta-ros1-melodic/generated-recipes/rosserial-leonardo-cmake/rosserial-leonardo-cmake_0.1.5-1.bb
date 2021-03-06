# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "CMake scripts for building Arduino Leonardo (atmega32u4) Firmwares"
AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MPL & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e6edcdce62cccda22710dc9415f3477"

ROS_CN = "rosserial_leonardo_cmake"
ROS_BPN = "rosserial_leonardo_cmake"

ROS_BUILD_DEPENDS = " \
    tar \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-avr-libc} \
    ${ROS_UNRESOLVED_DEP-avrdude} \
    ${ROS_UNRESOLVED_DEP-gcc-avr} \
    rosserial-arduino \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-avr-libc} \
    ${ROS_UNRESOLVED_DEP-avrdude} \
    ${ROS_UNRESOLVED_DEP-gcc-avr} \
    rosserial-arduino \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/rosserial_leonardo_cmake-release/archive/release/melodic/rosserial_leonardo_cmake/0.1.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rosserial_leonardo_cmake"
SRC_URI = "git://github.com/clearpath-gbp/rosserial_leonardo_cmake-release;${ROS_BRANCH};protocol=https"
SRCREV = "c32a4716bb478e1446a3ed197fe2518c8aea9927"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
