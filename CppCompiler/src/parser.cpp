#include <iostream>
#include "parser.h"

// Recursive descent parser for primary expressions
ASTNode parsePrimary(std::vector<Token> &tokens)
{
    if (tokens.empty())
    {
        std::cerr << "Error: Unexpected end of input.\n";
        return {TokenType::NUM, "", {}};
    }

    Token token = tokens.front();
    tokens.erase(tokens.begin());

    if (token.type == TokenType::NUM)
    {
        return {TokenType::NUM, token.value, {}};
    }
    else if (token.type == TokenType::OPEN)
    {
        ASTNode expression = parseExpression(tokens);

        if (tokens.empty() || tokens.front().type != TokenType::CLOSE)
        {
            std::cerr << "Error: Expected closing parenthesis.\n";
            return {TokenType::NUM, "", {}};
        }

        tokens.erase(tokens.begin()); // Consume the ')'
        return expression;
    }
    else
    {
        std::cerr << "Error: Unexpected token '" << token.value << "'.\n";
        return {TokenType::NUM, "", {}};
    }
}

// Recursive descent parser for factor expressions (multiplication and division)
ASTNode parseFactor(std::vector<Token> &tokens)
{
    ASTNode left = parsePrimary(tokens);

    while (!tokens.empty() && (tokens.front().value == "*" || tokens.front().value == "/"))
    {
        std::string op = tokens.front().value;
        tokens.erase(tokens.begin());

        ASTNode right = parsePrimary(tokens);
        left = {TokenType::OP, op, {left, right}};
    }

    return left;
}

// Recursive descent parser for term expressions (addition and subtraction)
ASTNode parseTerm(std::vector<Token> &tokens)
{
    ASTNode left = parseFactor(tokens);

    while (!tokens.empty() && (tokens.front().value == "+" || tokens.front().value == "-"))
    {
        std::string op = tokens.front().value;
        tokens.erase(tokens.begin());

        ASTNode right = parseFactor(tokens);
        left = {TokenType::OP, op, {left, right}};
    }

    return left;
}

// Top-level parser function for expressions
ASTNode parseExpression(std::vector<Token> &tokens)
{
    return parseTerm(tokens);
}

// Print AST for visualization
void printAST(const ASTNode &node, int level)
{
    for (int i = 0; i < level; ++i)
    {
        std::cout << "  ";
    }

    std::cout << "Type: " << static_cast<int>(node.type);

    if (!node.value.empty())
    {
        std::cout << ", Value: " << node.value;
    }

    std::cout << '\n';

    for (const auto &child : node.children)
    {
        printAST(child, level + 1);
    }
}