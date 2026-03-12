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

### 🔟 LargestNumber - Finding Maximum Value
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program that finds the largest of three numbers using nested if-else statements and logical operators.

**✨ Features:**
- Compares three integer values
- Uses nested if-else statements
- Implements logical AND operator (`&&`)
- Displays which number is the largest

**🧠 Concepts Learned:**
- **Nested If-Else Statements** - multiple conditional branches
- **Logical Operators** - using `&&` (AND) operator
- **Comparison Operators** - `>=` for greater than or equal to
- **Conditional Logic** - evaluating multiple conditions
- **Code Efficiency** - minimizing comparisons with logical operators

**📂 File:** [`Largestnumber.java`](Largestnumber.java)

---

### 1️⃣1️⃣ ReverseNumber - Digit Reversal Algorithm
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program that reverses the digits of a number using a while loop and mathematical operations.

**✨ Features:**
- Reverses digits of an integer (e.g., 123 → 321)
- Uses while loop for iteration
- Demonstrates modulus and division operators
- Algorithm-based digit manipulation

**🧠 Concepts Learned:**
- **While Loops** - iteration until condition is false
- **Modulus Operator (`%`)** - extracting last digit with `n % 10`
- **Integer Division (`/`)** - removing last digit with `n / 10`
- **Algorithm Design** - digit reversal logic
- **Variable Updates** - building the reversed number incrementally

**📂 File:** [`ReverseNumber.java`](ReverseNumber.java)

---

### 1️⃣2️⃣ Palindrome - Palindrome Number Checker
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program that checks if a number is a palindrome by reversing it and comparing with the original.

**✨ Features:**
- Checks if a number reads the same forwards and backwards
- Uses digit reversal technique
- Stores original value in temporary variable
- Demonstrates equality comparison

**🧠 Concepts Learned:**
- **Temporary Variables** - preserving original value (`temp = n`)
- **Palindrome Logic** - comparing original with reversed number
- **Compound Assignment** - using `temp /= 10` instead of `temp = temp / 10`
- **Equality Operator** - using `==` for number comparison
- **Algorithm Reuse** - applying digit reversal from previous program

**📂 File:** [`PalindromNumber.java`](PalindromNumber.java)

---

### 1️⃣3️⃣ Factorial - Factorial Calculator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

A program that calculates the factorial of a number using a for loop.

**✨ Features:**
- Calculates factorial (5! = 5 × 4 × 3 × 2 × 1 = 120)
- Uses for loop for iteration
- Demonstrates multiplication assignment operator
- Efficient iterative approach

**🧠 Concepts Learned:**
- **For Loops** - loop with initialization, condition, and increment
- **Multiplication Assignment** - using `fact *= i` instead of `fact = fact * i`
- **Loop Initialization** - starting from 1 to n
- **Accumulator Pattern** - building result through iterations
- **Factorial Algorithm** - iterative implementation

**📂 File:** [`Factorial.java`](Factorial.java)

---

### 1️⃣4️⃣ PalindromeChecker - String & Number Palindrome Checker
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

An interactive program that checks whether strings or numbers are palindromes with user-friendly menu options.

**✨ Features:**
- Check if strings are palindromes (case-insensitive, ignores spaces)
- Check if numbers are palindromes
- Menu-driven interface for easy selection
- Clean user prompts and feedback

**🧠 Concepts Learned:**
- **String Manipulation** - `replaceAll()`, `toLowerCase()`
- **StringBuilder** - efficient string reversal with `reverse()`
- **Method Overloading** - separate methods for strings and numbers
- **Algorithm Reuse** - applying digit reversal for numbers
- **User Interface Design** - menu-based program flow

**📂 File:** [`PalindromeChecker.java`](PalindromeChecker.java)

---

### 1️⃣5️⃣ ArmstrongNumber - Armstrong Number Validator  
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Checks if numbers are Armstrong numbers (narcissistic numbers) where the sum of digits raised to the power of digit count equals the number itself.

**✨ Features:**
- Check single numbers for Armstrong property
- Find all Armstrong numbers in a range
- Displays examples (153 = 1³ + 5³ + 3³)
- Efficient digit counting algorithm

**🧠 Concepts Learned:**
- **Math.pow()** - calculating powers
- **Digit Extraction** - counting and processing digits
- **Algorithm Design** - Armstrong number validation
- **Range Processing** - finding numbers in intervals

**📂 File:** [`ArmstrongNumber.java`](ArmstrongNumber.java)

