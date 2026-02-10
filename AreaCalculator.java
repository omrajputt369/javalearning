import java.util.Scanner;

public class AreaCalculator {

    // Circle area
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle area
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Triangle area
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Square area
    public static double squareArea(double side) {
        return side * side;
    }

    // Trapezoid area
    public static double trapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }

    // Parallelogram area
    public static double parallelogramArea(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.println("5. Trapezoid");
        System.out.println("6. Parallelogram");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        double area = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                area = circleArea(radius);
                System.out.printf("\nArea of circle: %.2f square units\n", area);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                area = rectangleArea(length, width);
                System.out.printf("\nArea of rectangle: %.2f square units\n", area);
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                area = triangleArea(base, height);
                System.out.printf("\nArea of triangle: %.2f square units\n", area);
                break;

            case 4:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                area = squareArea(side);
                System.out.printf("\nArea of square: %.2f square units\n", area);
                break;

            case 5:
                System.out.print("Enter first base: ");
                double base1 = scanner.nextDouble();
                System.out.print("Enter second base: ");
                double base2 = scanner.nextDouble();
                System.out.print("Enter height: ");
                height = scanner.nextDouble();
                area = trapezoidArea(base1, base2, height);
                System.out.printf("\nArea of trapezoid: %.2f square units\n", area);
                break;

            case 6:
                System.out.print("Enter base: ");
                base = scanner.nextDouble();
                System.out.print("Enter height: ");
                height = scanner.nextDouble();
                area = parallelogramArea(base, height);
                System.out.printf("\nArea of parallelogram: %.2f square units\n", area);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
