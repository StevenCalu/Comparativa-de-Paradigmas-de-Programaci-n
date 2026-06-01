# Autonomo-1P - Comparativa de Paradigmas de Programación

## Autor

Steven Caluña

## Arquitectura Implementada

El proyecto sigue una arquitectura por capas:

### Capa de Persistencia

* HardwareEntity
* HardwareRepository

### Capa de Negocio

* HardwareService

### Capa Web

* HardwareController

### Capa AI

* TechAIService

## Funcionalidades

El sistema realiza las siguientes operaciones:

1. Filtra equipos comprados en los últimos 5 años.
2. Filtra únicamente equipos con estado ACTIVO.
3. Agrupa los equipos por categoría.
4. Calcula el valor total por categoría.
5. Calcula el promedio de precios por categoría.
6. Obtiene el equipo más costoso de cada categoría.
7. Genera un resumen ejecutivo utilizando Inteligencia Artificial.

## Endpoints Disponibles

### Reporte Imperativo

<img width="1101" height="777" alt="image" src="https://github.com/user-attachments/assets/ebe1ee5a-bda2-4bb4-a13b-c71a71e80b3c" />


### Reporte Funcional

<img width="1088" height="752" alt="image" src="https://github.com/user-attachments/assets/927132f9-5fa4-472a-9574-e23ab14ec152" />


### Resumen IA

<img width="1071" height="407" alt="image" src="https://github.com/user-attachments/assets/ef59a33d-31a8-4a97-9657-3f16e33b527a" />


## Comparación entre Paradigma Imperativo y Funcional

### Paradigma Imperativo

Características:

* Utiliza estructuras tradicionales como for, if y acumuladores.
* El flujo de ejecución es explícito.
* Requiere mayor cantidad de código para realizar agrupaciones y cálculos.

Ventajas:

* Fácil de comprender para programadores principiantes.
* Permite controlar paso a paso la ejecución.

Desventajas:

* Mayor cantidad de líneas de código.
* Más propenso a errores de mantenimiento.
* Menor nivel de abstracción.

### Paradigma Funcional

Características:

* Utiliza Streams API, Collectors y Optional.
* Se enfoca en describir qué hacer en lugar de cómo hacerlo.
* Reduce significativamente la cantidad de código.

Ventajas:

* Código más compacto.
* Mayor legibilidad.
* Mejor mantenimiento y escalabilidad.
* Facilita operaciones de filtrado, agrupación y agregación.

Desventajas:

* Requiere conocimientos previos de programación funcional.
* Puede resultar menos intuitivo para desarrolladores principiantes.


## Conclusiones

Ambos enfoques nod permiten resolver el problema pero sin embargo el l paradigma funcional ofrece una solución más concisa, legible y fácil de mantener por lo que es la mejor opcion cuando se trata de trabajar con gran volumen de datos. Por otro lado el paradigma imperativo proporciona un mayor control sobre el flujo de ejecución y resulta útil para comprender el procesamiento paso a paso.


