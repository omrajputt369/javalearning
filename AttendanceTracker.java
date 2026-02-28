import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of an attendance tracker for logging employee check-ins and
 * check-outs.
 */
public class AttendanceTracker {
    private Map<String, List<String>> attendanceLog;

    public AttendanceTracker() {
        this.attendanceLog = new HashMap<>();
    }

    public void checkIn(String employeeId) {
        String timestamp = LocalDateTime.now().toString();
        attendanceLog.computeIfAbsent(employeeId, k -> new ArrayList<>()).add("IN: " + timestamp);
        System.out.println("Employee " + employeeId + " checked in at " + timestamp);
    }

    public void checkOut(String employeeId) {
        String timestamp = LocalDateTime.now().toString();
        attendanceLog.computeIfAbsent(employeeId, k -> new ArrayList<>()).add("OUT: " + timestamp);
        System.out.println("Employee " + employeeId + " checked out at " + timestamp);
    }

    public void printLogs(String employeeId) {
        System.out.println("\n--- Attendance Logs for " + employeeId + " ---");
        List<String> logs = attendanceLog.getOrDefault(employeeId, new ArrayList<>());
        for (String log : logs) {
            System.out.println(log);
        }
    }

    public static void main(String[] args) {
        AttendanceTracker tracker = new AttendanceTracker();

        tracker.checkIn("FT-101");
        tracker.checkIn("DEV-001");

        // Simulating some delay (not really needed for basic CLI)
        tracker.checkOut("FT-101");
        tracker.checkOut("DEV-001");

        tracker.printLogs("FT-101");
        tracker.printLogs("DEV-001");
    }
}
