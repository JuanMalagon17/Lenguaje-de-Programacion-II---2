package model;

public class Car implements CarbonFootprint {

    private double fuelConsumption; // litros

    public Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double getCarbonFootprint() {
        return fuelConsumption * 2.3;
    }

    @Override
    public String toString() {
        return "Car | Fuel: " + fuelConsumption;
    }
}