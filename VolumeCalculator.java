import java.util.Scanner;

public class VolumeCalculator {

    public static double cubeVolume(double side) {
        return Math.pow(side, 3);
    }

    public static double cuboidVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double coneVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Volume Calculator ===");
        System.out.println("1. Cube");
        System.out.println("2. Cuboid");
        System.out.println("3. Sphere");
        System.out.println("4. Cylinder");
        System.out.println("5. Cone");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        double volume = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                volume = cubeVolume(side);
                System.out.printf("\nVolume of cube: %.2f cubic units\n", volume);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                volume = cuboidVolume(length, width, height);
                System.out.printf("\nVolume of cuboid: %.2f cubic units\n", volume);
                break;

            case 3:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                volume = sphereVolume(radius);
                System.out.printf("\nVolume of sphere: %.2f cubic units\n", volume);
                break;

            case 4:
                System.out.print("Enter radius: ");
                radius = scanner.nextDouble();
                System.out.print("Enter height: ");
                height = scanner.nextDouble();
                volume = cylinderVolume(radius, height);
                System.out.printf("\nVolume of cylinder: %.2f cubic units\n", volume);
                break;

            case 5:
                System.out.print("Enter radius: ");
                radius = scanner.nextDouble();
                System.out.print("Enter height: ");
                height = scanner.nextDouble();
                volume = coneVolume(radius, height);
                System.out.printf("\nVolume of cone: %.2f cubic units\n", volume);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
