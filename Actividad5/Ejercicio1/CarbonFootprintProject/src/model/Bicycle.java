package model;

public class Bicycle implements CarbonFootprint {

    private double distance; // km

    public Bicycle(double distance) {
        this.distance = distance;
    }

    @Override
    public double getCarbonFootprint() {

        if (distance < 0) {
            return 0;
        }

        return distance * 0.01;
    }

    @Override
    public String toString() {
        return "Bicycle | Distance: " + distance;
    }
}