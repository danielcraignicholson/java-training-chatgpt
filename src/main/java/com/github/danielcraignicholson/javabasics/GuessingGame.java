package com.github.danielcraignicholson.javabasics;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(1, 101);

        System.out.print("Guess the number from 1-100: ");
        int number = scanner.nextInt();

        while (number != randomNumber) {

            if (number > randomNumber) {
                System.out.print("Too high! Guess again: ");
            } else {
                System.out.print("Too low! Guess again: ");
            }
            number = scanner.nextInt();

        }

        System.out.print("Congratulations! The number was " + randomNumber);

    }

}
