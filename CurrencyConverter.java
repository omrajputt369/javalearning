import java.util.Scanner;

public class CurrencyConverter {

    // Exchange rates (as of example - user should update)
    private static final double USD_TO_EUR = 0.92;
    private static final double USD_TO_GBP = 0.79;
    private static final double USD_TO_INR = 83.12;
    private static final double USD_TO_JPY = 149.50;

    public static double convertToUSD(double amount, String from) {
        switch (from.toUpperCase()) {
            case "EUR":
                return amount / USD_TO_EUR;
            case "GBP":
                return amount / USD_TO_GBP;
            case "INR":
                return amount / USD_TO_INR;
            case "JPY":
                return amount / USD_TO_JPY;
            default:
                return amount;
        }
    }

    public static double convertFromUSD(double amount, String to) {
        switch (to.toUpperCase()) {
            case "EUR":
                return amount * USD_TO_EUR;
            case "GBP":
                return amount * USD_TO_GBP;
            case "INR":
                return amount * USD_TO_INR;
            case "JPY":
                return amount * USD_TO_JPY;
            default:
                return amount;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("Supported: USD, EUR, GBP, INR, JPY");

        System.out.print("\nEnter source currency: ");
        String from = scanner.next();
        System.out.print("Enter target currency: ");
        String to = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double inUSD = convertToUSD(amount, from);
        double result = convertFromUSD(inUSD, to);

        System.out.printf("\n%.2f %s = %.2f %s\n", amount, from.toUpperCase(), result, to.toUpperCase());

        scanner.close();
    }
}
