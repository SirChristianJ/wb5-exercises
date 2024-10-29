package com.pluralsight;

public class Car extends Vehicle{
    private int totalWeightOfOccupants;

    public Car(){
        super("Car","White",3,1000,75,200,"West",50);
        this.totalWeightOfOccupants = getNumberOfPassengers() * 150;
    }

    public int getTotalWeightOfOccupants() {
        return totalWeightOfOccupants;
    }

    public void setTotalWeightOfOccupants(int totalWeightOfOccupants) {
        this.totalWeightOfOccupants = totalWeightOfOccupants;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntotalWeightOfOccupants=" + totalWeightOfOccupants +
                '}';
    }
}
