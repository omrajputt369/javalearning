import java.util.Scanner;

public class PerimeterCalculator {

    public static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double trianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Perimeter Calculator ===");
        System.out.println("1. Circle (Circumference)");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        double perimeter = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                perimeter = circlePerimeter(radius);
                System.out.printf("\nCircumference: %.2f units\n", perimeter);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                perimeter = rectanglePerimeter(length, width);
                System.out.printf("\nPerimeter: %.2f units\n", perimeter);
                break;

            case 3:
                System.out.print("Enter side 1: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter side 2: ");
                double side2 = scanner.nextDouble();
                System.out.print("Enter side 3: ");
                double side3 = scanner.nextDouble();
                perimeter = trianglePerimeter(side1, side2, side3);
                System.out.printf("\nPerimeter: %.2f units\n", perimeter);
                break;

            case 4:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                perimeter = squarePerimeter(side);
                System.out.printf("\nPerimeter: %.2f units\n", perimeter);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
