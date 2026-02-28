import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of a developer with technical skill tracking and bug
 * management.
 */
public class Developer implements EmployeeInterface {
    private String id;
    private String name;
    private double monthlySalary;
    private List<String> techStack;
    private int bugsResolved;

    public Developer(String id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.techStack = new ArrayList<>();
        this.bugsResolved = 0;
    }

    public void addSkill(String skill) {
        techStack.add(skill);
    }

    public void resolveBug() {
        bugsResolved++;
        System.out.println("Bug resolved by " + name + ". Total resolved: " + bugsResolved);
    }

    @Override
    public double calculatePay() {
        return monthlySalary + (bugsResolved * 50.0); // Fix-it bonus
    }

    @Override
    public String getDetails() {
        return "Developer [ID=" + id + ", Name=" + name + ", Tech=" + techStack + ", Salary=$" + monthlySalary + "]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is writing code and performing code reviews.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        Developer dev = new Developer("DEV-001", "Mike Coder", 7000.0);
        dev.addSkill("Java");
        dev.addSkill("Spring Boot");
        dev.resolveBug();
        dev.resolveBug();
        System.out.println(dev.getDetails());
        System.out.println("Total Monthly Pay: $" + dev.calculatePay());
        dev.performDuty();
    }
}
