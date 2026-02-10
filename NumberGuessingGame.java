import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void playGame(int minRange, int maxRange, int maxAttempts) {
        Random random = new Random();
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int score = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n🎮 GAME START! 🎮");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange);
        System.out.println("You have " + maxAttempts + " attempts to guess it!");
        System.out.println("-------------------------------------------");

        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("\nAttempt " + attempts + "/" + maxAttempts + " - Enter your guess: ");

            int guess;
            try {
                guess = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine(); // Clear buffer
                System.out.println("❌ Invalid input! Please enter a number.");
                attempts--;
                continue;
            }

            if (guess < minRange || guess > maxRange) {
                System.out.println("❌ Please guess a number between " + minRange + " and " + maxRange);
                attempts--;
                continue;
            }

            if (guess == targetNumber) {
                System.out.println("\n🎉 CONGRATULATIONS! 🎉");
                System.out.println("You guessed the number " + targetNumber + " correctly!");
                System.out.println("Attempts used: " + attempts + "/" + maxAttempts);

                // Calculate score
                score = score - ((attempts - 1) * 10);
                System.out.println("Your score: " + Math.max(score, 0) + "/100");

                if (attempts == 1) {
                    System.out.println("⭐ PERFECT! First try!");
                } else if (attempts <= 3) {
                    System.out.println("⭐ Excellent!");
                } else if (attempts <= 5) {
                    System.out.println("👍 Good job!");
                } else {
                    System.out.println("✓ You made it!");
                }
                return;

            } else if (guess < targetNumber) {
                System.out.println("📈 Too low! Try a HIGHER number.");

                // Give hints
                int difference = targetNumber - guess;
                if (difference <= 5) {
                    System.out.println("💡 Hint: You're very close!");
                } else if (difference <= 10) {
                    System.out.println("💡 Hint: You're getting warmer!");
                }

            } else {
                System.out.println("📉 Too high! Try a LOWER number.");

                // Give hints
                int difference = guess - targetNumber;
                if (difference <= 5) {
                    System.out.println("💡 Hint: You're very close!");
                } else if (difference <= 10) {
                    System.out.println("💡 Hint: You're getting warmer!");
                }
            }

            // Show remaining attempts
            int remaining = maxAttempts - attempts;
            if (remaining > 0) {
                System.out.println("Attempts remaining: " + remaining);
            }
        }

        // Game over
        System.out.println("\n💔 GAME OVER! 💔");
        System.out.println("You've used all " + maxAttempts + " attempts.");
        System.out.println("The number was: " + targetNumber);
        System.out.println("Better luck next time!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║  NUMBER GUESSING GAME  ║");
        System.out.println("╚═══════════════════════════════════╝");

        while (playAgain) {
            System.out.println("\nSelect difficulty level:");
            System.out.println("1. Easy (1-50, 10 attempts)");
            System.out.println("2. Medium (1-100, 7 attempts)");
            System.out.println("3. Hard (1-200, 5 attempts)");
            System.out.println("4. Custom");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            int minRange, maxRange, maxAttempts;

            switch (choice) {
                case 1:
                    playGame(1, 50, 10);
                    break;
                case 2:
                    playGame(1, 100, 7);
                    break;
                case 3:
                    playGame(1, 200, 5);
                    break;
                case 4:
                    System.out.print("Enter minimum range: ");
                    minRange = scanner.nextInt();
                    System.out.print("Enter maximum range: ");
                    maxRange = scanner.nextInt();
                    System.out.print("Enter max attempts: ");
                    maxAttempts = scanner.nextInt();
                    playGame(minRange, maxRange, maxAttempts);
                    break;
                default:
                    System.out.println("Invalid choice! Using medium difficulty.");
                    playGame(1, 100, 7);
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("y");
        }

        System.out.println("\n👋 Thanks for playing! Goodbye!");
        scanner.close();
    }
}
