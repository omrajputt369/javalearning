import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of a bonus calculation logger for tracking performance-based
 * incentives.
 */
public class BonusCalculationLog {
    private List<String> bonusHistory;

    public BonusCalculationLog() {
        this.bonusHistory = new ArrayList<>();
    }

    public void calculateAndLogBonus(String employeeId, double baseSalary, double performanceRating) {
        double bonus = 0;
        if (performanceRating >= 4.5) {
            bonus = baseSalary * 0.15; // 15%
        } else if (performanceRating >= 3.5) {
            bonus = baseSalary * 0.08; // 8%
        } else if (performanceRating >= 2.5) {
            bonus = baseSalary * 0.03; // 3%
        }

        String entry = String.format("Employee: %s | Rating: %.1f | Bonus: $%.2f", employeeId, performanceRating,
                bonus);
        bonusHistory.add(entry);
        System.out.println("Bonus logged: " + entry);
    }

    public void displayLogs() {
        System.out.println("\n--- Bonus Calculation History ---");
        for (String log : bonusHistory) {
            System.out.println(log);
        }
    }

    public static void main(String[] args) {
        BonusCalculationLog logger = new BonusCalculationLog();

        logger.calculateAndLogBonus("FT-101", 60000.0, 4.7);
        logger.calculateAndLogBonus("DEV-001", 75000.0, 3.8);
        logger.calculateAndLogBonus("PT-102", 30000.0, 2.9);

        logger.displayLogs();
    }
}
