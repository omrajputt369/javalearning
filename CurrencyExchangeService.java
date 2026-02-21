import java.util.HashMap;
import java.util.Map;

/**
 * Simulates a currency exchange service with mock rates.
 */
public class CurrencyExchangeService {
    private Map<String, Double> rates = new HashMap<>();

    public CurrencyExchangeService() {
        // Mock rates relative to USD
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.79);
        rates.put("INR", 83.25);
        rates.put("JPY", 148.50);
    }

    /**
     * Converts an amount from USD to target currency.
     * 
     * @param usdAmount      Amount in USD.
     * @param targetCurrency The ISO code of the target currency.
     * @return Converted amount.
     */
    public double convertFromUSD(double usdAmount, String targetCurrency) {
        if (targetCurrency.equals("USD"))
            return usdAmount;

        double rate = rates.getOrDefault(targetCurrency, 1.0);
        double converted = usdAmount * rate;
        System.out.println("[FX] Converting $" + usdAmount + " USD to " + targetCurrency +
                " | Rate: " + rate + " | Result: " + converted);
        return converted;
    }

    public static void main(String[] args) {
        CurrencyExchangeService fx = new CurrencyExchangeService();

        fx.convertFromUSD(100.0, "EUR");
        fx.convertFromUSD(100.0, "INR");
        fx.convertFromUSD(100.0, "ABC"); // Unsupported
    }
}
