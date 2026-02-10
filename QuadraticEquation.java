import java.util.Scanner;

public class QuadraticEquation {

    // Method to solve quadratic equation ax² + bx + c = 0
    public static void solveQuadratic(double a, double b, double c) {
        // Check if it's a valid quadratic equation
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0)");

            if (b == 0) {
                if (c == 0) {
                    System.out.println("All real numbers are solutions");
                } else {
                    System.out.println("No solution exists");
                }
            } else {
                double x = -c / b;
                System.out.printf("This is a linear equation. Solution: x = %.2f\n", x);
            }
            return;
        }

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        System.out.println("\nEquation: " + a + "x² + " + b + "x + " + c + " = 0");
        System.out.printf("Discriminant (Δ) = b² - 4ac = %.2f\n", discriminant);

        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("\nThe equation has TWO DISTINCT REAL ROOTS:");
            System.out.printf("Root 1 (x₁) = %.4f\n", root1);
            System.out.printf("Root 2 (x₂) = %.4f\n", root2);

        } else if (discriminant == 0) {
            // One repeated real root
            double root = -b / (2 * a);

            System.out.println("\nThe equation has ONE REPEATED REAL ROOT:");
            System.out.printf("Root (x) = %.4f\n", root);

        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("\nThe equation has TWO COMPLEX ROOTS:");
            System.out.printf("Root 1 (x₁) = %.4f + %.4fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2 (x₂) = %.4f - %.4fi\n", realPart, imaginaryPart);
        }

        // Display additional information
        displayAdditionalInfo(a, b, c, discriminant);
    }

    // Method to display additional information
    public static void displayAdditionalInfo(double a, double b, double c, double discriminant) {
        System.out.println("\n=== Additional Information ===");

        // Sum and product of roots
        double sumOfRoots = -b / a;
        double productOfRoots = c / a;

        System.out.printf("Sum of roots (α + β) = -b/a = %.4f\n", sumOfRoots);
        System.out.printf("Product of roots (α × β) = c/a = %.4f\n", productOfRoots);

        // Vertex of parabola
        double h = -b / (2 * a);
        double k = c - (b * b) / (4 * a);

        System.out.printf("Vertex of parabola: (%.4f, %.4f)\n", h, k);
        System.out.println("Axis of symmetry: x = " + String.format("%.4f", h));

        // Nature of parabola
        if (a > 0) {
            System.out.println("Parabola opens UPWARD (minimum value exists)");
        } else {
            System.out.println("Parabola opens DOWNWARD (maximum value exists)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Quadratic Equation Solver ===");
        System.out.println("Solves equations of the form: ax² + bx + c = 0\n");

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        solveQuadratic(a, b, c);

        scanner.close();
    }
}
