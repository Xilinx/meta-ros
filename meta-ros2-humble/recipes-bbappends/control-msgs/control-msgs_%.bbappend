# Copyright (c) 2019 LG Electronics, Inc.
# Copyright (C) 2023 Advanced Micro Devices, Inc.  All rights reserved.

ROS_BUILDTOOL_DEPENDS += " \
    rosidl-parser-native \
    rosidl-adapter-native \
    rosidl-typesupport-fastrtps-cpp-native \
    rosidl-typesupport-fastrtps-c-native \
    python3-numpy-native \
    python3-lark-parser-native \
"

# Without the target rosidl-typesupport-{c,cpp}, ament finds the native packages and then fails to link (error: incompatible
# target).
ROS_BUILD_DEPENDS += " \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
"

# ERROR: control-msgs-3.0.0-1-r0 do_package: QA Issue: control-msgs: Files/directories were installed but not shipped in any package:
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/control_msgs_s__rosidl_typesupport_fastrtps_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/control_msgs_s__rosidl_typesupport_introspection_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/control_msgs_s__rosidl_typesupport_c.cpython-39-aarch64-linux-gnu.so
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/srv
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/srv/_query_trajectory_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/srv/_query_calibration_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/srv/_query_trajectory_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/srv/_query_calibration_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/srv/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_pid_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_component_tolerance.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_trajectory_controller_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_dynamic_joint_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_tolerance.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_interface_value_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_jog_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_pid_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_controller_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_trajectory_controller_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_tolerance_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_controller_state.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_gripper_command_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_interface_value.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_jog.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_dynamic_joint_state_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_gripper_command.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/msg/_joint_component_tolerance_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_point_head_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_follow_joint_trajectory_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_single_joint_position.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_joint_trajectory.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_gripper_command_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_joint_trajectory_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_single_joint_position_s.c
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/__init__.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_point_head.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_gripper_command.py
#   /tmp/sandeepg/yocto/2022.2/build-kr260-stater-kit/work/cortexa72-cortexa53-xilinx-linux/control-msgs/3.0.0-1-r0/recipe-sysroot-native/usr/lib/python3.9/site-packages/control_msgs/action/_follow_joint_trajectory.py
# Please set FILES such that these items are packaged. Alternatively if they are unneeded, avoid installing them or delete them within do_install.
# control-msgs: 42 installed and not shipped files. [installed-vs-shipped]
# ERROR: control-msgs-3.0.0-1-r0 do_package: Fatal QA errors found, failing task.

# Fix for Honister release only:
inherit distutils3-base

