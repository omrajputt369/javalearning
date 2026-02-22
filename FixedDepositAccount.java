/**
 * Concrete implementation of a Fixed Deposit (FD) Account.
 */
public class FixedDepositAccount implements BankSystemInterface {
    private String accountNumber;
    private double balance;
    private int tenureMonths;
    private boolean isMatured;

    public FixedDepositAccount(String accountNumber, double initialDeposit, int tenureMonths) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.tenureMonths = tenureMonths;
        this.isMatured = false;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit failed: FD accounts do not accept recurring deposits after initialization.");
    }

    @Override
    public boolean withdraw(double amount) {
        if (!isMatured) {
            System.out.println(
                    "Warning: Withdrawing before maturity (" + tenureMonths + " months) results in a 2% penalty.");
            double penalty = amount * 0.02;
            if (balance >= (amount + penalty)) {
                balance -= (amount + penalty);
                System.out.println("Withdrew $" + amount + " with penalty $" + penalty + ". New balance: $" + balance);
                return true;
            }
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        }
        System.out.println("Withdrawal failed: Insufficient funds.");
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Fixed Deposit Account";
    }

    public void setMatured(boolean status) {
        this.isMatured = status;
        if (status)
            System.out.println("Account FD-" + accountNumber + " has reached maturity.");
    }

    @Override
    public void displaySummary() {
        System.out.println("--- FD Account Summary ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Tenure: " + tenureMonths + " months");
        System.out.println("Current Balance: $" + balance);
        System.out.println("Maturity Status: " + (isMatured ? "Matured" : "Active"));
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        FixedDepositAccount fd = new FixedDepositAccount("FD-9005", 10000.0, 12);
        fd.displaySummary();
        fd.deposit(1000.0); // Should fail
        fd.withdraw(2000.0); // Premature withdrawal with penalty
        fd.setMatured(true);
        fd.withdraw(5000.0); // Mature withdrawal no penalty
        fd.displaySummary();
    }
}
