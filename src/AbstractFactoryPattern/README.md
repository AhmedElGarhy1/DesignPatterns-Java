# Abstract Factory Design Pattern

## General UML
![General UML](https://refactoring.guru/images/patterns/diagrams/abstract-factory/structure.png)

Decorator Pattern is just superset of FactoryMethod it used to create group of related object/classes

## Problem
Imagine that you’re creating a furniture shop simulator. Your code consists of classes that represent:

A family of related products, say: `Chair` + `Sofa` + `CoffeeTable`.

Several variants of this family. For example, products Chair + Sofa + CoffeeTable are available in these variants: `Modern`, `Victorian`, `ArtDeco`.
![Example](https://refactoring.guru/images/patterns/diagrams/abstract-factory/problem-en.png)

### Solution
you can create a factory foreach group like `ModernFactory`, `VictorianFactory`, `ArtDecoFactory`.

and each one of these factories implements the same interface so you can select anyOne of them it will works fine.

**#Abstract Factory Pattern**
