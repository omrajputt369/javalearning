import java.util.Scanner;

/**
 * A simple text-based adventure game.
 */
public class TextBasedAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Mystery Cave! ---");
        System.out.println("You stand at the entrance of a dark cave. Do you enter? (yes/no)");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("You step inside and see two paths: left or right. Which way do you go?");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("left")) {
                System.out.println("You find a treasure chest! Do you open it? (yes/no)");
                choice = scanner.nextLine().toLowerCase();

                if (choice.equals("yes")) {
                    System.out.println("It's filled with gold! You win!");
                } else {
                    System.out.println("You walk away and get lost. Game over.");
                }
            } else if (choice.equals("right")) {
                System.out.println("A sleeping dragon is here! Do you sneak past or run away? (sneak/run)");
                choice = scanner.nextLine().toLowerCase();

                if (choice.equals("sneak")) {
                    System.out.println("You safely sneak past and find an exit. You win!");
                } else {
                    System.out.println("The dragon wakes up! Game over.");
                }
            } else {
                System.out.println("Invalid choice. You are confused and stay there forever. Game over.");
            }
        } else {
            System.out.println("You decide to stay safe at home. Goodbye!");
        }

        scanner.close();
    }
}
