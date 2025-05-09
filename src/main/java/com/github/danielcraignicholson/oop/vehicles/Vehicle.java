package com.github.danielcraignicholson.oop.vehicles;

public abstract class Vehicle {

  private final String make;
  private final String model;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public abstract void start();

  public abstract void stop();

  public void info() {
    System.out.println("Vehicle: " + make + " " + model);
  }
}
