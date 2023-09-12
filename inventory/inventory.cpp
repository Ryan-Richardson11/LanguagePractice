#include <iostream>
#include <string>
#include <vector>

using namespace std;

class InventoryItem
{

public:
    string name;
    int id;
    int quantity;
    float price;

    InventoryItem(string itemName, int itemID, int itemQuantity, float itemPrice)
        : name(itemName), id(itemID), quantity(itemQuantity), price(itemPrice) {}

    float getValue()
    {
        return quantity * price;
    }
};

class Inventory
{
public:
    vector<InventoryItem> items;
    int itemCount = 0;

    float totalValue()
    {
        float total = 0.0;
        for (int i = 0; i < itemCount; i++)
        {
            total += items[i].getValue();
        }
        return total;
    }

    void addItem(const InventoryItem &newItem)
    {
        items[itemCount] = newItem;
        itemCount++;
    }
};

int main()
{
    Inventory inv;
    int input;
    input = cout << "Enter 1 to add an item, 2 to delete an item, and 0 to exit: " << endl;
}