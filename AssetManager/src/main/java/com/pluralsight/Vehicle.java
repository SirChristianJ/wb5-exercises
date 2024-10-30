package com.pluralsight;

import java.time.LocalDateTime;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, double originalCost, String dateAquired, String makeModel, int year, int odometer) {
        super(description, originalCost, dateAquired);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDateTime.now().getYear();
        int yearDifference = currentYear-year;
        switch (yearDifference){
            case 0,1,2,3 -> {
                if(odometer<=100000 || getMakeModel().contains("Honda")|| getMakeModel().contains("Toyota"))
                    return (double) super.getOriginalCost() - (0.03 * (currentYear-year));
                else if((odometer > 100000 && !getMakeModel().contains("Honda")) || (odometer > 100000 && !getMakeModel().contains("Toyota")))
                    return (double) (super.getOriginalCost() - (0.03 * (currentYear-year))) - (super.getOriginalCost() * .25);
                }
            case 4,5,6 -> {
                if(odometer<=100000 || getMakeModel().contains("Honda")|| getMakeModel().contains("Toyota"))
                    return (double) super.getOriginalCost() - (0.06 * (currentYear-year));
                else if((odometer > 100000 && !getMakeModel().contains("Honda")) || (odometer > 100000 && !getMakeModel().contains("Toyota")))
                    return (double) (super.getOriginalCost() - (0.06 * (currentYear-year))) - (super.getOriginalCost() * .25);

            }
            case 7,8,9,10 -> {
                if(odometer<=100000 || getMakeModel().equalsIgnoreCase("Honda")|| getMakeModel().equalsIgnoreCase("Toyota"))
                    return (double) super.getOriginalCost() - (0.08 * (currentYear-year));
                else if((odometer > 100000 && !getMakeModel().equalsIgnoreCase("Honda")) || (odometer > 100000 && !getMakeModel().equalsIgnoreCase("Toyota")))
                    return (double) (super.getOriginalCost() - (0.08 * (currentYear-year))) - (super.getOriginalCost() * .25);

            }
            default -> {
                return (double) 1000;
            }
        }
        return 0;
    }
}
