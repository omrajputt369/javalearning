/**
 * Concrete implementation of a smart smoke alarm.
 */
public class SmokeAlarmSim extends BaseSmartDevice {
    private boolean isAlarmActive;
    private int batteryPercentage;

    public SmokeAlarmSim(String name) {
        super(name);
        this.isAlarmActive = false;
        this.batteryPercentage = 100;
    }

    public void testAlarm() {
        if (isOn) {
            System.out.println("Testing " + deviceName + " speaker... BEEP! BEEP! BEEP!");
        }
    }

    public void triggerAlarm() {
        if (isOn) {
            this.isAlarmActive = true;
            System.out.println("CRITICAL: " + deviceName + " DETECTED SMOKE! Alarms sounding!");
        }
    }

    public void silenceAlarm() {
        this.isAlarmActive = false;
        System.out.println(deviceName + " silenced.");
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ON" : "OFF") +
                " | Alarm State: " + (isAlarmActive ? "ACTIVE!!!" : "NORMAL") +
                " | Battery: " + batteryPercentage + "%";
    }

    public static void main(String[] args) {
        SmokeAlarmSim kitchenAlarm = new SmokeAlarmSim("Kitchen Smoke Alarm");
        kitchenAlarm.turnOn();
        kitchenAlarm.testAlarm();

        System.out.println(kitchenAlarm.getDeviceStatus());
        kitchenAlarm.triggerAlarm();
        System.out.println(kitchenAlarm.getDeviceStatus());

        kitchenAlarm.silenceAlarm();
    }
}
