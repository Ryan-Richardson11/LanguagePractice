// parser.h
#pragma once

#include "lexer.h"

// Define a structure for AST nodes
struct ASTNode
{
    TokenType type;
    std::string value;
    std::vector<ASTNode> children;
};

// Parser function declarations
ASTNode parseExpression(std::vector<Token> &tokens);
void printAST(const ASTNode &node, int level = 0);

// Add other function declarations if needed
