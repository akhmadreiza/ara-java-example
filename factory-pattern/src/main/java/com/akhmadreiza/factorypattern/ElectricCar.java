package com.akhmadreiza.factorypattern;

public class ElectricCar implements Car {
    public static final String TYPE = "Electric Car";

    private int batteryCapacity;

    public ElectricCar(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
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
        System.out.println("My " + TYPE + " is moving forward silently. Woooooosh...");
    }

    @Override
    public void moveBackward() {
        System.out.println("My " + TYPE + " is moving backward silently. Beep... beep...");
    }

    @Override
    public void stopEngine() {
        System.out.println("My " + TYPE + " engine is successfully stopped.");
    }
}
