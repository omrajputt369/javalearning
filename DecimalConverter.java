import java.util.Scanner;

public class DecimalConverter {

    // Decimal to binary
    public static String decimalToBinary(int decimal) {
        if (decimal == 0)
            return "0";

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    // Decimal to octal
    public static String decimalToOctal(int decimal) {
        if (decimal == 0)
            return "0";

        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        return octal.toString();
    }

    // Decimal to hexadecimal
    public static String decimalToHex(int decimal) {
        if (decimal == 0)
            return "0";

        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        StringBuilder hex = new StringBuilder();

        while (decimal > 0) {
            hex.insert(0, hexDigits[decimal % 16]);
            decimal /= 16;
        }
        return hex.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Decimal Number Converter ===");
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        System.out.println("\n1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexadecimal");
        System.out.println("4. Convert to All");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nDecimal: " + decimal);
                System.out.println("Binary:  " + decimalToBinary(decimal));
                break;

            case 2:
                System.out.println("\nDecimal: " + decimal);
                System.out.println("Octal:   " + decimalToOctal(decimal));
                break;

            case 3:
                System.out.println("\nDecimal: " + decimal);
                System.out.println("Hexadecimal: " + decimalToHex(decimal));
                break;

            case 4:
                System.out.println("\n=== All Conversions ===");
                System.out.println("Decimal:     " + decimal);
                System.out.println("Binary:      " + decimalToBinary(decimal));
                System.out.println("Octal:       " + decimalToOctal(decimal));
                System.out.println("Hexadecimal: " + decimalToHex(decimal));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
