import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Simulates a Two-Factor Authentication (2FA) service with OTP generation.
 */
public class TwoFactorAuthenticatorService {
    private Map<String, String> otpStorage = new HashMap<>();
    private Random random = new Random();

    /**
     * Generates a 6-digit OTP for a user.
     * 
     * @param userId The user ID or Phone/Email.
     * @return The generated OTP (simulated sending).
     */
    public String generateOTP(String userId) {
        String otp = String.format("%06d", random.nextInt(1000000));
        otpStorage.put(userId, otp);
        System.out.println("[2FA] OTP generated and 'sent' to " + userId + ": " + otp);
        return otp;
    }

    /**
     * Verifies the OTP provided by the user.
     * 
     * @param userId   The user ID.
     * @param inputOTP The OTP entered by the user.
     * @return true if matches.
     */
    public boolean verifyOTP(String userId, String inputOTP) {
        if (otpStorage.containsKey(userId) && otpStorage.get(userId).equals(inputOTP)) {
            System.out.println("[2FA] Verification Successful for user: " + userId);
            otpStorage.remove(userId); // Single use
            return true;
        }
        System.out.println("[2FA] Verification Failed: Invalid OTP.");
        return false;
    }

    public static void main(String[] args) {
        TwoFactorAuthenticatorService auth2fa = new TwoFactorAuthenticatorService();
        String user = "customer_88";

        String otp = auth2fa.generateOTP(user);

        // Correct OTP
        auth2fa.verifyOTP(user, otp);

        // Test reuse or wrong OTP
        auth2fa.verifyOTP(user, otp);
    }
}
