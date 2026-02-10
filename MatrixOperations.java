import java.util.Scanner;

public class MatrixOperations {

    // Method to input a matrix
    public static int[][] inputMatrix(Scanner scanner, int rows, int cols, String name) {
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements for " + name + " (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix, String name) {
        System.out.println("\n" + name + ":");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    // Method to check if matrix is symmetric
    public static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Matrix Operations ===");
        System.out.println("1. Add two matrices");
        System.out.println("2. Subtract two matrices");
        System.out.println("3. Multiply two matrices");
        System.out.println("4. Transpose a matrix");
        System.out.println("5. Check if matrix is symmetric");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            case 2:
                System.out.print("Enter number of rows: ");
                int rows = scanner.nextInt();
                System.out.print("Enter number of columns: ");
                int cols = scanner.nextInt();

                int[][] matrix1 = inputMatrix(scanner, rows, cols, "Matrix 1");
                int[][] matrix2 = inputMatrix(scanner, rows, cols, "Matrix 2");

                displayMatrix(matrix1, "Matrix 1");
                displayMatrix(matrix2, "Matrix 2");

                if (choice == 1) {
                    int[][] sum = addMatrices(matrix1, matrix2);
                    displayMatrix(sum, "Sum (Matrix 1 + Matrix 2)");
                } else {
                    int[][] diff = subtractMatrices(matrix1, matrix2);
                    displayMatrix(diff, "Difference (Matrix 1 - Matrix 2)");
                }
                break;

            case 3:
                System.out.print("Enter rows for Matrix 1: ");
                int rows1 = scanner.nextInt();
                System.out.print("Enter columns for Matrix 1: ");
                int cols1 = scanner.nextInt();

                System.out.print("Enter rows for Matrix 2 (must be " + cols1 + "): ");
                int rows2 = scanner.nextInt();
                System.out.print("Enter columns for Matrix 2: ");
                int cols2 = scanner.nextInt();

                if (cols1 != rows2) {
                    System.out.println("Error: Matrix 1 columns must equal Matrix 2 rows for multiplication!");
                    break;
                }

                int[][] matA = inputMatrix(scanner, rows1, cols1, "Matrix 1");
                int[][] matB = inputMatrix(scanner, rows2, cols2, "Matrix 2");

                displayMatrix(matA, "Matrix 1");
                displayMatrix(matB, "Matrix 2");

                int[][] product = multiplyMatrices(matA, matB);
                displayMatrix(product, "Product (Matrix 1 × Matrix 2)");
                break;

            case 4:
                System.out.print("Enter number of rows: ");
                int r = scanner.nextInt();
                System.out.print("Enter number of columns: ");
                int c = scanner.nextInt();

                int[][] mat = inputMatrix(scanner, r, c, "Matrix");
                displayMatrix(mat, "Original Matrix");

                int[][] transposed = transposeMatrix(mat);
                displayMatrix(transposed, "Transposed Matrix");
                break;

            case 5:
                System.out.print("Enter matrix size (n for n×n): ");
                int n = scanner.nextInt();

                int[][] sqMatrix = inputMatrix(scanner, n, n, "Matrix");
                displayMatrix(sqMatrix, "Matrix");

                if (isSymmetric(sqMatrix)) {
                    System.out.println("\nThe matrix is SYMMETRIC!");
                } else {
                    System.out.println("\nThe matrix is NOT symmetric.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
