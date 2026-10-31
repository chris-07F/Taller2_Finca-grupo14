# Taller 2: Records, enums y clases selladas – Los activos de la finca

Programación 3 (Orientada a Objetos Avanzada) · Universidad Agraria del Ecuador
Semana 2 · Taller Grupal 2 · Grupo 14

## Descripción

Modelo en Java 21 de los activos de una finca usando records inmutables,
una interfaz sellada (`sealed`) y una enumeración con comportamiento.
El valor de cada activo y de la finca completa se calcula con un `switch`
con pattern matching, sin `default`.

## Estructura (paquete `semana2.finca`)

- `Activo`: interfaz sellada que permite `Producto`, `Cultivo` y `Animal`.
- `UnidadMedida`: enum con kilogramo, quintal y tonelada.
- `Producto`, `Cultivo`, `Animal`: records con validación en el constructor compacto.
- `Valorador`: calcula el valor de un activo con `switch`.
- `Demo`: programa principal que valora la lista de activos.

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA con JDK 21.
2. Ejecutar `Demo.main()` en `src/main/java/semana2/finca/Demo.java`.

## Salida esperada

Valor total de la finca: USD 14377,00 (incluye el activo adicional del grupo:
Cultivo de arroz en granza, Daule).

## Integrantes y roles

- Christofer Flores: coordinador
- Alexander Jordan: programador de records
- Keiser Vera: programador del valorador
- Yeslie Toledo: revisora
