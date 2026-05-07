package model;

public class Building implements CarbonFootprint {

    private double electricityUsage; // kWh

    public Building(double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    @Override
    public double getCarbonFootprint() {

        if (electricityUsage < 0) {
            return 0;
        }

        return electricityUsage * 0.5; // factor estimado
    }

    @Override
    public String toString() {
        return "Building | Electricity: " + electricityUsage;
    }
}