---

### 1️⃣6️⃣ FibonacciSeries - Fibonacci Number Generator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Comprehensive Fibonacci program with multiple operation modes including iterative, recursive, and validation methods.

**✨ Features:**
- Generate first N Fibonacci numbers (iterative)
- Find Nth Fibonacci number (recursive)
- Check if a number is in the Fibonacci sequence
- Generate Fibonacci numbers up to a limit
- Multiple algorithms demonstrated

**🧠 Concepts Learned:**
- **Recursion** - recursive Fibonacci calculation
- **Iteration vs Recursion** - comparing approaches
- **Sequence Algorithms** - Fibonacci generation
- **Long Data Type** - handling large Fibonacci numbers
- **Algorithm Efficiency** - understanding trade-offs

**📂 File:** [`FibonacciSeries.java`](FibonacciSeries.java)

---

### 1️⃣7️⃣ PrimeChecker - Prime Number Analyzer
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Advanced prime number program featuring Sieve of Eratosthenes algorithm and prime factorization.

**✨ Features:**
- Check if individual numbers are prime
- Find all primes up to N (Sieve of Eratosthenes)
- Find first N prime numbers
- Calculate prime factors of any number
- Optimized prime checking with √n limit

**🧠 Concepts Learned:**
- **Sieve of Eratosthenes** - efficient prime finding algorithm
- **Boolean Arrays** - tracking prime status
- **Prime Factorization** - breaking numbers into prime factors
- **Algorithm Optimization** - checking only up to square root
- **Nested Loops** - sieve implementation

**📂 File:** [`PrimeChecker.java`](PrimeChecker.java)

---

### 1️⃣8️⃣ BubbleSort - Sorting Algorithm with Visualization
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Interactive bubble sort implementation with step-by-step visualization and multiple sorting options.

**✨ Features:**
- Sort arrays in ascending order
- Sort arrays in descending order
- Visualized sorting with step-by-step output
- Optimized with early termination when sorted
- Shows swap operations in real-time

**🧠 Concepts Learned:**
- **Bubble Sort Algorithm** - comparison-based sorting
- **Nested Loops** - algorithm implementation
- **Array Swapping** - element exchange technique
- **Algorithm Optimization** - early termination with swapped flag
- **Arrays.toString()** - convenient array display

**📂 File:** [`BubbleSort.java`](BubbleSort.java)

---

### 1️⃣9️⃣ StringManipulator - String Operations Toolkit
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Comprehensive string manipulation program with 7 different operations for text processing.

**✨ Features:**
- Reverse strings using StringBuilder
- Count vowels and consonants
- Check palindromes (case-insensitive)
- Count words and characters
- Convert case (upper, lower, toggle)
- Remove duplicate characters
- Check if strings are anagrams

**🧠 Concepts Learned:**
- **StringBuilder** - efficient string building
- **Character Processing** - `Character.isLetter()`, `Character.isUpperCase()`
- **Regular Expressions** - `replaceAll("\\s+", "")`
- **String Methods** - `split()`, `trim()`, `toCharArray()`
- **Arrays.sort()** - sorting character arrays for anagrams
- **Arrays.equals()** - comparing arrays

**📂 File:** [`StringManipulator.java`](StringManipulator.java)

---

### 2️⃣0️⃣ MatrixOperations - 2D Array Matrix Calculator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Matrix operations program supporting addition, subtraction, multiplication, transpose, and symmetric checking.

**✨ Features:**
- Add two matrices
- Subtract two matrices
- Multiply two matrices (with dimension validation)
- Transpose a matrix
- Check if matrix is symmetric
- User-friendly matrix input system

**🧠 Concepts Learned:**
- **2D Arrays** - matrix representation
- **Nested Loops** - matrix traversal and operations
- **Matrix Algorithms** - addition, multiplication, transpose
- **Dimension Validation** - ensuring compatible matrix sizes
- **Row-Column Operations** - matrix multiplication logic

**📂 File:** [`MatrixOperations.java`](MatrixOperations.java)

---

### 2️⃣1️⃣ LeapYearChecker - Leap Year Calculator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Comprehensive leap year program with range finding, month day calculation, and age analysis.

**✨ Features:**
- Check if a year is a leap year
- Find leap years in a range
- Find next N leap years from a given year
- Get days in any month (considering leap years)
- Calculate age with leap year counting

