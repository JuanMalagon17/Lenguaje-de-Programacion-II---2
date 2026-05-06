from abc import ABC, abstractmethod

from model.CarbonFootprint import CarbonFootprint

class Car(CarbonFootprint):
    def __init__(self, fuel_consumption: float):
        self.fuel_consumption = fuel_consumption if fuel_consumption >= 0 else 0

    def get_carbon_footprint(self) -> float:
        return self.fuel_consumption * 2.3

    def __str__(self):
        return f"Car | Fuel: {self.fuel_consumption} Litros"
    