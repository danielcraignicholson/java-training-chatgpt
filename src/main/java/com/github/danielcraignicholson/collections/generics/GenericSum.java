package com.github.danielcraignicholson.collections.generics;

import java.util.List;

public class GenericSum {

    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for(Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static double average(List<? extends Number> numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for(Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum / numbers.size();
    }

    public static void main(String[] args){

        List<Integer> ints = List.of(1, 2, 3, 4);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of ints: " + sumNumbers(ints));
        System.out.println("Sum of doubles: " + sumNumbers(doubles));

        System.out.println("Average of ints: " + average(ints));
        System.out.println("Average of doubles: " + average(doubles));
  }
}
