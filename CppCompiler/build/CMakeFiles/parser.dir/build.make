# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.28

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\CMake\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\CMake\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build

# Include any dependencies generated for this target.
include CMakeFiles/parser.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/parser.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/parser.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/parser.dir/flags.make

CMakeFiles/parser.dir/src/lexer.cpp.obj: CMakeFiles/parser.dir/flags.make
CMakeFiles/parser.dir/src/lexer.cpp.obj: CMakeFiles/parser.dir/includes_CXX.rsp
CMakeFiles/parser.dir/src/lexer.cpp.obj: C:/Users/Ryan/Desktop/PracticePrograms/CppCompiler/src/lexer.cpp
CMakeFiles/parser.dir/src/lexer.cpp.obj: CMakeFiles/parser.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/parser.dir/src/lexer.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/parser.dir/src/lexer.cpp.obj -MF CMakeFiles\parser.dir\src\lexer.cpp.obj.d -o CMakeFiles\parser.dir\src\lexer.cpp.obj -c C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\lexer.cpp

CMakeFiles/parser.dir/src/lexer.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/parser.dir/src/lexer.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\lexer.cpp > CMakeFiles\parser.dir\src\lexer.cpp.i

CMakeFiles/parser.dir/src/lexer.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/parser.dir/src/lexer.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\lexer.cpp -o CMakeFiles\parser.dir\src\lexer.cpp.s

CMakeFiles/parser.dir/src/parser.cpp.obj: CMakeFiles/parser.dir/flags.make
CMakeFiles/parser.dir/src/parser.cpp.obj: CMakeFiles/parser.dir/includes_CXX.rsp
CMakeFiles/parser.dir/src/parser.cpp.obj: C:/Users/Ryan/Desktop/PracticePrograms/CppCompiler/src/parser.cpp
CMakeFiles/parser.dir/src/parser.cpp.obj: CMakeFiles/parser.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/parser.dir/src/parser.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/parser.dir/src/parser.cpp.obj -MF CMakeFiles\parser.dir\src\parser.cpp.obj.d -o CMakeFiles\parser.dir\src\parser.cpp.obj -c C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\parser.cpp

CMakeFiles/parser.dir/src/parser.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/parser.dir/src/parser.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\parser.cpp > CMakeFiles\parser.dir\src\parser.cpp.i

CMakeFiles/parser.dir/src/parser.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/parser.dir/src/parser.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\parser.cpp -o CMakeFiles\parser.dir\src\parser.cpp.s

CMakeFiles/parser.dir/src/evaluator.cpp.obj: CMakeFiles/parser.dir/flags.make
CMakeFiles/parser.dir/src/evaluator.cpp.obj: CMakeFiles/parser.dir/includes_CXX.rsp
CMakeFiles/parser.dir/src/evaluator.cpp.obj: C:/Users/Ryan/Desktop/PracticePrograms/CppCompiler/src/evaluator.cpp
CMakeFiles/parser.dir/src/evaluator.cpp.obj: CMakeFiles/parser.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build\CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object CMakeFiles/parser.dir/src/evaluator.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/parser.dir/src/evaluator.cpp.obj -MF CMakeFiles\parser.dir\src\evaluator.cpp.obj.d -o CMakeFiles\parser.dir\src\evaluator.cpp.obj -c C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\evaluator.cpp

CMakeFiles/parser.dir/src/evaluator.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/parser.dir/src/evaluator.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\evaluator.cpp > CMakeFiles\parser.dir\src\evaluator.cpp.i

CMakeFiles/parser.dir/src/evaluator.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/parser.dir/src/evaluator.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\evaluator.cpp -o CMakeFiles\parser.dir\src\evaluator.cpp.s

CMakeFiles/parser.dir/src/main.cpp.obj: CMakeFiles/parser.dir/flags.make
CMakeFiles/parser.dir/src/main.cpp.obj: CMakeFiles/parser.dir/includes_CXX.rsp
CMakeFiles/parser.dir/src/main.cpp.obj: C:/Users/Ryan/Desktop/PracticePrograms/CppCompiler/src/main.cpp
CMakeFiles/parser.dir/src/main.cpp.obj: CMakeFiles/parser.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --progress-dir=C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build\CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building CXX object CMakeFiles/parser.dir/src/main.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/parser.dir/src/main.cpp.obj -MF CMakeFiles\parser.dir\src\main.cpp.obj.d -o CMakeFiles\parser.dir\src\main.cpp.obj -c C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\main.cpp

CMakeFiles/parser.dir/src/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Preprocessing CXX source to CMakeFiles/parser.dir/src/main.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\main.cpp > CMakeFiles\parser.dir\src\main.cpp.i

CMakeFiles/parser.dir/src/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green "Compiling CXX source to assembly CMakeFiles/parser.dir/src/main.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\src\main.cpp -o CMakeFiles\parser.dir\src\main.cpp.s

# Object files for target parser
parser_OBJECTS = \
"CMakeFiles/parser.dir/src/lexer.cpp.obj" \
"CMakeFiles/parser.dir/src/parser.cpp.obj" \
"CMakeFiles/parser.dir/src/evaluator.cpp.obj" \
"CMakeFiles/parser.dir/src/main.cpp.obj"

# External object files for target parser
parser_EXTERNAL_OBJECTS =

parser.exe: CMakeFiles/parser.dir/src/lexer.cpp.obj
parser.exe: CMakeFiles/parser.dir/src/parser.cpp.obj
parser.exe: CMakeFiles/parser.dir/src/evaluator.cpp.obj
parser.exe: CMakeFiles/parser.dir/src/main.cpp.obj
parser.exe: CMakeFiles/parser.dir/build.make
parser.exe: CMakeFiles/parser.dir/linkLibs.rsp
parser.exe: CMakeFiles/parser.dir/objects1.rsp
parser.exe: CMakeFiles/parser.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color "--switch=$(COLOR)" --green --bold --progress-dir=C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build\CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Linking CXX executable parser.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\parser.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/parser.dir/build: parser.exe
.PHONY : CMakeFiles/parser.dir/build

CMakeFiles/parser.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\parser.dir\cmake_clean.cmake
.PHONY : CMakeFiles/parser.dir/clean

CMakeFiles/parser.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build C:\Users\Ryan\Desktop\PracticePrograms\CppCompiler\build\CMakeFiles\parser.dir\DependInfo.cmake "--color=$(COLOR)"
.PHONY : CMakeFiles/parser.dir/depend

