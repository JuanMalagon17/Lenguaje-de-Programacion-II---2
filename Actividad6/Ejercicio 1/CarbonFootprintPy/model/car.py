from model.CarbonFootprint import CarbonFootprint
from model.exceptions import InvalidEmissionDataError

class Car(CarbonFootprint):
    def __init__(self, fuel_consumption: float):
        if fuel_consumption < 0:
            raise InvalidEmissionDataError(f"Consumo de combustible inválido: {fuel_consumption}. No puede ser negativo.")
        self.fuel_consumption = fuel_consumption

    def get_carbon_footprint(self) -> float:
        return self.fuel_consumption * 2.3

    def __str__(self):
        return f"Car | Fuel: {self.fuel_consumption} Litros"