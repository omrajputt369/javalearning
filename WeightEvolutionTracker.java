import java.util.ArrayList;
import java.util.List;

/**
 * Historical logging of body weight trends.
 */
public class WeightEvolutionTracker implements HealthInterface {
    private List<Double> weightHistory;
    private double startWeight;

    @Override
    public void initializeComponent() {
        weightHistory = new ArrayList<>();
        System.out.println("Weight Evolution Tracker Initialized.");
    }

    public void setStartWeight(double weight) {
        this.startWeight = weight;
        weightHistory.add(weight);
    }

    @Override
    public void updateData(double newWeight) {
        weightHistory.add(newWeight);
        System.out.println("Logged weight: " + newWeight + " kg");
    }

    @Override
    public String getStatus() {
        if (weightHistory.size() < 2)
            return "Not enough data for trend analysis.";

        double current = weightHistory.get(weightHistory.size() - 1);
        double diff = current - startWeight;
        String trend = diff < 0 ? "Loss" : (diff > 0 ? "Gain" : "Stable");

        return String.format(
                "Start: %.1f kg | Current: %.1f kg | Trend: %s (%.1f kg)",
                startWeight, current, trend, Math.abs(diff));
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        WeightEvolutionTracker tracker = new WeightEvolutionTracker();
        tracker.initializeComponent();

        tracker.setStartWeight(85.0);
        tracker.updateData(84.5);
        tracker.updateData(83.8);
        tracker.updateData(84.0);

        System.out.println(tracker.getStatus());
    }
}
