package com.github.danielcraignicholson.oop.collections.sets;

import java.util.*;

public class EmailRegistry {

  private Set<String> emailSet = new TreeSet<>(Comparator.reverseOrder());

  public void addEmails(List<String> emails) {
    emailSet.addAll(emails);
    displayEmails();
  }

  public void removeEmail(String email) {
    emailSet.remove(email);
    System.out.println(email + " removed");
  }

  public void checkEmail(String email) {
    if (emailSet.contains(email)) {
      System.out.println(email + " found");
    } else {
      System.out.println(email + " not found");
    }
  }

  public void displayEmails() {
    System.out.println(emailSet);
  }
}
