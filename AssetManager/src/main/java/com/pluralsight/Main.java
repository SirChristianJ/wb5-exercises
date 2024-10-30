package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> test = new ArrayList<Asset>();
        test.add(new House("Vacation Home", 200000,"1997/10/20","1800 victory road", 1, 10000, 20000));
        test.add(new House("Tom's Home", 25000,"2002/10/20","10 albert road", 4, 10000, 200));
        test.add(new Vehicle("Tom's Truck", 50000,"2020/10/31","BMW X5", 2019, 100001));

        StringBuilder output = new StringBuilder();

        for(Asset a: test){
            output.append("\n" + a.getDescription() + " ");
            output.append("was originally worth: " + a.getOriginalCost());
            output.append("\n it is now worth: " + a.getValue());
        }

        System.out.println(output.toString());
    }
}