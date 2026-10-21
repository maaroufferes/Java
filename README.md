# Java Coursework

A collection of practical exercises (Travaux Pratiques) completed during my university studies, implemented in Java. The exercises introduce object-oriented programming: classes and objects, constructors, encapsulation, object composition, and arrays of objects. Each exercise includes its model classes and a `Test` class that demonstrates them.

## Overview

| Series | Theme | Exercises |
|--------|-------|-----------|
| [TP1](#tp1--classes-and-objects) | Classes, constructors, and methods | 7 |
| [TP2](#tp2--composition-and-collections) | Composition, arrays of objects, and simple simulations | 4 |

## Concepts Covered

- Classes, objects, and constructors (including default constructors)
- Encapsulation with accessors and mutators
- Object composition (e.g., a circle that contains a point)
- Arrays of objects
- Business rules such as balance checks and stock updates

## TP1 – Classes and Objects

| Exercise | Directory | Classes | Description |
|----------|-----------|---------|-------------|
| EX1 | `TP1/EX1` | `Livre`, `TestLivre` | Book with a code, title, author, and price; displays its details |
| EX2 | `TP1/EX2` | `Score`, `TestScore` | Player score with constructors with and without an initial score, and point addition |
| EX3 | `TP1/EX3` | `Etudiant`, `TestEtudiant` | Student record with an average; determines admission using a threshold of 10 |
| EX4 | `TP1/EX4` | `Point`, `TestPoint` | Mutable 2D point; displays coordinates and computes the distance to another point |
| EX5 | `TP1/EX5` | `Cercle`, `TestCercle` | Circle defined by a center point and radius, with a default circle, area, and circumference |
| EX6 | `TP1/EX6` | `Rectangle`, `TestRectangle` | Rectangle defined by length and width; computes area and perimeter |
| EX7 | `TP1/EX7` | `CompteBancaire`, `TestCB` | Bank account with deposits, withdrawals limited by the available balance, and account display |

## TP2 – Composition and Collections

| Exercise | Directory | Classes | Description |
|----------|-----------|---------|-------------|
| EX1 | `TP2/EX1` | `Robot`, `TestRobot` | Robot on a grid with a cardinal direction; turns left and right, moves forward, and displays its state |
| EX2 | `TP2/EX2` | `Point`, `Rectangle`, `TestRectangle` | Rectangle positioned by a corner point; accessors, mutators, area, perimeter, and point-containment test |
| EX3 | `TP2/EX3` | `Livre`, `Bibliotheque`, `TestBib` | Library holding up to ten books; add, list, and search by title, with borrowing and returning of copies |
| EX4 | `TP2/EX4` | `Produit`, `LigneDeFacteur`, `Facteur`, `TestFacteur` | Invoicing system: products with stock, invoice lines that update stock, and invoices with a total |

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Compilation and Execution

Navigate to an exercise directory, compile its classes, and run its test class:

```bash
cd TP1/EX1
javac *.java
java TestLivre
```

The test class to run for each exercise is the one starting with `Test` (for example `TestScore`, `TestRobot`, or `TestFacteur`).

## Repository Structure

```
.
├── TP1/
│   ├── EX1/   Livre, TestLivre
│   ├── EX2/   Score, TestScore
│   ├── EX3/   Etudiant, TestEtudiant
│   ├── EX4/   Point, TestPoint
│   ├── EX5/   Cercle, TestCercle
│   ├── EX6/   Rectangle, TestRectangle
│   └── EX7/   CompteBancaire, TestCB
├── TP2/
│   ├── EX1/   Robot, TestRobot
│   ├── EX2/   Point, Rectangle, TestRectangle
│   ├── EX3/   Livre, Bibliotheque, TestBib
│   └── EX4/   Produit, LigneDeFacteur, Facteur, TestFacteur
└── README.md
```

## License

This project is intended for educational purposes.
