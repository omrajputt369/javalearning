import java.util.Scanner;

public class TimeConverter {

    public static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }

    public static double secondsToHours(double seconds) {
        return seconds / 3600;
    }

    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }

    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    public static double hoursToSeconds(double hours) {
        return hours * 3600;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Time Converter ===");
        System.out.println("1. Seconds to Minutes");
        System.out.println("2. Seconds to Hours");
        System.out.println("3. Minutes to Seconds");
        System.out.println("4. Minutes to Hours");
        System.out.println("5. Hours to Minutes");
        System.out.println("6. Hours to Seconds");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = secondsToMinutes(value);
                System.out.printf("\n%.2f seconds = %.2f minutes\n", value, result);
                break;
            case 2:
                result = secondsToHours(value);
                System.out.printf("\n%.2f seconds = %.2f hours\n", value, result);
                break;
            case 3:
                result = minutesToSeconds(value);
                System.out.printf("\n%.2f minutes = %.2f seconds\n", value, result);
                break;
            case 4:
                result = minutesToHours(value);
                System.out.printf("\n%.2f minutes = %.2f hours\n", value, result);
                break;
            case 5:
                result = hoursToMinutes(value);
                System.out.printf("\n%.2f hours = %.2f minutes\n", value, result);
                break;
            case 6:
                result = hoursToSeconds(value);
                System.out.printf("\n%.2f hours = %.2f seconds\n", value, result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
