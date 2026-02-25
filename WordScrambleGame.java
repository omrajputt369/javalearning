import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * A game where the user unscrambles words.
 */
public class WordScrambleGame {
    private static String[] words = { "developer", "keyboard", "monitor", "software", "network", "database",
            "security" };

    public static String scramble(String word) {
        List<Character> letters = new ArrayList<>();
        for (char c : word.toCharArray())
            letters.add(c);
        Collections.shuffle(letters);
        StringBuilder sb = new StringBuilder();
        for (char c : letters)
            sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String original = words[random.nextInt(words.length)];
        String scrambled = scramble(original);

        System.out.println("--- Welcome to Word Scramble! ---");
        System.out.println("Unscramble this word: " + scrambled);

        int attempts = 0;
        while (true) {
            System.out.print("Your guess: ");
            String guess = scanner.nextLine().toLowerCase();
            attempts++;

            if (guess.equals(original)) {
                System.out.println("Correct! You unscrambled the word in " + attempts + " attempts.");
                break;
            } else {
                System.out.println("Incorrect. Try again!");
            }
        }
        scanner.close();
    }
}
