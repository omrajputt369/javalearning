import java.util.Scanner;

public class MagicSquare {

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        if (n == 0)
            return false;

        // Calculate sum of first row
        int magicSum = 0;
        for (int j = 0; j < n; j++)
            magicSum += matrix[0][j];

        // Check rows
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++)
                rowSum += matrix[i][j];
            if (rowSum != magicSum)
                return false;
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++)
                colSum += matrix[i][j];
            if (colSum != magicSum)
                return false;
        }

        // Check main diagonal
        int diag1Sum = 0;
        for (int i = 0; i < n; i++)
            diag1Sum += matrix[i][i];
        if (diag1Sum != magicSum)
            return false;

        // Check anti-diagonal
        int diag2Sum = 0;
        for (int i = 0; i < n; i++)
            diag2Sum += matrix[i][n - 1 - i];
        if (diag2Sum != magicSum)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Magic Square Checker ===");
        System.out.print("Enter size of square matrix (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int[] row : matrix) {
            for (int x : row)
                System.out.print(x + "\t");
            System.out.println();
        }

        if (isMagicSquare(matrix)) {
            System.out.println("\nThis is a MAGIC SQUARE!");
        } else {
            System.out.println("\nThis is NOT a magic square.");
        }

        scanner.close();
    }
}
