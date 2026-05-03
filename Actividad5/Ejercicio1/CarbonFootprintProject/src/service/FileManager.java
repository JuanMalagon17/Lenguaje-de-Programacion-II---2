package service;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveToFile(String data) {
        try (FileWriter writer = new FileWriter("data/output.txt", true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}