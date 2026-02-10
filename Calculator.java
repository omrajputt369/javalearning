import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    // Method for modulus
    public static double modulus(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Modulus by zero!");
            return Double.NaN;
        }
        return a % b;
    }

    // Method for percentage
    public static double percentage(double value, double percent) {
        return (value * percent) / 100;
    }

    // Method for square root
    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot find square root of negative number!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    // Method for power
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("=== Simple Calculator ===");

        while (continueCalculating) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (×)");
            System.out.println("4. Division (÷)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Percentage");
            System.out.println("7. Square Root (√)");
            System.out.println("8. Power (^)");
            System.out.println("9. Exit");
            System.out.print("Enter choice (1-9): ");

            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("Thank you for using Calculator!");
                continueCalculating = false;
                continue;
            }

            double num1, num2, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = add(num1, num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = subtract(num1, num2);
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = multiply(num1, num2);
                    System.out.println("Result: " + num1 + " × " + num2 + " = " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + num1 + " ÷ " + num2 + " = " + result);
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = modulus(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    }
                    break;

                case 6:
                    System.out.print("Enter value: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter percentage: ");
                    num2 = scanner.nextDouble();
                    result = percentage(num1, num2);
                    System.out.println("Result: " + num2 + "% of " + num1 + " = " + result);
                    break;

                case 7:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    result = squareRoot(num1);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: √" + num1 + " = " + result);
                    }
                    break;

                case 8:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    result = power(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-9.");
            }
        }

        scanner.close();
    }
}