/**
 * Base interface for all payment processors in the Payment Gateway system.
 */
public interface PaymentProcessor {
    /**
     * Processes a payment of a specific amount.
     * 
     * @param amount The amount to process.
     * @return true if successful, false otherwise.
     */
    boolean process(double amount);

    /**
     * Returns the name of the payment gateway/method.
     * 
     * @return String representation of the gateway.
     */
    String getGatewayName();

    /**
     * Validates the transaction details before processing.
     * 
     * @return true if valid.
     */
    boolean validate();
}
