package com.github.danielcraignicholson.collections.generics;

public class Main {

  public static void main(String[] args) {

    Pair<String, Integer> agePair = new Pair<>("Alice", 30);
    System.out.println(agePair);

    Box<String> stringBox = new Box<>("Hello");
    Box<String> anotherStringBox = new Box<>("Hello");
    Box<String> anotherStringBox1 = new Box<>("Hi");
    Box<Integer> intBox = new Box<>(42);

    System.out.println(stringBox.get());
    System.out.println(stringBox.equals(anotherStringBox));
    System.out.println(stringBox.equals(anotherStringBox1));
    System.out.println(stringBox.equals(intBox));
    System.out.println(anotherStringBox1);
  }
}
