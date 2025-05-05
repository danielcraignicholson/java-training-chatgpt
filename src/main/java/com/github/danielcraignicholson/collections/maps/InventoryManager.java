package com.github.danielcraignicholson.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

  private final Map<String, Integer> inventory = new HashMap<>();
  private final Map<String, Double> prices = new HashMap<>();
  private final Map<String, Double> discounts = new HashMap<>();

  public void addItem(String item, int quantity) {
    inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    System.out.println(quantity + " " + item + "(s) added");
  }

  public void removeItem(String item, int quantity) {
    if (inventory.containsKey(item)) {
      int current = inventory.get(item);
      if (quantity >= current) {
        inventory.remove(item);
        System.out.println(item + " removed from inventory");
      } else {
        inventory.put(item, current - quantity);
        System.out.println(quantity + " " + item + "(s) removed");
      }
    } else {
      System.out.println(item + " not found in inventory");
    }
  }

  public void checkStock(String item) {
    if (inventory.containsKey(item)) {
      System.out.println(item + " stock: " + inventory.get(item));
    } else {
      System.out.println(item + " is not in inventory");
    }
  }

  public void displayInventory() {
    System.out.println("Current Inventory: ");
    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
      int current = entry.getValue();
      if (prices.containsKey(entry.getKey())) {
        double cost = prices.get(entry.getKey());
        double discount = discounts.getOrDefault(entry.getKey(), 0.0);
        double total = (current * cost);
        double totalWithDiscount = total - (total * discount);
        System.out.println(
            "- "
                + entry.getKey()
                + ": "
                + current
                + " items at £"
                + cost
                + " each, "
                + (discount * 100)
                + "% off = £"
                + String.format("%.2f", totalWithDiscount));
      } else {
        System.out.println("Cannot display inventory. Some items do not contain a price");
        break;
      }
    }
  }

  public void setPrice(String item, double price) {
    if (inventory.containsKey(item)) {
      prices.put(item, price);
      System.out.println(item + " price set as £" + price);
    } else {
      System.out.println(item + " not in inventory. Please add first.");
    }
  }

  public void inventoryValue() {
    double total;
    double totalWithDiscount = 0;
    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
      int current = entry.getValue();
      if (prices.get(entry.getKey()) != null) {
        double cost = prices.get(entry.getKey());
        double discount = discounts.getOrDefault(entry.getKey(), 0.0);
        total = current * cost;
        totalWithDiscount += total - (total * discount);
      } else {
        System.out.println("Cannot display inventory. Some items do not contain a price");
        break;
      }
    }
    System.out.println("Total inventory value: £" + String.format("%.2f", totalWithDiscount));
  }

  public void setDiscount(String item, double percentage) {
    if (inventory.containsKey(item)) {
      discounts.put(item, percentage);
      System.out.println(item + " discount set as " + (percentage * 100) + "%");
    } else {
      System.out.println(item + " not in inventory. Please add first.");
    }
  }
}
