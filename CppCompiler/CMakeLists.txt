cmake_minimum_required(VERSION 3.28.1)
project(CppCompiler)

add_executable(CppCompiler src/lexer.cpp src/parser.cpp src/lexer.h)
