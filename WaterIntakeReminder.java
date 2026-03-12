/**
 * Hydration goal tracking and alerts.
 */
public class WaterIntakeReminder implements HealthInterface {
    private double currentIntake; // in liters
    private double dailyGoal; // in liters
    private static final double CUP_SIZE = 0.25; // 250ml

    public WaterIntakeReminder(double dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    @Override
    public void initializeComponent() {
        this.currentIntake = 0;
        System.out.println("Hydration Tracker Initialized. Daily Goal: " + dailyGoal + "L");
    }

    public void drinkCup() {
        updateData(CUP_SIZE);
    }

    @Override
    public void updateData(double liters) {
        this.currentIntake += liters;
        System.out.printf("Drank %.2fL. Total Intake: %.2fL\n", liters, currentIntake);
    }

    @Override
    public String getStatus() {
        double remaining = dailyGoal - currentIntake;
        String alert = remaining <= 0 ? "STAY HYDRATED - Goal Met! ✨"
                : String.format("Need %.2fL more to reach goal.", remaining);

        return String.format(
                "Intake: %.2fL / %.2fL | %s",
                currentIntake, dailyGoal, alert);
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        WaterIntakeReminder reminder = new WaterIntakeReminder(3.0);
        reminder.initializeComponent();

        reminder.drinkCup();
        reminder.drinkCup();
        reminder.updateData(1.0); // Large bottle

        System.out.println(reminder.getStatus());

        reminder.updateData(1.5);
        System.out.println(reminder.getStatus());
    }
}
