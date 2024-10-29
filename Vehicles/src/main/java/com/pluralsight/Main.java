package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Tank","Dark Green",1,10000,110,40,"South",15);
        SemiTruck s = new SemiTruck();
        Car c = new Car();
        HoverCraft h = new HoverCraft();

        System.out.println(v + "\n");
        System.out.println(s + "\n");
        System.out.println(c + "\n");
        System.out.println(h + "\n");
    }
}