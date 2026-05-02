package model;

public class Bicycle implements CarbonFootprint {

    private double distance; // km

    public Bicycle(double distance) {
        this.distance = distance;
    }

    @Override
    public double getCarbonFootprint() {
        return distance * 0.01;
    }

    @Override
    public String toString() {
        return "Bicycle | Distance: " + distance;
    }
}