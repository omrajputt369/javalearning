/**
 * Monitors and logs network connectivity statistics for the smart home mesh.
 */
public class ConnectivityStats extends BaseSmartDevice {
    private int signalStrength; // 0-100
    private double latencyMs;
    private String networkType;

    public ConnectivityStats(String name) {
        super(name);
        this.signalStrength = 85;
        this.latencyMs = 24.5;
        this.networkType = "Mesh Wi-Fi 6";
    }

    public void runDiagnostics() {
        if (isOn) {
            System.out.println(deviceName + " running network diagnostics...");
            this.latencyMs = 20.0 + (Math.random() * 10.0);
            System.out.println("Ping: " + String.format("%.2f", latencyMs) + " ms | Signal: " + signalStrength + "%");
        }
    }

    public void setNetworkType(String type) {
        this.networkType = type;
        System.out.println(deviceName + " network type switched to " + type);
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "CONNECTED" : "OFFLINE") +
                " | Signal: " + signalStrength + "%" +
                " | Latency: " + String.format("%.2f", latencyMs) + " ms" +
                " | Type: " + networkType;
    }

    public static void main(String[] args) {
        ConnectivityStats networkSvc = new ConnectivityStats("Core Connectivity");
        networkSvc.turnOn();

        System.out.println(networkSvc.getDeviceStatus());
        networkSvc.runDiagnostics();

        System.out.println(networkSvc.getDeviceStatus());
    }
}
