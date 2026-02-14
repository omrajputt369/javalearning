import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:,.<>?";
    private static final String ALL = LOWER + UPPER + DIGITS + SPECIAL;

    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 4)
            length = 8; // Default to 8 if too short

        StringBuilder sb = new StringBuilder(length);

        // Ensure at least one of each category
        sb.append(LOWER.charAt(random.nextInt(LOWER.length())));
        sb.append(UPPER.charAt(random.nextInt(UPPER.length())));
        sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        sb.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        for (int i = 4; i < length; i++) {
            sb.append(ALL.charAt(random.nextInt(ALL.length())));
        }

        // Shuffle the characters
        char[] password = sb.toString().toCharArray();
        for (int i = 0; i < password.length; i++) {
            int j = random.nextInt(password.length);
            char temp = password[i];
            password[i] = password[j];
            password[j] = temp;
        }

        return new String(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Random Password Generator ===");
        System.out.print("Enter desired password length: ");

        try {
            int len = scanner.nextInt();
            String password = generatePassword(len);

            System.out.println("\nGenerated Password: " + password);
            System.out.println("(Matches requirements: Lower, Upper, Digits, Special)");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
