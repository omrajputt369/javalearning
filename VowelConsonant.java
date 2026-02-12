import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Vowel & Consonant Counter ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0, spaces = 0, digits = 0, others = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("\nAnalysis Result:");
        System.out.println("----------------");
        System.out.println("Vowels:     " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits:     " + digits);
        System.out.println("Spaces:     " + spaces);
        System.out.println("Others:     " + others);

        scanner.close();
    }
}
