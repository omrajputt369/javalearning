import java.util.ArrayList;
import java.util.List;

/**
 * Orchestrates and displays all current health stats from different components.
 */
public class HealthSummaryDashboard implements HealthInterface {
    private List<HealthInterface> components;
    private String userName;

    public HealthSummaryDashboard(String userName) {
        this.userName = userName;
        this.components = new ArrayList<>();
    }

    public void registerComponent(HealthInterface component) {
        components.add(component);
    }

    @Override
    public void initializeComponent() {
        System.out.println("=== " + userName + "'s Health Dashboard Initialized ===");
        for (HealthInterface component : components) {
            component.initializeComponent();
        }
    }

    @Override
    public void updateData(double value) {
        // Broad update to all components (e.g., end of session)
        System.out.println("Processing daily data synchronization...");
    }

    @Override
    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n************************************\n");
        sb.append("   DAILY HEALTH SUMMARY: ").append(userName).append("\n");
        sb.append("************************************\n");

        for (HealthInterface component : components) {
            sb.append("\n> ").append(component.getClass().getSimpleName()).append(":\n");
            sb.append("  ").append(component.getStatus()).append("\n");
        }

        sb.append("\n************************************");
        return sb.toString();
    }

    @Override
    public void reset() {
        for (HealthInterface component : components) {
            component.reset();
        }
        System.out.println("All dashboard components reset.");
    }

    public static void main(String[] args) {
        HealthSummaryDashboard dashboard = new HealthSummaryDashboard("Om");

        // Set up some components
        UserFitnessProfile profile = new UserFitnessProfile();
        // Skip interactive setup for demo
        StepCounterLog steps = new StepCounterLog(10000);
        CalorieTracker calories = new CalorieTracker(2500);

        dashboard.registerComponent(profile);
        dashboard.registerComponent(steps);
        dashboard.registerComponent(calories);

        // Simulate activity
        steps.updateData(7500);
        calories.logFood("Breakfast", 450);

        System.out.println(dashboard.getStatus());
    }
}
