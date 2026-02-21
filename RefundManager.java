import java.util.HashMap;
import java.util.Map;

/**
 * Manages refund requests and their statuses.
 */
public class RefundManager {
    private Map<String, String> refundStatus = new HashMap<>();

    /**
     * Initiates a refund for a specific transaction.
     * 
     * @param transactionId The ID of the original transaction.
     * @param reason        The reason for refund.
     */
    public void requestRefund(String transactionId, String reason) {
        System.out.println("[REFUND REQUEST] ID: " + transactionId + " | Reason: " + reason);
        refundStatus.put(transactionId, "REFUND_PENDING");
        System.out.println("Status updated: REFUND_PENDING");
    }

    /**
     * Approves a pending refund.
     * 
     * @param transactionId The ID of the transaction.
     */
    public void approveRefund(String transactionId) {
        if (refundStatus.containsKey(transactionId) && refundStatus.get(transactionId).equals("REFUND_PENDING")) {
            refundStatus.put(transactionId, "REFUND_SUCCESS");
            System.out.println("[REFUND APPROVED] Transaction " + transactionId + " has been refunded.");
        } else {
            System.out.println("[ERROR] No pending refund found for ID: " + transactionId);
        }
    }

    public static void main(String[] args) {
        RefundManager rm = new RefundManager();
        String txId = "TXN-12345";

        rm.requestRefund(txId, "Customer changed mind");
        rm.approveRefund(txId);

        rm.approveRefund("TXN-99999"); // Test error case
    }
}
