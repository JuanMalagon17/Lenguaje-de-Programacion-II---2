package app;

import model.*;

public class Main {
    public static void main(String[] args) {

        Building b = new Building(100);
        System.out.println("Huella edificio: " + b.getCarbonFootprint());
    }
}