# Copyright (C) 2023 Advanced Micro Devices, Inc.  All rights reserved.

# ERROR: xacro-2.0.7-3-r0 do_package: QA Issue: xacro: Files/directories were installed but not shipped in any package:
#   /tmp
#   /tmp/sandeepg
#   /tmp/sandeepg/yocto
#   /tmp/sandeepg/yocto/2022.2
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro-2.0.7-py3.9.egg-info
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro-2.0.7-py3.9.egg-info/SOURCES.txt
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro-2.0.7-py3.9.egg-info/dependency_links.txt
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro-2.0.7-py3.9.egg-info/top_level.txt
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro-2.0.7-py3.9.egg-info/PKG-INFO
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro/xmlutils.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro/substitution_args.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro/color.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-zynqmp-ros/work/cortexa72-cortexa53-xilinx-linux/xacro/2.0.7-3-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/xacro/cli.py
# Please set FILES such that these items are packaged. Alternatively if they are unneeded, avoid installing them or delete them within do_install.
# xacro: 25 installed and not shipped files. [installed-vs-shipped]
# ERROR: xacro-2.0.7-3-r0 do_package: Fatal QA errors found, failing task.

# Fix for Honister release only:
inherit distutils3-base