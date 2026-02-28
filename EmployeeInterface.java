/**
 * Base interface for all employee types in the Employee Management System.
 */
public interface EmployeeInterface {
    /**
     * Calculates the periodic pay for the employee.
     * 
     * @return The calculated pay amount.
     */
    double calculatePay();

    /**
     * Returns a summary of the employee's details.
     * 
     * @return A string representation of employee details.
     */
    String getDetails();

    /**
     * Simulates the employee performing their primary job duty.
     */
    void performDuty();

    /**
     * Returns the unique employee ID.
     * 
     * @return The employee ID.
     */
    String getEmployeeId();
}
