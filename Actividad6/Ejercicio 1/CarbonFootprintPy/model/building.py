from abc import ABC, abstractmethod

from model.CarbonFootprint import CarbonFootprint

class Building(CarbonFootprint):
    def __init__(self, electricity_usage: float):
        
        self.electricity_usage = electricity_usage if electricity_usage >= 0 else 0

    def get_carbon_footprint(self) -> float:
        return self.electricity_usage * 0.5  # factor estimado

    def __str__(self):
        return f"Building | Electricity: {self.electricity_usage} kWh"
    