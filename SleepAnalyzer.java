/**
 * Simple analysis of sleep duration and quality metrics.
 */
public class SleepAnalyzer implements HealthInterface {
    private double totalHours;
    private int qualityScore; // 1-10

    @Override
    public void initializeComponent() {
        this.totalHours = 0;
        this.qualityScore = 0;
        System.out.println("Sleep Analyzer Initialized.");
    }

    @Override
    public void updateData(double sleepHours) {
        this.totalHours = sleepHours;
        // Simple heuristic for quality if not provided, usually set via specific method
        if (this.qualityScore == 0) {
            this.qualityScore = sleepHours >= 7 ? 8 : (sleepHours >= 5 ? 5 : 2);
        }
        System.out.printf("Logged %.1f hours of sleep.\n", totalHours);
    }

    public void setQualityScore(int score) {
        this.qualityScore = score;
    }

    @Override
    public String getStatus() {
        String recommendation;
        if (totalHours < 6)
            recommendation = "Priority: Increase sleep duration.";
        else if (qualityScore < 5)
            recommendation = "Priority: Improve sleep environment/hygiene.";
        else
            recommendation = "Sleep metrics are healthy.";

        return String.format(
                "Sleep Duration: %.1f hrs | Quality Score: %d/10 | Evaluation: %s",
                totalHours, qualityScore, recommendation);
    }

    @Override
    public void reset() {
        this.totalHours = 0;
        this.qualityScore = 0;
    }

    public static void main(String[] args) {
        SleepAnalyzer analyzer = new SleepAnalyzer();
        analyzer.initializeComponent();

        analyzer.updateData(5.5);
        analyzer.setQualityScore(4);
        System.out.println(analyzer.getStatus());

        System.out.println("\nNext Day:");
        analyzer.updateData(8.0);
        analyzer.setQualityScore(9);
        System.out.println(analyzer.getStatus());
    }
}
