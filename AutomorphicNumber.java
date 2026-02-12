import java.util.Scanner;

public class AutomorphicNumber {

    public static boolean isAutomorphic(int num) {
        if (num < 0)
            return false;

        long square = (long) num * num;
        String s1 = Integer.toString(num);
        String s2 = Long.toString(square);

        return s2.endsWith(s1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Automorphic Number Checker ===");
        System.out.println("An Automorphic number is a number whose square ends with the number itself.");
        System.out.println("Example: 25 (25^2 = 625)\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isAutomorphic(n)) {
            System.out.println("\n" + n + " is an AUTOMORPHIC number!");
        } else {
            System.out.println("\n" + n + " is NOT an Automorphic number.");
        }

        scanner.close();
    }
}
