import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of a searchable employee directory for managing a collection
 * of employees.
 */
public class EmployeeDirectory {
    private List<EmployeeInterface> employeeList;

    public EmployeeDirectory() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(EmployeeInterface emp) {
        employeeList.add(emp);
    }

    public void searchById(String id) {
        System.out.println("Searching for employee ID: " + id);
        for (EmployeeInterface emp : employeeList) {
            if (emp.getEmployeeId().equalsIgnoreCase(id)) {
                System.out.println("Found: " + emp.getDetails());
                return;
            }
        }
        System.out.println("No employee found with ID: " + id);
    }

    public void displayAll() {
        System.out.println("\n--- Employee Directory Listing ---");
        for (EmployeeInterface emp : employeeList) {
            System.out.println(emp.getDetails());
        }
    }

    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new FullTimeEmployee("FT-201", "Emma Bright", 6000.0));
        directory.addEmployee(new Developer("DEV-202", "Linus Tech", 7500.0));
        directory.addEmployee(new Manager("MAN-203", "Gates Money", 9000.0, 5));

        directory.displayAll();

        System.out.println();
        directory.searchById("DEV-202");
        directory.searchById("FT-999");
    }
}