**🧠 Concepts Learned:**
- **Leap Year Algorithm** - divisibility rules (400, 100, 4)
- **Conditional Logic** - multiple condition checking
- **Arrays** - month days storage
- **Range Processing** - finding years in intervals
- **Calendar Calculations** - days per month logic

**📂 File:** [`LeapYearChecker.java`](LeapYearChecker.java)

---

### 2️⃣2️⃣ Calculator - Interactive Scientific Calculator  
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Full-featured calculator with 8 operations in a continuous loop interface.

**✨ Features:**
- Basic arithmetic (add, subtract, multiply, divide, modulus)
- Percentage calculations
- Square root with negative number validation
- Power (exponentiation) calculations
- Continuous calculation mode with exit option
- Error handling for division by zero

**🧠 Concepts Learned:**
- **While Loops** - continuous program execution
- **Boolean Flags** - loop control with `continueCalculating`
- **Input Validation** - checking for invalid operations
- **Double.isNaN()** - checking for Not-a-Number values
- **Formatted Output** - printf for clean display

**📂 File:** [`Calculator.java`](Calculator.java)

---

### 2️⃣3️⃣ GCDCalculator - GCD & LCM Calculator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Advanced calculator for Greatest Common Divisor (GCD) and Least Common Multiple (LCM) with step-by-step visualization.

**✨ Features:**
- Find GCD using Euclidean algorithm
- Calculate LCM efficiently
- Support for multiple numbers (GCD/LCM of arrays)
- Check if two numbers are coprime
- Display step-by-step GCD calculation
- Verify GCD × LCM = product property

**🧠 Concepts Learned:**
- **Euclidean Algorithm** - efficient GCD calculation
- **Math.abs()** - handling negative numbers
- **Arrays** - processing multiple numbers
- **Algorithm Visualization** - showing calculation steps
- **Number Theory** - coprime numbers, divisibility

**📂 File:** [`GCDCalculator.java`](GCDCalculator.java)

---

### 2️⃣4️⃣ PatternPrinter - Pattern Generator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Pattern printing program featuring 8 different patterns including triangles, pyramids, and special number patterns.

**✨ Features:**
- Right triangle pattern
- Inverted right triangle
- Pyramid pattern
- Diamond pattern
- Number pyramid (1 2 3 2 1 style)
- Floyd's triangle (incremental numbers)
- Pascal's triangle
- Hollow square pattern

**🧠 Concepts Learned:**
- **Nested Loops** - pattern generation logic
- **Spacing Control** - alignment with spaces
- **Pattern Algorithms** - mathematical pattern formulas
- **Binomial Coefficients** - Pascal's triangle calculation
- **Loop Control** - managing multiple loop variables

**📂 File:** [`PatternPrinter.java`](PatternPrinter.java)

---

### 2️⃣5️⃣ TemperatureConverter - Temperature Unit Converter
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Temperature conversion utility supporting Celsius, Fahrenheit, and Kelvin with comprehensive conversion options.

**✨ Features:**
- Convert between Celsius, Fahrenheit, and Kelvin
- Individual conversions (6 different pairs)
- Show all conversions at once from any unit
- Formatted output with proper symbols (°C, °F, K)
- Conversion formula references

**🧠 Concepts Learned:**
- **Temperature Formulas** - mathematical conversions
- **Method Composition** - using methods within methods
- **String Formatting** - `printf()` with format specifiers
- **Switch with Strings** - `toUpperCase()` for case handling
- **Floating Point Arithmetic** - precise temperature calculations

**📂 File:** [`TemperatureConverter.java`](TemperatureConverter.java)

---

### 2️⃣6️⃣ QuadraticEquation - Quadratic Equation Solver
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Comprehensive quadratic equation solver with discriminant analysis and parabola information.

**✨ Features:**
- Solve ax² + bx + c = 0
- Handle real, repeated, and complex roots
- Display discriminant value
- Show sum and product of roots
- Calculate vertex and axis of symmetry
- Determine parabola direction

**🧠 Concepts Learned:**
- **Quadratic Formula** - discriminant and root calculation
- **Complex Numbers** - handling imaginary roots
- **Math.sqrt()** - square root for real/complex cases
- **Mathematical Properties** - sum/product of roots formulas
- **Parabola Properties** - vertex, axis of symmetry

**📂 File:** [`QuadraticEquation.java`](QuadraticEquation.java)

---

### 2️⃣7️⃣ NumberGuessingGame - Interactive Number Game  
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Fun number guessing game with difficulty levels, scoring system, and intelligent hints.

