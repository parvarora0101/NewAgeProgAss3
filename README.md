# Clojure Functional Data Assignment

This repository contains the solution for the Clojure Functional Data Assignment.

## Overview
This project demonstrates various features of the Clojure programming language, including functional programming concepts, data structures, recursion, error handling, and more.

### Clojure Features Report
Clojure is a dynamic, general-purpose programming language, combining the approachability and interactive development of a scripting language with an efficient and robust infrastructure for multithreaded programming.

Key features include:
- **Lisp Dialect**: Clojure is a dialect of Lisp, sharing its code-as-data philosophy and powerful macro system.
- **Functional Programming**: It emphasizes immutable data structures and pure functions, making it easier to reason about state and concurrency.
- **JVM Hosted**: Clojure runs on the Java Virtual Machine (JVM), allowing seamless interoperability with Java libraries and tools.
- **Dynamic Typing**: It is dynamically typed, but supports type hints for performance optimization.
- **Concurrency**: Clojure provides software transactional memory (STM) and agent systems to handle state changes safely in concurrent environments.

## Prerequisites
- Java Development Kit (JDK) 8 or later
- Clojure CLI tools

## Installation Steps
1.  **Install Java**: Ensure you have Java installed (`java -version`).
2.  **Install Clojure**: Follow the official guide at [clojure.org/guides/install_clojure](https://clojure.org/guides/install_clojure).
3.  **Clone Repository**: Clone this repository to your local machine.
4.  **Run Code**: Use the `clj` command to run the source files.

## Implemented Tasks & Execution

### Task 1: Hello World
- **File**: `src/hello_world.clj`
- **Command**: `clj -M -m hello-world`
- **Output**: Prints "Hello, World!"

### Task 2: Basic Syntax & Data Structures
- **File**: `src/basic_syntax.clj`
- **Command**: `clj -M -m basic-syntax`
- **Description**: Demonstrates Lists, Vectors, Maps, and Sets.

### Task 3: Functional Programming Concepts
- **File**: `src/functional_concepts.clj`
- **Command**: `clj -M -m functional-concepts`
- **Description**: Examples of Pure Functions, Immutability, and Higher-Order Functions.

### Task 4: Recursion & Sequence Operations
- **File**: `src/recursion_sequences.clj`
- **Command**: `clj -M -m recursion-sequences`
- **Description**: Factorial using recursion and `recur`, plus `map`, `filter`, `reduce`.

### Task 5: Pattern Matching & Restructuring
- **File**: `src/destructuring.clj`
- **Command**: `clj -M -m destructuring`
- **Description**: Destructuring vectors and maps, and pattern matching using `clojure.core.match`.

### Task 6: Error Handling
- **File**: `src/error_handling.clj`
- **Command**: `clj -M -m error-handling`
- **Description**: `try-catch-finally` blocks and `ex-info`.

### Task 7: Testing
- **File**: `test/assignment_tests.clj`
- **Command**: `clj -M -m assignment-tests`
- **Description**: Unit tests using `clojure.test`.

### Task 8: Data Manipulation with Sequences
- **File**: `src/data_manipulation.clj`
- **Command**: `clj -M -m data-manipulation`
- **Description**: Filtering, mapping, reducing, and grouping a dataset of employees.

### Task 9: Data Transformation with Transducers
- **File**: `src/transducers.clj`
- **Command**: `clj -M -m transducers`
- **Description**: Efficient data transformation using transducers.

### Task 10: Data-Driven Development
- **File**: `src/data_driven.clj`
- **Command**: `clj -M -m data-driven`
- **Description**: Data-driven polymorphism and custom data readers (`#unit/point`).

## Summary of Concepts
- **Functional Programming**: Used pure functions to ensure predictability and immutability to manage state changes safely.
- **Error Handling**: Implemented robust error handling using standard Java-interop exceptions and Clojure's `ex-info`.
- **Data Transformation**: Leveraged Clojure's powerful sequence library and transducers for efficient, composable data processing.

