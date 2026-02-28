/**
 * Implementation of a manager with team oversight and performance bonuses.
 */
public class Manager implements EmployeeInterface {
    private String id;
    private String name;
    private double baseMonthlySalary;
    private int teamSize;
    private double performanceBonus = 1000.0;

    public Manager(String id, String name, double baseMonthlySalary, int teamSize) {
        this.id = id;
        this.name = name;
        this.baseMonthlySalary = baseMonthlySalary;
        this.teamSize = teamSize;
    }

    @Override
    public double calculatePay() {
        return baseMonthlySalary + performanceBonus;
    }

    @Override
    public String getDetails() {
        return "Manager [ID=" + id + ", Name=" + name + ", TeamSize=" + teamSize + ", BasePay=$" + baseMonthlySalary
                + "]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is conducting team meetings and overseeing project progress.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("MAN-001", "Sarah Chief", 8000.0, 10);
        System.out.println(manager.getDetails());
        System.out.println("Total Monthly Pay: $" + manager.calculatePay());
        manager.performDuty();
    }
}
