import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * A Java program that uses Regular Expressions to validate Email, Phone Number,
 * and Passwords.
 */
public class RegexValidator {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String PHONE_REGEX = "^[0-9]{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email to validate: ");
        String email = scanner.nextLine();
        System.out.println("Email valid: " + validate(email, EMAIL_REGEX));

        System.out.print("Enter 10-digit phone number to validate: ");
        String phone = scanner.nextLine();
        System.out.println("Phone number valid: " + validate(phone, PHONE_REGEX));

        System.out
                .println("Enter password to validate (min 8 chars, 1 digit, 1 upper, 1 lower, 1 special, no spaces): ");
        String password = scanner.nextLine();
        System.out.println("Password valid: " + validate(password, PASSWORD_REGEX));

        scanner.close();
    }

    private static boolean validate(String input, String regex) {
        return Pattern.compile(regex).matcher(input).matches();
    }
}