**✨ Features:**
- Three difficulty levels (Easy, Medium, Hard)
- Custom range and attempt options
- Scoring system (100 points maximum)
- Proximity hints ("very close", "getting warmer")
- Replay functionality
- Input validation with try-catch

**🧠 Concepts Learned:**
- **Random Class** - generating random numbers
- **Try-Catch Blocks** - exception handling for input
- **Game Logic** - scoring and hints
- **User Experience** - emoji feedback and messages
- **Replay Loop** - `equalsIgnoreCase()` for Y/N input

**📂 File:** [`NumberGuessingGame.java`](NumberGuessingGame.java)

---

### 2️⃣8️⃣ ArrayOperations - Array Utility Toolkit
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Comprehensive array operations program with 10 different utility functions.

**✨ Features:**
- Find maximum and minimum elements
- Calculate sum and average
- Reverse array in-place
- Linear search for elements
- Count element occurrences
- Remove duplicate elements
- Find second largest element
- Check if array is sorted

**🧠 Concepts Learned:**
- **Array Traversal** - efficient element processing
- **In-Place Algorithms** - array reversal without extra space
- **Linear Search** - finding elements by iteration
- **Duplicate Removal** - sorting and unique element extraction
- **Arrays.copyOf()** - creating array copies
- **Integer.MIN_VALUE** - using constants for comparisons

**📂 File:** [`ArrayOperations.java`](ArrayOperations.java)

---

### 2️⃣9️⃣ PowerCalculator - Power & Root Calculator
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Advanced power calculation program featuring multiple algorithms including fast exponentiation.

**✨ Features:**
- Calculate powers (iterative method)
- Calculate powers (recursive method)
- Fast exponentiation algorithm
- Square root calculation
- Cube root calculation
- Nth root of any number
- Display power tables

**🧠 Concepts Learned:**
- **Recursion** - recursive power calculation
- **Fast Exponentiation** - O(log n) algorithm
- **Bitwise Operations** - exponent halving
- **Math.cbrt()** - cube root function
- **Algorithm Comparison** - iterative vs recursive vs fast
- **Negative Exponents** - handling 1/result

**📂 File:** [`PowerCalculator.java`](PowerCalculator.java)

---

### 3️⃣0️⃣ DigitCounter - Digit Analysis Tool
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Comprehensive digit analysis program with frequency counting and statistical operations.

**✨ Features:**
- Count total digits
- Sum of all digits
- Product of all digits
- Reverse digit order
- Count specific digit occurrences
- Find maximum and minimum digits
- Display digit frequency table
- Complete analysis mode

**🧠 Concepts Learned:**
- **Digit Manipulation** - extracting and processing digits
- **Frequency Arrays** - counting occurrences with int[10]
- **Long Data Type** - handling large numbers
- **Math.abs()** - handling negative numbers
- **Modulus Patterns** - % 10 for last digit
- **Statistical Analysis** - min, max, frequency

**📂 File:** [`DigitCounter.java`](DigitCounter.java)

---

