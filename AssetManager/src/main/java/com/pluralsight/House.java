package com.pluralsight;

public class House extends Asset{
    private String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String description, double originalCost, String dateAquired, String address, int condition, int squareFoot, int lotSize) {
        super(description, originalCost, dateAquired);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    @Override
    public double getValue() {
        switch (condition){
            case 1 -> {
                return (double) 80*squareFoot;
            }
            case 2 -> {
                return (double) 90*squareFoot;}
            case 3 -> {
                return (double) 130*squareFoot;}
            case 4 -> {
                return (double) 180*squareFoot;}
            default -> {
                System.out.println("Must enter 1 (poor), 2 (fair), 3 (good), or 4 (excellent) for a condition.\n");
            }
        }
        return 0;
    }
}
