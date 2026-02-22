/**
 * Engine to calculate transaction fees based on type and amount.
 */
public class TransactionFeeEngine {

    public enum TransactionType {
        ATM_WITHDRAWAL, NEFT, RTGS, IMPS, COUNTER_CASH
    }

    /**
     * Calculates the fee for a transaction.
     * 
     * @param type   The type of transaction.
     * @param amount The transaction amount.
     * @return Calculated fee.
     */
    public double calculateFee(TransactionType type, double amount) {
        switch (type) {
            case ATM_WITHDRAWAL:
                return (amount > 5000) ? 20.0 : 0.0;
            case NEFT:
                return (amount > 10000) ? 5.0 : 2.5;
            case RTGS:
                return (amount > 200000) ? 25.0 : 20.0;
            case IMPS:
                return amount * 0.005; // 0.5% fee
            case COUNTER_CASH:
                return (amount > 50000) ? amount * 0.01 : 0.0;
            default:
                return 0.0;
        }
    }

    public void displayFeeSummary(TransactionType type, double amount) {
        double fee = calculateFee(type, amount);
        System.out.println("---------------------------------");
        System.out.println("Transaction Type: " + type);
        System.out.println("Amount: $" + amount);
        System.out.println("Calculated Service Fee: $" + String.format("%.2f", fee));
        System.out.println("Total Deduction: $" + String.format("%.2f", (amount + fee)));
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        TransactionFeeEngine engine = new TransactionFeeEngine();

        System.out.println("--- Bank Transaction Fee Simulation ---");
        engine.displayFeeSummary(TransactionType.IMPS, 1000.0);
        engine.displayFeeSummary(TransactionType.RTGS, 250000.0);
        engine.displayFeeSummary(TransactionType.ATM_WITHDRAWAL, 2000.0);
    }
}
