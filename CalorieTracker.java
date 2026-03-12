import java.util.HashMap;
import java.util.Map;

/**
 * Logic for logging and calculating net calories.
 */
public class CalorieTracker implements HealthInterface {
    private double currentIntake;
    private double currentBurned;
    private double maintenanceLimit;
    private Map<String, Double> foodLog;

    public CalorieTracker(double maintenanceLimit) {
        this.maintenanceLimit = maintenanceLimit;
        this.foodLog = new HashMap<>();
    }

    @Override
    public void initializeComponent() {
        this.currentIntake = 0;
        this.currentBurned = 0;
        this.foodLog.clear();
        System.out.println("Calorie Tracker Initialized with limit: " + maintenanceLimit + " kcal");
    }

    public void logFood(String foodItem, double calories) {
        foodLog.put(foodItem, foodLog.getOrDefault(foodItem, 0.0) + calories);
        currentIntake += calories;
        System.out.printf("Logged %s: %.1f kcal. Total Intake: %.1f kcal\n", foodItem, calories, currentIntake);
    }

    @Override
    public void updateData(double caloriesBurned) {
        this.currentBurned += caloriesBurned;
        System.out.printf("Burned %.1f kcal. Total Burned today: %.1f kcal\n", caloriesBurned, currentBurned);
    }

    @Override
    public String getStatus() {
        double netCalories = currentIntake - currentBurned;
        double remaining = maintenanceLimit - netCalories;
        String status = netCalories > maintenanceLimit ? "SURPLUS" : "DEFICIT";

        return String.format(
                "Net: %.1f kcal (%s) | Intake: %.1f | Burned: %.1f | Limit: %.1f | Remaining: %.1f",
                netCalories, status, currentIntake, currentBurned, maintenanceLimit, remaining);
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        CalorieTracker tracker = new CalorieTracker(2500);
        tracker.initializeComponent();

        tracker.logFood("Oatmeal", 350);
        tracker.logFood("Chicken Salad", 450);
        tracker.updateData(300); // 30 mins workout

        System.out.println(tracker.getStatus());

        tracker.logFood("Pizza Slice", 600);
        tracker.updateData(500); // Running

        System.out.println(tracker.getStatus());
    }
}
