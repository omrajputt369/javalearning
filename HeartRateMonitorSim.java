/**
 * Simulation of heart rate tracking across training zones.
 */
public class HeartRateMonitorSim implements HealthInterface {
    private int currentHeartRate;
    private int maxHeartRate;

    public HeartRateMonitorSim(int age) {
        this.maxHeartRate = 220 - age;
    }

    @Override
    public void initializeComponent() {
        this.currentHeartRate = 70; // Resting average
        System.out.println("Heart Rate Monitor initialized. Max HR: " + maxHeartRate + " bpm");
    }

    @Override
    public void updateData(double heartRate) {
        this.currentHeartRate = (int) heartRate;
        System.out.println("Current Heart Rate: " + currentHeartRate + " bpm");
    }

    @Override
    public String getStatus() {
        double percentage = (double) currentHeartRate / maxHeartRate * 100;
        String zone;
        if (percentage < 50)
            zone = "Resting/Light";
        else if (percentage < 60)
            zone = "Fat Burn";
        else if (percentage < 70)
            zone = "Aerobic/Cardio";
        else if (percentage < 85)
            zone = "Anaerobic";
        else
            zone = "MAX EFFORT / VO2 MAX";

        return String.format(
                "HR: %d bpm | Max: %d | Intensity: %.1f%% | Zone: %s",
                currentHeartRate, maxHeartRate, percentage, zone);
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        HeartRateMonitorSim monitor = new HeartRateMonitorSim(25);
        monitor.initializeComponent();

        System.out.println("--- Starting Jog ---");
        monitor.updateData(135);
        System.out.println(monitor.getStatus());

        System.out.println("\n--- Sprinting ---");
        monitor.updateData(185);
        System.out.println(monitor.getStatus());
    }
}
