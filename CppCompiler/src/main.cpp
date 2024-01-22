#include "lexer.h"
#include "parser.h"
#include <iostream>
#include "evaluator.h"

int main()
{
    std::cout << "Enter an expression: ";
    std::string inputExpression;
    std::getline(std::cin, inputExpression);

    // Tokenize the input expression
    std::vector<Token> tokens = lexer(inputExpression);

    // Parse the input and build the AST
    ASTNode root = parseExpression(tokens);

    // Print the AST
    std::cout << "Abstract Syntax Tree:\n";
    printAST(root);

    // Evaluate the AST
    int result = evaluate(root);

    // Print the result
    std::cout << "Result: " << result << std::endl;

    return 0;
}