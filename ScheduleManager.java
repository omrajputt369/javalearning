import java.util.HashMap;
import java.util.Map;

/**
 * Manages automation schedules for smart devices.
 */
public class ScheduleManager extends BaseSmartDevice {
    private Map<String, String> schedules; // Device Name -> Schedule Time

    public ScheduleManager(String name) {
        super(name);
        this.schedules = new HashMap<>();
    }

    public void setSchedule(ISmartDevice device, String time) {
        if (isOn) {
            schedules.put(device.getDeviceName(), time);
            System.out.println("Schedule set for '" + device.getDeviceName() + "' at " + time);
        }
    }

    public void runSchedules() {
        if (isOn) {
            System.out.println("[" + deviceName + "] Executing scheduled tasks...");
            for (String device : schedules.keySet()) {
                System.out.println("  Triggering '" + device + "' task at " + schedules.get(device));
            }
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "RUNNING" : "STOPPED") +
                " | active Schedules: " + schedules.size();
    }

    public static void main(String[] args) {
        ScheduleManager scheduler = new ScheduleManager("HomeScheduler");
        scheduler.turnOn();

        SmartLight porchLight = new SmartLight("Porch Light");
        scheduler.setSchedule(porchLight, "20:00");

        scheduler.runSchedules();
        System.out.println(scheduler.getDeviceStatus());
    }
}
