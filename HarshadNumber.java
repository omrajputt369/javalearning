import java.util.Scanner;

public class HarshadNumber {

    public static boolean isHarshad(int num) {
        if (num <= 0)
            return false;

        int sumOfDigits = 0;
        int temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        return num % sumOfDigits == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Harshad Number Checker ===");
        System.out.println("A Harshad number is an integer that is divisible by the sum of its digits.");
        System.out.println("Example: 18 (1+8=9, 18/9=2)\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isHarshad(n)) {
            System.out.println("\n" + n + " is a HARSHAD number!");
        } else {
            System.out.println("\n" + n + " is NOT a Harshad number.");
        }

        scanner.close();
    }
}
