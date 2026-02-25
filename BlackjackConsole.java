import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * A simple console-based Blackjack game.
 */
public class BlackjackConsole {
    private static class Card {
        String suit;
        String rank;
        int value;

        Card(String suit, String rank, int value) {
            this.suit = suit;
            this.rank = rank;
            this.value = value;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }

    private List<Card> deck;
    private List<Card> playerHand;
    private List<Card> dealerHand;

    public BlackjackConsole() {
        deck = createDeck();
        Collections.shuffle(deck);
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
    }

    private List<Card> createDeck() {
        List<Card> newDeck = new ArrayList<>();
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                newDeck.add(new Card(suit, ranks[i], values[i]));
            }
        }
        return newDeck;
    }

    private int calculateHandValue(List<Card> hand) {
        int val = 0;
        int aces = 0;
        for (Card card : hand) {
            val += card.value;
            if (card.rank.equals("Ace"))
                aces++;
        }
        while (val > 21 && aces > 0) {
            val -= 10;
            aces--;
        }
        return val;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        playerHand.add(deck.remove(0));
        dealerHand.add(deck.remove(0));
        playerHand.add(deck.remove(0));
        dealerHand.add(deck.remove(0));

        System.out.println("--- Welcome to Blackjack! ---");

        // Player's turn
        while (true) {
            System.out.println("\nYour hand: " + playerHand + " (Value: " + calculateHandValue(playerHand) + ")");
            System.out.println("Dealer's face-up card: " + dealerHand.get(0));

            if (calculateHandValue(playerHand) > 21) {
                System.out.println("Bust! You lose.");
                return;
            }

            System.out.print("Do you want to (H)it or (S)tand? ");
            String choice = scanner.nextLine().toUpperCase();
            if (choice.equals("H")) {
                playerHand.add(deck.remove(0));
            } else {
                break;
            }
        }

        // Dealer's turn
        System.out.println("\nDealer's hand: " + dealerHand + " (Value: " + calculateHandValue(dealerHand) + ")");
        while (calculateHandValue(dealerHand) < 17) {
            dealerHand.add(deck.remove(0));
            System.out.println("Dealer hits: " + dealerHand + " (Value: " + calculateHandValue(dealerHand) + ")");
        }

        int playerVal = calculateHandValue(playerHand);
        int dealerVal = calculateHandValue(dealerHand);

        if (dealerVal > 21 || playerVal > dealerVal) {
            System.out.println("You win!");
        } else if (playerVal < dealerVal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a push (tie)!");
        }
    }

    public static void main(String[] args) {
        new BlackjackConsole().play();
    }
}
