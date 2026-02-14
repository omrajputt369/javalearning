import java.util.Scanner;

public class TrimorphicNumber {

    public static boolean isTrimorphic(int n) {
        // A number is trimorphic if its cube ends with the number itself
        long cube = (long) n * n * n;
        String s1 = Integer.toString(n);
        String s2 = Long.toString(cube);

        return s2.endsWith(s1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Trimorphic Number Checker ===");
        System.out.println("A number is Trimorphic if its cube ends with the number itself.");
        System.out.println("Example: 4 (4^3 = 64), 5 (5^3 = 125), 6 (6^3 = 216), 24, 25, 49, 50, 51, 75, 76, 99\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isTrimorphic(n)) {
            System.out.println("\n" + n + " is a TRIMORPHIC number!");
        } else {
            System.out.println("\n" + n + " is NOT a Trimorphic number.");
        }

        scanner.close();
    }
}
