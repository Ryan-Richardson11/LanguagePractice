#include <iostream>
#include <vector>
#include <cctype>

// Define token types
enum class TokenType
{
    NUMBER,
    OPERATOR,
    OPEN_PAREN,
    CLOSE_PAREN,
    END_OF_INPUT
};

// Define a structure for tokens
struct Token
{
    TokenType type;
    std::string value;
};

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
                tokens.push_back({TokenType::NUMBER, currentToken});
                currentToken.clear();
            }
            tokens.push_back({TokenType::OPERATOR, std::string(1, ch)});
        }
        else if (ch == '(')
        {
            if (!currentToken.empty())
            {
                tokens.push_back({TokenType::NUMBER, currentToken});
                currentToken.clear();
            }
            tokens.push_back({TokenType::OPEN_PAREN, "("});
        }
        else if (ch == ')')
        {
            if (!currentToken.empty())
            {
                tokens.push_back({TokenType::NUMBER, currentToken});
                currentToken.clear();
            }
            tokens.push_back({TokenType::CLOSE_PAREN, ")"});
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
        tokens.push_back({TokenType::NUMBER, currentToken});
    }

    tokens.push_back({TokenType::END_OF_INPUT, ""});
    return tokens;
}

int main()
{
    // Example input expression: "3 + (4 * 5)"
    std::string inputExpression = "3 + (4 * 5)";

    // Tokenize the input expression
    std::vector<Token> tokens = lexer(inputExpression);

    // Print the tokens
    for (const auto &token : tokens)
    {
        std::cout << "Type: ";
        switch (token.type)
        {
        case TokenType::NUMBER:
            std::cout << "NUMBER";
            break;
        case TokenType::OPERATOR:
            std::cout << "OPERATOR";
            break;
        case TokenType::OPEN_PAREN:
            std::cout << "OPEN_PAREN";
            break;
        case TokenType::CLOSE_PAREN:
            std::cout << "CLOSE_PAREN";
            break;
        case TokenType::END_OF_INPUT:
            std::cout << "END_OF_INPUT";
            break;
        }
        std::cout << ", Value: " << token.value << '\n';
    }

    return 0;
}