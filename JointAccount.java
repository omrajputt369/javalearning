import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of a Joint Account held by multiple owners.
 */
public class JointAccount implements BankSystemInterface {
    private String accountNumber;
    private double balance;
    private List<String> owners;

    public JointAccount(String accountNumber, double initialBalance, String owner1, String owner2) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.owners = new ArrayList<>();
        this.owners.add(owner1);
        this.owners.add(owner2);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into Joint Account. New balance: $" + balance);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful from Joint Account.");
            System.out.println("Remaining Balance: $" + balance);
            return true;
        }
        System.out.println("Withdrawal failed: Insufficient funds in Joint Account.");
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Joint Account (Multi-Owner)";
    }

    @Override
    public void displaySummary() {
        System.out.println("--- Joint Account Summary ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owners: " + String.join(", ", owners));
        System.out.println("Total Balance: $" + balance);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        JointAccount ja = new JointAccount("JN-2003", 15000.0, "Alice Smith", "Bob Smith");
        ja.displaySummary();
        ja.deposit(2500.0);
        ja.withdraw(3000.0);
        ja.displaySummary();
    }
}
