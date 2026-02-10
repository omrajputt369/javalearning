import java.util.Scanner;

public class DistanceCalculator {

    public static double distance2D(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double distance3D(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    public static double manhattanDistance(double x1, double y1, double x2, double y2) {
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Distance Calculator ===");
        System.out.println("1. 2D Euclidean Distance");
        System.out.println("2. 3D Euclidean Distance");
        System.out.println("3. Manhattan Distance (2D)");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        double distance = 0;

        switch (choice) {
            case 1:
                System.out.println("\nEnter coordinates of first point (x1, y1):");
                System.out.print("x1: ");
                double x1 = scanner.nextDouble();
                System.out.print("y1: ");
                double y1 = scanner.nextDouble();

                System.out.println("\nEnter coordinates of second point (x2, y2):");
                System.out.print("x2: ");
                double x2 = scanner.nextDouble();
                System.out.print("y2: ");
                double y2 = scanner.nextDouble();

                distance = distance2D(x1, y1, x2, y2);
                System.out.printf("\nEuclidean Distance: %.2f units\n", distance);
                break;

            case 2:
                System.out.println("\nEnter coordinates of first point (x1, y1, z1):");
                System.out.print("x1: ");
                x1 = scanner.nextDouble();
                System.out.print("y1: ");
                y1 = scanner.nextDouble();
                System.out.print("z1: ");
                double z1 = scanner.nextDouble();

                System.out.println("\nEnter coordinates of second point (x2, y2, z2):");
                System.out.print("x2: ");
                x2 = scanner.nextDouble();
                System.out.print("y2: ");
                y2 = scanner.nextDouble();
                System.out.print("z2: ");
                double z2 = scanner.nextDouble();

                distance = distance3D(x1, y1, z1, x2, y2, z2);
                System.out.printf("\n3D Euclidean Distance: %.2f units\n", distance);
                break;

            case 3:
                System.out.println("\nEnter coordinates of first point (x1, y1):");
                System.out.print("x1: ");
                x1 = scanner.nextDouble();
                System.out.print("y1: ");
                y1 = scanner.nextDouble();

                System.out.println("\nEnter coordinates of second point (x2, y2):");
                System.out.print("x2: ");
                x2 = scanner.nextDouble();
                System.out.print("y2: ");
                y2 = scanner.nextDouble();

                distance = manhattanDistance(x1, y1, x2, y2);
                System.out.printf("\nManhattan Distance: %.2f units\n", distance);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
