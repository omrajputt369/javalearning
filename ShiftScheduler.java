import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of a shift scheduler for managing employee work rotations.
 */
public class ShiftScheduler {
    private Map<String, String> shiftRoster;

    public ShiftScheduler() {
        this.shiftRoster = new HashMap<>();
    }

    public void assignShift(String employeeId, String shiftType) {
        shiftRoster.put(employeeId, shiftType);
        System.out.println("Assigned " + shiftType + " shift to employee " + employeeId);
    }

    public void swapShift(String emp1, String emp2) {
        if (shiftRoster.containsKey(emp1) && shiftRoster.containsKey(emp2)) {
            String temp = shiftRoster.get(emp1);
            shiftRoster.put(emp1, shiftRoster.get(emp2));
            shiftRoster.put(emp2, temp);
            System.out.println("Swapped shifts between " + emp1 + " and " + emp2);
        } else {
            System.out.println("Cannot swap. One or both employees not found in roster.");
        }
    }

    public void displayRoster() {
        System.out.println("\n--- Current Shift Roster ---");
        for (Map.Entry<String, String> entry : shiftRoster.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + " | Shift: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ShiftScheduler scheduler = new ShiftScheduler();

        scheduler.assignShift("FT-201", "Morning (09:00 - 17:00)");
        scheduler.assignShift("DEV-202", "Evening (17:00 - 01:00)");
        scheduler.assignShift("MAN-203", "General (10:00 - 18:00)");

        scheduler.displayRoster();

        scheduler.swapShift("FT-201", "DEV-202");
        scheduler.displayRoster();
    }
}
