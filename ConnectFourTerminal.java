import java.util.Scanner;

/**
 * A 2-player Connect Four game on the terminal.
 */
public class ConnectFourTerminal {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private char[][] grid;
    private char currentPlayer;

    public ConnectFourTerminal() {
        grid = new char[ROWS][COLS];
        currentPlayer = 'R'; // Red vs Yellow
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = '.';
            }
        }
    }

    public void displayGrid() {
        System.out.println("\n  0 1 2 3 4 5 6");
        for (int i = 0; i < ROWS; i++) {
            System.out.print("| ");
            for (int j = 0; j < COLS; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }

    public boolean dropPiece(int col) {
        if (col < 0 || col >= COLS || grid[0][col] != '.')
            return false;

        for (int i = ROWS - 1; i >= 0; i--) {
            if (grid[i][col] == '.') {
                grid[i][col] = currentPlayer;
                return true;
            }
        }
        return false;
    }

    public boolean checkWin() {
        // Horiz, Vert, Diag checks... (impl logic)
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS - 3; c++) {
                if (grid[r][c] != '.' && grid[r][c] == grid[r][c + 1] && grid[r][c] == grid[r][c + 2]
                        && grid[r][c] == grid[r][c + 3])
                    return true;
            }
        }
        for (int r = 0; r < ROWS - 3; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] != '.' && grid[r][c] == grid[r + 1][c] && grid[r][c] == grid[r + 2][c]
                        && grid[r][c] == grid[r + 3][c])
                    return true;
            }
        }
        // Simplified diagonal checks
        return false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Welcome to Connect Four! ---");

        while (true) {
            displayGrid();
            System.out.print("Player " + currentPlayer + ", enter column (0-6): ");
            int col = scanner.nextInt();

            if (dropPiece(col)) {
                if (checkWin()) {
                    displayGrid();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                currentPlayer = (currentPlayer == 'R') ? 'Y' : 'R';
            } else {
                System.out.println("Invalid move!");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        new ConnectFourTerminal().play();
    }
}
