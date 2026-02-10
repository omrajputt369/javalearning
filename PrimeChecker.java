import java.util.Scanner;

public class PrimeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        // Check odd divisors up to square root
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find all prime numbers up to n (Sieve of Eratosthenes)
    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        // Initialize all as prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Mark non-primes
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print primes
        System.out.print("Prime numbers up to " + n + ": ");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
                if (count % 15 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTotal: " + count + " primes");
    }

    // Method to find first N prime numbers
    public static void findFirstNPrimes(int n) {
        System.out.println("First " + n + " prime numbers:");
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
                if (count % 15 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
        System.out.println();
    }

    // Method to find prime factors of a number
    public static void findPrimeFactors(int num) {
        System.out.print("Prime factors of " + num + ": ");

        // Handle 2 separately
        while (num % 2 == 0) {
            System.out.print("2 ");
            num /= 2;
        }

        // Check odd factors
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // If num is still > 2, it's a prime factor
        if (num > 2) {
            System.out.print(num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Prime Number Checker ===");
        System.out.println("1. Check if a number is prime");
        System.out.println("2. Find all primes up to N");
        System.out.println("3. Find first N prime numbers");
        System.out.println("4. Find prime factors of a number");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (isPrime(num)) {
                    System.out.println(num + " is a prime number!");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
                break;

            case 2:
                System.out.print("Enter the limit: ");
                int limit = scanner.nextInt();

                if (limit < 2) {
                    System.out.println("There are no primes less than 2!");
                } else {
                    sieveOfEratosthenes(limit);
                }
                break;

            case 3:
                System.out.print("How many primes to find? ");
                int count = scanner.nextInt();

                if (count <= 0) {
                    System.out.println("Please enter a positive number!");
                } else {
                    findFirstNPrimes(count);
                }
                break;

            case 4:
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number <= 1) {
                    System.out.println("Number must be greater than 1!");
                } else {
                    findPrimeFactors(number);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
