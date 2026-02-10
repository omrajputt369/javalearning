import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BMI Calculator ===");
        System.out.println("1. Metric (kg, meters)");
        System.out.println("2. Imperial (lbs, inches)");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        double weight, height, bmi;

        if (choice == 1) {
            System.out.print("Enter weight (kg): ");
            weight = scanner.nextDouble();
            System.out.print("Enter height (meters): ");
            height = scanner.nextDouble();
            bmi = calculateBMI(weight, height);
        } else if (choice == 2) {
            System.out.print("Enter weight (lbs): ");
            weight = scanner.nextDouble();
            System.out.print("Enter height (inches): ");
            height = scanner.nextDouble();
            // Convert to metric
            weight = weight * 0.453592;
            height = height * 0.0254;
            bmi = calculateBMI(weight, height);
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        String category = getBMICategory(bmi);

        System.out.println("\n=== Results ===");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);

        System.out.println("\nBMI Categories:");
        System.out.println("  < 18.5:        Underweight");
        System.out.println("  18.5 - 24.9:   Normal weight");
        System.out.println("  25.0 - 29.9:   Overweight");
        System.out.println("  >= 30.0:       Obese");

        scanner.close();
    }
}
