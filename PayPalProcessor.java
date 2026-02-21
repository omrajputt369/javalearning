/**
 * Concrete implementation of PaymentProcessor for PayPal transactions.
 */
public class PayPalProcessor implements PaymentProcessor {
    private String email;
    private String password;

    public PayPalProcessor(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean process(double amount) {
        if (validate()) {
            System.out.println("Processing PayPal payment of $" + amount);
            System.out.println("Redirecting to PayPal for user: " + email);
            System.out.println("Transaction Successful via PayPal.");
            return true;
        }
        System.out.println("Transaction Failed: Invalid PayPal credentials.");
        return false;
    }

    @Override
    public String getGatewayName() {
        return "PayPal Express Checkout";
    }

    @Override
    public boolean validate() {
        return email != null && email.contains("@") && email.contains(".") &&
                password != null && password.length() >= 6;
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalProcessor("user@example.com", "securePass123");
        processor.process(99.99);
    }
}
