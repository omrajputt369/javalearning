import java.util.Scanner;

public class PerfectNumber {

    // Method to check if a number is perfect
    public static boolean isPerfect(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1; // 1 is always a divisor

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    // Method to find divisors of a number
    public static void findDivisors(int num) {
        System.out.print("Divisors of " + num + ": ");
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum of divisors: " + sum);

        if (sum == num) {
            System.out.println(num + " is a PERFECT number!");
        } else if (sum > num) {
            System.out.println(num + " is an ABUNDANT number");
        } else {
            System.out.println(num + " is a DEFICIENT number");
        }
    }

    // Method to find perfect numbers in a range
    public static void findPerfectInRange(int start, int end) {
        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        boolean found = false;

        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None found");
        } else {
            System.out.println();
        }
    }

    // Method to find first N perfect numbers
    public static void findFirstNPerfect(int n) {
        System.out.println("Finding first " + n + " perfect numbers:");
        System.out.println("(This may take some time for large values)\n");

        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPerfect(num)) {
                System.out.println((count + 1) + ". " + num);
                count++;
            }
            num++;

            // Safety limit
            if (num > 10000 && count == 0) {
                System.out.println("Search limit reached. Perfect numbers are rare!");
                break;
            }
        }
    }

    // Method to check if number is abundant
    public static boolean isAbundant(int num) {
        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum > num;
    }

    // Method to check if number is deficient
    public static boolean isDeficient(int num) {
        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum < num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Perfect Number Checker ===");
        System.out.println("A perfect number equals the sum of its proper divisors");
        System.out.println("Example: 6 = 1 + 2 + 3\n");

        System.out.println("1. Check if a number is perfect");
        System.out.println("2. Find divisors and classify number");
        System.out.println("3. Find perfect numbers in range");
        System.out.println("4. Find first N perfect numbers");
        System.out.println("5. Check if number is abundant");
        System.out.println("6. Check if number is deficient");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (isPerfect(num)) {
                    System.out.println("\n" + num + " is a PERFECT NUMBER! ✓");
                    findDivisors(num);
                } else {
                    System.out.println("\n" + num + " is NOT a perfect number.");
                }
                break;

            case 2:
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                System.out.println();
                findDivisors(n);
                break;

            case 3:
                System.out.print("Enter start range: ");
                int start = scanner.nextInt();
                System.out.print("Enter end range: ");
                int end = scanner.nextInt();
                System.out.println();

                if (end > 10000) {
                    System.out.println("Warning: Large range may take time!");
                }

                findPerfectInRange(start, end);
                break;

            case 4:
                System.out.print("How many perfect numbers to find? ");
                int count = scanner.nextInt();

                if (count > 4) {
                    System.out.println("Note: Perfect numbers are very rare!");
                    System.out.println("Finding more than 4 may take a very long time.");
                }

                System.out.println();
                findFirstNPerfect(count);
                break;

            case 5:
                System.out.print("Enter a number: ");
                int num5 = scanner.nextInt();

                if (isAbundant(num5)) {
                    System.out.println("\n" + num5 + " is an ABUNDANT number");
                    System.out.println("(Sum of divisors > number)");
                } else {
                    System.out.println("\n" + num5 + " is NOT abundant");
                }
                break;

            case 6:
                System.out.print("Enter a number: ");
                int num6 = scanner.nextInt();

                if (isDeficient(num6)) {
                    System.out.println("\n" + num6 + " is a DEFICIENT number");
                    System.out.println("(Sum of divisors < number)");
                } else {
                    System.out.println("\n" + num6 + " is NOT deficient");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
