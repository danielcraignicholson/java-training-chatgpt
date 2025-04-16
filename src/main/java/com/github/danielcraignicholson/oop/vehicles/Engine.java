package com.github.danielcraignicholson.oop.vehicles;

public class Engine implements Startable {

  private final String type;
  private final int horsepower;

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

  @Override
  public void start() {
    System.out.println("Startable");
    startEngine();
  }

  @Override
  public void stop() {
    System.out.println("Startable stopped");
    stopEngine();
  }

  public String getType() {
    return this.type;
  }

  public int getHorsepower() {
    return this.horsepower;
  }

  @Override
  public String toString() {
    return "Engine type = " + type + ", " + "horsepower = " + horsepower;
  }
}
