import java.util.Scanner;

public class SmithNumber {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isSmith(int n) {
        if (n <= 1)
            return false;

        // Check if n is prime (Smith numbers are composite)
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            return false;

        int sumDigits = sumOfDigits(n);
        int sumPrimeFactors = 0;
        int temp = n;

        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                sumPrimeFactors += sumOfDigits(i);
                temp /= i;
            }
        }

        return sumDigits == sumPrimeFactors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Smith Number Checker ===");
        System.out.println(
                "A Smith number is a composite number whose sum of digits equals the sum of digits of its prime factors.");
        System.out.println(
                "Example: 666 (6+6+6 = 18. Prime factors: 2, 3, 3, 37. Sum of digits of factors: 2+3+3+(3+7) = 18)\n");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isSmith(n)) {
            System.out.println("\n" + n + " is a SMITH number!");
        } else {
            System.out.println("\n" + n + " is NOT a Smith number.");
        }

        scanner.close();
    }
}
