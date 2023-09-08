#include <iostream>

using namespace std;

int generateNumber()
{
    int random = 1 + (rand() % 100);
    return random;
}

int main()
{
    int numGuesses = 10;
    int ans = generateNumber();
    int guess;
    while (numGuesses > 0)
    {
        cout << "Enter a number from 1 to 100: " << endl;
        cin >> guess;
        if (guess == ans)
        {
            cout << guess << " is correct!";
            break;
        }
        else
        {
            cout << guess << " is incorrect, guess again." << endl;
            numGuesses -= 1;
            if (numGuesses == 0)
            {
                cout << "Sorry, you ran out of guesses." << endl;
                break;
            }
        }
    }
    return 0;
}