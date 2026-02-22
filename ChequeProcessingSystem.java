/**
 * Simulates the processing, clearing, and dishonoring of bank cheques.
 */
public class ChequeProcessingSystem {
    public enum ChequeStatus {
        UNPROCESSED, CLEARED, DISHONORED, STOPPED
    }

    private String chequeNumber;
    private double amount;
    private ChequeStatus status;

    public ChequeProcessingSystem(String chequeNumber, double amount) {
        this.chequeNumber = chequeNumber;
        this.amount = amount;
        this.status = ChequeStatus.UNPROCESSED;
    }

    public void processCheque(double availableBalance) {
        System.out.println("Processing Cheque #" + chequeNumber + " for $" + amount + "...");
        if (availableBalance >= amount) {
            status = ChequeStatus.CLEARED;
            System.out.println("Clearing Successful: Funds transferred.");
        } else {
            status = ChequeStatus.DISHONORED;
            System.out.println("Clearing Failed: Insufficient funds (Cheque Bounced).");
        }
    }

    public void stopPayment() {
        if (status == ChequeStatus.UNPROCESSED) {
            status = ChequeStatus.STOPPED;
            System.out.println("Stop payment request processed for Cheque #" + chequeNumber);
        } else {
            System.out.println("Request Denied: Cheque has already been " + status);
        }
    }

    public void displayChequeDetails() {
        System.out.println("--- Cheque Lifecycle Details ---");
        System.out.println("Cheque Number: " + chequeNumber);
        System.out.println("Amount: $" + amount);
        System.out.println("Current Status: " + status);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        ChequeProcessingSystem chq1 = new ChequeProcessingSystem("CHQ-00123", 4500.0);
        chq1.displayChequeDetails();
        chq1.processCheque(5000.0); // Success
        chq1.displayChequeDetails();

        ChequeProcessingSystem chq2 = new ChequeProcessingSystem("CHQ-00124", 10000.0);
        chq2.processCheque(2000.0); // Bounced
        chq2.displayChequeDetails();
    }
}
