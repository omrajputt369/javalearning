import java.util.Scanner;

public class StringManipulator {

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to count vowels and consonants
    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Method to check if string is palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return str.equals(reverseString(str));
    }

    // Method to count word frequency
    public static void countWords(String str) {
        String[] words = str.trim().split("\\s+");
        System.out.println("Total words: " + words.length);

        // Count character frequency
        System.out.println("Total characters (including spaces): " + str.length());
        System.out.println("Total characters (excluding spaces): " +
                str.replaceAll("\\s+", "").length());
    }

    // Method to convert case
    public static void convertCase(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Toggle case
        StringBuilder toggled = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        System.out.println("Toggle case: " + toggled.toString());
    }

    // Method to remove duplicates
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // Method to check anagram
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== String Manipulator ===");
        System.out.println("1. Reverse a string");
        System.out.println("2. Count vowels and consonants");
        System.out.println("3. Check if palindrome");
        System.out.println("4. Count words and characters");
        System.out.println("5. Convert case");
        System.out.println("6. Remove duplicate characters");
        System.out.println("7. Check if two strings are anagrams");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                String str1 = scanner.nextLine();
                System.out.println("Reversed: " + reverseString(str1));
                break;

            case 2:
                System.out.print("Enter a string: ");
                String str2 = scanner.nextLine();
                countVowelsConsonants(str2);
                break;

            case 3:
                System.out.print("Enter a string: ");
                String str3 = scanner.nextLine();
                if (isPalindrome(str3)) {
                    System.out.println("\"" + str3 + "\" is a palindrome!");
                } else {
                    System.out.println("\"" + str3 + "\" is not a palindrome.");
                }
                break;

            case 4:
                System.out.print("Enter a string: ");
                String str4 = scanner.nextLine();
                countWords(str4);
                break;

            case 5:
                System.out.print("Enter a string: ");
                String str5 = scanner.nextLine();
                convertCase(str5);
                break;

            case 6:
                System.out.print("Enter a string: ");
                String str6 = scanner.nextLine();
                System.out.println("Without duplicates: " + removeDuplicates(str6));
                break;

            case 7:
                System.out.print("Enter first string: ");
                String strA = scanner.nextLine();
                System.out.print("Enter second string: ");
                String strB = scanner.nextLine();

                if (isAnagram(strA, strB)) {
                    System.out.println("\"" + strA + "\" and \"" + strB + "\" are anagrams!");
                } else {
                    System.out.println("\"" + strA + "\" and \"" + strB + "\" are not anagrams.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
