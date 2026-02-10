import java.util.Scanner;

public class ArmstrongNumber {

    // Method to count the number of digits
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to check if a number is Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    // Method to find all Armstrong numbers in a range
    public static void findArmstrongInRange(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        boolean found = false;

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None found");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Armstrong Number Checker ===");
        System.out.println(
                "An Armstrong number is equal to the sum of its digits raised to the power of number of digits");
        System.out.println("Example: 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153\n");

        System.out.println("1. Check single number");
        System.out.println("2. Find Armstrong numbers in range");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (isArmstrong(num)) {
                    System.out.println(num + " is an Armstrong number!");
                } else {
                    System.out.println(num + " is not an Armstrong number.");
                }
                break;

            case 2:
                System.out.print("Enter start range: ");
                int start = scanner.nextInt();
                System.out.print("Enter end range: ");
                int end = scanner.nextInt();

                findArmstrongInRange(start, end);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
