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
        FileManager.saveToFile("=== CARBON FOOTPRINT REPORT ===");

        for (CarbonFootprint obj : list) {

            double footprint = obj.getCarbonFootprint();
            total += footprint;

            String result = String.format("%s | Footprint: %.2f",
                    obj.toString(), footprint);

            System.out.println(result);
            FileManager.saveToFile(result);
        }

        String totalResult = String.format("TOTAL FOOTPRINT: %.2f", total);

        System.out.println("\n" + totalResult);

        // línea vacía para separar visualmente en el archivo (detalle pro)
        FileManager.saveToFile("");
        FileManager.saveToFile(totalResult);
    }

    public static void clearFile() {
        FileManager.clearFile();
    }
}