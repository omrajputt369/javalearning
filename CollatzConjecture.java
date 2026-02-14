import java.util.Scanner;

public class CollatzConjecture {

    public static void printCollatz(long n) {
        System.out.print(n);
        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(" -> " + n);
            steps++;

            // Safety break for very large sequences
            if (steps > 1000) {
                System.out.println("... (Sequence truncated)");
                break;
            }
        }
        System.out.println("\nTotal steps: " + steps);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Collatz Conjecture ===");
        System.out.println("Rules: If n is even, n = n/2. If n is odd, n = 3n + 1. The sequence always ends at 1.");
        System.out.print("Enter a positive integer: ");

        try {
            long n = scanner.nextLong();
            if (n <= 0) {
                System.out.println("Please enter a positive integer!");
            } else {
                System.out.println("\nCollatz sequence for " + n + ":");
                printCollatz(n);
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
