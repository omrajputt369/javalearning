/**
 * Implementation of a full-time salaried employee with benefits.
 */
public class FullTimeEmployee implements EmployeeInterface {
    private String id;
    private String name;
    private double monthlySalary;
    private double benefitsMultiplier = 0.2; // 20% benefits

    public FullTimeEmployee(String id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary + (monthlySalary * benefitsMultiplier);
    }

    @Override
    public String getDetails() {
        return "Employee [ID=" + id + ", Name=" + name + ", Type=Full-Time, Salary=$" + monthlySalary + "]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is fulfilling their full-time role responsibilities.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("FT-001", "John Smith", 5000.0);
        System.out.println(emp.getDetails());
        System.out.println("Total Monthly Pay (including benefits): $" + emp.calculatePay());
        emp.performDuty();
    }
}
