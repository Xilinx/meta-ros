# Copyright (c) 2020-2021 LG Electronics, Inc.
# Copyright (C) 2023 Advanced Micro Devices, Inc.  All rights reserved.

# Make this conditional on meta-qt5, because otherwise builds without
# meta-qt5 fail to parse, before turtlesim is PNBLACKLISTed based
# on qt5 in ROS_WORLD_SKIP_GROUPS
# ERROR: ParseError at meta-ros/meta-ros2-dashing/recipes-bbappends/turtlesim/turtlesim_%.bbappend:3: Could not inherit file classes/cmake_qt5.bbclass
inherit ${@bb.utils.contains('BBFILE_COLLECTIONS', 'qt5-layer', 'cmake_qt5', '', d)}

# Keep in mind that this needs widgets enabled in qtbase PACKAGECONFIG which webOS OSE explicitly disables:
# meta-webos/recipes-qt/qt5/qtbase_git.bbappend:PACKAGECONFIG:remove = "widgets"

DEPENDS += " \
    rosidl-typesupport-fastrtps-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
"

# ERROR: turtlesim-1.4.1-3-r0 do_package: QA Issue: turtlesim: Files/directories were installed but not shipped in any package:
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/turtlesim_s__rosidl_typesupport_introspection_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/turtlesim_s__rosidl_typesupport_fastrtps_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/turtlesim_s__rosidl_typesupport_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/msg
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/action
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_teleport_relative.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_set_pen.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_spawn.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_spawn_s.c
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_teleport_absolute.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_set_pen_s.c
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_kill.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_teleport_relative_s.c
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_teleport_absolute_s.c
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/srv/_kill_s.c
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/msg/_pose.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/msg/_color.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/msg/_color_s.c
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/msg/_pose_s.c
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/msg/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/action/_rotate_absolute.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/action/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/turtlesim/action/_rotate_absolute_s.c
# Please set FILES such that these items are packaged. Alternatively if they are unneeded, avoid installing them or delete them within do_install.
# turtlesim: 26 installed and not shipped files. [installed-vs-shipped]
# ERROR: turtlesim-1.4.1-3-r0 do_package: Fatal QA errors found, failing task.
# ERROR: Logfile of failure stored in: /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/turtlesim/1.4.1-3-r0/temp/log.do_package.2337613
# ERROR: Task (/group/bcapps/sandeepg/yocto/2022.2/yp-dev/sources/core/../meta-ros/meta-ros2-humble/generated-recipes/turtlesim/turtlesim_1.4.1-3.bb:do_package) failed with exit code '1'

# Fix for Honister release only:
inherit distutils3-base

