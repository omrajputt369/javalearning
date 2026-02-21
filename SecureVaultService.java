import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Simulates a secure vault for tokenizing sensitive payment data (like card
 * numbers).
 */
public class SecureVaultService {
    private Map<String, String> tokenVault = new HashMap<>();

    /**
     * Tokenizes sensitive data and returns a safe token.
     * 
     * @param sensitiveData The data to protect (e.g., Credit Card number).
     * @return A unique token representing the data.
     */
    public String tokenize(String sensitiveData) {
        String token = "TOKEN-" + UUID.randomUUID().toString();
        tokenVault.put(token, sensitiveData);
        return token;
    }

    /**
     * Retrieves the original data from a token (restricted access).
     * 
     * @param token The token.
     * @return The original data.
     */
    public String detokenize(String token) {
        return tokenVault.get(token);
    }

    public static void main(String[] args) {
        SecureVaultService vault = new SecureVaultService();

        String myCard = "4111222233334444";
        System.out.println("Original Card Data: " + myCard);

        String myToken = vault.tokenize(myCard);
        System.out.println("Generated Secure Token: " + myToken);

        String retrieved = vault.detokenize(myToken);
        System.out.println("Retrieved Data (Vault): " + retrieved);

        if (myCard.equals(retrieved)) {
            System.out.println("Vault verification successful.");
        }
    }
}
