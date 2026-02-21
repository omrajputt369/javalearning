import java.util.Scanner;

/**
 * Simulates a Point-of-Sale (POS) terminal interaction for retail payments.
 */
public class TerminalPOSSimulation {
    private String terminalId;
    private String merchantName;

    public TerminalPOSSimulation(String terminalId, String merchantName) {
        this.terminalId = terminalId;
        this.merchantName = merchantName;
    }

    public void startTransaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- " + merchantName + " POS Terminal (" + terminalId + ") ---");

        System.out.print("Enter purchase amount: ");
        double amount = scanner.nextDouble();

        System.out.println("1. Swipe/Insert Card");
        System.out.println("2. Contactless (NFC)");
        System.out.print("Select payment mode: ");
        int choice = scanner.nextInt();

        System.out.println("Connecting to gateway...");
        simulateDelay(2000);

        if (choice == 1 || choice == 2) {
            System.out.println("Transaction Approved! Amount: $" + amount);
            System.out.println("Printing Receipt...");
        } else {
            System.out.println("Transaction Cancelled.");
        }

        scanner.close();
    }

    private void simulateDelay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        TerminalPOSSimulation pos = new TerminalPOSSimulation("T-900", "City Supermarket");
        pos.startTransaction();
    }
}
