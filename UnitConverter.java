import java.util.Scanner;

public class UnitConverter {

    // Length conversions (to meters)
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double kilometersToMeters(double km) {
        return km * 1000;
    }

    public static double metersToMiles(double meters) {
        return meters / 1609.34;
    }

    public static double milesToMeters(double miles) {
        return miles * 1609.34;
    }

    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    // Weight conversions (to kilograms)
    public static double kilogramsToGrams(double kg) {
        return kg * 1000;
    }

    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double poundsToKilograms(double lbs) {
        return lbs / 2.20462;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Unit Converter ===");
        System.out.println("1. Length Conversions");
        System.out.println("2. Weight Conversions");
        System.out.print("Enter category: ");

        int category = scanner.nextInt();

        if (category == 1) {
            System.out.println("\n1. Meters to Kilometers");
            System.out.println("2. Kilometers to Meters");
            System.out.println("3. Meters to Miles");
            System.out.println("4. Miles to Meters");
            System.out.println("5. Meters to Centimeters");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = metersToKilometers(value);
                    System.out.printf("\n%.2f meters = %.2f kilometers\n", value, result);
                    break;
                case 2:
                    result = kilometersToMeters(value);
                    System.out.printf("\n%.2f kilometers = %.2f meters\n", value, result);
                    break;
                case 3:
                    result = metersToMiles(value);
                    System.out.printf("\n%.2f meters = %.2f miles\n", value, result);
                    break;
                case 4:
                    result = milesToMeters(value);
                    System.out.printf("\n%.2f miles = %.2f meters\n", value, result);
                    break;
                case 5:
                    result = metersToCentimeters(value);
                    System.out.printf("\n%.2f meters = %.2f centimeters\n", value, result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } else if (category == 2) {
            System.out.println("\n1. Kilograms to Grams");
            System.out.println("2. Grams to Kilograms");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Pounds to Kilograms");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = kilogramsToGrams(value);
                    System.out.printf("\n%.2f kg = %.2f grams\n", value, result);
                    break;
                case 2:
                    result = gramsToKilograms(value);
                    System.out.printf("\n%.2f grams = %.2f kg\n", value, result);
                    break;
                case 3:
                    result = kilogramsToPounds(value);
                    System.out.printf("\n%.2f kg = %.2f pounds\n", value, result);
                    break;
                case 4:
                    result = poundsToKilograms(value);
                    System.out.printf("\n%.2f pounds = %.2f kg\n", value, result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Invalid category!");
        }

        scanner.close();
    }
}
