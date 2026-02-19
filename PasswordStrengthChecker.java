import java.util.Scanner;

/**
 * A Java program that analyzes the strength of a password based on common
 * criteria.
 */

public class PasswordStrengthChecker {
    public static String checkStrength(String password) {
        int length = password.length();
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                hasUpper = true;
            else if (Character.isLowerCase(c))
                hasLower = true;
            else if (Character.isDigit(c))
                hasDigit = true;
            else if (specialChars.indexOf(c) != -1)
                hasSpecial = true;
        }

        int score = 0;
        if (length >= 8)
            score++;
        if (length >= 12)
            score++;
        if (hasUpper)
            score++;
        if (hasLower)
            score++;
        if (hasDigit)
            score++;
        if (hasSpecial)
            score++;

        if (score <= 2)
            return "Very Weak";
        if (score <= 3)
            return "Weak";
        if (score <= 4)
            return "Medium";
        if (score <= 5)
            return "Strong";
        return "Very Strong";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Password Strength Checker ---");
        System.out.print("Enter password to check: ");
        String password = scanner.nextLine();

        String strength = checkStrength(password);
        System.out.println("Password Strength: " + strength);

        System.out.println("\nCriteria for a strong password:");
        System.out.println("- At least 8-12 characters");
        System.out.println("- Upper and lowercase letters");
        System.out.println("- Numbers and special characters");

        scanner.close();
    }
}
