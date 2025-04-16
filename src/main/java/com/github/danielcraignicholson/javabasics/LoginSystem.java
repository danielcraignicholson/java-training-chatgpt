package com.github.danielcraignicholson.javabasics;

import java.util.Scanner;

public class LoginSystem {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String username;
    String password;

    System.out.print("Enter username: ");
    username = scanner.next();

    do {
      System.out.print("Enter password: ");
      password = scanner.next();
    } while (!password.equals("Daniel123"));

    System.out.print("Welcome " + username);
  }
}