### 3️⃣1️⃣ PerfectNumber - Perfect Number Checker
![Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

Number theory program for perfect, abundant, and deficient number classification.

**✨ Features:**
- Check if number is perfect (sum of divisors = number)
- Find all divisors of a number
- Classify as perfect/abundant/deficient
- Find perfect numbers in a range
- Find first N perfect numbers (with warnings)
- Individual abundant/deficient checks

**🧠 Concepts Learned:**
- **Number Theory** - perfect numbers (6, 28, 496, etc.)
- **Divisor Finding** - iterating to n/2
- **Classification Logic** - comparing sum with original
- **Algorithm Performance** - understanding rarity of perfect numbers
- **Sum Accumulation** - building divisor sums

**📂 File:** [`PerfectNumber.java`](PerfectNumber.java)

---

## 🔥 Advanced Programs (Batch 2)

### 3️⃣2️⃣-5️⃣6️⃣ Algorithms, Data Structures & Utilities (25 Programs)

This collection includes advanced sorting algorithms, searching techniques, data structure implementations, and practical converters/calculators.

#### **Sorting & Searching Algorithms** (7 programs)

- **[`BinarySearch.java`](BinarySearch.java)** - Binary search (iterative, recursive, with step visualization)
- **[`LinearSearchEnhanced.java`](LinearSearchEnhanced.java)** - Enhanced linear search with multiple occurrence finding
- **[`SelectionSort.java`](SelectionSort.java)** - Selection sort with visualization
- **[`InsertionSort.java`](InsertionSort.java)** - Insertion sort showing element shifts
- **[`MergeSort.java`](MergeSort.java)** - Divide-and-conquer merge sort
- **[`QuickSort.java`](QuickSort.java)** - Partition-based quicksort
- **[`SearchingSortingDemo.java`](SearchingSortingDemo.java)** - Algorithm performance comparison with timing

#### **Data Structures** (5 programs)

- **[`StackImpl.java`](StackImpl.java)** - Array-based stack (push, pop, peek)
- **[`QueueImpl.java`](QueueImpl.java)** - Circular queue implementation
- **[`CircularQueueImpl.java`](CircularQueueImpl.java)** - Enhanced circular queue with front/rear tracking
- **[`LinkedListImpl.java`](LinkedListImpl.java)** - Singly linked list
- **[`DoublyLinkedList.java`](DoublyLinkedList.java)** - Doubly linked list with bidirectional traversal

#### **Number System Converters** (2 programs)

- **[`DecimalConverter.java`](DecimalConverter.java)** - Decimal to Binary/Octal/Hexadecimal
- **[`BinaryConverter.java`](BinaryConverter.java)** - Binary to Decimal/Octal/Hex with validation

#### **Unit Converters** (4 programs)

- **[`TimeConverter.java`](TimeConverter.java)** - Time unit conversions (seconds/minutes/hours)
- **[`CurrencyConverter.java`](CurrencyConverter.java)** - Multi-currency converter (USD/EUR/GBP/INR/JPY)
- **[`RomanNumerals.java`](RomanNumerals.java)** - Decimal ↔ Roman numeral conversions
- **[`UnitConverter.java`](UnitConverter.java)** - Length & weight conversions

#### **Geometry Calculators** (4 programs)

- **[`AreaCalculator.java`](AreaCalculator.java)** - Area of 6 shapes (circle, rectangle, triangle, square, trapezoid, parallelogram)
- **[`VolumeCalculator.java`](VolumeCalculator.java)** - Volume of 5 3D shapes (cube, cuboid, sphere, cylinder, cone)
- **[`PerimeterCalculator.java`](PerimeterCalculator.java)** - Perimeter of 4 shapes
- **[`DistanceCalculator.java`](DistanceCalculator.java)** - 2D/3D Euclidean & Manhattan distance

#### **Health & Finance Calculators** (3 programs)

- **[`BMICalculator.java`](BMICalculator.java)** - BMI calculator (metric/imperial with categories)
- **[`SimpleInterestCalculator.java`](SimpleInterestCalculator.java)** - Simple & Compound interest
- **[`AgeCalculator.java`](AgeCalculator.java)** - Detailed age calculation with next birthday

**🧠 Advanced Concepts Covered:**
- Recursion & divide-and-conquer algorithms
- Time complexity analysis (O(n), O(log n), O(n²))
- Data structure implementation (nodes, pointers)
- Circular buffers & bidirectional traversal
- Number system conversions & algorithms
- Java Time API (`LocalDate`, `Period`)
- Performance benchmarking with `System.nanoTime()`

---

## 🚀 New Java Lab Programs (Batch 3)

### 5️⃣7️⃣-7️⃣6️⃣ Interactive Games, Systems & Advanced Utilities (20 Programs)

A collection of interactive terminal games, management systems, and practical utility programs.

#### **Interactive Games** (3 programs)
- **[`TicTacToeGame.java`](TicTacToeGame.java)** - Terminal-based 2-player Tic-Tac-Toe
- **[`SudokuSolver.java`](SudokuSolver.java)** - Backtracking-based 9x9 Sudoku solver
- **[`RockPaperScissors.java`](RockPaperScissors.java)** - Human vs Computer game

#### **Advanced Algorithms** (3 programs)
- **[`BinaryTreeTraversal.java`](BinaryTreeTraversal.java)** - Inorder, Preorder, and Postorder traversals
- **[`DijkstraAlgorithm.java`](DijkstraAlgorithm.java)** - Shortest path in weighted graphs
- **[`KnapsackProblem.java`](KnapsackProblem.java)** - 0/1 Knapsack with Dynamic Programming

#### **Management Systems** (4 programs)
- **[`LibraryManagementSystem.java`](LibraryManagementSystem.java)** - Simple book management system
- **[`InventorySystem.java`](InventorySystem.java)** - Product stock tracking utility
- **[`AttendanceManager.java`](AttendanceManager.java)** - Student attendance tracking record
- **[`StudentGradeSystem.java`](StudentGradeSystem.java)** - Student grade calculator based on marks

#### **Networking & Web** (4 programs)
- **[`ChatServer.java`](ChatServer.java)** - Basic socket-based chat server
- **[`ChatClient.java`](ChatClient.java)** - Basic socket-based chat client
- **[`WebScraperBasic.java`](WebScraperBasic.java)** - Basic HTML content fetcher
- **[`JSONParserBasic.java`](JSONParserBasic.java)** - Simple recursive descent JSON parser

#### **Practical Utilities** (6 programs)
- **[`FileEncryption.java`](FileEncryption.java)** - XOR-based file encryption/decryption
- **[`RegexValidator.java`](RegexValidator.java)** - Email, Phone, and Password validation
- **[`MultithreadedDownloader.java`](MultithreadedDownloader.java)** - Parallel file download simulation
- **[`SimpleWeatherApp.java`](SimpleWeatherApp.java)** - Simulated weather data fetcher
- **[`RecipeBook.java`](RecipeBook.java)** - Cookery recipe storage and retrieval
- **[`QuizApplication.java`](QuizApplication.java)** - Interactive multiple-choice Java quiz

---

## 🌟 Advanced Java Lab (Batch 4)

### 7️⃣7️⃣-9️⃣6️⃣ Design Patterns, Algorithms & System Simulations (20 Programs)

A collection of Design Pattern demonstrations, graph algorithms, and system simulation utilities.

#### **Design Patterns** (8 programs)
- **[`CommandPatternDemo.java`](CommandPatternDemo.java)** - Encapsulating requests as objects
- **[`ObserverPatternDemo.java`](ObserverPatternDemo.java)** - Subject-Observer subscription model
- **[`FactoryPatternDemo.java`](FactoryPatternDemo.java)** - Object creation without specific classes
- **[`SingletonPatternDemo.java`](SingletonPatternDemo.java)** - Ensuring a single class instance
- **[`StrategyPatternDemo.java`](StrategyPatternDemo.java)** - Encapsulating interchangeable algorithms
- **[`DecoratorPatternDemo.java`](DecoratorPatternDemo.java)** - Dynamic object responsibility attachment
- **[`AdapterPatternDemo.java`](AdapterPatternDemo.java)** - Interface conversion for compatibility
- **[`ProxyPatternDemo.java`](ProxyPatternDemo.java)** - Placeholder for another object

#### **Data Structures & Algorithms** (6 programs)
- **[`GraphTraversalBFS.java`](GraphTraversalBFS.java)** - Breadth-First Search implementation
- **[`GraphTraversalDFS.java`](GraphTraversalDFS.java)** - Depth-First Search implementation
- **[`HuffmanCodingBasic.java`](HuffmanCodingBasic.java)** - Basic data compression demo
- **[`LRUCacheSimulation.java`](LRUCacheSimulation.java)** - Least Recently Used cache eviction
- **[`BitManipulationDemo.java`](BitManipulationDemo.java)** - Common bitwise optimization tricks
- **[`PriorityQueueDemo.java`](PriorityQueueDemo.java)** - Priority-based task scheduling

#### **Concurrency & Systems** (6 programs)
- **[`ProducerConsumerDemo.java`](ProducerConsumerDemo.java)** - Thread synchronization using wait/notify
- **[`TextToSpeechBasic.java`](TextToSpeechBasic.java)** - Basic TTS engine interface simulation
- **[`CurrencyFormatter.java`](CurrencyFormatter.java)** - Locale-specific currency formatting
- **[`MarkdownToHTMLConverter.java`](MarkdownToHTMLConverter.java)** - Regex-based MD to HTML tool
- **[`SimpleEncryptionSys.java`](SimpleEncryptionSys.java)** - AES-based encryption/decryption system
- **[`PasswordStrengthChecker.java`](PasswordStrengthChecker.java)** - Password complexity analyzer

---

## 💳 Payment Gateway System (Batch 5)

### 9️⃣7️⃣-1️⃣1️⃣6️⃣ Transaction Processing, Security & Merchant Tools (20 Programs)

This batch implements a simulated Payment Gateway, focusing on secure transaction handling, fraud detection, and merchant services.

#### **Payment Core & Logic** (5 programs)
- **[`PaymentProcessor.java`](PaymentProcessor.java)** - Standard interface for all payment methods
- **[`TransactionManager.java`](TransactionManager.java)** - Lifecycle management for payment transactions
- **[`BatchPaymentProcessor.java`](BatchPaymentProcessor.java)** - Processing multiple transactions in bulk
- **[`CurrencyExchangeService.java`](CurrencyExchangeService.java)** - International conversion and FX rates simulation
- **[`TerminalPOSSimulation.java`](TerminalPOSSimulation.java)** - Retail Point-of-Sale terminal interaction

#### **Payment Methods** (3 programs)
- **[`CreditCardProcessor.java`](CreditCardProcessor.java)** - Visa/MasterCard card validation and processing
- **[`PayPalProcessor.java`](PayPalProcessor.java)** - Email-based digital wallet processing
- **[`CryptoPaymentProcessor.java`](CryptoPaymentProcessor.java)** - Blockchain/Wallet-based decentralized payments

#### **Security & Compliance** (4 programs)
- **[`FraudDetectionSystem.java`](FraudDetectionSystem.java)** - Rule-based engine for suspicious activity detection
- **[`SecureVaultService.java`](SecureVaultService.java)** - Data tokenization and secure storage vault
- **[`AuthServiceProvider.java`](AuthServiceProvider.java)** - Merchant authentication and session handling
- **[`TwoFactorAuthenticatorService.java`](TwoFactorAuthenticatorService.java)** - OTP-based 2FA verification flow

#### **Business & Operations** (8 programs)
- **[`InvoiceGeneratorService.java`](InvoiceGeneratorService.java)** - Text-based formal invoice generation
- **[`PaymentReceiptService.java`](PaymentReceiptService.java)** - Digital receipt creation and formatting
- **[`RefundManager.java`](RefundManager.java)** - Tracking and processing refund requests
- **[`SubscriptionEngine.java`](SubscriptionEngine.java)** - Recurring billing and membership states
- **[`WalletManagementSystem.java`](WalletManagementSystem.java)** - Virtual wallet balance and top-up manager
- **[`MerchantPortalSystem.java`](MerchantPortalSystem.java)** - Business dashboard and sales reporting
- **[`AuditLoggerService.java`](AuditLoggerService.java)** - Activity logging for security compliance
- **[`PaymentGatewayProxy.java`](PaymentGatewayProxy.java)** - Proxy pattern for secure gateway access

---

## 🏃 Health & Fitness Tracker System (Batch 9)

### 1️⃣1️⃣7️⃣-1️⃣3️⃣6️⃣ Health Monitoring, Fitness Planning & Analysis (20 Programs)

This batch implements a comprehensive Health & Fitness Tracker System, focused on user bio-data, activity logging, and health metrics analysis.

#### **Core & Profiles** (5 programs)
- **[`HealthInterface.java`](HealthInterface.java)** - Base interface for all health tracking components
- **[`UserFitnessProfile.java`](UserFitnessProfile.java)** - User biological data and fitness targets
- **[`BMRCalculator.java`](BMRCalculator.java)** - Basal Metabolic Rate calculation logic
- **[`BodyFatEstimator.java`](BodyFatEstimator.java)** - Body fat percentage estimation (Navy method)
- **[`GoalSettingService.java`](GoalSettingService.java)** - Milestone management for health goals

#### **Activity & Nutrition** (5 programs)
- **[`CalorieTracker.java`](CalorieTracker.java)** - Daily net calorie intake and burn logic
- **[`StepCounterLog.java`](StepCounterLog.java)** - Persistent physical activity logger
- **[`WorkoutPlanner.java`](WorkoutPlanner.java)** - Exercise routine generation templates
- **[`NutritionDatabase.java`](NutritionDatabase.java)** - In-memory food item and macro records
- **[`MacroNutrientEngine.java`](MacroNutrientEngine.java)** - Protein, Carb, and Fat requirement breakdown

#### **Vitals & Monitoring** (5 programs)
- **[`HeartRateMonitorSim.java`](HeartRateMonitorSim.java)** - Training zone heart rate simulation
- **[`SleepAnalyzer.java`](SleepAnalyzer.java)** - Sleep duration and quality metrics analysis
- **[`WaterIntakeReminder.java`](WaterIntakeReminder.java)** - Hydration goal tracking and alerts
- **[`HydrationLevelMonitor.java`](HydrationLevelMonitor.java)** - Dynamic water requirement calculator
- **[`ActivityLevelScale.java`](ActivityLevelScale.java)** - Physical activity intensity classification

#### **Tracking & Dashboards** (5 programs)
- **[`WeightEvolutionTracker.java`](WeightEvolutionTracker.java)** - Body weight history and trend analysis
- **[`MeditationTimer.java`](MeditationTimer.java)** - Mindfulness and session tracking
- **[`FitnessChallengeSystem.java`](FitnessChallengeSystem.java)** - Gamified daily/weekly fitness tasks
- **[`ProgressReportGen.java`](ProgressReportGen.java)** - Data aggregation into health summaries
- **[`HealthSummaryDashboard.java`](HealthSummaryDashboard.java)** - Integrated health overview dashboard

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
- [x] **Nested If-Else Statements** - multiple conditional branches
- [x] **Logical Operators** - AND (`&&`) operator
- [x] Comparison operators and boolean expressions
- [x] **Arrays** - one-dimensional arrays
- [x] Array declaration and initialization
- [x] Array indexing and traversal
- [x] For loops with arrays
- [x] **Modulus Operator** - extracting digits with `%`
- [x] **Integer Division** - digit manipulation
- [x] **Algorithm Design** - digit reversal logic
- [x] **Temporary Variables** - preserving original values
- [x] **Compound Assignment Operators** - `/=` operator
- [x] **Palindrome Checking** - algorithm implementation
- [x] **Multiplication Assignment** - `*=` operator
- [x] **Accumulator Pattern** - building results through iterations
- [x] **Factorial Algorithm** - iterative implementation

- [x] **Design Patterns** - Command, Observer, Factory, Singleton
- [x] **Advanced Patterns** - Strategy, Decorator, Adapter, Proxy
- [x] **Graph Algorithms** - BFS and DFS traversals
- [x] **Data Compression** - Huffman Coding fundamentals
- [x] **Cache Algorithms** - LRU Cache implementation
- [x] **Concurrency** - Thread sync with wait/notify
- [x] **Secure Systems** - Payment gateway architecture
- [x] **Security Features** - 2FA, Tokenization, Fraud Detection
- [x] **Business Logic** - Subscriptions, Batch Processing, Wallets
- [x] **Banking Architecture** - Interface-based account modeling
- [x] **Financial Logic** - EMI, Overdraft, Maturity calculations
- [x] **Compliance** - KYC, AML detection, Audit logging
- [x] **Service Engines** - Fee calculation, Interest accrual
- [x] **Game Mechanics** - Move validation, Turn logic, Winning checks
- [x] **Logic Puzzles** - Sudoku, Towers of Hanoi, Matchstick strategy
- [x] **Simulation Physics** - Gravity, Collision detection, Randomness
- [x] **State Management** - Pet needs, Quiz scoring, Card decks
- [x] **Health Tracking** - Core interfaces and bio-metrics (Batch 9)

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
├── Largestnumber.java       # Find largest of three numbers
├── ReverseNumber.java       # Reverse digits of a number
├── PalindromNumber.java     # Check if number is palindrome
├── Factorial.java           # Calculate factorial using for loop
├── EmployeeInterface.java   # Base EMS interface (Batch 8)
├── PayrollSystem.java       # Centralized salary processing (Batch 8)
├── AttendanceTracker.java   # Daily login/logout logger (Batch 8)
├── TaxCalculatorEngine.java # Income tax slab engine (Batch 8)
├── OrganizationalChart.java  # Hierarchy visualization (Batch 8)
├── TicTacToeTerminal.java   # 2-player grid game (Batch 7)
├── PaymentProcessor.java    # Payment gateway interface (Batch 5)
├── FraudDetectionSystem.java # Fraud rules engine (Batch 5)
├── SecureVaultService.java  # Tokenization service (Batch 5)
├── HealthInterface.java     # Base health interface (Batch 9)
├── UserFitnessProfile.java  # User fitness targets (Batch 9)
├── CalorieTracker.java      # Calorie intake/burn logic (Batch 9)
├── StepCounterLog.java      # Step and distance logger (Batch 9)
├── WorkoutPlanner.java      # Workout routine generator (Batch 9)
├── WaterIntakeReminder.java # Hydration tracking logic (Batch 9)
├── SleepAnalyzer.java       # Sleep quality analysis (Batch 9)
├── HeartRateMonitorSim.java # Heart rate simulation (Batch 9)
├── BMRCalculator.java       # Basal Metabolic Rate calc (Batch 9)
├── NutritionDatabase.java   # Food nutrition data (Batch 9)
├── GoalSettingService.java   # Fitness goal management (Batch 9)
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
