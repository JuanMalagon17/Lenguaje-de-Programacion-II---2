package app;

import model.*;
import service.FileManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        clearFile();

        ArrayList<CarbonFootprint> objects = createObjects();
        processObjects(objects);
    }

    public static ArrayList<CarbonFootprint> createObjects() {

        ArrayList<CarbonFootprint> list = new ArrayList<>();

        list.add(new Building(120));
        list.add(new Building(80));
        list.add(new Car(40));
        list.add(new Car(60));
        list.add(new Bicycle(10));
        list.add(new Bicycle(25));

        return list;
    }

    public static void processObjects(ArrayList<CarbonFootprint> list) {

        double total = 0;

        System.out.println("=== CARBON FOOTPRINT REPORT ===");

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

    public static void clearFile() {
        FileManager.clearFile();
    }
}