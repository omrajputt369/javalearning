import java.util.Scanner;

public class PatternPrinter {

    // Method to print right triangle
    public static void printRightTriangle(int n) {
        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print inverted right triangle
    public static void printInvertedTriangle(int n) {
        System.out.println("\nInverted Right Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print pyramid
    public static void printPyramid(int n) {
        System.out.println("\nPyramid:");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print diamond
    public static void printDiamond(int n) {
        System.out.println("\nDiamond:");
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print number pyramid
    public static void printNumberPyramid(int n) {
        System.out.println("\nNumber Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Method to print Floyd's triangle
    public static void printFloydsTriangle(int n) {
        System.out.println("\nFloyd's Triangle:");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Method to print Pascal's triangle
    public static void printPascalsTriangle(int n) {
        System.out.println("\nPascal's Triangle:");
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // Method to print hollow square
    public static void printHollowSquare(int n) {
        System.out.println("\nHollow Square:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Pattern Printer ===");
        System.out.println("1. Right Triangle");
        System.out.println("2. Inverted Right Triangle");
        System.out.println("3. Pyramid");
        System.out.println("4. Diamond");
        System.out.println("5. Number Pyramid");
        System.out.println("6. Floyd's Triangle");
        System.out.println("7. Pascal's Triangle");
        System.out.println("8. Hollow Square");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        System.out.print("Enter the size: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Size must be positive!");
            scanner.close();
            return;
        }

        switch (choice) {
            case 1:
                printRightTriangle(n);
                break;
            case 2:
                printInvertedTriangle(n);
                break;
            case 3:
                printPyramid(n);
                break;
            case 4:
                printDiamond(n);
                break;
            case 5:
                printNumberPyramid(n);
                break;
            case 6:
                printFloydsTriangle(n);
                break;
            case 7:
                printPascalsTriangle(n);
                break;
            case 8:
                printHollowSquare(n);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
