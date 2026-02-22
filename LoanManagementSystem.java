/**
 * Handles loan eligibility checks and EMI calculations.
 */
public class LoanManagementSystem {

    /**
     * Calculates the Equated Monthly Installment (EMI).
     * 
     * @param principal    Principal loan amount.
     * @param annualRate   Annual interest rate (percentage).
     * @param tenureMonths Loan tenure in months.
     * @return Calculated EMI amount.
     */
    public double calculateEMI(double principal, double annualRate, int tenureMonths) {
        double monthlyRate = (annualRate / 12) / 100;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1);
        return emi;
    }

    /**
     * Checks if a customer is eligible for a loan based on credit score and monthly
     * income.
     * 
     * @param creditScore     Credit score (300-900).
     * @param monthlyIncome   Monthly income.
     * @param requestedAmount Requested loan amount.
     * @return true if eligible, false otherwise.
     */
    public boolean checkEligibility(int creditScore, double monthlyIncome, double requestedAmount) {
        if (creditScore < 700) {
            System.out.println("Eligibility Denied: Credit score too low (" + creditScore + ").");
            return false;
        }
        if (requestedAmount > (monthlyIncome * 50)) {
            System.out.println("Eligibility Denied: Requested amount exceeds income-to-loan ratio.");
            return false;
        }
        System.out.println("Eligibility Approved for amount: $" + requestedAmount);
        return true;
    }

    public static void main(String[] args) {
        LoanManagementSystem lms = new LoanManagementSystem();

        System.out.println("--- Loan Management Simulation ---");

        // EMI Calculation Example
        double princ = 500000;
        double rate = 8.5;
        int tenure = 60;
        double emi = lms.calculateEMI(princ, rate, tenure);

        System.out.printf("Loan Amount: $%.2f\n", princ);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Tenure: " + tenure + " months");
        System.out.printf("Predicted Monthly EMI: $%.2f\n", emi);

        System.out.println("\nChecking Eligibility...");
        lms.checkEligibility(750, 6000.0, 100000.0);
        lms.checkEligibility(650, 6000.0, 10000.0);
    }
}
