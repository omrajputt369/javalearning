import java.util.Scanner;

public class PronicNumber {

    public static boolean isPronic(int n) {
        if (n < 0)
            return false;

        // A pronic number is a product of two consecutive integers: n = x * (x + 1)
        for (int i = 0; i <= Math.sqrt(n); i++) {
            if (i * (i + 1) == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Pronic Number Checker ===");
        System.out.println("A Pronic number is a product of two consecutive integers (n = x * (x + 1)).");
        System.out.println("Example: 12 (3 * 4), 2, 6, 20, 30, 42\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isPronic(n)) {
            System.out.println("\n" + n + " is a PRONIC number!");
        } else {
            System.out.println("\n" + n + " is NOT a Pronic number.");
        }

        scanner.close();
    }
}
