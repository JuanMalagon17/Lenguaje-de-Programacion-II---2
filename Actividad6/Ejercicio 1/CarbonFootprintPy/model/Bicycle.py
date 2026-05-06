from abc import ABC, abstractmethod

from model import CarbonFootprint

class Bicycle(CarbonFootprint):
    def __init__(self, distance: float):
        self.distance = distance if distance >= 0 else 0

    def get_carbon_footprint(self) -> float:
        return self.distance * 0.01

    def __str__(self):
        return f"Bicycle | Distance: {self.distance} km"
    