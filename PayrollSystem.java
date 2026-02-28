import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of a centralized payroll system for batch processing of
 * employee payments.
 */
public class PayrollSystem {
    private List<EmployeeInterface> employees;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(EmployeeInterface emp) {
        employees.add(emp);
    }

    public void processPayroll() {
        System.out.println("\n--- Processing Monthly Payroll ---");
        double totalPayout = 0;
        for (EmployeeInterface emp : employees) {
            double pay = emp.calculatePay();
            totalPayout += pay;
            System.out.println("Processing pay for " + emp.getDetails());
            System.out.printf("   Pay Amount: $%.2f\n", pay);
        }
        System.out.println("----------------------------------");
        System.out.printf("Total Payroll Payout: $%.2f\n", totalPayout);
    }

    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        // polymorphic behavior
        payroll.addEmployee(new FullTimeEmployee("FT-101", "Emma Watson", 6000.0));
        PartTimeEmployee pt = new PartTimeEmployee("PT-102", "Daniel Red", 30.0);
        pt.addHours(40);
        payroll.addEmployee(pt);
        payroll.addEmployee(new Contractor("CON-103", "Rupert Green", 7500.0, 12));
        payroll.addEmployee(new Intern("INT-104", "Tom Felton", 1000.0));

        payroll.processPayroll();
    }
}
