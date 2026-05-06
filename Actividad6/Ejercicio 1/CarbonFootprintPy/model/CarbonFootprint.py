from abc import ABC, abstractmethod

class CarbonFootprint(ABC):
    
    @abstractmethod
    def get_carbon_footprint(self) -> float:
        """Método abstracto que todas las subclases deben implementar."""
        pass