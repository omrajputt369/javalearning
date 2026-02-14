import java.util.Scanner;

public class DisariumNumber {

    public static boolean isDisarium(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            len--;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Disarium Number Checker ===");
        System.out.println(
                "A number is Disarium if the sum of its digits raised to their respective positions equals the number.");
        System.out.println("Example: 89 (8^1 + 9^2 = 8 + 81 = 89), 135, 175\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isDisarium(n)) {
            System.out.println("\n" + n + " is a DISARIUM number!");
        } else {
            System.out.println("\n" + n + " is NOT a Disarium number.");
        }

        scanner.close();
    }
}
