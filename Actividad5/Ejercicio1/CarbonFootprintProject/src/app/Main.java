package app;

import model.*;

public class Main {
    public static void main(String[] args) {

        Building b = new Building(100);
        Car c = new Car(50);
        Bicycle bike = new Bicycle(20);

        System.out.println(b.getCarbonFootprint());
        System.out.println(c.getCarbonFootprint());
        System.out.println(bike.getCarbonFootprint());
        
    }
}