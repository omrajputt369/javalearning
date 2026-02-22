/**
 * Simulates the frontend flow of a Mobile Banking Application.
 */
public class MobileBankingAppSimulation {
    private String deviceId;
    private boolean isBiometricVerified;

    public MobileBankingAppSimulation(String deviceId) {
        this.deviceId = deviceId;
        this.isBiometricVerified = false;
    }

    public void verifyFingerprint() {
        System.out.println("Scanning fingerprint on device: " + deviceId);
        isBiometricVerified = true;
        System.out.println("Fingerprint Verification Success.");
    }

    public void scanQrToPay(String merchantName, double amount) {
        if (!isBiometricVerified) {
            System.out.println("Payment Rejected: Biometric authentication required.");
            return;
        }
        System.out.println("Scanning QR code for " + merchantName + "...");
        System.out.println("App-based Payment of $" + amount + " to " + merchantName + " successful.");
    }

    public void checkUpiBalance() {
        if (isBiometricVerified) {
            System.out.println("UPI Balance retrieved. You have a safe balance.");
        } else {
            System.out.println("Action Denied: Unlock app first.");
        }
    }

    public static void main(String[] args) {
        MobileBankingAppSimulation mobileApp = new MobileBankingAppSimulation("Pixel-7-Om");

        System.out.println("--- Mobile Banking Simulation ---");
        mobileApp.checkUpiBalance(); // Denied
        mobileApp.verifyFingerprint();
        mobileApp.checkUpiBalance(); // Successful
        mobileApp.scanQrToPay("Starbucks-Central", 15.50);
        System.out.println("--- Session Ended ---");
    }
}
