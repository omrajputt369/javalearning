/**
 * Validates a 9x9 Sudoku grid for correctness.
 */
public class SudokuValidator {
    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };

        if (isValidSudoku(board)) {
            System.out.println("The Sudoku grid is valid.");
        } else {
            System.out.println("The Sudoku grid is NOT valid.");
        }
    }

    public static boolean isValidSudoku(int[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValidUnit(board[i]))
                return false;
        }

        // Check columns
        for (int i = 0; i < 9; i++) {
            int[] column = new int[9];
            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            if (!isValidUnit(column))
                return false;
        }

        // Check 3x3 squares
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] square = new int[9];
                int k = 0;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        square[k++] = board[row][col];
                    }
                }
                if (!isValidUnit(square))
                    return false;
            }
        }

        return true;
    }

    private static boolean isValidUnit(int[] unit) {
        boolean[] seen = new boolean[10];
        for (int num : unit) {
            if (num < 1 || num > 9 || seen[num])
                return false;
            seen[num] = true;
        }
        return true;
    }
}
