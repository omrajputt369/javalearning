import java.util.Scanner;

public class ArmstrongRange {

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Armstrong Numbers in Range ===");
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        System.out.println("\nArmstrong numbers between " + start + " and " + end + ":");
        boolean found = false;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None found.");
        } else {
            System.out.println();
        }

        scanner.close();
    }
}
