#include <iostream>
#include <string>
#include <vector>

using namespace std;

class InventoryItem{

public:
    string name;
    int id;
    int quantity;
    float price;

    InventoryItem(string itemName, int itemID, int itemQuantity, float itemPrice)
        : name(itemName), id(itemID), quantity(itemQuantity), price(itemPrice) {}

    float getValue(){
        return quantity * price;
    }
};

class Inventory{
public:
    vector<InventoryItem> items;

    float totalValue(){
        
    }
};