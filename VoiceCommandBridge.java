/**
 * Bridge for processing voice commands and mapping them to device actions.
 */
public class VoiceCommandBridge extends BaseSmartDevice {
    private String assistantName;

    public VoiceCommandBridge(String name, String assistantName) {
        super(name);
        this.assistantName = assistantName;
    }

    public void processCommand(String command, ISmartDevice target) {
        if (isOn) {
            System.out.println(
                    "[" + assistantName + "] Processing command: '" + command + "' for " + target.getDeviceName());
            if (command.toLowerCase().contains("on")) {
                target.turnOn();
            } else if (command.toLowerCase().contains("off")) {
                target.turnOff();
            } else {
                System.out.println("[" + assistantName + "] Unknown command: " + command);
            }
        }
    }

    @Override
    public String getDeviceStatus() {
        return "Assistant: " + assistantName + " | Status: " + (isOn ? "LISTENING" : "OFF");
    }

    public static void main(String[] args) {
        VoiceCommandBridge alexa = new VoiceCommandBridge("SmartBridge", "Alexa");
        alexa.turnOn();

        SmartLight loungeLight = new SmartLight("Lounge Light");
        alexa.processCommand("Turn the Lounge Light on", loungeLight);

        System.out.println(alexa.getDeviceStatus());
        alexa.processCommand("Switch off the light", loungeLight);
    }
}
