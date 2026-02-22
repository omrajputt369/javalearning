/**
 * Manages the states and operations of a Debit Card.
 */
public class DebitCardService {
    public enum CardStatus {
        ACTIVE, INACTIVE, BLOCKED, EXPIRED
    }

    private String cardNumber;
    private CardStatus status;
    private double dailyLimit;

    public DebitCardService(String cardNumber) {
        this.cardNumber = cardNumber;
        this.status = CardStatus.INACTIVE; // Default state
        this.dailyLimit = 2000.0;
    }

    public void activateCard() {
        if (status == CardStatus.INACTIVE) {
            status = CardStatus.ACTIVE;
            System.out.println("Card " + cardNumber + " has been activated.");
        } else {
            System.out.println("Activation failed: Card is currently " + status);
        }
    }

    public void blockCard() {
        status = CardStatus.BLOCKED;
        System.out.println("Card " + cardNumber + " has been BLOCKED for security.");
    }

    public void setDailyLimit(double newLimit) {
        if (status == CardStatus.ACTIVE) {
            this.dailyLimit = newLimit;
            System.out.println("Daily limit updated to: $" + dailyLimit);
        } else {
            System.out.println("Update failed: Card must be ACTIVE to change limits.");
        }
    }

    public void displayCardInfo() {
        System.out.println("--- Debit Card Information ---");
        System.out.println("Card Number: XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Status: " + status);
        System.out.println("Daily Limit: $" + dailyLimit);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        DebitCardService card = new DebitCardService("4455667788991122");
        card.displayCardInfo();
        card.activateCard();
        card.setDailyLimit(3500.0);
        card.blockCard();
        card.displayCardInfo();
    }
}
