import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of an insurance coverage service for defining health and life
 * insurance tiers.
 */
public class InsuranceCoverageService {
    private Map<String, String> healthTiers;
    private Map<String, Double> lifeCoverage;

    public InsuranceCoverageService() {
        healthTiers = new HashMap<>();
        lifeCoverage = new HashMap<>();

        // Tier 1: Exec/Manager
        healthTiers.put("Grade_A", "Platinum (100% Coverage)");
        lifeCoverage.put("Grade_A", 1000000.0);

        // Tier 2: Full-time / Senior
        healthTiers.put("Grade_B", "Gold (80% Coverage)");
        lifeCoverage.put("Grade_B", 500000.0);

        // Tier 3: Junior / Part-time
        healthTiers.put("Grade_C", "Silver (50% Coverage)");
        lifeCoverage.put("Grade_C", 100000.0);
    }

    public void displayInsurance(String employeeName, String grade) {
        System.out.println("\n--- Insurance Coverage for " + employeeName + " (" + grade + ") ---");
        if (healthTiers.containsKey(grade)) {
            System.out.println("Health Plan: " + healthTiers.get(grade));
            System.out.printf("Life Insurance Limit: $%.2f\n", lifeCoverage.get(grade));
        } else {
            System.out.println("No insurance profile found for this grade.");
        }
    }

    public static void main(String[] args) {
        InsuranceCoverageService service = new InsuranceCoverageService();

        service.displayInsurance("Sarah Chief", "Grade_A");
        service.displayInsurance("Mike Coder", "Grade_B");
        service.displayInsurance("Bob Junior", "Grade_C");
    }
}
