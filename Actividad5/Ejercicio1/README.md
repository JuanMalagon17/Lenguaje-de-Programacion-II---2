# Sistema CarbonFootprint

## Descripción
El sistema CarbonFootprint es una aplicación desarrollada en Java con enfoque orientado a objetos (POO), cuyo objetivo es calcular y analizar la huella de carbono generada por diferentes entidades como edificios, vehículos y bicicletas.

Este sistema permite:

- Calcular la huella de carbono de distintos objetos
- Aplicar polimorfismo mediante una interfaz común
- Generar reportes en consola
- Guardar resultados en archivos de texto
- Simular escenarios de impacto ambiental
- Organizar el código de forma modular y reutilizable

---

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Manejo de archivos (FileWriter)
- Buenas prácticas (Clean Code)
- Principios SOLID

---

## Programación Orientada a Objetos

En el sistema se aplican los siguientes conceptos:

- **Clase**: Estructura que define objetos (ej: Building, Car, Bicycle)
- **Objeto**: Instancia de una clase (new Car(...))
- **Encapsulamiento**: Uso de atributos privados y métodos públicos
- **Abstracción**: Uso de la interfaz CarbonFootprint
- **Herencia**: Implementación de la interfaz en diferentes clases
- **Polimorfismo**: Uso de una colección de tipo CarbonFootprint para tratar distintos objetos de forma uniforme

---

## Principios SOLID

El sistema fue diseñado aplicando los principios SOLID:

- **S (Single Responsibility)**: Cada clase tiene una única responsabilidad (ej: FileManager solo maneja archivos)
- **O (Open/Closed)**: Se pueden agregar nuevas clases (ej: nuevos tipos de transporte) sin modificar el código existente
- **L (Liskov Substitution)**: Cualquier clase que implemente CarbonFootprint puede usarse sin afectar el sistema
- **I (Interface Segregation)**: Se usa una interfaz específica y clara (CarbonFootprint)
- **D (Dependency Inversion)**: El sistema depende de la abstracción (interfaz) y no de implementaciones concretas

---

## Funcionamiento

El sistema crea diferentes objetos que representan fuentes de emisión de carbono, calcula su impacto mediante polimorfismo y genera un reporte que se muestra en consola y se guarda en un archivo de texto.

---

## Autor

Juan Pablo Malagón