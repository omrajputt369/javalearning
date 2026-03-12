/**
 * Classification of physical activity intensity for calorie adjustment.
 */
public class ActivityLevelScale implements HealthInterface {
    private String level;
    private double multiplier;

    @Override
    public void initializeComponent() {
        this.level = "Sedentary";
        this.multiplier = 1.2;
        System.out.println("Activity Level Scale Initialized.");
    }

    @Override
    public void updateData(double multiplier) {
        this.multiplier = multiplier;
        updateLevelByMultiplier();
        System.out.println("Activity multiplier updated to: " + multiplier);
    }

    private void updateLevelByMultiplier() {
        if (multiplier <= 1.2)
            level = "Sedentary";
        else if (multiplier <= 1.375)
            level = "Lightly Active";
        else if (multiplier <= 1.55)
            level = "Moderately Active";
        else if (multiplier <= 1.725)
            level = "Very Active";
        else
            level = "Extra Active";
    }

    public double getAdjustedCalories(double bmr) {
        return bmr * multiplier;
    }

    @Override
    public String getStatus() {
        return String.format("Current Activity Level: %s (Multiplier: %.3f)", level, multiplier);
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        ActivityLevelScale scale = new ActivityLevelScale();
        scale.initializeComponent();
        System.out.println(scale.getStatus());

        scale.updateData(1.55); // Moderate activity
        System.out.println(scale.getStatus());
        System.out.println("TDEE for 2000 BMR: " + scale.getAdjustedCalories(2000));
    }
}
