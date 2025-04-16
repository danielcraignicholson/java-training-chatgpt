package com.github.danielcraignicholson.oop.collections.lists;

import java.util.LinkedList;
import java.util.List;

public class StudentRegistry {

    LinkedList<String> students = new LinkedList<>();

    public void addStudent(List<String> newStudents) {
        students.addAll(newStudents);
        System.out.println("Adding students...");
        displayStudents();
    }

    public void removeStudent(List<String> oldStudents) {
        students.removeAll(oldStudents);
        System.out.println("Removing..." + oldStudents);
        displayStudents();
    }

    public void searchStudent(String student) {
        System.out.println("Searching for " + student);
        if (students.contains(student)) {
            System.out.println("Found: " + student);
        } else {
            System.out.println("Not found: " + student);
        }
    }

    public void displayStudents() {
        System.out.println("Students: " + students);
    }

}
