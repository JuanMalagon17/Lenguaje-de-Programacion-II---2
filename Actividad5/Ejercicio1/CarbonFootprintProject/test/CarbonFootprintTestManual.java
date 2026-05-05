package test;
import model.*;

public class CarbonFootprintTestManual {

    public static void main(String[] args) {

        System.out.println("=== INICIO TESTS ===\n");

        testNegativeValues();
        testLargeValues();
        testZeroValues();
        testConsistency();
        testComparison();
        testExtremeComparison();
        testSameTypeComparison();
        testPolymorphicTotal();
        testSensitivity();

        System.out.println("\n=== FIN TESTS ===");
    }

    // Caso 1: valores negativos
    public static void testNegativeValues() {

        Car car = new Car(-10);
        Building building = new Building(-100);
        Bicycle bike = new Bicycle(-5);

        check("Negative Car", car.getCarbonFootprint() == 0);
        check("Negative Building", building.getCarbonFootprint() == 0);
        check("Negative Bicycle", bike.getCarbonFootprint() == 0);
    }

    // Caso 2: valores grandes
    public static void testLargeValues() {

        Car car = new Car(1000000);
        double result = car.getCarbonFootprint();

        check("Large Value Positive", result > 0);
        check("Large Value Growth", result > 1000000);
    }

    // Caso 3: cero
    public static void testZeroValues() {

        Bicycle bike = new Bicycle(0);

        check("Zero Bicycle", bike.getCarbonFootprint() == 0.0);
    }

    // Caso 4: consistencia
    public static void testConsistency() {

        Car car = new Car(50);

        double first = car.getCarbonFootprint();
        double second = car.getCarbonFootprint();

        check("Consistency", first == second);
    }

    // Caso 5: comparación
    public static void testComparison() {

        Car car = new Car(50);
        Bicycle bike = new Bicycle(50);

        check("Car vs Bicycle", car.getCarbonFootprint() > bike.getCarbonFootprint());
    }

    // Caso 6: comparacíon extrema:
    public static void testExtremeComparison() {

    Car car = new Car(1000);
    Bicycle bike = new Bicycle(1);

    check("Extreme Comparison", car.getCarbonFootprint() > bike.getCarbonFootprint());
}

    // Caso 7: comparacion de objetos del mismo tipo:
    public static void testSameTypeComparison() {

        Car car1 = new Car(50);
        Car car2 = new Car(100);

        check("Same Type Comparison", car2.getCarbonFootprint() > car1.getCarbonFootprint());
    }

    //Caso 8: Polimorfismo total:
    public static void testPolymorphicTotal() {
    // Lista de la interfaz
    CarbonFootprint[] elements = {
        new Car(100),
        new Building(2000),
        new Bicycle(50),
        new Car(10)
    };

    double totalEmissions = 0;
    for (CarbonFootprint item : elements) {
        totalEmissions += item.getCarbonFootprint();
    }

    check("Polymorphic Sum", totalEmissions > 0);
    }

    // Caso 9: Sensibilidad del double:
    public static void testSensitivity() {
    Car car1 = new Car(100);
    Car car2 = new Car(100.1);

    check("Sensitivity to small increments", car2.getCarbonFootprint() > car1.getCarbonFootprint());
    }
    
    // Método tipo "assert"
    public static void check(String testName, boolean condition) {
        if (condition) {
            System.out.println("✅ " + testName + " PASSED");
        } else {
            System.out.println("❌ " + testName + " FAILED");
        }
    }
}