package com.pluralsight;

public class Asset {
    private String description;
    private String dateAquired;
    private double originalCost;

    public Asset(String description, double originalCost, String dateAquired) {
        this.description = description;
        this.originalCost = originalCost;
        this.dateAquired = dateAquired;
    }

    public String getDescription() {
        return description;
    }

    public String getDateAquired() {
        return dateAquired;
    }

    public double getValue() {
        return originalCost;
    }
}