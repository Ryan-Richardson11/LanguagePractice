#include <iostream>
#include "lexer.h"
#include "parser.h"

// Evaluate the AST
int evaluate(const ASTNode &node)
{
    if (node.type == TokenType::NUM)
    {
        // Convert the value to an integer and return
        return std::stoi(node.value);
    }
    else if (node.type == TokenType::OP)
    {
        // Perform the operation based on the operator
        int left = evaluate(node.children[0]);
        int right = evaluate(node.children[1]);

        if (node.value == "+")
        {
            return left + right;
        }
        else if (node.value == "-")
        {
            return left - right;
        }
        else if (node.value == "*")
        {
            return left * right;
        }
        else if (node.value == "/")
        {
            // Check for division by zero
            if (right != 0)
            {
                return left / right;
            }
            else
            {
                std::cerr << "Error: Division by zero.\n";
                // Handle error, you might want to throw an exception
                return 0;
            }
        }
    }

    // If the node is not a number or operator, return 0 (error case)
    return 0;
}