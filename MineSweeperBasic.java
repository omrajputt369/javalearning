import java.util.Random;
import java.util.Scanner;

/**
 * A basic terminal-based Minesweeper game.
 */
public class MineSweeperBasic {
    private int rows, cols, mines;
    private char[][] board;
    private boolean[][] mineField;
    private boolean gameOver;

    public MineSweeperBasic(int rows, int cols, int mines) {
        this.rows = rows;
        this.cols = cols;
        this.mines = mines;
        this.board = new char[rows][cols];
        this.mineField = new boolean[rows][cols];
        this.gameOver = false;
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int placedMines = 0;
        while (placedMines < mines) {
            int r = random.nextInt(rows);
            int c = random.nextInt(cols);
            if (!mineField[r][c]) {
                mineField[r][c] = true;
                placedMines++;
            }
        }
    }

    public void reveal(int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != '-')
            return;

        if (mineField[r][c]) {
            board[r][c] = '*';
            gameOver = true;
            System.out.println("BOOM! You hit a mine. Game Over.");
        } else {
            int count = countAdjacentMines(r, c);
            board[r][c] = (char) (count + '0');
            if (count == 0) {
                for (int i = r - 1; i <= r + 1; i++) {
                    for (int j = c - 1; j <= c + 1; j++) {
                        reveal(i, j);
                    }
                }
            }
        }
    }

    private int countAdjacentMines(int r, int c) {
        int count = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && mineField[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void displayBoard() {
        System.out.println("\n  Current Board:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MineSweeperBasic game = new MineSweeperBasic(5, 5, 3);

        System.out.println("--- Welcome to MineSweeper Basic ---");

        while (!game.gameOver) {
            game.displayBoard();
            System.out.print("Enter row and column (0-4) to reveal: ");
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            game.reveal(r, c);

            // Check win condition (simplified)
            int revealedCount = 0;
            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 5; j++)
                    if (game.board[i][j] != '-' && game.board[i][j] != '*')
                        revealedCount++;
            if (revealedCount == (25 - 3)) {
                System.out.println("Congratulations! You cleared all non-mine cells!");
                break;
            }
        }
        game.displayBoard();
        scanner.close();
    }
}
