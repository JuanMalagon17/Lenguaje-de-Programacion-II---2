package app;

import model.*;
import service.FileManager;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<CarbonFootprint> list = new ArrayList<>();

        list.add(new Building(100));
        list.add(new Car(50));
        list.add(new Bicycle(20));

        System.out.println("=== CARBON FOOTPRINT REPORT ===");

        double total = 0;

        for (CarbonFootprint obj : list) {

            double footprint = obj.getCarbonFootprint();
            total += footprint;

            String result = obj.toString() +
                    " | Footprint: " + footprint;

            System.out.println(result);
            FileManager.saveToFile(result);
        }

        System.out.println("\nTOTAL FOOTPRINT: " + total);
        FileManager.saveToFile("TOTAL: " + total);
    }
}