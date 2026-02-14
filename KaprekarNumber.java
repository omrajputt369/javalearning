import java.util.Scanner;

public class KaprekarNumber {

    public static boolean isKaprekar(int n) {
        if (n == 1)
            return true;

        long square = (long) n * n;
        String s = Long.toString(square);
        int len = s.length();

        // Split the square into two parts
        for (int i = 1; i < len; i++) {
            String leftStr = s.substring(0, i);
            String rightStr = s.substring(i);

            int left = Integer.parseInt(leftStr);
            int right = Integer.parseInt(rightStr);

            // right part cannot be zero
            if (right > 0 && left + right == n) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kaprekar Number Checker ===");
        System.out.println(
                "A Kaprekar number is a number whose square can be split into two parts that add up to the number.");
        System.out.println("Example: 45 (45^2 = 2025, 20 + 25 = 45), 9, 297, 703\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isKaprekar(n)) {
            System.out.println("\n" + n + " is a KAPREKAR number!");
        } else {
            System.out.println("\n" + n + " is NOT a Kaprekar number.");
        }

        scanner.close();
    }
}
