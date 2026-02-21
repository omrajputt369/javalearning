import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Service for logging critical system actions and transactions for audit
 * purposes.
 */
public class AuditLoggerService {
    private static final String LOG_FILE = "audit_log.txt";

    /**
     * Records an event in the audit log.
     * 
     * @param event The description of the event.
     * @param user  The user associated with the event.
     */
    public void logEvent(String event, String user) {
        String logEntry = String.format("[%s] USER: %s | EVENT: %s",
                LocalDateTime.now(), user, event);

        System.out.println("[AUDIT] " + logEntry);

        try (FileWriter fw = new FileWriter(LOG_FILE, true);
                PrintWriter pw = new PrintWriter(fw)) {
            pw.println(logEntry);
        } catch (IOException e) {
            System.err.println("Error writing to audit log: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        AuditLoggerService logger = new AuditLoggerService();

        logger.logEvent("Successful Login", "admin");
        logger.logEvent("Payment Processed: $500.00", "merchant_1");
        logger.logEvent("Refund Issued: TXN-54321", "support_agent");
    }
}
