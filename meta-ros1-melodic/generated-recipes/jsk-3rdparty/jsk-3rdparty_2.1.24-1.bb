# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>Metapackage that contains commonly used 3rdparty toolset for jsk-ros-pkg</p>"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/jsk_3rdparty"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_3rdparty"
ROS_BPN = "jsk_3rdparty"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp-devel \
    bayesian-belief-networks \
    dialogflow-task-executive \
    downward \
    ff \
    ffha \
    gdrive-ros \
    google-cloud-texttospeech \
    julius \
    julius-ros \
    libcmt \
    libsiftfast \
    mini-maxwell \
    nlopt \
    opt-camera \
    pgm-learner \
    rospatlite \
    rosping \
    rostwitter \
    sesame-ros \
    slic \
    voice-text \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp-devel \
    bayesian-belief-networks \
    dialogflow-task-executive \
    downward \
    ff \
    ffha \
    gdrive-ros \
    google-cloud-texttospeech \
    julius \
    julius-ros \
    libcmt \
    libsiftfast \
    mini-maxwell \
    nlopt \
    opt-camera \
    pgm-learner \
    rospatlite \
    rosping \
    rostwitter \
    sesame-ros \
    slic \
    voice-text \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/jsk_3rdparty/2.1.24-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_3rdparty"
SRC_URI = "git://github.com/tork-a/jsk_3rdparty-release;${ROS_BRANCH};protocol=https"
SRCREV = "4ac34f0e229539294a8621a3484d68c9385ff244"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
