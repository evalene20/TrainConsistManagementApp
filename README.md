# Train Consist Management App

## Overview
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist. A train consist is a collection of bogies attached to an engine.

The application demonstrates how different Java collection frameworks and concepts can be used to manage:
- Passenger bogies (Sleeper, AC Chair, First Class) with seating capacity
- Goods bogies (Rectangular, Cylindrical) with cargo constraints
- Train composition, ordering, and validation
- Capacity tracking and filtering

Each use case (UC1–UC8) introduces key Java concepts through realistic railway scenarios.

---

## Features by Use Case

### UC1: Initialize Train and Display Summary
- Initializes the application
- Creates an empty train consist using ArrayList
- Displays initial bogie count

**Concepts:**
- Class and Main Method
- ArrayList and List interface
- Dynamic initialization

---

### UC2: Add Passenger Bogies (ArrayList Operations)
- Adds passenger bogies dynamically
- Removes bogies
- Checks existence using contains()

**Concepts:**
- add(), remove(), contains()
- CRUD operations
- Dynamic list management

---

### UC3: Track Unique Bogie IDs (HashSet)
- Ensures uniqueness of bogie IDs
- Automatically removes duplicates

**Concepts:**
- Set interface
- HashSet
- Uniqueness enforcement

---

### UC4: Maintain Ordered Train Consist (LinkedList)
- Maintains physical order of bogies
- Supports insertion at specific positions
- Removes first and last bogies

**Concepts:**
- LinkedList
- add(), add(index)
- removeFirst(), removeLast()

---

### UC5: Preserve Order with Uniqueness (LinkedHashSet)
- Maintains insertion order
- Prevents duplicate bogies

**Concepts:**
- LinkedHashSet
- Ordered iteration
- Automatic deduplication

---

### UC6: Map Bogie to Capacity (HashMap)
- Associates each bogie with its capacity
- Displays key-value mapping

**Concepts:**
- HashMap
- Map interface
- entrySet() iteration

---

### UC7: Sort Bogies by Capacity (Comparator)
- Creates Bogie objects with attributes
- Sorts bogies based on seating capacity

**Concepts:**
- Custom classes
- Comparator
- Lambda expressions
- sort() method

---

### UC8: Filter Bogies Using Streams
- Filters bogies based on capacity
- Uses functional programming approach

**Concepts:**
- Stream API
- filter()
- collect()
- Declarative programming

---

## How to Run

1. Compile the program:
   ```bash
   javac TrainConsistManagementApp.java
