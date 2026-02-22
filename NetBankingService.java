/**
 * Simulates the backend logic for Net Banking operations like transfers and
 * profile updates.
 */
public class NetBankingService {
    private String userId;
    private boolean isSessionActive;

    public NetBankingService(String userId) {
        this.userId = userId;
        this.isSessionActive = false;
    }

    public void login(String password) {
        if ("bankP@ss".equals(password)) {
            isSessionActive = true;
            System.out.println("User " + userId + " logged into Net Banking.");
        } else {
            System.out.println("Login Failed: Authentication error.");
        }
    }

    public void transferFunds(String targetAccount, double amount, double currentBalance) {
        if (!isSessionActive) {
            System.out.println("Transfer Denied: No active session found.");
            return;
        }
        if (amount > 0 && currentBalance >= amount) {
            System.out.println("Transfer of $" + amount + " to account " + targetAccount + " initiated...");
            System.out.println("Status: Success.");
        } else {
            System.out.println("Transfer Failed: Insufficient funds or invalid amount.");
        }
    }

    public void updateProfile(String newAddress) {
        if (isSessionActive) {
            System.out.println("Profile updated: New address for user " + userId + " is " + newAddress);
        } else {
            System.out.println("Update Denied: Log in required.");
        }
    }

    public void logout() {
        isSessionActive = false;
        System.out.println("User " + userId + " has safely logged out.");
    }

    public static void main(String[] args) {
        NetBankingService netBanking = new NetBankingService("user_om_369");

        System.out.println("--- Online Banking Simulation ---");
        netBanking.updateProfile("123 Java Lane"); // Denied
        netBanking.login("bankP@ss");
        netBanking.transferFunds("Target-9988", 1200.0, 5000.0);
        netBanking.updateProfile("456 Coder Court"); // Successful
        netBanking.logout();
    }
}
