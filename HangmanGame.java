import java.util.Scanner;
import java.util.Random;

/**
 * A simple Hangman word guessing game.
 */
public class HangmanGame {
    private static String[] words = { "java", "programming", "computer", "keyboard", "software", "developer",
            "interface" };
    private static String wordToGuess;
    private static StringBuilder currentGuess;
    private static int triesLeft = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        wordToGuess = words[random.nextInt(words.length)];
        currentGuess = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            currentGuess.append("_");
        }

        System.out.println("--- Welcome to Hangman! ---");

        while (triesLeft > 0 && currentGuess.toString().contains("_")) {
            System.out.println("\nWord: " + currentGuess.toString());
            System.out.println("Tries left: " + triesLeft);
            printHangman();
            System.out.print("Guess a letter: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Please enter only one letter.");
                continue;
            }

            char guess = input.charAt(0);
            if (wordToGuess.indexOf(guess) >= 0) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        currentGuess.setCharAt(i, guess);
                    }
                }
            } else {
                triesLeft--;
                System.out.println("Incorrect guess.");
            }
        }

        if (triesLeft > 0) {
            System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
        } else {
            printHangman();
            System.out.println("\nGame over! The word was: " + wordToGuess);
        }
        scanner.close();
    }

    private static void printHangman() {
        switch (triesLeft) {
            case 6:
                System.out.println("  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========");
                break;
            case 5:
                System.out.println("  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========");
                break;
            case 4:
                System.out.println("  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========");
                break;
            case 3:
                System.out.println("  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========");
                break;
            case 2:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========");
                break;
            case 1:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========");
                break;
            case 0:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========");
                break;
        }
    }
}
