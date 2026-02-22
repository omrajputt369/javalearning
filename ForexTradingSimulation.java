import java.util.HashMap;
import java.util.Map;

/**
 * Simulates a Foreign Exchange (Forex) trading desk within a bank.
 */
public class ForexTradingSimulation {
    private Map<String, Double> exchangeRates = new HashMap<>();

    public ForexTradingSimulation() {
        // Mock rates (1 Unit of Currency X to USD)
        exchangeRates.put("EUR", 1.08); // 1 EUR = 1.08 USD
        exchangeRates.put("GBP", 1.26); // 1 GBP = 1.26 USD
        exchangeRates.put("JPY", 0.0067); // 1 JPY = 0.0067 USD
        exchangeRates.put("INR", 0.012); // 1 INR = 0.012 USD
    }

    /**
     * Converts an amount from a specified currency to USD based on current rates.
     */
    public void buyCurrency(String currencyCode, double units) {
        if (exchangeRates.containsKey(currencyCode)) {
            double rate = exchangeRates.get(currencyCode);
            double totalCostUsd = units * rate;
            System.out.println("[TRADE] Buying " + units + " " + currencyCode);
            System.out.printf("[TRADE] Total Cost in USD: $%.2f\n", totalCostUsd);
            System.out.println("Status: Trade Completed Successfully.");
        } else {
            System.out.println("[TRADE] Error: Currency code " + currencyCode + " not supported.");
        }
    }

    public void displayCurrentRates() {
        System.out.println("\n--- LIVE FOREX RATES (Base: USD) ---");
        System.out.printf("%-10s | %-10s\n", "Currency", "Rate (USD)");
        exchangeRates.forEach((code, rate) -> System.out.printf("%-10s | %-10.4f\n", code, rate));
        System.out.println("------------------------------------\n");
    }

    public static void main(String[] args) {
        ForexTradingSimulation forex = new ForexTradingSimulation();

        System.out.println("--- Bank Forex Trading Simulation ---");
        forex.displayCurrentRates();

        forex.buyCurrency("EUR", 500.0);
        forex.buyCurrency("INR", 10000.0);
        forex.buyCurrency("BIT", 1.0); // Fail case
    }
}
