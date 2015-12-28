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

Expressions are evaluated with precedence, same precedence operators are applied left
to right, values can be implicitly cast as in `3 + 2.5`, `3` becomes `3.0`, or they
can be explicitly case `(int) 3.0` becomes `3` (conversion to *int* truncates value).

### Integers
Java provides a standard 32-bit int alongside a 64-bit long, 16-bit short, 16-bit char
8-bit byte, a 32-bit float and the 64-bit long.

### Statements
A Java program is made up of a series of statements: Declarations, Assignments,
Conditionals, Loops, Calls and Returns.

### Arrays
An array stores a series of values of a type, zero-indexed and accessible by this index.
An array can be made by:

1. Declaring the array name and type.
2. Creating the array.
3. Initialising the array values

See `ArrayBasics.java` for examples. Using the short-form initialises an
array to zero.

Array variables are *pointers* to the array in memory and multiple variables can
be assigned to the same array. This is *aliasing*.

Multi-dimensional arrays may be *ragged*, further array functions are defined as
examples in the aforementioned `ArrayBasics.java`. The functions in this class are
**static** methods, these can be called without instantiating the class.

### Functions

1. Arguments are passed by **value** (arrays as their pointer values)
2. Method names can be overloaded (see *printArray* in `ArrayBasics.java`)
3. A method has a single return value
4. A method can have side-effects
5. A method may use **recursion** and call itself.
  a) For this a *base case* is needed
  b) Each recursive call addresses a *sub-problem*
  c) Each *sub-problem* must not overlap

An example of a recursive implementation of **rank** is provided alongside the original
in `BinarySearch.java`.

## Basic programming model
A program made up of at least one static function (main) and other static or instance
classes and methods with optional data-type definitions.

This allows for **modular programming** and **unit testing**. We build our programs
with the *standard libraries* such as `Math` from `java.lang.*` these can be pulled
in with an `import` statement.

### APIs, Application Programming Interfaces
A *client* can be written that calls an *implementation* of an *API* for example, in
`ArrayBasics.java`, we have a client that calls the standard library implementation of
`Math` whose **API** is given in the documentation.

The purpose of an *API* is to separate the *client* from the *implementation*.

## Strings
We often use strings to deal with input/ouput to and from the console. We can use
the built-in library functions of Integer and Double to transform strings to these
respective primitives.

Strings have a default concatenation operator `+`, as in `"a" + "b" = "ab"`. When
any argument in such a sequence is a string, all the operators become converted to
strings automatically.

**args[]** is the argument passed to **main()** which contains the command line
arguments.

## Input and output
We can visualise the Java program as a block that takes input (console, file, gui)
and outputs to file, console and drawing.

We can read from standard input with the **StdIn** wrapper around the Java standard
input libraries and output to standard output with the respective **StdOut** wrapper.

The accompanying `algs4.jar` library exposes these and other libraries with functions
such as **printLn()** to print a string followed by the newline character or alternatively
**printf()** for formatted printing using the Java-standard formatting strings (eg, %f).

We can redirect and pipe input/output via the command line with the bash commands
as noted in the instructions for the `BinarySearch` class above.

Also provided in `algs4.jar` are **In** and **Out**, respective classes to read to
and from the filesystem. In addition to these file and text based IO are StdDraw,
a graphical output class.

Examples of drawing are used to illustrate algorithms and formulae in `DrawingExamples.java`.

## Binary Search
The binary search algorithm is noted previously and implemented in `BinarySearch.java`.

This is a *divide and conquer* algorithm which halves the problem area in each iteration.
