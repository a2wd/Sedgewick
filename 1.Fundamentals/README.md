# 1. Fundamentals

## Fundamentals of Algorithms & Data Structures
Notes on chapter 1 of Sedgewick's ALgorithms & Data Structures

## Outline
The outline of the course is:
* Introduce the programming model
* Data abstraction & ADTs (abstract data types)
* APIs (applications programming interfaces)
* Initial data Structures
  - The bag
  - The queue
  - The stack
* Performance: the scientific method
* The connectivity problem, with a *union-find* ADT

## Algorithms
Can be defined by describing a procedure for solving a problem. We use computer
implementations here, in Java, but they can be solved in any programming language.

Most algorithms involve organising data, this leads to *data structures*.

In implementing algorithms, we start to be concerned with performance and the
amount of resources consumed.

An example of the programming model is reproduced in BinarySearch.java
This can be invoked from the command line (after compilation) with:

`java-algs4 BinarySearch BinarySearchTest.txt < BinarySearchInput.txt`

## Structure of a program
A Java program (a class) is either a library of static methods or a data type definition.

These are built with:

1. Primitive data types (int, bool, etc).
2. Statements
3. Arrays
4. Static methods
5. Strings
6. Input/output
7. Data abstraction

## 1. Primitive Data Types
We are concerned with four main primitives:

* Integers
* Real numbers (double)
* Booleans
* Characters (char)

Most java programs are concerned with state and side effects. We use *expressions*
to manipulate *variables*, labelled with *identifiers*. We specify the values as
*literals* and manipulate them with *operators*.

`int someInt = 10 / 2;`
