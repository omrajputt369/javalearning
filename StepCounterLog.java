/**
 * Record keeping for physical activity (steps/distance).
 */
public class StepCounterLog implements HealthInterface {
    private int currentSteps;
    private double currentDistance; // in km
    private int dailyGoal;
    private final double STRIDE_LENGTH = 0.000762; // Average stride in km (0.762m)

    public StepCounterLog(int dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    @Override
    public void initializeComponent() {
        this.currentSteps = 0;
        this.currentDistance = 0;
        System.out.println("Step Counter Initialized. Daily Goal: " + dailyGoal + " steps");
    }

    @Override
    public void updateData(double additionalSteps) {
        int steps = (int) additionalSteps;
        this.currentSteps += steps;
        this.currentDistance = this.currentSteps * STRIDE_LENGTH;
        System.out.printf("Added %d steps. Total today: %d steps (%.2f km)\n", steps, currentSteps, currentDistance);
    }

    @Override
    public String getStatus() {
        double progress = (double) currentSteps / dailyGoal * 100;
        String goalMet = currentSteps >= dailyGoal ? "GOAL REACHED!" : String.format("%.1f%% of goal", progress);

        return String.format(
                "Steps: %d | Distance: %.2f km | Goal: %d | Progress: %s",
                currentSteps, currentDistance, dailyGoal, goalMet);
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        StepCounterLog counter = new StepCounterLog(10000);
        counter.initializeComponent();

        System.out.println("--- Morning Walk ---");
        counter.updateData(3500);
        System.out.println(counter.getStatus());

        System.out.println("\n--- Evening Run ---");
        counter.updateData(7000);
        System.out.println(counter.getStatus());
    }
}
