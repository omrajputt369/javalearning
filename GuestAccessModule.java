/**
 * Manages temporary guest access for the smart home security system.
 */
public class GuestAccessModule extends BaseSmartDevice {
    private String currentGuestName;
    private String expiryTime;

    public GuestAccessModule(String name) {
        super(name);
        this.currentGuestName = "None";
    }

    public void grantAccess(String guestName, String timeLimit) {
        if (isOn) {
            this.currentGuestName = guestName;
            this.expiryTime = timeLimit;
            System.out.println("Access GRANTED to guest: " + guestName + " until " + timeLimit);
        }
    }

    public void revokeAccess() {
        System.out.println("Access REVOKED for guest: " + currentGuestName);
        this.currentGuestName = "None";
        this.expiryTime = null;
    }

    @Override
    public String getDeviceStatus() {
        return "System: " + (isOn ? "READY" : "OFF") +
                " | Current Guest: " + currentGuestName +
                (expiryTime != null ? " | Expiring at: " + expiryTime : "");
    }

    public static void main(String[] args) {
        GuestAccessModule accessMgr = new GuestAccessModule("Guest Controller");
        accessMgr.turnOn();

        accessMgr.grantAccess("Alice", "22:00");
        System.out.println(accessMgr.getDeviceStatus());

        accessMgr.revokeAccess();
    }
}
