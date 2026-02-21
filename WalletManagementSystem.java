import java.util.HashMap;
import java.util.Map;

/**
 * Manages virtual wallet balances for users.
 */
public class WalletManagementSystem {
    private Map<String, Double> userWallets = new HashMap<>();

    public void createWallet(String userId, double initialBalance) {
        userWallets.put(userId, initialBalance);
        System.out.println("Wallet created for " + userId + " with balance: $" + initialBalance);
    }

    public double getBalance(String userId) {
        return userWallets.getOrDefault(userId, 0.0);
    }

    public void topUp(String userId, double amount) {
        double current = getBalance(userId);
        userWallets.put(userId, current + amount);
        System.out.println("Top-up: " + userId + " | New Balance: $" + (current + amount));
    }

    public boolean deduct(String userId, double amount) {
        double current = getBalance(userId);
        if (current >= amount) {
            userWallets.put(userId, current - amount);
            System.out.println("Deducted: $" + amount + " from " + userId + " | Remaining: $" + (current - amount));
            return true;
        }
        System.out.println("Insufficient funds for " + userId);
        return false;
    }

    public static void main(String[] args) {
        WalletManagementSystem wms = new WalletManagementSystem();
        String user = "wallet_user_1";

        wms.createWallet(user, 100.00);
        wms.topUp(user, 50.00);
        wms.deduct(user, 30.50);
        wms.deduct(user, 200.00); // Should fail
    }
}
