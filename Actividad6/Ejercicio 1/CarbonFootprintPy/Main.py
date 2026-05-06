from model import Car, Bicycle, Building
from service.FileManager import FileManager

def create_objects():
    """Crea y retorna una lista de objetos que implementan CarbonFootprint."""

    return [
        Building(120),
        Building(80),
        Car(40),
        Car(60),
        Bicycle(10),
        Bicycle(25)
    ]

def process_objects(obj_list):
    """Calcula emisiones, imprime en consola y guarda en archivo."""
    total = 0.0
    
    header = "=== CARBON FOOTPRINT REPORT ==="
    print(header)
    FileManager.save_to_file(header)

    for obj in obj_list:

        footprint = obj.get_carbon_footprint()
        total += footprint

        # Formateo de string similar al String.format de Java
        result = f"{obj} | Footprint: {footprint:.2f}"
        
        print(result)
        FileManager.save_to_file(result)

    total_result = f"TOTAL FOOTPRINT: {total:.2f}"
    print(f"\n{total_result}")

    FileManager.save_to_file("")
    FileManager.save_to_file(total_result)

if __name__ == "__main__":

    FileManager.clear_file()
    
    objects = create_objects()
    
    process_objects(objects)
