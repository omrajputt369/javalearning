import java.util.Scanner;

public class PowerCalculator {

    // Method to calculate power using loop
    public static double powerIterative(double base, int exponent) {
        double result = 1;
        int absExponent = Math.abs(exponent);

        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }

        return (exponent < 0) ? 1 / result : result;
    }

    // Method to calculate power using recursion
    public static double powerRecursive(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        if (exponent < 0) {
            return 1 / powerRecursive(base, -exponent);
        }

        return base * powerRecursive(base, exponent - 1);
    }

    // Method to calculate power using fast exponentiation
    public static double powerFast(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        boolean negative = exponent < 0;
        exponent = Math.abs(exponent);

        double result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2;
        }

        return negative ? 1 / result : result;
    }

    // Method to calculate square root
    public static double squareRoot(double num) {
        if (num < 0) {
            System.out.println("Cannot calculate square root of negative number");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }

    // Method to calculate cube root
    public static double cubeRoot(double num) {
        return Math.cbrt(num);
    }

    // Method to calculate nth root
    public static double nthRoot(double num, int n) {
        return Math.pow(num, 1.0 / n);
    }

    // Method to display power table
    public static void displayPowerTable(double base, int maxExponent) {
        System.out.println("\nPower Table for base " + base + ":");
        System.out.println("─────────────────────────");
        for (int i = 0; i <= maxExponent; i++) {
            double result = Math.pow(base, i);
            System.out.printf("%g^%d = %g\n", base, i, result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Power Calculator ===");
        System.out.println("1. Calculate power (x^y)");
        System.out.println("2. Calculate power using recursion");
        System.out.println("3. Calculate power using fast method");
        System.out.println("4. Calculate square root (√x)");
        System.out.println("5. Calculate cube root (∛x)");
        System.out.println("6. Calculate nth root");
        System.out.println("7. Display power table");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        double base, result;
        int exponent;

        switch (choice) {
            case 1:
                System.out.print("Enter base: ");
                base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                exponent = scanner.nextInt();
                result = powerIterative(base, exponent);
                System.out.printf("\n%g^%d = %g\n", base, exponent, result);
                break;

            case 2:
                System.out.print("Enter base: ");
                base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                exponent = scanner.nextInt();
                result = powerRecursive(base, exponent);
                System.out.printf("\n%g^%d = %g (using recursion)\n", base, exponent, result);
                break;

            case 3:
                System.out.print("Enter base: ");
                base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                exponent = scanner.nextInt();
                result = powerFast(base, exponent);
                System.out.printf("\n%g^%d = %g (using fast exponentiation)\n", base, exponent, result);
                break;

            case 4:
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();
                result = squareRoot(num);
                if (!Double.isNaN(result)) {
                    System.out.printf("\n√%g = %g\n", num, result);
                }
                break;

            case 5:
                System.out.print("Enter number: ");
                num = scanner.nextDouble();
                result = cubeRoot(num);
                System.out.printf("\n∛%g = %g\n", num, result);
                break;

            case 6:
                System.out.print("Enter number: ");
                num = scanner.nextDouble();
                System.out.print("Enter root (n): ");
                int n = scanner.nextInt();
                result = nthRoot(num, n);
                System.out.printf("\n%d√%g = %g\n", n, num, result);
                break;

            case 7:
                System.out.print("Enter base: ");
                base = scanner.nextDouble();
                System.out.print("Enter maximum exponent: ");
                int max = scanner.nextInt();
                displayPowerTable(base, max);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
