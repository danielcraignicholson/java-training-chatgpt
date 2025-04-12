package com.github.danielcraignicholson.oop.vehicles;

public class Computer implements Startable {

    @Override
    public void start() {
        System.out.println("Computer booting up...");
    }

    @Override
    public void stop() {
        System.out.println("Computer shutting down.");
    }
}



