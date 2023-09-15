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

    float getValue() const
    {
        return quantity * price;
    }
};

class Inventory
{
public:
    vector<InventoryItem> items;

    float totalValue()
    {
        float total = 0.0;
        for (const InventoryItem &item : items)
        {
            total += item.getValue();
        }
        return total;
    }

    void addItem(const InventoryItem &newItem)
    {
        items.push_back(newItem);
    }

    void removeItem(int itemID)
    {
        for (auto it = items.begin(); it < items.end(); it++)
        {
            if (it->id == itemID)
            {
                items.erase(it);
            }
        }
    }
};

int main()
{
    Inventory inv;
    int input = -1;

    while (input != 0)
    {
        cout << "Enter 1 to add an item, 2 to delete an item, and 0 to exit: " << endl;
        cin >> input;
        if (input == 1)
        {
            string name;
            int ID;
            int quantity;
            float price;

            cout << "Enter the items name: " << endl;
            cin >> name;
            cout << "Enter the items ID: " << endl;
            cin >> ID;
            cout << "Enter the items quantity: " << endl;
            cin >> quantity;
            cout << "Enter the items price: " << endl;
            cin >> price;
            InventoryItem newItem(name, ID, quantity, price);
            inv.addItem(newItem);
        }
        else
        {
            int itemID;
            cout << "Enter the ID of the item to delete: " << endl;
            cin >> itemID;
            inv.removeItem(itemID);
            cout << "Item deleted." << endl;
        }
    }
    cout << "Total inventory value: $" << inv.totalValue() << endl;
    return 0;
}