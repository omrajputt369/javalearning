/**
 * Implementation of a contract-based employee with milestone tracking.
 */
public class Contractor implements EmployeeInterface {
    private String id;
    private String name;
    private double monthlyContractPay;
    private int durationMonths;
    private int completedMilestones;

    public Contractor(String id, String name, double monthlyContractPay, int durationMonths) {
        this.id = id;
        this.name = name;
        this.monthlyContractPay = monthlyContractPay;
        this.durationMonths = durationMonths;
        this.completedMilestones = 0;
    }

    public void completeMilestone() {
        completedMilestones++;
        System.out.println("Milestone completed by " + name + ". Total: " + completedMilestones);
    }

    @Override
    public double calculatePay() {
        // Base monthly contract pay
        return monthlyContractPay;
    }

    @Override
    public String getDetails() {
        return "Contractor [ID=" + id + ", Name=" + name + ", Duration=" + durationMonths + "mo, Pay=$"
                + monthlyContractPay + "/mo]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is working on project deliverables under contract.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        Contractor emp = new Contractor("CON-001", "Alice Wonder", 6000.0, 6);
        emp.completeMilestone();
        System.out.println(emp.getDetails());
        System.out.println("Monthly Payment: $" + emp.calculatePay());
        emp.performDuty();
    }
}
