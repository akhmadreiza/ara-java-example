package com.akhmadreiza.factorypattern;

public class App {
    public static void main(String[] args) {
        runWithoutFactoryPattern();
        runWithFactoryPattern();
    }

    private static void runWithoutFactoryPattern() {
        Car myFirstCar = new ElectricCar(100);
        Car mySecondCar = new GasolineCar(300);

        System.out.println("I want to use my electric car..");
        operate(myFirstCar);

        System.out.println("\n\nNow, I want to use my gasoline car..");
        operate(mySecondCar);
    }

    private static void runWithFactoryPattern() {
        //I want to ask my favorite car factory to produce 1 electric and 1 gasoline car for me.
        Car myFirstCar = CarFactory.produce(CarType.ELECTRIC);
        Car mySecondCar = CarFactory.produce(CarType.GASOLINE);

        System.out.println("I want to use my electric car..");
        operate(myFirstCar);

        System.out.println("\n\nNow, I want to use my gasoline car..");
        operate(mySecondCar);
    }

    private static void operate(Car car) {
        car.startEngine();
        car.moveForward();
        car.moveBackward();
        car.stopEngine();
    }
}
