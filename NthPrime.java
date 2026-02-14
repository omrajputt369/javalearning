import java.util.Scanner;

public class NthPrime {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Nth Prime Finder ===");
        System.out.print("Enter the value of N: ");

        try {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("N must be a positive integer!");
            } else {
                int nthPrime = findNthPrime(n);
                System.out.println("\nThe " + n + "-th prime number is: " + nthPrime);
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
