#include <iostream>

using namespace std;
// Basic area calculation given length and width
void calculateArea(int length, int width)
{
    int area;
    area = length * width;
    cout << "The area of the rectangle is " << area << endl;
}

int main()
{
    // Asks for input which is used as function parameters
    int length;
    int width;
    cout << "Please enter the rectangles length: ";
    cin >> length;
    cout << "Please enter the rectangles width: ";
    cin >> width;
    calculateArea(length, width);
    return 0;
}
