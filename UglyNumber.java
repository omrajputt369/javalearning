import java.util.Scanner;

public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;

        // Ugly numbers are positive numbers whose only prime factors are 2, 3, or 5
        int[] factors = { 2, 3, 5 };
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ugly Number Checker ===");
        System.out.println("Ugly numbers are positive numbers whose only prime factors are 2, 3, or 5.");
        System.out.println("Example: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isUgly(n)) {
            System.out.println("\n" + n + " is an UGLY number!");
        } else {
            System.out.println("\n" + n + " is NOT an Ugly number.");
        }

        scanner.close();
    }
}
