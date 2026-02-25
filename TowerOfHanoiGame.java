import java.util.Scanner;
import java.util.Stack;

/**
 * An interactive Tower of Hanoi game.
 */
public class TowerOfHanoiGame {
    private Stack<Integer>[] towers;
    private int numDisks;

    @SuppressWarnings("unchecked")
    public TowerOfHanoiGame(int disks) {
        this.numDisks = disks;
        towers = new Stack[3];
        for (int i = 0; i < 3; i++)
            towers[i] = new Stack<>();
        for (int i = disks; i > 0; i--)
            towers[0].push(i);
    }

    public void display() {
        System.out.println("\nTowers State:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Tower " + (i + 1) + ": " + towers[i]);
        }
    }

    public boolean move(int from, int to) {
        if (from < 0 || from > 2 || to < 0 || to > 2 || towers[from].isEmpty())
            return false;

        int disk = towers[from].peek();
        if (!towers[to].isEmpty() && towers[to].peek() < disk)
            return false;

        towers[to].push(towers[from].pop());
        return true;
    }

    public boolean isSolved() {
        return towers[2].size() == numDisks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();
        TowerOfHanoiGame game = new TowerOfHanoiGame(n);

        System.out.println("--- Welcome to Tower of Hanoi! ---");
        System.out.println("Objective: Move all disks to Tower 3.");
        System.out.println("Rules: Only a smaller disk can be placed on a larger one.");

        while (!game.isSolved()) {
            game.display();
            System.out.print("Move from tower (1-3) to tower (1-3): ");
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;

            if (game.move(from, to)) {
                System.out.println("Successful move!");
            } else {
                System.out.println("Invalid move!");
            }
        }

        game.display();
        System.out.println("Congratulations! You solved the puzzle.");
        scanner.close();
    }
}
