import java.util.Scanner;

public class BinaryConverter {

    // Binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    // Binary to octal
    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return Integer.toOctalString(decimal);
    }

    // Binary to hexadecimal
    public static String binaryToHex(String binary) {
        int decimal = binaryToDecimal(binary);
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Binary Number Converter ===");
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        // Validate binary input
        if (!binary.matches("[01]+")) {
            System.out.println("Invalid binary number!");
            scanner.close();
            return;
        }

        System.out.println("\n1. Binary to Decimal");
        System.out.println("2. Binary to Octal");
        System.out.println("3. Binary to Hexadecimal");
        System.out.println("4. Convert to All");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nBinary:  " + binary);
                System.out.println("Decimal: " + binaryToDecimal(binary));
                break;

            case 2:
                System.out.println("\nBinary: " + binary);
                System.out.println("Octal:  " + binaryToOctal(binary));
                break;

            case 3:
                System.out.println("\nBinary:      " + binary);
                System.out.println("Hexadecimal: " + binaryToHex(binary));
                break;

            case 4:
                System.out.println("\n=== All Conversions ===");
                System.out.println("Binary:      " + binary);
                System.out.println("Decimal:     " + binaryToDecimal(binary));
                System.out.println("Octal:       " + binaryToOctal(binary));
                System.out.println("Hexadecimal: " + binaryToHex(binary));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
