import java.util.Scanner;
import java.util.Random;

/**
 * A simple Rock, Paper, Scissors game against the computer.
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = { "Rock", "Paper", "Scissors" };

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your choice (Rock, Paper, Scissors or Exit to quit): ");
            String userChoice = scanner.nextLine().trim();

            if (userChoice.equalsIgnoreCase("Exit")) {
                break;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (isWin(userChoice, computerChoice)) {
                System.out.println("You win!");
            } else if (isValid(userChoice)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            }
            System.out.println();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static boolean isWin(String user, String computer) {
        return (user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"));
    }

    private static boolean isValid(String choice) {
        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper")
                || choice.equalsIgnoreCase("Scissors");
    }
}
