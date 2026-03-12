/**
 * Concrete implementation of a smart thermostat for temperature control.
 */
public class SmartThermostat extends BaseSmartDevice {
    private double currentTemperature;
    private double targetTemperature;
    private String mode; // Heating, Cooling, Eco, Off

    public SmartThermostat(String name) {
        super(name);
        this.currentTemperature = 22.0; // Celsius
        this.targetTemperature = 22.0;
        this.mode = "Off";
    }

    public void setTargetTemperature(double target) {
        if (isOn) {
            this.targetTemperature = target;
            System.out.println(deviceName + " target temperature set to " + target + "°C.");
        } else {
            System.out.println("Cannot set temperature, " + deviceName + " is OFF.");
        }
    }

    public void setMode(String mode) {
        if (isOn) {
            this.mode = mode;
            System.out.println(deviceName + " mode set to " + mode + ".");
        } else {
            System.out.println("Cannot set mode, " + deviceName + " is OFF.");
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ON" : "OFF") +
                " | Current Temp: " + currentTemperature + "°C" +
                " | Target Temp: " + targetTemperature + "°C" +
                " | Mode: " + mode;
    }

    public static void main(String[] args) {
        SmartThermostat bedroomStats = new SmartThermostat("Main Thermostat");
        System.out.println(bedroomStats.getDeviceStatus());

        bedroomStats.turnOn();
        bedroomStats.setMode("Heating");
        bedroomStats.setTargetTemperature(24.5);
        System.out.println(bedroomStats.getDeviceStatus());
    }
}
