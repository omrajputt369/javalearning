import java.util.Scanner;

public class SunnyNumber {

    public static boolean isSunny(int n) {
        // A number n is a Sunny number if n + 1 is a perfect square
        double root = Math.sqrt(n + 1);
        return (root % 1 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sunny Number Checker ===");
        System.out.println("A number n is Sunny if n + 1 is a perfect square.");
        System.out.println("Example: 8 (8+1=9, 9=3^2), 3, 15, 24, 35, 48, 63, 80\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isSunny(n)) {
            System.out.println("\n" + n + " is a SUNNY number!");
        } else {
            System.out.println("\n" + n + " is NOT a Sunny number.");
        }

        scanner.close();
    }
}
