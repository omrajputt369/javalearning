import java.util.HashMap;
import java.util.Map;

/**
 * Simulates an authentication service for user login and session management.
 */
public class AuthServiceProvider {
    private Map<String, String> userDatabase = new HashMap<>();
    private Map<String, String> activeSessions = new HashMap<>();

    public AuthServiceProvider() {
        // Mock data
        userDatabase.put("admin", "admin123");
        userDatabase.put("merchant_1", "securePass");
    }

    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            String sessionId = "SESSION-" + System.currentTimeMillis();
            activeSessions.put(username, sessionId);
            System.out.println("Login Success: " + username + " | Session: " + sessionId);
            return true;
        }
        System.out.println("Login Failed: Invalid credentials for " + username);
        return false;
    }

    public boolean isSessionActive(String username) {
        return activeSessions.containsKey(username);
    }

    public void logout(String username) {
        activeSessions.remove(username);
        System.out.println("User logged out: " + username);
    }

    public static void main(String[] args) {
        AuthServiceProvider auth = new AuthServiceProvider();

        auth.login("admin", "admin123");
        System.out.println("Is admin session active? " + auth.isSessionActive("admin"));

        auth.logout("admin");
        System.out.println("Is admin session active? " + auth.isSessionActive("admin"));

        auth.login("merchant_1", "wrong_pass");
    }
}
