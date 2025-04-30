package com.github.danielcraignicholson.oop.collections.stacks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

  private final String customerName;
  private final String drink;
  private final LocalDateTime timestamp;

  public Order(String customerName, String drink) {
    this.customerName = customerName;
    this.drink = drink;
    this.timestamp = LocalDateTime.now();
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getDrink() {
    return drink;
  }

  public String getTimestamp() {
    return timestamp.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  @Override
  public String toString() {
    return drink + " for " + customerName + " at " + getTimestamp();
  }
}
