#pragma once

#include <vector>
#include <string>

// Define token types
enum class TokenType
{
    NUM,
    OP,
    OPEN,
    CLOSE,
    END
};

// Define a structure for tokens
struct Token
{
    TokenType type;
    std::string value;
};

// Lexer function to tokenize the input expression
std::vector<Token> lexer(const std::string &input);