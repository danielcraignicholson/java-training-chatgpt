package com.github.danielcraignicholson.oop;

public class Engine {

    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void startEngine() {
        System.out.println("Engine started: " + type + " with " + horsepower + " HP");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    public String getType(){
        return this.type;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

}
