package com.github.danielcraignicholson.oop.collections.generics;

import java.util.Objects;

public class Box<T> {

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparing with: " + obj);

        if (obj == null || obj.getClass() != this.getClass()) {
            System.out.println("Not a Box");
            return false;
        }

        // Safe cast after class check
        Box<?> other = (Box<?>) obj;

        boolean result = Objects.equals(value, other.value);

        System.out.println("Values equal? " + result);
        return result;
    }

    @Override
    public String toString() {
        return "Box{" + value + "}";
    }
}
