import java.util.ArrayList;
import java.util.List;

/**
 * Service to calculate and apply interest to multiple bank accounts in batch.
 */
public class InterestAccrualService {
    private List<SavingsAccount> savingsAccounts = new ArrayList<>();

    public void addAccount(SavingsAccount account) {
        savingsAccounts.add(account);
    }

    /**
     * Executes the interest accrual process for all registered savings accounts.
     */
    public void runInterestCycle() {
        System.out.println("--- Starting Monthly Interest Accrual Cycle ---");
        System.out.println("Processing " + savingsAccounts.size() + " accounts...");

        for (SavingsAccount acc : savingsAccounts) {
            System.out.print("Processing Acc: " + acc.getAccountType() + " | ");
            double oldBalance = acc.getBalance();
            acc.applyInterest();
            double newBalance = acc.getBalance();
            System.out.println("   Interest applied. Delta: $" + String.format("%.2f", (newBalance - oldBalance)));
        }

        System.out.println("--- Interest Cycle Completed Successfully ---");
    }

    public static void main(String[] args) {
        InterestAccrualService service = new InterestAccrualService();

        // Mock data
        service.addAccount(new SavingsAccount("SAV-991", 5000.0, 4.0));
        service.addAccount(new SavingsAccount("SAV-992", 12500.0, 4.5));
        service.addAccount(new SavingsAccount("SAV-993", 750.0, 3.5));

        service.runInterestCycle();
    }
}
