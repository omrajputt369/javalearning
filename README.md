<div align="center">

# ☕ Java Learning Journey

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Learning-yellow?style=for-the-badge)
![JDK](https://img.shields.io/badge/JDK-25-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

**Welcome to my Java learning repository!** 🚀  
*Documenting my journey from beginner to proficient Java developer*

</div>

---

## 📚 About This Repository

This repository is my personal learning space where I practice Java programming concepts, build small projects, and document my progress. Each program represents a step forward in understanding Java's core features and best practices.

> 💡 **Goal:** Master Java fundamentals and build a strong foundation for backend development and software engineering.

---

## 🎯 Projects & Programs

### 1️⃣ BuffReader - User Input Handler
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

My first Java program demonstrating input/output operations using `BufferedReader`.

**✨ Features:**
- Reads user input from console
- Echoes input back to user
- Clean exception handling

**🧠 Concepts Learned:**
- `BufferedReader` for input streams
- `InputStreamReader` for stream conversion
- Exception handling with `throws IOException`
- Java program structure (main method)

**📂 File:** [`BuffReader.java`](BuffReader.java)

---

### 2️⃣ Scanner - Multiple Input Types
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program demonstrating the `Scanner` class for reading different data types from user input.

**✨ Features:**
- Reads String, Integer, and Float inputs
- User-friendly prompts for each input
- Demonstrates type-specific input methods
- Proper resource management with `scanner.close()`

**🧠 Concepts Learned:**
- `Scanner` class for versatile input handling
- Type-specific methods: `nextLine()`, `nextInt()`, `nextFloat()`
- Case sensitivity in Java (String vs string, Scanner vs scanner)
- Proper string concatenation with `+` operator
- Resource management and closing scanners

**📂 File:** [`scanner.java`](scanner.java)

---

### 3️⃣ BankAccount - Object-Oriented Banking
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A simple bank account simulation demonstrating object-oriented programming concepts.

**✨ Features:**
- Deposit money into account
- Withdraw money with balance validation
- Check current balance
- Encapsulation with private balance field

**🧠 Concepts Learned:**
- Object-Oriented Programming (OOP) basics
- Class creation and object instantiation
- Private instance variables (encapsulation)
- Public methods (getters and setters)
- Conditional logic for validation
- Method chaining and object behavior

**📂 File:** [`BankAccount.java`](BankAccount.java)

---

### 4️⃣ Animal & Dog - Inheritance Demo
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program demonstrating Java inheritance with Animal parent class and Dog child class.

**✨ Features:**
- Parent class `Animal` with `eat()` method
- Child class `Dog` extends Animal
- Dog inherits `eat()` from Animal
- Dog adds its own `bark()` method
- Demonstrates method inheritance in action

**🧠 Concepts Learned:**
- **Inheritance** - extending parent classes
- `extends` keyword for creating subclasses
- Method inheritance from parent to child
- Code reusability through inheritance
- Parent-child class relationships
- Multiple classes in one file

**📂 File:** [`Animal.java`](Animal.java)

> **💡 Tip:** This file contains both `Animal` and `Dog` classes. The `main` method is in `Dog`:
> ```bash
> javac Animal.java
> java Dog  # Run the class with main method
> ```

---

### 5️⃣ Shape & Circle - Polymorphism Demo
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program demonstrating polymorphism and method overriding with Shape parent class and Circle child class.

**✨ Features:**
- Parent class `Shape` with default `area()` method
- Child class `Circle` extends Shape
- Circle **overrides** the `area()` method with `@Override` annotation
- Demonstrates runtime polymorphism
- Constructor with parameters in Circle
- Calculates actual circle area using formula πr²

**🧠 Concepts Learned:**
- **Polymorphism** - same method, different behaviors
- **Method overriding** with `@Override` annotation
- Runtime polymorphism (dynamic method dispatch)
- Parent reference to child object: `Shape s = new Circle(5);`
- Constructors in child classes
- `this` keyword for instance variables

**📂 File:** [`Shape.java`](Shape.java)

> **💡 Tip:** This file contains both `Shape` and `Circle` classes. The `main` method is in `Circle`:
> ```bash
> javac Shape.java
> java Circle  # Runs Circle's main method
> ```

---

### 6️⃣ Calculator - Method Overloading Demo
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program demonstrating method overloading (compile-time polymorphism) with multiple `add()` methods.

**✨ Features:**
- Three `add()` methods with different signatures
- `add(int, int)` - adds two integers
- `add(double, double)` - adds two doubles
- `add(int, int, int)` - adds three integers
- Same method name, different parameters
- Demonstrates compile-time polymorphism

**🧠 Concepts Learned:**
- **Method Overloading** - multiple methods with same name
- Compile-time polymorphism (static binding)
- Method signature differences (number/type of parameters)
- Return types with different data types
- Method resolution at compile time

**📂 File:** [`Calculator.java`](Calculator.java)

---

## 🛠️ How to Run

### Prerequisites
```bash
☑️ Java JDK 11+ (I'm using JDK 25)
☑️ Terminal/Command Prompt
☑️ Text editor or IDE (optional)
```

### Running Any Java Program

1️⃣ **Compile:**
```bash
javac ProgramName.java
```

2️⃣ **Run:**
```bash
java ProgramName
```

### Quick Example with BuffReader:
```bash
# Compile
javac BuffReader.java

# Run
java BuffReader

# Input & Output
Hello, Java!          ← You type this
Hello, Java!          ← Program echoes back
```

---

## 📖 Learning Path

### ✅ Completed
- [x] Java installation & setup
- [x] Basic syntax and structure
- [x] Input/Output with BufferedReader
- [x] Input/Output with Scanner class
- [x] Exception handling basics
- [x] Understanding case sensitivity in Java
- [x] String concatenation
- [x] Object-Oriented Programming basics
- [x] Classes and objects
- [x] Encapsulation with private fields
- [x] Public methods (getters and setters)
- [x] **Inheritance** - extending classes
- [x] Parent-child class relationships
- [x] Method inheritance and code reusability
- [x] **Polymorphism** - method overriding
- [x] `@Override` annotation
- [x] Runtime polymorphism (dynamic method dispatch)
- [x] Constructors in child classes
- [x] `this` keyword
- [x] **Method Overloading** - compile-time polymorphism
- [x] Method signatures and parameter differences

### 🔄 In Progress
- [x] Control flow (if/else, switch)
- [ ] Data types and variables (advanced)
- [ ] Operators and expressions
- [ ] Loops (for, while, do-while)

### ⏳ Upcoming
- [ ] Abstract classes and interfaces
- [ ] Arrays and collections
- [ ] Methods and functions
- [ ] Object-Oriented Programming (OOP)
- [ ] File I/O operations
- [ ] Exception handling (advanced)

---

## 📚 Resources I'm Using

- ☕ [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- 📖 Online tutorials and courses
- 💻 Practice coding challenges
- 🎥 YouTube tutorials

---

## 🏆 Learning Goals 2026

```
🎯 Master Java fundamentals
🎯 Build 10+ small projects
🎯 Understand OOP principles
🎯 Learn data structures & algorithms
🎯 Contribute to open source
```

---

## 📁 Repository Structure

```
java-learning/
├── BuffReader.java      # Input/output with BufferedReader
├── scanner.java         # Input/output with Scanner class
├── BankAccount.java     # Bank account OOP demo
├── Animal.java          # Inheritance demo (Animal & Dog)
├── Shape.java           # Polymorphism demo (Shape & Circle)
├── Calculator.java      # Method overloading demo
├── LICENSE              # MIT License
├── README.md            # This file
└── .gitignore           # Git ignore rules
```

---

## 🤝 Contributing

This is a personal learning repository, but I'm open to:
- 💡 Suggestions for improvement
- 🐛 Bug reports in my code
- 📚 Learning resource recommendations
- 🎓 Best practice feedback

Feel free to open an issue or reach out!

---

## 📫 Connect With Me

[![GitHub](https://img.shields.io/badge/GitHub-omrajputt369--byte-181717?style=for-the-badge&logo=github)](https://github.com/omrajputt369)

---

<div align="center">

### 🌱 Status: Beginner | 📅 Started: January 2026

**"The journey of a thousand miles begins with a single line of code."**

⭐ Star this repo if you're also learning Java!

</div>
