/**
 * Concrete implementation of PaymentProcessor for Cryptocurrency transactions.
 */
public class CryptoPaymentProcessor implements PaymentProcessor {
    private String walletAddress;
    private String network; // e.g., Ethereum, Bitcoin, Solana

    public CryptoPaymentProcessor(String walletAddress, String network) {
        this.walletAddress = walletAddress;
        this.network = network;
    }

    @Override
    public boolean process(double amount) {
        if (validate()) {
            System.out.println("Processing Crypto payment of $" + amount + " equivalent.");
            System.out.println("Network: " + network);
            System.out.println("Sending request to wallet: " + walletAddress);
            System.out.println("Transaction Successful: Blockchain confirmation pending (simulated).");
            return true;
        }
        System.out.println("Transaction Failed: Invalid wallet address or network.");
        return false;
    }

    @Override
    public String getGatewayName() {
        return "Decentralized Crypto Gateway";
    }

    @Override
    public boolean validate() {
        // Simple crypto wallet format simulation (starts with 0x for ETH etc)
        return walletAddress != null && walletAddress.length() > 20 &&
                network != null && !network.isEmpty();
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new CryptoPaymentProcessor("0x71C7656EC7ab88b098defB751B7401B5f6d8976F",
                "Ethereum");
        processor.process(1500.50);
    }
}
