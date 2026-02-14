import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = shift % 26; // Ensure shift is within 0-25

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) (base + (ch - base + shift + 26) % 26);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Caesar Cipher Tool ===");
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.print("Enter shift value (e.g. 3): ");
        int shift = scanner.nextInt();

        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("\n--- Results ---");
        System.out.println("Original:  " + text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);

        scanner.close();
    }
}
