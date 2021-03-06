# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "CloudWatch Logger node for publishing logs to AWS CloudWatch Logs"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/cloudwatch_logger"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cloudwatch_logger"
ROS_BPN = "cloudwatch_logger"

ROS_BUILD_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-logs-common \
    roscpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-logs-common \
    roscpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-logs-common \
    roscpp \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/cloudwatch_logger-release/archive/release/melodic/cloudwatch_logger/2.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cloudwatch_logger"
SRC_URI = "git://github.com/aws-gbp/cloudwatch_logger-release;${ROS_BRANCH};protocol=https"
SRCREV = "3cd9e601dfd1413f8d66feaa17fdd69f6e668fa0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
