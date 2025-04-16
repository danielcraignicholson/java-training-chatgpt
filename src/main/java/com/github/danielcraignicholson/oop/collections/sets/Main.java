package com.github.danielcraignicholson.oop.collections.sets;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    EmailRegistry registry = new EmailRegistry();

    registry.addEmails(
        List.of(
            "zalice@example.com",
            "bob@example.com",
            "alice@example.com", // Duplicate
            "carol@example.com"));

    registry.checkEmail("bob@example.com");
    registry.removeEmail("bob@example.com");
    registry.checkEmail("bob@example.com");

    registry.displayEmails();
  }
}
