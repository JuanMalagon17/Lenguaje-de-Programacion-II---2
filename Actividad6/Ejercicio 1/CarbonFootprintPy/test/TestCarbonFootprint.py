import unittest
from model.Car import Car
from model.Building import Building
from model.Bicycle import Bicycle
from model.exceptions import InvalidEmissionDataError

class TestCarbonFootprint(unittest.TestCase):

    # Caso 1: valores negativos
    def test_negative_values(self):

        with self.assertRaises(InvalidEmissionDataError):
            Car(-10)
            
        with self.assertRaises(InvalidEmissionDataError):
            Building(-100)
            
        with self.assertRaises(InvalidEmissionDataError):
            Bicycle(-5)

    # Caso 2: valores grandes
    def test_large_values(self):
        car = Car(1000000)
        result = car.get_carbon_footprint()
        self.assertTrue(result > 1000000)

    # Caso 3: cero
    def test_zero_values(self):
        bike = Bicycle(0)
        self.assertEqual(bike.get_carbon_footprint(), 0.0)

    # Caso 4: consistencia
    def test_consistency(self):
        car = Car(50)
        self.assertEqual(car.get_carbon_footprint(), car.get_carbon_footprint())

    # Caso 5, 6 y 7: Comparaciones
    def test_comparisons(self):
        car = Car(50)
        bike = Bicycle(50)
        car_large = Car(100)
        
        # Test entre tipos
        self.assertGreater(car.get_carbon_footprint(), bike.get_carbon_footprint())
        # Test mismo tipo
        self.assertGreater(car_large.get_carbon_footprint(), car.get_carbon_footprint())

    # Caso 8: Polimorfismo total
    def test_polymorphic_total(self):
        elements = [
            Car(100),
            Building(2000),
            Bicycle(50),
            Car(10)
        ]
        total_emissions = sum(item.get_carbon_footprint() for item in elements)
        self.assertGreater(total_emissions, 0)

    # Caso 9: Sensibilidad
    def test_sensitivity(self):
        car1 = Car(100)
        car2 = Car(100.1)
        self.assertGreater(car2.get_carbon_footprint(), car1.get_carbon_footprint())

# Caso 10: Prueba de Excepciones
    def test_invalid_data_exception(self):
        """Verifica que el sistema lance una excepción ante datos absurdos."""
        with self.assertRaises(InvalidEmissionDataError):
            Car(-500)

    # Caso 11: Test de Tipos Invalidados
    def test_type_safety(self):
        """Verifica que el sistema no explote si se pasan tipos erróneos (Duck Typing)."""
        with self.assertRaises(TypeError):
            Car("mucho combustible")

    # Caso 12: Test de Gran Escala 
    def test_large_scale_collection(self):
        """Prueba el rendimiento con 10,000 objetos."""
        large_list = [Car(10)] * 10000
        total = sum(obj.get_carbon_footprint() for obj in large_list)
        self.assertEqual(total, 230000.0)
        
if __name__ == "__main__":
    unittest.main()