import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * A Java program demonstrating Currency Formatting for different locales.
 */

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        double payment = scanner.nextDouble();
        scanner.close();

        // Create locale-specific currency formatters
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
