/**
 * Concrete implementation of a smart light device.
 */
public class SmartLight extends BaseSmartDevice {
    private int brightness; // 0-100
    private String color;

    public SmartLight(String name) {
        super(name);
        this.brightness = 0;
        this.color = "Warm White";
    }

    public void setBrightness(int brightness) {
        if (isOn) {
            this.brightness = Math.max(0, Math.min(100, brightness));
            System.out.println(deviceName + " brightness set to " + this.brightness + "%.");
        } else {
            System.out.println("Cannot adjust brightness, " + deviceName + " is OFF.");
        }
    }

    public void setColor(String color) {
        if (isOn) {
            this.color = color;
            System.out.println(deviceName + " color set to " + color + ".");
        } else {
            System.out.println("Cannot change color, " + deviceName + " is OFF.");
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Status: " + (isOn ? "ON" : "OFF") +
                " | Brightness: " + brightness + "%" +
                " | Color: " + color;
    }

    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Living Room Light");
        System.out.println(livingRoomLight.getDeviceStatus());

        livingRoomLight.turnOn();
        livingRoomLight.setBrightness(75);
        livingRoomLight.setColor("Cyan");
        System.out.println(livingRoomLight.getDeviceStatus());

        livingRoomLight.turnOff();
    }
}
