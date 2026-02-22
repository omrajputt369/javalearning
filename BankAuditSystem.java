import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Monitors and logs high-value transactions for regulatory compliance and
 * auditing.
 */
public class BankAuditSystem {
    private static final double AUDIT_THRESHOLD = 50000.0;

    /**
     * Logs a transaction and raises an alert if it exceeds the threshold.
     * 
     * @param accountId ID of the account.
     * @param amount    Transaction amount.
     * @param type      Type of transaction (DEBIT/CREDIT).
     */
    public void logTransaction(String accountId, double amount, String type) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(
                "[AUDIT LOG] [" + timestamp + "] Account: " + accountId + " | Type: " + type + " | Amount: $" + amount);

        if (amount >= AUDIT_THRESHOLD) {
            System.err.println("!!! SECURITY ALERT !!! High-value transaction detected for account " + accountId);
            System.err.println("Action: Flagged for investigation by AML (Anti-Money Laundering) team.");
        }
    }

    public static void main(String[] args) {
        BankAuditSystem audit = new BankAuditSystem();

        System.out.println("--- Starting Bank Audit Monitoring ---");

        audit.logTransaction("ACC-101", 1200.0, "DEBIT");
        audit.logTransaction("ACC-505", 75000.0, "CREDIT"); // Triggers alert
        audit.logTransaction("ACC-202", 49999.0, "DEBIT"); // Close to threshold

        System.out.println("--- Audit Monitoring Session Finished ---");
    }
}
