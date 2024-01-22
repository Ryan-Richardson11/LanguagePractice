cmake_minimum_required(VERSION 3.10)
project(CppCompiler)

set(CMAKE_CXX_STANDARD 11)

# Add executable target
add_executable(main src/lexer.cpp src/parser.cpp src/evaluator.cpp src/main.cpp)

# Include directories
target_include_directories(main PRIVATE ${CMAKE_CURRENT_SOURCE_DIR}/src)