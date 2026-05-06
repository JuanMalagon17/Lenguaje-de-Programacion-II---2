from model.CarbonFootprint import CarbonFootprint
from model.exceptions import InvalidEmissionDataError

class Building(CarbonFootprint):
    def __init__(self, electricity_usage: float):
        if electricity_usage < 0:
            raise InvalidEmissionDataError(f"Uso de electricidad inválido: {electricity_usage}. No puede ser negativo.")
        self.electricity_usage = electricity_usage

    def get_carbon_footprint(self) -> float:
        return self.electricity_usage * 0.5  # factor estimado

    def __str__(self):
        return f"Building | Electricity: {self.electricity_usage} kWh"