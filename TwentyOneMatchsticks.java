import java.util.Scanner;

/**
 * A strategic matchstick game (Nim variant).
 * The goal is not to be the one to pick up the last matchstick.
 */
public class TwentyOneMatchsticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matchsticks = 21;

        System.out.println("--- Welcome to 21 Matchsticks! ---");
        System.out.println("Rules: You can pick 1, 2, 3, or 4 matchsticks.");
        System.out.println("The player who picks the last matchstick loses.");

        while (matchsticks > 1) {
            System.out.println("\nRemaining matchsticks: " + matchsticks);
            System.out.print("Your turn! How many do you pick (1-4)? ");
            int userPick = scanner.nextInt();

            if (userPick < 1 || userPick > 4) {
                System.out.println("Invalid pick. Choose between 1 and 4.");
                continue;
            }

            matchsticks -= userPick;
            if (matchsticks <= 1) {
                System.out.println("Remaining matchsticks: " + matchsticks);
                System.out.println("Only 1 matchstick left. Computer is forced to pick it.");
                System.out.println("Congratulations! You win!");
                break;
            }

            // Computer's strategy (Nim sum adaptation for 21 sticks)
            // Goal: Leave (4*n + 1) sticks for the hardware
            int computerPick = 5 - userPick;
            System.out.println("Computer picks: " + computerPick);
            matchsticks -= computerPick;

            if (matchsticks == 1) {
                System.out.println("\nRemaining matchsticks: 1");
                System.out.println("You are forced to pick the last matchstick.");
                System.out.println("Game Over! Computer wins!");
                break;
            }
        }
        scanner.close();
    }
}
