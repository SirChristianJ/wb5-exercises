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

    public double returnWorthBasedOnMileageAndYear(double rateApplied, int currentYear){
        if(odometer<=100000 || getMakeModel().contains("Honda")|| getMakeModel().contains("Toyota"))
            return (double) super.getOriginalCost() - (rateApplied * (currentYear-year));
        else if((odometer > 100000 && !getMakeModel().contains("Honda")) || (odometer > 100000 && !getMakeModel().contains("Toyota")))
            return (double) (super.getOriginalCost() - (rateApplied * (currentYear-year))) - (super.getOriginalCost() * .25);

        return 0;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDateTime.now().getYear();
        int yearDifference = currentYear-year;
        switch (yearDifference){
            case 0,1,2,3 -> {
                return returnWorthBasedOnMileageAndYear(0.03, currentYear);
            }
            case 4,5,6 -> {
                return returnWorthBasedOnMileageAndYear(0.06, currentYear);
            }
            case 7,8,9,10 -> {
                return returnWorthBasedOnMileageAndYear(0.08, currentYear);
            }
            default -> {
                return (double) 1000;
            }
        }
    }
}
