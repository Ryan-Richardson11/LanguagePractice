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

// Parser class for better organization
class Parser
{
public:
    Parser(const std::vector<Token> &tokens) : tokens(tokens), currentToken(tokens.begin()) {}

    ASTNode parseExpression();
    ASTNode parsePrimary();
    ASTNode parseFactor();
    ASTNode parseTerm();

private:
    const std::vector<Token> &tokens;
    std::vector<Token>::const_iterator currentToken;

    bool match(TokenType expected);
    void advance();
};

// Print AST for visualization
void printAST(const ASTNode &node, int level = 0);

int main()
{
    // Example input expression: "7 * (4 / 5)"
    std::string inputExpression = "7 * (4 / 5)";

    // Tokenize the input expression
    std::vector<Token> tokens = lexer(inputExpression);

    // Create a parser and parse the input to build the AST
    Parser parser(tokens);
    ASTNode root = parser.parseExpression();

    // Print the AST
    std::cout << "Abstract Syntax Tree (AST):\n";
    printAST(root);

    return 0;
}

// Parser function to build the Abstract Syntax Tree (AST) for expressions
ASTNode Parser::parseExpression()
{
    return parseTerm();
}

// Recursive descent parser for primary expressions
ASTNode Parser::parsePrimary()
{
    if (match(TokenType::NUM))
    {
        return {TokenType::NUM, currentToken->value, {}};
    }
    else if (match(TokenType::OPEN))
    {
        ASTNode expression = parseExpression();
        if (match(TokenType::CLOSE))
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
ASTNode Parser::parseFactor()
{
    ASTNode left = parsePrimary();

    while (match(TokenType::OP) && (currentToken->value == "*" || currentToken->value == "/"))
    {
        ASTNode right = parsePrimary();
        left = {TokenType::OP, currentToken->value, {left, right}};
    }

    return left;
}

// Recursive descent parser for term expressions (addition and subtraction)
ASTNode Parser::parseTerm()
{
    ASTNode left = parseFactor();

    while (match(TokenType::OP) && (currentToken->value == "+" || currentToken->value == "-"))
    {
        ASTNode right = parseFactor();
        left = {TokenType::OP, currentToken->value, {left, right}};
    }

    return left;
}

// Helper function to match a specific token type
bool Parser::match(TokenType expected)
{
    if (currentToken != tokens.end() && currentToken->type == expected)
    {
        advance();
        return true;
    }
    return false;
}

// Advance the current token iterator
void Parser::advance()
{
    if (currentToken != tokens.end())
    {
        ++currentToken;
    }
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