#include <iostream>
#include <vector>
#include <cctype>
#include "lexer.h"

// Lexer function to tokenize the input expression
std::vector<Token> lexer(const std::string &input)
{
    std::vector<Token> tokens;
    std::string currentToken;

    for (char ch : input)
    {
        if (std::isdigit(ch))
        {
            currentToken += ch;
        }
        else if (std::isspace(ch))
        {
            // Ignore whitespace
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
        {
            if (!currentToken.empty())
            {
                tokens.push_back({TokenType::NUM, currentToken});
                currentToken.clear();
            }
            tokens.push_back({TokenType::OP, std::string(1, ch)});
        }
        else if (ch == '(')
        {
            if (!currentToken.empty())
            {
                tokens.push_back({TokenType::NUM, currentToken});
                currentToken.clear();
            }
            tokens.push_back({TokenType::OPEN, "("});
        }
        else if (ch == ')')
        {
            if (!currentToken.empty())
            {
                tokens.push_back({TokenType::NUM, currentToken});
                currentToken.clear();
            }
            tokens.push_back({TokenType::CLOSE, ")"});
        }
        else
        {
            std::cerr << "Error: Invalid character '" << ch << "' in input.\n";
            return {}; // Return an empty vector indicating an error
        }
    }

    // Handle the last token
    if (!currentToken.empty())
    {
        tokens.push_back({TokenType::NUM, currentToken});
    }

    tokens.push_back({TokenType::END, ""});
    return tokens;
}