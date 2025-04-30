package com.github.danielcraignicholson.oop.collections.stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

  static Queue<Order> orders = new LinkedList<>();
  static Stack<Order> served = new Stack<>();

  public static void main(String[] args) {

    serveOrder();

    showLastServedOrder();

    addOrder("Daniel", "Espresso");
    addOrder("Rosario", "Latte");
    addOrder("Gabriela", "Americano");

    serveOrder();
    serveOrder();

    showNextOrder();

    showLastServedOrder();

    serveOrder();

    showNextOrder();
  }

  public static void addOrder(String name, String drink) {
    Order order = new Order(name, drink);
    orders.add(order);
    System.out.println(order + " ordered");
  }

  public static void serveOrder() {
    if (orders.isEmpty()) {
      System.out.println("There are no orders");
    } else {
      Order servedOrder = orders.poll();
      served.push(servedOrder);
      System.out.println(servedOrder + " served");
    }
  }

  public static void showNextOrder() {
    if (orders.isEmpty()) {
      System.out.println("There are no orders pending");
    } else {
      System.out.println("Next order is " + orders.peek());
    }
  }

  public static void showLastServedOrder() {
    if (served.isEmpty()) {
      System.out.println("No orders have been served");
    } else {
      System.out.println("Last order was " + served.peek());
    }
  }
}
