/**
 * Implementation of a retirement savings plan for tracking employee and
 * employer contributions.
 */
public class RetirementSavingsPlan {
    private double employeeContributionRate;
    private double employerMatchLimit;

    public RetirementSavingsPlan(double employeeContributionRate, double employerMatchLimit) {
        this.employeeContributionRate = employeeContributionRate;
        this.employerMatchLimit = employerMatchLimit;
    }

    public void calculateMonthlyContribution(String employeeName, double monthlySalary) {
        double employeeContrib = monthlySalary * employeeContributionRate;
        double employerContrib = Math.min(employeeContrib, monthlySalary * employerMatchLimit);

        System.out.println("\n--- Retirement Contribution for " + employeeName + " ---");
        System.out.printf("Monthly Salary: $%.2f\n", monthlySalary);
        System.out.printf("Employee Contribution (%.1f%%): $%.2f\n", employeeContributionRate * 100, employeeContrib);
        System.out.printf("Employer Match (up to %.1f%%): $%.2f\n", employerMatchLimit * 100, employerContrib);
        System.out.printf("Total Monthly Savings: $%.2f\n", employeeContrib + employerContrib);
    }

    public static void main(String[] args) {
        RetirementSavingsPlan planA = new RetirementSavingsPlan(0.06, 0.04); // 6% contrib, 4% match

        planA.calculateMonthlyContribution("Emma Watson", 6000.0);
        planA.calculateMonthlyContribution("Mike Coder", 10000.0);
    }
}
