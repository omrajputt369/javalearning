import java.util.Scanner;

public class IPValidator {

    public static boolean isValidIPv4(String ip) {
        if (ip == null || ip.isEmpty())
            return false;

        String[] parts = ip.split("\\.");
        if (parts.length != 4)
            return false;

        try {
            for (String part : parts) {
                // Check if part is empty or contains non-digits
                if (part.isEmpty() || !part.matches("\\d+"))
                    return false;

                // Check for leading zero if length > 1
                if (part.length() > 1 && part.startsWith("0"))
                    return false;

                int value = Integer.parseInt(part);
                if (value < 0 || value > 255)
                    return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== IPv4 Address Validator ===");
        System.out.print("Enter an IP address: ");
        String ip = scanner.nextLine();

        if (isValidIPv4(ip)) {
            System.out.println("\n" + ip + " is a VALID IPv4 address!");
        } else {
            System.out.println("\n" + ip + " is NOT a valid IPv4 address.");
        }

        scanner.close();
    }
}
