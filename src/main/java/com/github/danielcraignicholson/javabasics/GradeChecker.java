package com.github.danielcraignicholson.javabasics;

import java.util.Scanner;

public class GradeChecker {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your grade (0-100): ");
    int grade = scanner.nextInt();

    if (grade >= 90) {
      System.out.println("Grade A");
    } else if (grade >= 80) {
      System.out.println("Grade B");
    } else if (grade >= 70) {
      System.out.println("Grade C");
    } else {
      System.out.println("Grade F");
    }
  }
}
