import java.util.Scanner;

public class FibonacciSeries {

    // Method to generate Fibonacci series using iteration
    public static void generateFibonacci(int n) {
        long first = 0, second = 1;

        System.out.print("Fibonacci Series (" + n + " terms): ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Method to get nth Fibonacci number using recursion
    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Method to check if a number is in Fibonacci series
    public static boolean isFibonacci(long num) {
        long a = 0, b = 1;

        if (num == 0 || num == 1) {
            return true;
        }

        while (b < num) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        return b == num;
    }

    // Method to find Fibonacci numbers up to a limit
    public static void fibonacciUpToLimit(long limit) {
        System.out.print("Fibonacci numbers up to " + limit + ": ");

        long first = 0, second = 1;
        System.out.print(first + " ");

        while (second <= limit) {
            System.out.print(second + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Fibonacci Series Generator ===");
        System.out.println("1. Generate first N Fibonacci numbers");
        System.out.println("2. Find Nth Fibonacci number (Recursive)");
        System.out.println("3. Check if a number is Fibonacci");
        System.out.println("4. Generate Fibonacci up to a limit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("How many terms? ");
                int n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Please enter a positive number!");
                } else {
                    generateFibonacci(n);
                }
                break;

            case 2:
                System.out.print("Enter term position (n): ");
                int pos = scanner.nextInt();

                if (pos < 0) {
                    System.out.println("Please enter a non-negative number!");
                } else {
                    long result = fibonacciRecursive(pos);
                    System.out.println("The " + pos + "th Fibonacci number is: " + result);
                }
                break;

            case 3:
                System.out.print("Enter a number to check: ");
                long num = scanner.nextLong();

                if (isFibonacci(num)) {
                    System.out.println(num + " is a Fibonacci number!");
                } else {
                    System.out.println(num + " is not a Fibonacci number.");
                }
                break;

            case 4:
                System.out.print("Enter the limit: ");
                long limit = scanner.nextLong();

                if (limit < 0) {
                    System.out.println("Please enter a non-negative number!");
                } else {
                    fibonacciUpToLimit(limit);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
