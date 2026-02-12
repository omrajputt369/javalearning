import java.util.Scanner;

public class StrongNumber {

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Strong Number Checker ===");
        System.out
                .println("A Strong number is one where the sum of factorials of its digits equals the number itself.");
        System.out.println("Example: 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isStrong(n)) {
            System.out.println("\n" + n + " is a STRONG number!");
        } else {
            System.out.println("\n" + n + " is NOT a strong number.");
        }

        scanner.close();
    }
}
