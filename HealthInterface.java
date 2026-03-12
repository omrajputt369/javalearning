/**
 * Base interface for all health tracking components in the Fitness System.
 */
public interface HealthInterface {
    /**
     * Initializes the health component with necessary user data.
     */
    void initializeComponent();

    /**
     * Updates the component with new data points.
     * 
     * @param value The value to update (e.g., weight, steps, calories).
     */
    void updateData(double value);

    /**
     * Retrieves the current status or result from the component.
     * 
     * @return A formatted status string.
     */
    String getStatus();

    /**
     * Resets the component data for a new tracking period (e.g., daily reset).
     */
    void reset();
}
