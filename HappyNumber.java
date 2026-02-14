import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Happy Number Checker ===");
        System.out.println("A Happy number eventually reaches 1 when replaced by the sum of square of its digits.");
        System.out.println("Example: 19 (1^2 + 9^2 = 82, 8^2 + 2^2 = 68, 6^2 + 8^2 = 100, 1^2 + 0^2 + 0^2 = 1)\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isHappy(n)) {
            System.out.println("\n" + n + " is a HAPPY number!");
        } else {
            System.out.println("\n" + n + " is NOT a Happy number.");
        }

        scanner.close();
    }
}
