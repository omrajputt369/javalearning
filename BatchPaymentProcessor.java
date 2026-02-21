import java.util.ArrayList;
import java.util.List;

/**
 * Handles multiple transactions in a single batch operation.
 */
public class BatchPaymentProcessor {
    private List<Double> pendingPayments = new ArrayList<>();

    public void addPayment(double amount) {
        pendingPayments.add(amount);
        System.out.println("Payment of $" + amount + " added to batch.");
    }

    public void processBatch(PaymentProcessor processor) {
        System.out.println("\n--- Starting Batch Processing via " + processor.getGatewayName() + " ---");
        int count = 0;
        double total = 0;

        for (double amount : pendingPayments) {
            boolean success = processor.process(amount);
            if (success) {
                count++;
                total += amount;
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Batch Summary:");
        System.out.println("Total Successfully Processed: " + count);
        System.out.println("Total Amount: $" + String.format("%.2f", total));
        System.out.println("--------------------------------\n");
        pendingPayments.clear();
    }

    public static void main(String[] args) {
        BatchPaymentProcessor bpp = new BatchPaymentProcessor();
        bpp.addPayment(50.00);
        bpp.addPayment(125.75);
        bpp.addPayment(200.00);

        PaymentProcessor creditCard = new CreditCardProcessor("4111222233334444", "12/28", "123");
        bpp.processBatch(creditCard);
    }
}
