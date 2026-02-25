import java.util.Random;
import java.util.Scanner;

/**
 * Simulates rolling of two dice and tracks frequency of results.
 */
public class DiceRollingSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] frequencies = new int[13]; // Indices 2 to 12

        System.out.println("--- Dice Rolling Simulator ---");
        System.out.print("How many times do you want to roll the dice? ");
        int rolls = scanner.nextInt();

        for (int i = 0; i < rolls; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            frequencies[sum]++;
        }

        System.out.println("\nResults Summary (Sum of 2 Dice):");
        System.out.println("Sum | Frequency | Percentage");
        System.out.println("---------------------------");
        for (int i = 2; i <= 12; i++) {
            double percentage = (double) frequencies[i] / rolls * 100;
            System.out.printf("%3d | %9d | %9.2f%%\n", i, frequencies[i], percentage);
        }

        scanner.close();
    }
}
