# Sistema CarbonFootprint (Python Edition)

## Descripción

El sistema CarbonFootprint es una aplicación desarrollada en **Python** con un enfoque de arquitectura limpia y orientada a objetos (POO). Su objetivo principal es calcular y analizar la huella de carbono generada por diferentes entidades como edificios, vehículos y bicicletas, optimizando la versión original de Java hacia un entorno más dinámico y robusto.

Este sistema permite:
* **Calcular la huella de carbono** de distintos objetos mediante fórmulas específicas.
* **Aplicar polimorfismo** mediante una Clase Base Abstracta (ABC) común.
* **Garantizar la integridad de datos** mediante excepciones personalizadas.
* **Generar reportes en consola** en tiempo real.
* **Persistencia de datos**: Guardar resultados en archivos de texto de forma automática.
* **Validación técnica**: Incluye una suite de pruebas unitarias automáticas para asegurar la precisión de los cálculos.

## Tecnologías utilizadas

* **Python 3.13+**
* **Programación Orientada a Objetos (POO)**
* **Módulo `abc`** (Abstract Base Classes) para contratos de interfaz.
* **Módulo `unittest`** para pruebas de software.
* **Manejo de archivos** con gestión de contextos (`with`).
* **Principios SOLID** y **Clean Code**.

## Programación Orientada a Objetos

En el sistema se aplican los siguientes conceptos fundamentales:

* **Clase**: Estructuras que definen las entidades del dominio (`Building`, `Car`, `Bicycle`).
* **Objeto**: Instancias concretas con datos específicos (ej: `Car(fuel_consumption=40)`).
* **Encapsulamiento**: Validación de atributos en los constructores y protección de la lógica interna.
* **Abstracción**: Uso de la clase base `CarbonFootprint` que define el contrato `get_carbon_footprint()`.
* **Herencia**: Las clases concretas heredan y extienden el comportamiento de la clase base abstracta.
* **Polimorfismo**: Procesamiento uniforme de una colección de objetos heterogéneos mediante una interfaz compartida.

## Principios SOLID

El sistema fue evolucionado aplicando rigurosamente los principios SOLID:

* **S (Single Responsibility)**: Separación clara entre modelos (`model/`), persistencia (`service/`) y lógica de ejecución (`Main.py`).
* **O (Open/Closed)**: El sistema está abierto a la extensión (puedes añadir un `Airplane`) pero cerrado a la modificación de la lógica central.
* **L (Liskov Substitution)**: Cualquier subclase de `CarbonFootprint` puede ser procesada por el motor de reportes sin errores.
* **I (Interface Segregation)**: Se utiliza una abstracción mínima y necesaria para el cálculo de emisiones.
* **D (Dependency Inversion)**: El procesador de objetos depende de la abstracción `CarbonFootprint`, no de las implementaciones específicas.

## Funcionamiento y Ejecución

El sistema inicializa una colección de objetos, valida sus datos (lanzando `InvalidEmissionDataError` si los datos son incoherentes), calcula el impacto ambiental mediante polimorfismo y genera un reporte dual (Consola y Archivo `.txt`).

### Comandos de ejecución:

1. **Ejecutar la aplicación**:
   ```bash
   py Main.py