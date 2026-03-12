/**
 * Logic for optimizing energy consumption in the smart home.
 */
public class EnergyOptimizer extends BaseSmartDevice {
    private double currentUsageKW;
    private double dailyThreshold;

    public EnergyOptimizer(String name) {
        super(name);
        this.currentUsageKW = 0.0;
        this.dailyThreshold = 15.0; // 15 kWh limit
    }

    public void updateUsage(double consumption) {
        if (isOn) {
            this.currentUsageKW += consumption;
            System.out.println(deviceName + " recorded consumption of " + consumption + " kWh.");
            checkThreshold();
        }
    }

    private void checkThreshold() {
        if (currentUsageKW > dailyThreshold) {
            System.out.println(
                    "ALERT: Energy usage (" + currentUsageKW + " kWh) exceeds threshold (" + dailyThreshold + " kWh)!");
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "MONITORING" : "OFFLINE") +
                " | Total Usage Today: " + String.format("%.2f", currentUsageKW) + " kWh" +
                " | Limit: " + dailyThreshold + " kWh";
    }

    public static void main(String[] args) {
        EnergyOptimizer powerMonitor = new EnergyOptimizer("EcoMonitor");
        powerMonitor.turnOn();

        powerMonitor.updateUsage(5.2);
        powerMonitor.updateUsage(10.5);

        System.out.println(powerMonitor.getDeviceStatus());
    }
}
