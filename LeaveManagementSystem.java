import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of a leave management system for tracking employee leave
 * balances and applications.
 */
public class LeaveManagementSystem {
    private Map<String, Integer> leaveBalances;

    public LeaveManagementSystem() {
        this.leaveBalances = new HashMap<>();
    }

    public void initializeEmployee(String employeeId, int totalLeaves) {
        leaveBalances.put(employeeId, totalLeaves);
    }

    public boolean applyLeave(String employeeId, int days) {
        int currentBalance = leaveBalances.getOrDefault(employeeId, 0);
        if (days > 0 && currentBalance >= days) {
            leaveBalances.put(employeeId, currentBalance - days);
            System.out.println(
                    "Leave approved for " + employeeId + ". Days: " + days + ". Remaining: " + (currentBalance - days));
            return true;
        } else {
            System.out.println("Leave denied for " + employeeId + ". Insufficient balance or invalid days.");
            return false;
        }
    }

    public void displayBalance(String employeeId) {
        System.out.println(
                "Employee " + employeeId + " Leave Balance: " + leaveBalances.getOrDefault(employeeId, 0) + " days.");
    }

    public static void main(String[] args) {
        LeaveManagementSystem lms = new LeaveManagementSystem();

        lms.initializeEmployee("FT-101", 20);
        lms.initializeEmployee("DEV-001", 15);

        lms.displayBalance("FT-101");
        lms.applyLeave("FT-101", 3);
        lms.displayBalance("FT-101");

        lms.applyLeave("DEV-001", 20); // Should fail
        lms.displayBalance("DEV-001");
    }
}
