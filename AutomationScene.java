import java.util.HashMap;
import java.util.Map;

/**
 * Defines a "scene" or preset state for multiple smart devices.
 */
public class AutomationScene extends BaseSmartDevice {
    private String sceneName;
    private Map<ISmartDevice, Boolean> deviceStates;

    public AutomationScene(String name) {
        super("Scene Controller");
        this.sceneName = name;
        this.deviceStates = new HashMap<>();
    }

    public void addDeviceState(ISmartDevice device, boolean turnOn) {
        deviceStates.put(device, turnOn);
    }

    public void activateScene() {
        if (isOn) {
            System.out.println("Activating Scene: " + sceneName);
            for (Map.Entry<ISmartDevice, Boolean> entry : deviceStates.entrySet()) {
                if (entry.getValue()) {
                    entry.getKey().turnOn();
                } else {
                    entry.getKey().turnOff();
                }
            }
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Scene: " + sceneName + " | Devices involved: " + deviceStates.size();
    }

    public static void main(String[] args) {
        AutomationScene movieNight = new AutomationScene("Movie Night");
        movieNight.turnOn();

        SmartLight livingRoom = new SmartLight("Living Room Light");
        SmartThermostat hvac = new SmartThermostat("HVAC");

        movieNight.addDeviceState(livingRoom, true); // On but usually dimmed via other logic
        movieNight.addDeviceState(hvac, true);

        movieNight.activateScene();
        System.out.println(movieNight.getDeviceStatus());
    }
}
