import java.util.Scanner;

/**
 * Simulates a Merchant Portal for managing business settings and viewing
 * summary.
 */
public class MerchantPortalSystem {
    private String merchantId;
    private String businessName;
    private double totalSales;
    private int transactionCount;

    public MerchantPortalSystem(String merchantId, String businessName) {
        this.merchantId = merchantId;
        this.businessName = businessName;
    }

    public void displayDashboard() {
        System.out.println("------------------------------------");
        System.out.println("  MERCHANT PORTAL: " + businessName);
        System.out.println("  ID: " + merchantId);
        System.out.println("------------------------------------");
        System.out.println("1. View Daily Sales Summary");
        System.out.println("2. Update Business Settings");
        System.out.println("3. Manage Payouts");
        System.out.println("4. Exit");
        System.out.println("------------------------------------");
    }

    public void viewSummary(double mockSales, int mockCount) {
        this.totalSales = mockSales;
        this.transactionCount = mockCount;
        System.out.println("\n[SUMMARY] Total Sales: $" + String.format("%.2f", totalSales));
        System.out.println("[SUMMARY] Total Transactions: " + transactionCount);
        System.out.println("[SUMMARY] Avg Ticket Size: $" + String.format("%.2f", (totalSales / transactionCount)));
    }

    public static void main(String[] args) {
        MerchantPortalSystem portal = new MerchantPortalSystem("M-505", "Global Tech Store");
        portal.displayDashboard();
        portal.viewSummary(15450.75, 120);
    }
}
