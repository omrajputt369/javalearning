import java.util.Scanner;

public class RomanNumerals {

    public static String decimalToRoman(int num) {
        if (num <= 0 || num > 3999) {
            return "Number out of range (1-3999)";
        }

        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static int romanToDecimal(String roman) {
        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = getValue(roman.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Roman Numerals Converter ===");
        System.out.println("1. Decimal to Roman");
        System.out.println("2. Roman to Decimal");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (choice == 1) {
            System.out.print("Enter decimal number (1-3999): ");
            int decimal = scanner.nextInt();
            String roman = decimalToRoman(decimal);
            System.out.println("\nDecimal: " + decimal);
            System.out.println("Roman:   " + roman);

        } else if (choice == 2) {
            System.out.print("Enter Roman numeral: ");
            String roman = scanner.nextLine().toUpperCase();
            int decimal = romanToDecimal(roman);
            System.out.println("\nRoman:   " + roman);
            System.out.println("Decimal: " + decimal);

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
