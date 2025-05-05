package com.github.danielcraignicholson.collections.maps;

public class Main {

  public static void main(String[] args) {

    InventoryManager inventory = new InventoryManager();

    inventory.addItem("apple", 10);
    inventory.addItem("banana", 5);
    inventory.addItem("apple", 5); // increases apple to 15
    inventory.addItem("pear", 8);

    inventory.displayInventory();

    inventory.removeItem("banana", 2);
    inventory.removeItem("apple", 20); // removes apple completely
    inventory.removeItem("grape", 1); // doesn't exist

    inventory.checkStock("banana");
    inventory.checkStock("apple");

    inventory.displayInventory();

    inventory.setPrice("banana", 0.22);
    inventory.setPrice("mango", 1.45);
    inventory.setPrice("pear", 0.84);

    inventory.setDiscount("banana", 0.10);
    inventory.setDiscount("mango", 0.20);
    inventory.setDiscount("pear", 0.15);

    inventory.displayInventory();

    inventory.inventoryValue();
  }
}
