/**
 * Implementation of a salesperson with target and commission logic.
 */
public class Salesperson implements EmployeeInterface {
    private String id;
    private String name;
    private double baseSalary;
    private double totalSales;
    private double commissionRate = 0.05; // 5%

    public Salesperson(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.totalSales = 0;
    }

    public void recordSale(double amount) {
        this.totalSales += amount;
        System.out.println("Sale of $" + amount + " recorded for " + name + ". Total sales: $" + totalSales);
    }

    @Override
    public double calculatePay() {
        return baseSalary + (totalSales * commissionRate);
    }

    @Override
    public String getDetails() {
        return "Salesperson [ID=" + id + ", Name=" + name + ", Sales=$" + totalSales + ", Base=$" + baseSalary + "]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is meeting with clients and closing deals.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        Salesperson sales = new Salesperson("SAL-001", "Emma Sell", 3000.0);
        sales.recordSale(50000.0);
        System.out.println(sales.getDetails());
        System.out.println("Total Periodic Pay: $" + sales.calculatePay());
        sales.performDuty();
    }
}
