import java.util.Random;
import java.util.Scanner;

/**
 * A simple Rock, Paper, Scissors game against the computer.
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("--- Welcome to Rock, Paper, Scissors! ---");

        while (true) {
            System.out.print("Enter move (rock, paper, scissors). To exit, type 'exit': ");
            String userMove = scanner.nextLine().toLowerCase();

            if (userMove.equals("exit")) {
                break;
            }

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerMove = choices[computerIndex];

            System.out.println("Computer's move: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equals("rock") && computerMove.equals("scissors") ||
                    userMove.equals("paper") && computerMove.equals("rock") ||
                    userMove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.println();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
