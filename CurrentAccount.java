/**
 * Concrete implementation of a Current Account with overdraft facility.
 */
public class CurrentAccount implements BankSystemInterface {
    private String accountNumber;
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". Current Balance: $" + balance);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Current Balance: $" + balance);
            if (balance < 0) {
                System.out.println("Warning: Using overdraft facility. Debt: $" + Math.abs(balance));
            }
            return true;
        }
        System.out.println("Withdrawal failed: Exceeds overdraft limit of $" + overdraftLimit);
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Current Account (Business)";
    }

    @Override
    public void displaySummary() {
        System.out.println("--- Current Account Summary ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount("CUR-1002", 5000.0, 2000.0);
        ca.displaySummary();
        ca.withdraw(6000.0); // Uses partial overdraft
        ca.withdraw(2000.0); // Should fail (exceeds total 5000+2000)
        ca.deposit(1500.0);
        ca.displaySummary();
    }
}
