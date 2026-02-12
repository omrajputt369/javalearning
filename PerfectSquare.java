import java.util.Scanner;

public class PerfectSquare {

    public static boolean isPerfectSquare(long n) {
        if (n < 0)
            return false;
        long root = (long) Math.sqrt(n);
        return root * root == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Perfect Square Checker ===");
        System.out.print("Enter a number: ");

        try {
            long n = scanner.nextLong();
            if (isPerfectSquare(n)) {
                System.out.println(n + " is a PERFECT SQUARE! (sqrt: " + (long) Math.sqrt(n) + ")");
            } else {
                System.out.println(n + " is NOT a perfect square.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
