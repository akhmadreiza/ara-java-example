package com.akhmadreiza.factorypattern;

public class CarFactory {
    public static Car produce(CarType carType) {
        if (carType.equals(CarType.ELECTRIC)) {
            return new ElectricCar(100);
        } else if (carType.equals(CarType.GASOLINE)) {
            return new GasolineCar(300);
        } else {
            throw new UnsupportedOperationException("Cannot produce unknown car type.");
        }
    }
}
