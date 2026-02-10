import java.util.Scanner;

public class TemperatureConverter {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    // Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    // Display all conversions
    public static void displayAllConversions(double value, String unit) {
        double celsius, fahrenheit, kelvin;

        System.out.println("\n=== All Temperature Conversions ===");

        switch (unit.toUpperCase()) {
            case "C":
                celsius = value;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "F":
                fahrenheit = value;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = fahrenheitToKelvin(fahrenheit);
                break;
            case "K":
                kelvin = value;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = kelvinToFahrenheit(kelvin);
                break;
            default:
                System.out.println("Invalid unit!");
                return;
        }

        System.out.printf("Celsius:    %.2f °C\n", celsius);
        System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin:     %.2f K\n", kelvin);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.println("7. Show all conversions");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        double temp, result;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temp = scanner.nextDouble();
                result = celsiusToFahrenheit(temp);
                System.out.printf("%.2f °C = %.2f °F\n", temp, result);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = scanner.nextDouble();
                result = fahrenheitToCelsius(temp);
                System.out.printf("%.2f °F = %.2f °C\n", temp, result);
                break;

            case 3:
                System.out.print("Enter temperature in Celsius: ");
                temp = scanner.nextDouble();
                result = celsiusToKelvin(temp);
                System.out.printf("%.2f °C = %.2f K\n", temp, result);
                break;

            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                temp = scanner.nextDouble();
                result = kelvinToCelsius(temp);
                System.out.printf("%.2f K = %.2f °C\n", temp, result);
                break;

            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = scanner.nextDouble();
                result = fahrenheitToKelvin(temp);
                System.out.printf("%.2f °F = %.2f K\n", temp, result);
                break;

            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                temp = scanner.nextDouble();
                result = kelvinToFahrenheit(temp);
                System.out.printf("%.2f K = %.2f °F\n", temp, result);
                break;

            case 7:
                System.out.print("Enter temperature value: ");
                temp = scanner.nextDouble();
                System.out.print("Enter unit (C/F/K): ");
                String unit = scanner.next();
                displayAllConversions(temp, unit);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
