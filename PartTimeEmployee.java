/**
 * Implementation of a part-time hourly employee with hour tracking.
 */
public class PartTimeEmployee implements EmployeeInterface {
    private String id;
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String id, String name, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;
    }

    public void addHours(double hours) {
        this.hoursWorked += hours;
        System.out.println("Added " + hours + " hours for " + name + ". Total: " + hoursWorked);
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getDetails() {
        return "Employee [ID=" + id + ", Name=" + name + ", Type=Part-Time, Rate=$" + hourlyRate + "/hr]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is fulfilling their part-time role duties.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        PartTimeEmployee emp = new PartTimeEmployee("PT-001", "Jane Doe", 25.0);
        emp.addHours(35.5);
        System.out.println(emp.getDetails());
        System.out.println("Total Periodic Pay: $" + emp.calculatePay());
        emp.performDuty();
    }
}
