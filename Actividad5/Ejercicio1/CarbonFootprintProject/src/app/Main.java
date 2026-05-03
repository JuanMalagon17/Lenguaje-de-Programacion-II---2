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

        for (CarbonFootprint obj : list) {
            String result = obj.toString() +
                    " | Footprint: " + obj.getCarbonFootprint();

            System.out.println(result);
            FileManager.saveToFile(result);
        }
    }
}