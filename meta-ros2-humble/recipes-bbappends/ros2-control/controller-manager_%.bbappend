# Copyright (C) 2023 Advanced Micro Devices, Inc.  All rights reserved.

# | CMake Error in CMakeLists.txt:
# |   Imported target
# |   "controller_manager_msgs::controller_manager_msgs__rosidl_generator_py"
# |   includes non-existent path
# |
# |     "/tmp/sandeepg/yocto/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.10/site-packages/numpy/core/include"
# |
# |   in its INTERFACE_INCLUDE_DIRECTORIES.  Possible reasons include:
# |
# |   * The path was deleted, renamed, or moved to another location.
# |
# |   * An install or uninstall procedure did not complete successfully.
# |
# |   * The installation package was faulty and references files it does not
# |   provide.
# |
# |
# |
# | -- Generating done
# | CMake Warning:
# |   Manually-specified variables were not used by the project:
# |
# |     CMAKE_EXPORT_NO_PACKAGE_REGISTRY
# |     CMAKE_INSTALL_BINDIR
# |     CMAKE_INSTALL_DATAROOTDIR
# |     CMAKE_INSTALL_INCLUDEDIR
# |     CMAKE_INSTALL_LIBDIR
# |     CMAKE_INSTALL_LIBEXECDIR
# |     CMAKE_INSTALL_LOCALSTATEDIR
# |     CMAKE_INSTALL_SBINDIR
# |     CMAKE_INSTALL_SHAREDSTATEDIR
# |     CMAKE_INSTALL_SYSCONFDIR
# |     FETCHCONTENT_FULLY_DISCONNECTED
# |     LIB_SUFFIX
# |     PYTHON_EXECUTABLE
# |     PYTHON_SOABI
# |     Python_EXECUTABLE
# |
# |
# | CMake Generate step failed.  Build files cannot be regenerated correctly.

ROS_BUILDTOOL_DEPENDS += " \
    ament-cmake-ros-native \
    python3-numpy-native \
"

# ERROR: controller-manager-2.5.0-2-r0 do_populate_sysroot: QA Issue: : /work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/sysroot-destdir/usr/lib/controller_manager/unspawner maximum shebang size exceeded, the maximum size is 128. [shebang-size]
# ERROR: controller-manager-2.5.0-2-r0 do_populate_sysroot: QA Issue: : /work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/sysroot-destdir/usr/lib/controller_manager/spawner maximum shebang size exceeded, the maximum size is 128. [shebang-size]
# ERROR: controller-manager-2.5.0-2-r0 do_populate_sysroot: do_populate_sysroot for this recipe installed files with QA issues
FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://0001-setup.cfg-use-usr-bin-env-python-shebang.patch \
    "

# ERROR: controller-manager-2.5.0-2-r0 do_package: QA Issue: controller-manager: Files/directories were installed but not shipped in any package:
#   /tmp
#   /tmp/sandeepg
#   /tmp/sandeepg/yocto
#   /tmp/sandeepg/yocto/2022.2
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager-2.5.0-py3.9.egg-info
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager/launch_utils.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager/spawner.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager/unspawner.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager/controller_manager_services.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager-2.5.0-py3.9.egg-info/entry_points.txt
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager-2.5.0-py3.9.egg-info/SOURCES.txt
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager-2.5.0-py3.9.egg-info/dependency_links.txt
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager-2.5.0-py3.9.egg-info/top_level.txt
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager-2.5.0-py3.9.egg-info/PKG-INFO
# Please set FILES such that these items are packaged. Alternatively if they are unneeded, avoid installing them or delete them within do_install.
# controller-manager: 26 installed and not shipped files. [installed-vs-shipped]
# ERROR: controller-manager-2.5.0-2-r0 do_package: Fatal QA errors found, failing task.

# Fix for Honister release only:
inherit distutils3-base

