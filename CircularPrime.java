import java.util.Scanner;

public class CircularPrime {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isCircularPrime(int n) {
        String s = Integer.toString(n);
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (!isPrime(Integer.parseInt(s)))
                return false;

            // Rotate the string: move first char to the end
            s = s.substring(1) + s.charAt(0);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Circular Prime Checker ===");
        System.out.println(
                "A Circular prime is a prime number that remains prime after all cyclic shifts of its digits.");
        System.out.println("Example: 197 (197, 971, 719 are all prime), 11, 13, 17, 37, 71, 73, 79, 97\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isCircularPrime(n)) {
            System.out.println("\n" + n + " is a CIRCULAR PRIME!");
        } else {
            System.out.println("\n" + n + " is NOT a Circular prime.");
        }

        scanner.close();
    }
}
