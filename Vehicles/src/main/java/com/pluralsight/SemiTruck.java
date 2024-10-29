package com.pluralsight;

public class SemiTruck extends Vehicle{
        private boolean hasCargo;
    public SemiTruck(){
        super("SemiTruck","White",2,5000,95,105,"North",25);
        this.hasCargo = true;
    }

    public boolean isHasCargo() {
        return hasCargo;
    }

    public void setHasCargo(boolean hasCargo) {
        this.hasCargo = hasCargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nhasCargo=" + hasCargo +
                '}';
    }
}
