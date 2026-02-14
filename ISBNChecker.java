import java.util.Scanner;

public class ISBNChecker {

    public static boolean isValidISBN10(String isbn) {
        // Remove any dashes or spaces
        isbn = isbn.replace("-", "").replace(" ", "");

        if (isbn.length() != 10) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = isbn.charAt(i) - '0';
            if (digit < 0 || digit > 9)
                return false;
            sum += (digit * (10 - i));
        }

        // Handle the last character (could be 'X')
        char lastChar = isbn.charAt(9);
        if (lastChar == 'X' || lastChar == 'x') {
            sum += 10;
        } else if (Character.isDigit(lastChar)) {
            sum += (lastChar - '0');
        } else {
            return false;
        }

        return (sum % 11 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ISBN-10 Validator ===");
        System.out.print("Enter a 10-digit ISBN: ");
        String isbn = scanner.nextLine();

        if (isValidISBN10(isbn)) {
            System.out.println("\n\"" + isbn + "\" is a VALID ISBN-10 code!");
        } else {
            System.out.println("\n\"" + isbn + "\" is NOT a valid ISBN-10 code.");
        }

        scanner.close();
    }
}
