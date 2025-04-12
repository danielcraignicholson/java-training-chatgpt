package com.github.danielcraignicholson.oop.vehicles;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine("V6", 300);
        Car car = new Car("Kia", "Ceed", 2009, engine);
        SportsCar sportsCar = new SportsCar("Porsche", "911", 2020, engine, true);
        Startable startableEngine = new Engine("V8", 350);
        Car[] cars = new Car[2];
        cars[0] = car;
        cars[1] = sportsCar;
        Startable[] startables = new Startable[2];
        startables[0] = engine;
        startables[1] = new Computer();

        System.out.println("Car year: " + car.getYear());
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + sportsCar.getYear());
        System.out.println("Car make: " + sportsCar.getMake());
        System.out.println("Car model: " + sportsCar.getModel());
        car.setYear(2050); // Should print: Invalid year!
        car.setYear(2023); // Updates year
        car.setMake("Toyota");
        car.setModel("Prius");
        System.out.println(car);
        System.out.println(engine);
        System.out.println(sportsCar);
        car.drive();
        car.turnOffCar();
        sportsCar.drive();
        sportsCar.activateTurboBoost();
        sportsCar.turnOffCar();
        car.info();
        car.start();
        System.out.println(car);
        car.stop();
        car.start();
        startableEngine.start();

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        for (Startable device : startables) {
            device.start(); // Polymorphic call
        }

        System.out.println("-----");

        for (Startable device : startables) {
            device.stop(); // Polymorphic call
        }

    }


}
