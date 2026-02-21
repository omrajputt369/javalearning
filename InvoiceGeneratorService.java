import java.util.Date;

/**
 * Generates an itemized text-based invoice for a given transaction.
 */
public class InvoiceGeneratorService {

    public void generateInvoice(String merchantName, String transactionId, double amount, String currency) {
        System.out.println("================================");
        System.out.println("        OFFICIAL INVOICE        ");
        System.out.println("================================");
        System.out.println("Merchant: " + merchantName);
        System.out.println("Date: " + new Date());
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("--------------------------------");
        System.out.println("Description          Price");
        System.out.println("Services/Products    " + amount + " " + currency);
        System.out.println("--------------------------------");
        System.out.println("TOTAL DUE:           " + amount + " " + currency);
        System.out.println("================================");
        System.out.println("    Thank you for your business!    ");
        System.out.println("================================");
    }

    public static void main(String[] args) {
        InvoiceGeneratorService igs = new InvoiceGeneratorService();
        igs.generateInvoice("Java Lab Solutions", "TXN-998877", 250.75, "USD");
    }
}
