/**
 * Base interface for all bank account types in the Banking System.
 */
public interface BankSystemInterface {
    /**
     * Deposits a specified amount into the account.
     * 
     * @param amount The amount to deposit.
     */
    void deposit(double amount);

    /**
     * Withdraws a specified amount from the account.
     * 
     * @param amount The amount to withdraw.
     * @return true if withdrawal was successful, false otherwise.
     */
    boolean withdraw(double amount);

    /**
     * Returns the current balance of the account.
     * 
     * @return The account balance.
     */
    double getBalance();

    /**
     * Returns the account type description.
     * 
     * @return A string representing the account type.
     */
    String getAccountType();

    /**
     * Displays the account details and summary.
     */
    void displaySummary();
}
