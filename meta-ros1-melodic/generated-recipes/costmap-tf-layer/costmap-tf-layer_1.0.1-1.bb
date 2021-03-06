# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS-package that implements a costmap layer populated by observing tf frames."
AUTHOR = "Igor Banfi <banfi.igor@windowslive.com>"
ROS_AUTHOR = "Igor Banfi <banfi.igor@windowslive.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "costmap_tf_layer"
ROS_BPN = "costmap_tf_layer"

ROS_BUILD_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    pluginlib \
    roscpp \
    rospy \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    pluginlib \
    roscpp \
    rospy \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    pluginlib \
    roscpp \
    rospy \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/igorbanfi/costmap_tf_layer-release/archive/release/melodic/costmap_tf_layer/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/costmap_tf_layer"
SRC_URI = "git://github.com/igorbanfi/costmap_tf_layer-release;${ROS_BRANCH};protocol=https"
SRCREV = "f6dca38547d8c41f73392be4ae3abe902c8d099a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
