package com.akhmadreiza.factorypattern;

public class GasolineCar implements Car {
    public static final String TYPE = "Gasoline Car";

    private int tankCapacity;

    public GasolineCar(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public void startEngine() {
        System.out.println("My " + TYPE + " engine is successfully started.");
    }

    @Override
    public void moveForward() {
        System.out.println("My " + TYPE + " is moving forward loudly. VROOOOMMMMMMM...");
    }

    @Override
    public void moveBackward() {
        System.out.println("My " + TYPE + " is moving backward loudly. WEEE-O... WEEE-O...");
    }

    @Override
    public void stopEngine() {
        System.out.println("My " + TYPE + " engine is successfully stopped.");
    }
}
