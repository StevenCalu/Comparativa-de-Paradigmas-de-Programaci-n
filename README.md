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

GET /hardware/imperativo

### Reporte Funcional

GET /hardware/funcional

### Resumen IA

GET /hardware/resumen

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

Ambos enfoques permiten resolver correctamente el problema planteado. Sin embargo, el paradigma funcional ofrece una solución más concisa, legible y fácil de mantener, especialmente cuando se trabaja con grandes volúmenes de datos. Por otro lado, el paradigma imperativo proporciona un mayor control sobre el flujo de ejecución y resulta útil para comprender el procesamiento paso a paso.


