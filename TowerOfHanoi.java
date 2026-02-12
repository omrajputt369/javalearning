import java.util.Scanner;

public class TowerOfHanoi {

    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        solveHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Tower of Hanoi Solver ===");
        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number of disks must be positive!");
        } else {
            System.out.println("\nSteps to solve for " + n + " disks:");
            solveHanoi(n, 'A', 'C', 'B'); // A: Source, B: Auxiliary, C: Destination

            int totalMoves = (int) Math.pow(2, n) - 1;
            System.out.println("\nTotal moves required: " + totalMoves);
        }

        scanner.close();
    }
}
