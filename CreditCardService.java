/**
 * Simulates a Credit Card service with limit and billing logic.
 */
public class CreditCardService {
    private String cardNumber;
    private double creditLimit;
    private double currentBalance;
    private double interestRate;

    public CreditCardService(String cardNumber, double creditLimit, double interestRate) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.currentBalance = 0; // Debt amount
        this.interestRate = interestRate;
    }

    public boolean makePurchase(double amount) {
        if (amount > 0 && (currentBalance + amount) <= creditLimit) {
            currentBalance += amount;
            System.out.println("Purchase successful: $" + amount);
            System.out.println("Available Limit: $" + (creditLimit - currentBalance));
            return true;
        }
        System.out.println("Purchase failed: Credit limit exceeded or invalid amount.");
        return false;
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            currentBalance -= amount;
            if (currentBalance < 0)
                currentBalance = 0;
            System.out.println("Payment received: $" + amount + ". Remaining Debt: $" + currentBalance);
        }
    }

    public void applyMonthlyInterest() {
        if (currentBalance > 0) {
            double interest = (currentBalance * (interestRate / 100)) / 12;
            currentBalance += interest;
            System.out.println("Monthly interest applied: $" + String.format("%.2f", interest));
            System.out.println("New Debt Balance: $" + String.format("%.2f", currentBalance));
        }
    }

    public void displayAccountInfo() {
        System.out.println("--- Credit Card Account ---");
        System.out.println("Card: XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Total Credit Limit: $" + creditLimit);
        System.out.println("Outstanding Balance (Debt): $" + String.format("%.2f", currentBalance));
        System.out.println("Available Credit: $" + String.format("%.2f", (creditLimit - currentBalance)));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        CreditCardService cc = new CreditCardService("1122334455667788", 10000.0, 18.0);
        cc.displayAccountInfo();
        cc.makePurchase(2500.0);
        cc.makePurchase(8000.0); // Should fail
        cc.applyMonthlyInterest();
        cc.makePayment(1000.0);
        cc.displayAccountInfo();
    }
}
