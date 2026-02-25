import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * A simple 4x4 Memory Match game.
 */
public class MemoryMatchGame {
    private String[][] board;
    private String[][] hiddenBoard;
    private boolean[][] matched;
    private int pairsFound;

    public MemoryMatchGame() {
        board = new String[4][4];
        hiddenBoard = new String[4][4];
        matched = new boolean[4][4];
        pairsFound = 0;
        initializeBoards();
    }

    private void initializeBoards() {
        List<String> symbols = new ArrayList<>();
        String[] possibleSymbols = { "A", "B", "C", "D", "E", "F", "G", "H" };
        for (String s : possibleSymbols) {
            symbols.add(s);
            symbols.add(s);
        }
        Collections.shuffle(symbols);

        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = symbols.get(k++);
                hiddenBoard[i][j] = "*";
                matched[i][j] = false;
            }
        }
    }

    public void displayBoard() {
        System.out.println("\n  Board:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matched[i][j])
                    System.out.print(board[i][j] + " ");
                else
                    System.out.print(hiddenBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Welcome to Memory Match! ---");

        while (pairsFound < 8) {
            displayBoard();
            System.out.print("Select first card (row col 0-3): ");
            int r1 = scanner.nextInt();
            int c1 = scanner.nextInt();

            if (matched[r1][c1]) {
                System.out.println("Already matched!");
                continue;
            }

            System.out.println("Card: " + board[r1][c1]);

            System.out.print("Select second card (row col 0-3): ");
            int r2 = scanner.nextInt();
            int c2 = scanner.nextInt();

            if ((r1 == r2 && c1 == c2) || matched[r2][c2]) {
                System.out.println("Invalid selection!");
                continue;
            }

            System.out.println("Card: " + board[r2][c2]);

            if (board[r1][c1].equals(board[r2][c2])) {
                System.out.println("It's a match!");
                matched[r1][c1] = true;
                matched[r2][c2] = true;
                pairsFound++;
            } else {
                System.out.println("Not a match.");
            }
        }

        System.out.println("Congratulations! You found all pairs.");
        scanner.close();
    }

    public static void main(String[] args) {
        new MemoryMatchGame().play();
    }
}
