# Copyright (c) 2021 LG Electronics, Inc.
# Copyright (C) 2023 Advanced Micro Devices, Inc.  All rights reserved.

# "rosidl-default-generators" belongs in ROS_BUILDTOOL_DEPENDS (as "rosidl-default-generators-native"); it should not be in
# ROS_BUILD_DEPENDS.
ROS_BUILDTOOL_DEPENDS += " \
    rosidl-default-generators-native \
    rosidl-typesupport-fastrtps-c-native \
    rosidl-typesupport-fastrtps-cpp-native \
"
ROS_BUILD_DEPENDS:remove = " \
    rosidl-default-generators \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
"

# ERROR: controller-manager-msgs-2.5.0-2-r0 do_package: QA Issue: controller-manager-msgs: Files/directories were installed but not shipped in any package:
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/controller_manager_msgs_s__rosidl_typesupport_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/controller_manager_msgs_s__rosidl_typesupport_introspection_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/controller_manager_msgs_s__rosidl_typesupport_fastrtps_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_configure_controller_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_unload_controller_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_load_configure_controller_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_controllers_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_hardware_components_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_hardware_interfaces_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_controller_types_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_reload_controller_libraries.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_switch_controller.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_load_controller_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_load_configure_controller.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_hardware_components.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_controllers.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_reload_controller_libraries_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_unload_controller.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_load_start_controller_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_configure_start_controller.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_switch_controller_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_load_start_controller.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_load_controller.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_controller_types.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_set_hardware_component_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_configure_start_controller_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_configure_controller.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_set_hardware_component_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/srv/_list_hardware_interfaces.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg/_hardware_interface_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg/_hardware_component_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg/_hardware_interface.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg/_controller_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg/_controller_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/controller-manager-msgs/2.5.0-2-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/controller_manager_msgs/msg/_hardware_component_state.py
# Please set FILES such that these items are packaged. Alternatively if they are unneeded, avoid installing them or delete them within do_install.
# controller-manager-msgs: 40 installed and not shipped files. [installed-vs-shipped]

# Fix for Honister release only:
inherit distutils3-base

