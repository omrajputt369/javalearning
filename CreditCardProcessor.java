/**
 * Concrete implementation of PaymentProcessor for Credit Card transactions.
 */
public class CreditCardProcessor implements PaymentProcessor {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardProcessor(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean process(double amount) {
        if (validate()) {
            System.out.println("Processing Credit Card payment of $" + amount);
            System.out.println("Transaction Successful using card: **** **** **** " +
                    cardNumber.substring(cardNumber.length() - 4));
            return true;
        }
        System.out.println("Transaction Failed: Invalid Card Details.");
        return false;
    }

    @Override
    public String getGatewayName() {
        return "Visa/MasterCard Secure Gateway";
    }

    @Override
    public boolean validate() {
        // Simple validation logic
        return cardNumber != null && cardNumber.length() == 16 &&
                expiryDate != null && expiryDate.contains("/") &&
                cvv != null && cvv.length() == 3;
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new CreditCardProcessor("1234567890123456", "12/28", "123");
        processor.process(250.75);
    }
}
