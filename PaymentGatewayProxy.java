/**
 * Implements a Proxy for the PaymentProcessor to add logging and security
 * checks.
 */
public class PaymentGatewayProxy implements PaymentProcessor {
    private PaymentProcessor realProcessor;
    private String adminToken;

    public PaymentGatewayProxy(PaymentProcessor realProcessor, String adminToken) {
        this.realProcessor = realProcessor;
        this.adminToken = adminToken;
    }

    private boolean isAuthorized() {
        // Simple token check simulation
        return "SECURE-TOKEN-123".equals(adminToken);
    }

    @Override
    public boolean process(double amount) {
        System.out.println("[PROXY] Intercepting payment request of $" + amount);

        if (!isAuthorized()) {
            System.out.println("[PROXY] Error: Unauthorized Gateway Access. Token invalid.");
            return false;
        }

        System.out.println("[PROXY] Authorization verified. Forwarding to " + realProcessor.getGatewayName());
        boolean result = realProcessor.process(amount);

        System.out.println("[PROXY] Audit Log: Transaction status: " + (result ? "SUCCESS" : "FAILED"));
        return result;
    }

    @Override
    public String getGatewayName() {
        return "Secured Proxy [" + realProcessor.getGatewayName() + "]";
    }

    @Override
    public boolean validate() {
        return realProcessor.validate();
    }

    public static void main(String[] args) {
        PaymentProcessor realCard = new CreditCardProcessor("4444555566667777", "05/32", "555");

        // Unauthorized attempt
        System.out.println("--- Unauthorized Attempt ---");
        PaymentProcessor unauthorizedProxy = new PaymentGatewayProxy(realCard, "WRONG-TOKEN");
        unauthorizedProxy.process(100.00);

        System.out.println("\n--- Authorized Attempt ---");
        // Authorized attempt
        PaymentProcessor authorizedProxy = new PaymentGatewayProxy(realCard, "SECURE-TOKEN-123");
        authorizedProxy.process(100.00);
    }
}
