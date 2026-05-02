# Sistema TeleVentas

## Descripción

El sistema TeleVentas es una aplicación desarrollada en Java con enfoque orientado a objetos (POO), cuyo objetivo es gestionar el proceso de compras a distancia de productos por parte de clientes.

Este sistema permite:

- Consultar el catálogo de productos  
- Realizar órdenes de compra  
- Procesar pagos (tarjeta de crédito)  
- Gestionar quejas de clientes  
- Coordinar la logística de envío de pedidos  
- Integrarse con un sistema de inventario  

---

## Tecnologías utilizadas

- Java  
- Programación Orientada a Objetos (POO)  
- Buenas prácticas (Clean Code)  
- Principios SOLID  

---

## Programación Orientada a Objetos

En el sistema se aplican los siguientes conceptos:

- **Clase:** Estructura que define objetos (ej: `Producto`, `Cliente`, `Orden`)  
- **Objeto:** Instancia de una clase (`new Producto(...)`)  
- **Encapsulamiento:** Uso de atributos privados y métodos públicos  
- **Abstracción:** Uso de interfaces como `MetodoPago`  
- **Herencia:** Implementación de interfaces (ej: `PagoTarjetaCredito`)  
- **Polimorfismo:** Diferentes métodos de pago usando la misma interfaz  

---

## Principios SOLID

El sistema fue diseñado aplicando los principios SOLID:

- **S (Single Responsibility):** Cada clase tiene una única responsabilidad  
- **O (Open/Closed):** Se pueden agregar nuevos métodos de pago sin modificar código existente  
- **L (Liskov Substitution):** Las implementaciones de pago pueden sustituirse sin afectar el sistema  
- **I (Interface Segregation):** Interfaces específicas (`MetodoPago`, `EmpresaEnvio`)  
- **D (Dependency Inversion):** Dependencia hacia abstracciones y no implementaciones  

---

## ⚙️ Estructura del proyecto

```bash
Ejercicio 1/
│
├── model/
│   ├── Producto.java
│   ├── Cliente.java
│   ├── Orden.java
│   ├── ItemOrden.java
│   ├── Queja.java
│
├── pago/
│   ├── MetodoPago.java
│   ├── PagoTarjetaCredito.java
│
├── envio/
│   ├── EmpresaEnvio.java
│   ├── Envio.java
│
├── inventario/
│   ├── InventarioService.java
│
├── service/
│   ├── CatalogoService.java
│   ├── OrdenService.java
│   ├── QuejaService.java
│
└── Main.java