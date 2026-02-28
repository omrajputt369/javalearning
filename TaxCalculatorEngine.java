/**
 * Implementation of a tax calculator engine for calculating income tax based on
 * salary slabs.
 */
public class TaxCalculatorEngine {

    public double calculateAnnualTax(double annualSalary) {
        double tax = 0;

        // Simplified tax slabs
        if (annualSalary <= 50000) {
            tax = annualSalary * 0.10; // 10%
        } else if (annualSalary <= 100000) {
            tax = (50000 * 0.10) + ((annualSalary - 50000) * 0.20); // 10% + 20%
        } else {
            tax = (50000 * 0.10) + (50000 * 0.20) + ((annualSalary - 100000) * 0.30); // 10% + 20% + 30%
        }

        return tax;
    }

    public void printTaxSummary(String employeeName, double annualSalary) {
        double totalTax = calculateAnnualTax(annualSalary);
        double netSalary = annualSalary - totalTax;

        System.out.println("\n--- Tax Summary for " + employeeName + " ---");
        System.out.printf("Gross Annual Salary: $%.2f\n", annualSalary);
        System.out.printf("Total Annual Tax:    $%.2f\n", totalTax);
        System.out.printf("Net Annual Salary:   $%.2f\n", netSalary);
        System.out.printf("Monthly Net Take-home: $%.2f\n", netSalary / 12.0);
    }

    public static void main(String[] args) {
        TaxCalculatorEngine engine = new TaxCalculatorEngine();

        engine.printTaxSummary("Emma Watson", 72000.0);
        engine.printTaxSummary("Mike Coder", 120000.0);
        engine.printTaxSummary("Jane Doe", 45000.0);
    }
}
