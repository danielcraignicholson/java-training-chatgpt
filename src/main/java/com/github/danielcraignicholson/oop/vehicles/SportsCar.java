package com.github.danielcraignicholson.oop.vehicles;

public class SportsCar extends Car {

  private boolean turboBoost;

  public SportsCar(String make, String model, int year, Engine engine, boolean turboBoost) {
    super(make, model, year, engine);
    this.turboBoost = turboBoost;
  }

  public void activateTurboBoost() {
    if (turboBoost) {
      System.out.println("Turbo Boost activated! Hold on tight!");
    } else {
      System.out.println("This car doesn't have turbo boost.");
    }
  }

  @Override
  public void drive() {
    super.drive();
    System.out.println("Vroom vroom! Zooming in the SportsCar!");
  }
}
