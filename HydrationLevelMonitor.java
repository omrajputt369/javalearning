/**
 * Dynamic hydration requirement calculation based on activity and temperature.
 */
public class HydrationLevelMonitor implements HealthInterface {
    private double bodyWeight; // kg
    private double activityHours;
    private double temperature; // Celsius
    private double baseRequirement;

    public HydrationLevelMonitor(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    @Override
    public void initializeComponent() {
        this.activityHours = 0;
        this.temperature = 22; // Default room temp
        calculateRequirement();
        System.out.println("Hydration Level Monitor Initialized.");
    }

    private void calculateRequirement() {
        // Base: 35ml per kg of body weight
        baseRequirement = (bodyWeight * 0.035);
        // Add 0.5L for every hour of activity
        baseRequirement += (activityHours * 0.5);
        // Add 0.1L for every degree above 25C
        if (temperature > 25) {
            baseRequirement += (temperature - 25) * 0.1;
        }
    }

    @Override
    public void updateData(double value) {
        // Assume updateData(double hours) updates activity hours
        this.activityHours = value;
        calculateRequirement();
        System.out.println("Activity hours updated to " + activityHours + ". Requirement recalculated.");
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        calculateRequirement();
    }

    @Override
    public String getStatus() {
        return String.format(
                "Weight: %.1f kg | Activity: %.1f hrs | Temp: %.1fC | Daily Water Need: %.2f L",
                bodyWeight, activityHours, temperature, baseRequirement);
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        HydrationLevelMonitor monitor = new HydrationLevelMonitor(75);
        monitor.initializeComponent();
        System.out.println(monitor.getStatus());

        System.out.println("\n--- Hot Sunny Day Workout ---");
        monitor.setTemperature(32);
        monitor.updateData(2.0); // 2 hours workout
        System.out.println(monitor.getStatus());
    }
}
