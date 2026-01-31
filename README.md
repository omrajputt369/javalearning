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

### 7️⃣ ScientificCalculator - Advanced Calculator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A comprehensive menu-driven scientific calculator supporting basic arithmetic, trigonometric functions, logarithms, and more.

**✨ Features:**
- **Basic Operations:** Addition, Subtraction, Multiplication, Division, Modulus
- **Advanced Math:** Power (a^b), Square root
- **Trigonometry:** Sin, Cos, Tan (with degree to radian conversion)
- **Logarithms:** log10(x) and ln(x)
- **Other Functions:** Absolute value, Factorial
- **Constants:** Access to π (pi) and e
- **Input Validation:** Handles division by zero, negative factorials, invalid logarithms
- **Menu-driven Interface:** Interactive loop for continuous calculations
- **Exception Handling:** Robust error handling for invalid inputs

**🧠 Concepts Learned:**
- **Switch-Case Statements** - menu-driven program flow
- **While Loops** - infinite loop with break condition
- **Math Class** - `Math.pow()`, `Math.sqrt()`, `Math.sin()`, `Math.cos()`, `Math.tan()`, `Math.log()`, `Math.log10()`, `Math.abs()`, `Math.PI`, `Math.E`
- **Trigonometric Conversions** - `Math.toRadians()` for degree to radian conversion
- **Static Methods** - custom factorial method
- **Exception Handling** - try-catch blocks with `IllegalArgumentException`
- **Input Parsing** - `Integer.parseInt()`, `Double.parseDouble()`, `Long.parseLong()`
- **String Methods** - `trim()` for input sanitization
- **Iterative Algorithms** - factorial calculation using loops
- **Conditional Logic** - validation for mathematical constraints (division by zero, negative square roots, etc.)

**📂 File:** [`ScientificCalculator.java`](ScientificCalculator.java)

---

### 8️⃣ IfDemo - Conditional Statements
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A simple program demonstrating conditional statements in Java using the `if` statement.

**✨ Features:**
- Basic if-statement implementation
- Integer comparison
- Conditional output based on condition evaluation

**🧠 Concepts Learned:**
- **If Statements** - basic conditional control flow
- **Comparison Operators** - using `<` for less than comparison
- **Boolean Expressions** - evaluating conditions to true or false
- **Code Blocks** - grouping statements with curly braces `{}`

**📂 File:** [`IfDemo.java`](IfDemo.java)

---

### 9️⃣ OneDArray - Array Fundamentals
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program demonstrating basic array operations including declaration, input, and output of one-dimensional arrays.

**✨ Features:**
- Array declaration with fixed size
- Takes 5 integer inputs from user using Scanner
- Displays all array elements
- Demonstrates proper resource management with `scanner.close()`

**🧠 Concepts Learned:**
- **Arrays** - declaring and initializing arrays (`int arr[] = new int[5]`)
- **Array Indexing** - accessing elements using index `arr[i]`
- **For Loops** - iterating through arrays
- **Scanner Class** - reading integer inputs with `nextInt()`
- **Array Traversal** - processing each element sequentially

**📂 File:** [`OneDArray.java`](OneDArray.java)

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
- [x] **Advanced Math Operations** - Math class methods
- [x] Trigonometric functions (sin, cos, tan)
- [x] Logarithms (log10, ln)
- [x] Power and square root operations
- [x] **Control Flow** - switch-case statements
- [x] **Loops** - while loops with break conditions
- [x] **Exception Handling** - try-catch blocks
- [x] Custom exceptions (IllegalArgumentException)
- [x] Input validation and sanitization
- [x] Iterative algorithms (factorial)
- [x] **Conditional Statements** - if statements
- [x] Comparison operators and boolean expressions
- [x] **Arrays** - one-dimensional arrays
- [x] Array declaration and initialization
- [x] Array indexing and traversal
- [x] For loops with arrays

### 🔄 In Progress
- [ ] Data types and variables (advanced)
- [ ] Operators and expressions

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
├── BuffReader.java          # Input/output with BufferedReader
├── scanner.java             # Input/output with Scanner class
├── BankAccount.java         # Bank account OOP demo
├── Animal.java              # Inheritance demo (Animal & Dog)
├── Shape.java               # Polymorphism demo (Shape & Circle)
├── Calculator.java          # Method overloading demo
├── ScientificCalculator.java # Advanced scientific calculator
├── IfDemo.java              # Conditional statements demo
├── OneDArray.java           # One-dimensional arrays demo
├── LICENSE                  # MIT License
├── README.md                # This file
└── .gitignore               # Git ignore rules
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
