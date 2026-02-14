import java.util.Scanner;

public class BuzzNumber {

    public static boolean isBuzz(int n) {
        // A Buzz number is divisible by 7 or ends with 7
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Buzz Number Checker ===");
        System.out.println("A number is Buzz if it is divisible by 7 or ends with 7.");
        System.out.println("Example: 14, 17, 27, 28, 77\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isBuzz(n)) {
            System.out.println("\n" + n + " is a BUZZ number!");
        } else {
            System.out.println("\n" + n + " is NOT a Buzz number.");
        }

        scanner.close();
    }
}
