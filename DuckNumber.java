import java.util.Scanner;

public class DuckNumber {

    public static boolean isDuckNumber(String numStr) {
        // A Duck number is a number which has zeroes present in it,
        // but no zero at the beginning of the number.

        if (numStr.isEmpty())
            return false;

        // Check if starts with 0
        if (numStr.charAt(0) == '0')
            return false;

        // Check if contains 0
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Duck Number Checker ===");
        System.out.println("A Duck number has zero(s) in it, but doesn't start with zero.");
        System.out.println("Example: 3210, 7056, 8080 (Not 012)\n");

        System.out.print("Enter a number: ");
        String n = scanner.nextLine();

        if (isDuckNumber(n)) {
            System.out.println("\n" + n + " is a DUCK number!");
        } else {
            System.out.println("\n" + n + " is NOT a Duck number.");
        }

        scanner.close();
    }
}
