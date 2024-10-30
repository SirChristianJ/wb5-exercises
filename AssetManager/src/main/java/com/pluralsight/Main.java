package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> test = new ArrayList<Asset>();
        test.add(new House("Vacation Home", 20000,"1997/10/20","1800 victory road", 3, 10000, 200));
        test.add(new House("Tom's Home", 25000,"2002/10/20","10 albert road", 4, 10000, 200));
        test.add(new Vehicle("Tom's Truck", 50000,"2020/10/31","Toyota Camry", 2019, 100000));

        for(Asset a: test){
            System.out.println(a.getValue());
        }
    }
}