import java.util.Scanner;

public class NeonNumber {

    public static boolean isNeon(int n) {
        // A number is Neon if the sum of digits of its square equals the number itself
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Neon Number Checker ===");
        System.out.println("A number is Neon if the sum of digits of its square equals the number.");
        System.out.println("Example: 9 (9^2 = 81, 8+1 = 9), 0, 1\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isNeon(n)) {
            System.out.println("\n" + n + " is a NEON number!");
        } else {
            System.out.println("\n" + n + " is NOT a Neon number.");
        }

        scanner.close();
    }
}
