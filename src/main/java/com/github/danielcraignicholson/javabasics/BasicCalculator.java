package com.github.danielcraignicholson.javabasics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicCalculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##"); // format to 2 decimal places

    double number1;
    double number2;

    System.out.print("Enter a number: ");
    number1 = scanner.nextDouble();

    System.out.print("Enter another number: ");
    number2 = scanner.nextDouble();

    System.out.println("Sum = " + (number1 + number2));
    System.out.println("Difference = " + Math.abs(number1 - number2)); // always prints a positive
    System.out.println("Product = " + (number1 * number2));
    System.out.println("Quotient = " + decimalFormat.format(number1 / number2));

    scanner.close();
  }
}
