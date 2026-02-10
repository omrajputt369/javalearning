import java.util.Scanner;

public class GCDCalculator {

    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find GCD of multiple numbers
    public static int findGCDMultiple(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findGCD(result, numbers[i]);
        }
        return result;
    }

    // Method to find LCM
    public static int findLCM(int a, int b) {
        return Math.abs(a * b) / findGCD(a, b);
    }

    // Method to find LCM of multiple numbers
    public static int findLCMMultiple(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findLCM(result, numbers[i]);
        }
        return result;
    }

    // Method to check if two numbers are coprime
    public static boolean areCoprime(int a, int b) {
        return findGCD(a, b) == 1;
    }

    // Method to display GCD calculation steps
    public static void displayGCDSteps(int a, int b) {
        System.out.println("\nFinding GCD of " + a + " and " + b + " using Euclidean algorithm:");

        a = Math.abs(a);
        b = Math.abs(b);
        int step = 1;

        while (b != 0) {
            int quotient = a / b;
            int remainder = a % b;

            System.out.println("Step " + step + ": " + a + " = " + b + " × " + quotient + " + " + remainder);

            a = b;
            b = remainder;
            step++;
        }

        System.out.println("\nGCD = " + a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GCD and LCM Calculator ===");
        System.out.println("1. Find GCD of two numbers");
        System.out.println("2. Find LCM of two numbers");
        System.out.println("3. Find GCD and LCM of two numbers");
        System.out.println("4. Find GCD of multiple numbers");
        System.out.println("5. Find LCM of multiple numbers");
        System.out.println("6. Check if two numbers are coprime");
        System.out.println("7. Show GCD calculation steps");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();

                int gcd = findGCD(num1, num2);
                System.out.println("\nGCD of " + num1 + " and " + num2 + " = " + gcd);
                break;

            case 2:
                System.out.print("Enter first number: ");
                int n1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int n2 = scanner.nextInt();

                int lcm = findLCM(n1, n2);
                System.out.println("\nLCM of " + n1 + " and " + n2 + " = " + lcm);
                break;

            case 3:
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();

                int gcdVal = findGCD(a, b);
                int lcmVal = findLCM(a, b);

                System.out.println("\nFor numbers " + a + " and " + b + ":");
                System.out.println("GCD = " + gcdVal);
                System.out.println("LCM = " + lcmVal);
                System.out.println("Product of numbers = " + (a * b));
                System.out.println("GCD × LCM = " + (gcdVal * lcmVal));
                break;

            case 4:
                System.out.print("How many numbers? ");
                int count = scanner.nextInt();

                if (count < 2) {
                    System.out.println("Need at least 2 numbers!");
                    break;
                }

                int[] numbers = new int[count];
                System.out.println("Enter " + count + " numbers:");
                for (int i = 0; i < count; i++) {
                    System.out.print("Number " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();
                }

                int gcdMultiple = findGCDMultiple(numbers);
                System.out.print("\nGCD of ");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i]);
                    if (i < numbers.length - 1)
                        System.out.print(", ");
                }
                System.out.println(" = " + gcdMultiple);
                break;

            case 5:
                System.out.print("How many numbers? ");
                int cnt = scanner.nextInt();

                if (cnt < 2) {
                    System.out.println("Need at least 2 numbers!");
                    break;
                }

                int[] nums = new int[cnt];
                System.out.println("Enter " + cnt + " numbers:");
                for (int i = 0; i < cnt; i++) {
                    System.out.print("Number " + (i + 1) + ": ");
                    nums[i] = scanner.nextInt();
                }

                int lcmMultiple = findLCMMultiple(nums);
                System.out.print("\nLCM of ");
                for (int i = 0; i < nums.length; i++) {
                    System.out.print(nums[i]);
                    if (i < nums.length - 1)
                        System.out.print(", ");
                }
                System.out.println(" = " + lcmMultiple);
                break;

            case 6:
                System.out.print("Enter first number: ");
                int x = scanner.nextInt();
                System.out.print("Enter second number: ");
                int y = scanner.nextInt();

                if (areCoprime(x, y)) {
                    System.out.println("\n" + x + " and " + y + " are COPRIME (relatively prime)");
                    System.out.println("Their GCD is 1");
                } else {
                    System.out.println("\n" + x + " and " + y + " are NOT coprime");
                    System.out.println("Their GCD is " + findGCD(x, y));
                }
                break;

            case 7:
                System.out.print("Enter first number: ");
                int p = scanner.nextInt();
                System.out.print("Enter second number: ");
                int q = scanner.nextInt();

                displayGCDSteps(p, q);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
