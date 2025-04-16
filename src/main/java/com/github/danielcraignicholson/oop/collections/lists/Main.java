package com.github.danielcraignicholson.oop.collections.lists;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentRegistry registry = new StudentRegistry();

        registry.addStudent(List.of("Alice", "Bob", "Charlie"));
        registry.removeStudent(List.of("Bob"));
        registry.searchStudent("Charlie");
        registry.searchStudent("Daniel");

    }

}
