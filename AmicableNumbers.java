import java.util.Scanner;

public class AmicableNumbers {

    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean areAmicable(int a, int b) {
        return sumOfDivisors(a) == b && sumOfDivisors(b) == a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Amicable Numbers Checker ===");
        System.out.println(
                "Two numbers are amicable if the sum of proper divisors of one equals the other, and vice versa.");
        System.out.println("Example: 220 and 284\n");

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (areAmicable(a, b)) {
            System.out.println("\n" + a + " and " + b + " are AMICABLE numbers!");
        } else {
            System.out.println("\n" + a + " and " + b + " are NOT amicable numbers.");
        }

        scanner.close();
    }
}
