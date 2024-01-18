#include <iostream>
#include <vector>
#include <cctype>
#include "lexer.h"

// Define a structure for AST nodes
struct ASTNode
{
    TokenType type;
    std::string value;
    std::vector<ASTNode> children;
};

// Parser function to build the Abstract Syntax Tree (AST)
ASTNode parseExpression(std::vector<Token> &tokens);

// Helper function to match a specific token type
bool match(TokenType expected, std::vector<Token> &tokens);

// Recursive descent parser for expressions
ASTNode parsePrimary(std::vector<Token> &tokens);
ASTNode parseFactor(std::vector<Token> &tokens);
ASTNode parseTerm(std::vector<Token> &tokens);
ASTNode parseExpression(std::vector<Token> &tokens);

// Print AST for visualization
void printAST(const ASTNode &node, int level = 0);

int main()
{
    // Example input expression: "7 * (4 / 2)"
    std::string inputExpression = "7 * (4 / 2)";

    // Tokenize the input expression
    std::vector<Token> tokens = lexer(inputExpression);

    // Parse the input and build the AST
    ASTNode root = parseExpression(tokens);

    // Print the AST
    std::cout << "Abstract Syntax Tree (AST):\n";
    printAST(root);

    return 0;
}

// Parser function to build the Abstract Syntax Tree (AST) for expressions
ASTNode parseExpression(std::vector<Token> &tokens)
{
    return parseTerm(tokens);
}

// Helper function to match a specific token type
bool match(TokenType expected, std::vector<Token> &tokens)
{
    if (!tokens.empty() && tokens.front().type == expected)
    {
        tokens.erase(tokens.begin());
        return true;
    }
    return false;
}

// Recursive descent parser for primary expressions
ASTNode parsePrimary(std::vector<Token> &tokens)
{
    if (match(TokenType::NUM, tokens))
    {
        return {TokenType::NUM, tokens.back().value, {}};
    }
    else if (match(TokenType::OPEN, tokens))
    {
        ASTNode expression = parseExpression(tokens);
        if (match(TokenType::CLOSE, tokens))
        {
            return expression;
        }
        else
        {
            std::cerr << "Error: Expected closing parenthesis.\n";
        }
    }
    else
    {
        std::cerr << "Error: Expected number or opening parenthesis.\n";
    }
    // Return an empty node in case of an error
    return {TokenType::NUM, "", {}};
}

// Recursive descent parser for factor expressions (multiplication and division)
ASTNode parseFactor(std::vector<Token> &tokens)
{
    ASTNode left = parsePrimary(tokens);

    while (match(TokenType::OP, tokens) && (tokens.back().value == "*" || tokens.back().value == "/"))
    {
        ASTNode right = parsePrimary(tokens);
        left = {TokenType::OP, tokens.back().value, {left, right}};
    }

    return left;
}

// Recursive descent parser for term expressions (addition and subtraction)
ASTNode parseTerm(std::vector<Token> &tokens)
{
    ASTNode left = parseFactor(tokens);

    while (match(TokenType::OP, tokens) && (tokens.back().value == "+" || tokens.back().value == "-"))
    {
        ASTNode right = parseFactor(tokens);
        left = {TokenType::OP, tokens.back().value, {left, right}};
    }

    return left;
}

// Print AST for visualization
void printAST(const ASTNode &node, int level)
{
    for (int i = 0; i < level; ++i)
    {
        std::cout << "  ";
    }
    std::cout << "Type: " << static_cast<int>(node.type) << ", Value: " << node.value << '\n';

    for (const auto &child : node.children)
    {
        printAST(child, level + 1);
    }
}