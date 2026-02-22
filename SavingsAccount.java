/**
 * Concrete implementation of a Savings Account.
 */
public class SavingsAccount implements BankSystemInterface {
    private String accountNumber;
    private double balance;
    private double interestRate; // Annual interest rate in percentage

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        }
        System.out.println("Withdrawal failed: Insufficient funds or invalid amount.");
        return false;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }

    public void applyInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Applied annual interest of $" + interest + ". New balance: $" + balance);
    }

    @Override
    public void displaySummary() {
        System.out.println("--- Account Summary ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Current Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SAV-1001", 1000.0, 4.5);
        sa.displaySummary();
        sa.deposit(500.0);
        sa.withdraw(200.0);
        sa.applyInterest();
        sa.displaySummary();
    }
}
