# Java-Calculator-Project
This is a calculator project built in Java that performs different operations.

A modular, menu-driven console application developed in Java that performs both **basic arithmetic** and **scientific calculations**. The project is designed using Object-Oriented Programming (OOP) principles and demonstrates clean code organization, modular programming, user input validation, and file handling.

---

#  Project Overview

The **Java-Calculator** is a console-based application developed as a Java programming project. It allows users to perform a wide range of mathematical operations through an interactive menu-driven interface.

The application supports:

- Basic arithmetic operations
- Scientific calculations
- User input validation
- Calculation history saved to a file
- Clean and modular Java architecture

The project was developed to strengthen understanding of Java fundamentals, Object-Oriented Programming (OOP), exception handling, modular programming, and file handling.

---

#  Features

## Basic Calculator

- ➕ Addition
- ➖ Subtraction
- ✖ Multiplication
- ➗ Division
- % Modulus
- xʸ Power (Exponent)

---

## Scientific Calculator

- Square
- Square Root
- Factorial
- Percentage
- Absolute Value
- Log Base 10
- Natural Log (ln)
- Sine
- Cosine
- Tangent

---

## Additional Features

- Menu-driven interface
- Input validation
- Error handling
- Calculation history
- File handling
- Modular architecture
- Object-Oriented Programming (OOP)

---

# 📂 Project Structure

```
Java-Calculator/
│
├── src/
│   ├── Main.java
│   ├── Calculator.java
│   ├── ScientificCalculator.java
│   ├── InputValidator.java
│   └── HistoryManager.java
│
├── history.txt
├── README.md
└── .gitignore
```

---

# Project Components

## Main.java

The entry point of the application.

Responsibilities:

- Displays the calculator menu
- Reads user input
- Calls the appropriate calculator methods
- Displays results
- Controls the application's execution

---

## Calculator.java

Handles all basic mathematical operations.

Functions include:

- Addition
- Subtraction
- Multiplication
- Division
- Modulus
- Power
- Square
- Square Root
- Percentage
- Absolute Value

---

## ScientificCalculator.java

Extends the Calculator class and provides scientific calculations.

Functions include:

- Factorial
- Log Base 10
- Natural Log
- Sine
- Cosine
- Tangent

---

## InputValidator.java

Responsible for validating all user inputs.

It ensures:

- Only valid numbers are accepted
- Positive numbers are entered where required
- Whole numbers are entered for factorial
- Invalid inputs do not crash the program

---

## HistoryManager.java

Handles calculation history.

Functions include:

- Saving calculations
- Viewing history
- Clearing history

The history is stored inside:

```
data/history.txt
```

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Math Library
- Java File Handling
- Exception Handling
- VS Code
- Git
- GitHub

---

# Java Concepts Demonstrated

This project demonstrates:

- Variables
- Data Types
- Scanner Class
- Methods
- Loops
- Switch Statements
- Conditional Statements
- Classes
- Objects
- Inheritance
- Packages
- File Handling
- Exception Handling
- Modular Programming
- Method Reusability
- Java Math Library

---

#  How to Run the Project

## 1. Clone the Repository

```bash
git clone https://github.com/yourusername/AdvancedCalculator.git
```

---

## 2. Open the Project

Open the project using:

- Visual Studio Code
- IntelliJ IDEA
- Eclipse

---

## 3. Compile the Project

Compile all Java files.

Example:

```bash
javac src/calculator/Main.java
```

or use your IDE's Run button.

---

## 4. Run the Application

Run:

```
Main.java
```

The application will display the calculator menu and allow users to perform calculations.

---

# 📖 Example Menu

```
===============================
ADVANCED JAVA CALCULATOR
===============================

1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
6. Power
7. Square
8. Square Root
9. Factorial
10. Percentage
11. Absolute Value
12. Log Base 10
13. Natural Log (ln)
14. Sine
15. Cosine
16. Tangent
17. View History
18. Clear History
19. Exit
```

---

# History Feature

Every successful calculation is automatically saved.

Example:

```
5 + 3 = 8
25 ÷ 5 = 5
√49 = 7
5! = 120
```

History can be viewed or cleared directly from the application menu.

---

# 🛡 Error Handling

The application handles common user errors, including:

- Division by zero
- Invalid numeric input
- Negative values for square root
- Invalid values for logarithms
- Negative values for factorial
- Invalid menu selections

---

# 🚀 Future Improvements

Possible future enhancements include:

- Java Swing or JavaFX graphical interface
- Dark mode interface
- Additional scientific functions
- Unit conversion
- Currency conversion
- Matrix calculator
- Expression parser

---

# 👨‍💻 Coded By:

**Bontu Bekele**

Software Engineering Student

This project was developed as part of my journey in learning Java programming, Object-Oriented Programming, and software development best practices. It demonstrates my ability to design modular applications, implement mathematical algorithms, validate user input, and manage persistent data using file handling.

---

## ⭐ Thank You for visiting this repository!

