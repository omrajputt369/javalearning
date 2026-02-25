import java.util.Random;
import java.util.Scanner;

/**
 * A simplified 5x5 Battleship game.
 */
public class BattleshipLite {
    private char[][] grid;
    private int shipX, shipY;
    private boolean shipSunk;

    public BattleshipLite() {
        grid = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = '~';
            }
        }
        Random random = new Random();
        shipX = random.nextInt(5);
        shipY = random.nextInt(5);
        shipSunk = false;
    }

    public void displayGrid() {
        System.out.println("\n  0 1 2 3 4");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Welcome to Battleship Lite! ---");
        System.out.println("Find and sink the hidden 1x1 ship on a 5x5 grid.");

        int attempts = 0;
        while (!shipSunk) {
            displayGrid();
            System.out.print("Enter coordinates (row col): ");
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            attempts++;

            if (r < 0 || r >= 5 || c < 0 || c >= 5) {
                System.out.println("Out of bounds!");
                continue;
            }

            if (r == shipX && c == shipY) {
                grid[r][c] = 'X';
                shipSunk = true;
                System.out.println("HIT! You sank the battleship!");
            } else {
                grid[r][c] = 'M';
                System.out.println("MISS!");
            }
        }

        displayGrid();
        System.out.println("Congratulations! You won in " + attempts + " attempts.");
        scanner.close();
    }

    public static void main(String[] args) {
        new BattleshipLite().play();
    }
}
