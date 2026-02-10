import java.util.Scanner;

public class DigitCounter {

    // Method to count digits
    public static int countDigits(long num) {
        if (num == 0) {
            return 1;
        }

        num = Math.abs(num);
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    // Method to calculate sum of digits
    public static int sumOfDigits(long num) {
        num = Math.abs(num);
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    // Method to calculate product of digits
    public static long productOfDigits(long num) {
        num = Math.abs(num);
        long product = 1;

        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }

        return product;
    }

    // Method to reverse digits
    public static long reverseDigits(long num) {
        boolean negative = num < 0;
        num = Math.abs(num);
        long reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return negative ? -reversed : reversed;
    }

    // Method to count specific digit
    public static int countSpecificDigit(long num, int digit) {
        num = Math.abs(num);
        int count = 0;

        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }

        return count;
    }

    // Method to find max digit
    public static int findMaxDigit(long num) {
        num = Math.abs(num);
        int max = 0;

        while (num > 0) {
            int digit = (int) (num % 10);
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        }

        return max;
    }

    // Method to find min digit
    public static int findMinDigit(long num) {
        num = Math.abs(num);
        int min = 9;

        while (num > 0) {
            int digit = (int) (num % 10);
            if (digit < min) {
                min = digit;
            }
            num /= 10;
        }

        return min;
    }

    // Method to display digit frequency
    public static void displayDigitFrequency(long num) {
        num = Math.abs(num);
        int[] frequency = new int[10];

        while (num > 0) {
            frequency[(int) (num % 10)]++;
            num /= 10;
        }

        System.out.println("\nDigit Frequency:");
        System.out.println("─────────────────");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Digit Counter ===");
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        System.out.println("\nChoose operation:");
        System.out.println("1. Count total digits");
        System.out.println("2. Sum of digits");
        System.out.println("3. Product of digits");
        System.out.println("4. Reverse digits");
        System.out.println("5. Count specific digit");
        System.out.println("6. Find maximum digit");
        System.out.println("7. Find minimum digit");
        System.out.println("8. Display digit frequency");
        System.out.println("9. Show all information");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nTotal digits: " + countDigits(num));
                break;

            case 2:
                System.out.println("\nSum of digits: " + sumOfDigits(num));
                break;

            case 3:
                System.out.println("\nProduct of digits: " + productOfDigits(num));
                break;

            case 4:
                System.out.println("\nOriginal number: " + num);
                System.out.println("Reversed number: " + reverseDigits(num));
                break;

            case 5:
                System.out.print("Enter digit to count (0-9): ");
                int digit = scanner.nextInt();
                if (digit >= 0 && digit <= 9) {
                    System.out.println("\nDigit " + digit + " appears " +
                            countSpecificDigit(num, digit) + " time(s)");
                } else {
                    System.out.println("Invalid digit!");
                }
                break;

            case 6:
                System.out.println("\nMaximum digit: " + findMaxDigit(num));
                break;

            case 7:
                System.out.println("\nMinimum digit: " + findMinDigit(num));
                break;

            case 8:
                displayDigitFrequency(num);
                break;

            case 9:
                System.out.println("\n=== Complete Analysis ===");
                System.out.println("Number: " + num);
                System.out.println("Total digits: " + countDigits(num));
                System.out.println("Sum of digits: " + sumOfDigits(num));
                System.out.println("Product of digits: " + productOfDigits(num));
                System.out.println("Reversed: " + reverseDigits(num));
                System.out.println("Maximum digit: " + findMaxDigit(num));
                System.out.println("Minimum digit: " + findMinDigit(num));
                displayDigitFrequency(num);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
