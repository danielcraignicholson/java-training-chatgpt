package com.github.danielcraignicholson.oop.vehicles;

public class Car extends Vehicle {

  private String make;
  private String model;
  private int year;
  private final Engine engine;

  public Car(String make, String model, int year, Engine engine) {
    super(make, model);
    this.year = year;
    this.engine = engine;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    if (year > 1885 && year <= 2025) {
      this.year = year;
    } else {
      System.out.println("Invalid year!");
    }
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void drive() {
    System.out.println("Driving a " + year + " " + make + " " + model);
    engine.startEngine();
  }

  public void turnOffCar() {
    engine.stopEngine();
  }

  @Override
  public void start() {
    System.out.println("Starting car engine...");
    engine.startEngine();
  }

  @Override
  public void stop() {
    System.out.println("Stopping car engine...");
    engine.stopEngine();
  }

  @Override
  public String toString() {
    return year + " " + make + " " + model + " with a " + engine.getType() + " engine";
  }
}
