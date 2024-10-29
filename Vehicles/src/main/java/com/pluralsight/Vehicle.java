package com.pluralsight;

public class Vehicle {
    protected String vehicleName;
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private int topSpeed;
    private String direction;
    private int currentSpeed;


    public Vehicle(String vehicleName, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, String direction, int currentSpeed) {
        this.vehicleName = vehicleName;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.topSpeed = topSpeed;
        this.direction = direction;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                ", topSpeed=" + topSpeed +
                ", direction='" + direction + '\'' +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    public String getDirection() {
        return direction;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
