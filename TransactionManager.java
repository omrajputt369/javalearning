import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Manages the lifecycle and history of payment transactions.
 */
class Transaction {
    private String transactionId;
    private double amount;
    private String status;
    private String gateway;

    public Transaction(double amount, String gateway) {
        this.transactionId = UUID.randomUUID().toString();
        this.amount = amount;
        this.gateway = gateway;
        this.status = "PENDING";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction [ID=" + transactionId + ", Gateway=" + gateway +
                ", Amount=$" + amount + ", Status=" + status + "]";
    }
}

public class TransactionManager {
    private List<Transaction> history = new ArrayList<>();

    public void executeTransaction(PaymentProcessor processor, double amount) {
        Transaction tx = new Transaction(amount, processor.getGatewayName());
        System.out.println("Initiating: " + tx);

        history.add(tx);

        boolean success = processor.process(amount);
        if (success) {
            tx.setStatus("SUCCESS");
        } else {
            tx.setStatus("FAILED");
        }

        System.out.println("Final State: " + tx);
    }

    public void showHistory() {
        System.out.println("\n--- Transaction History ---");
        for (Transaction tx : history) {
            System.out.println(tx);
        }
    }

    public static void main(String[] args) {
        TransactionManager manager = new TransactionManager();

        PaymentProcessor card = new CreditCardProcessor("1111222233334444", "01/30", "999");
        PaymentProcessor paypal = new PayPalProcessor("buyer@test.com", "pass123");

        manager.executeTransaction(card, 50.00);
        manager.executeTransaction(paypal, 120.50);

        manager.showHistory();
    }
}
