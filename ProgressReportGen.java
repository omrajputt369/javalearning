/**
 * Aggregation of health data into readable summaries.
 */
public class ProgressReportGen implements HealthInterface {
    private double totalSteps;
    private double totalCalories;
    private double avgSleep;
    private int activeDays;

    @Override
    public void initializeComponent() {
        this.totalSteps = 0;
        this.totalCalories = 0;
        this.avgSleep = 0;
        this.activeDays = 0;
        System.out.println("Progress Report Generator Initialized.");
    }

    public void addDailyStats(double steps, double calories, double sleep) {
        totalSteps += steps;
        totalCalories += calories;
        avgSleep = (avgSleep * activeDays + sleep) / (activeDays + 1);
        activeDays++;
    }

    @Override
    public void updateData(double value) {
        // value could represent weighted average factor
        System.out.println("Report weighting updated.");
    }

    @Override
    public String getStatus() {
        if (activeDays == 0)
            return "No data available for report.";

        return String.format(
                "--- Weekly Progress Report ---\n" +
                        "Active Days: %d\n" +
                        "Total Steps: %.0f (Avg: %.0f/day)\n" +
                        "Total Burned: %.0f kcal\n" +
                        "Avg Sleep: %.1f hrs/night\n" +
                        "Health Score: %d/100",
                activeDays, totalSteps, totalSteps / activeDays, totalCalories, avgSleep, calculateHealthScore());
    }

    private int calculateHealthScore() {
        double stepScore = Math.min(40, (totalSteps / activeDays / 10000) * 40);
        double sleepScore = Math.min(30, (avgSleep / 8) * 30);
        return (int) (stepScore + sleepScore + 30); // Base 30
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        ProgressReportGen gen = new ProgressReportGen();
        gen.initializeComponent();

        gen.addDailyStats(8500, 400, 7.5);
        gen.addDailyStats(10200, 550, 8.2);
        gen.addDailyStats(6000, 200, 6.0);

        System.out.println(gen.getStatus());
    }
}
