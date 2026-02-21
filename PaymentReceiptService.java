import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Service to generate payment receipts after successful transactions.
 */
public class PaymentReceiptService {

    /**
     * Generates a digital receipt.
     * 
     * @param transactionId Unique transaction ID.
     * @param amount        The paid amount.
     * @param method        The payment method used.
     * @return String representing the receipt.
     */
    public String generateDigitalReceipt(String transactionId, double amount, String method) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------\n");
        sb.append("      PAYMENT RECEIPT       \n");
        sb.append("----------------------------\n");
        sb.append("Date:     ").append(timestamp).append("\n");
        sb.append("TXN ID:   ").append(transactionId).append("\n");
        sb.append("Method:   ").append(method).append("\n");
        sb.append("Amount:   $").append(String.format("%.2f", amount)).append("\n");
        sb.append("----------------------------\n");
        sb.append("      Status: PAID          \n");
        sb.append("----------------------------\n");

        return sb.toString();
    }

    public static void main(String[] args) {
        PaymentReceiptService receiptService = new PaymentReceiptService();
        String receipt = receiptService.generateDigitalReceipt("TXN-334455", 85.50, "Credit Card");
        System.out.println(receipt);
    }
}
