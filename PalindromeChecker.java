import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for accurate checking
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindromeNumber(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker ===");
        System.out.println("1. Check String Palindrome");
        System.out.println("2. Check Number Palindrome");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                if (isPalindrome(input)) {
                    System.out.println("\"" + input + "\" is a palindrome!");
                } else {
                    System.out.println("\"" + input + "\" is not a palindrome.");
                }
                break;

            case 2:
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (isPalindromeNumber(number)) {
                    System.out.println(number + " is a palindrome!");
                } else {
                    System.out.println(number + " is not a palindrome.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }
}
