from model.CarbonFootprint import CarbonFootprint
from model.exceptions import InvalidEmissionDataError

class Bicycle(CarbonFootprint):
    def __init__(self, distance: float):
        if distance < 0:
            raise InvalidEmissionDataError(f"Distancia inválida: {distance}. No puede ser negativa.")
        self.distance = distance

    def get_carbon_footprint(self) -> float:
        return self.distance * 0.01

    def __str__(self):
        return f"Bicycle | Distance: {self.distance} km"
    