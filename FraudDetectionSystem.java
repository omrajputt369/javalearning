/**
 * A basic fraud detection system for analyzing transaction risks.
 */
public class FraudDetectionSystem {
    private static final double MAX_TRANSACTION_LIMIT = 10000.00;

    /**
     * Checks if a transaction is suspicious.
     * 
     * @param amount  The transaction amount.
     * @param gateway The gateway being used.
     * @return true if suspicious, false if clean.
     */
    public boolean isSuspicious(double amount, String gateway) {
        // Rule 1: High value transaction
        if (amount > MAX_TRANSACTION_LIMIT) {
            System.out.println("[FRAUD ALERT] High value detected: $" + amount);
            return true;
        }

        // Rule 2: Specific high-risk gateway simulation (e.g., Crypto)
        // with large amounts (even if below global limit)
        if (gateway.contains("Crypto") && amount > 5000.00) {
            System.out.println("[FRAUD ALERT] High risk gateway large amount: $" + amount);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        FraudDetectionSystem fds = new FraudDetectionSystem();

        System.out.println(
                "Checking transaction $500 (Visa): " + (fds.isSuspicious(500, "Visa") ? "SUSPICIOUS" : "CLEAN"));
        System.out.println(
                "Checking transaction $6000 (Crypto): " + (fds.isSuspicious(6000, "Crypto") ? "SUSPICIOUS" : "CLEAN"));
        System.out.println(
                "Checking transaction $15000 (Bank): " + (fds.isSuspicious(15000, "Bank") ? "SUSPICIOUS" : "CLEAN"));
    }
}
