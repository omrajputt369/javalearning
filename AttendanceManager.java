import java.util.*;

/**
 * A simple Attendance Manager to mark and check student attendance.
 */
public class AttendanceManager {
    private static Map<String, List<String>> attendanceRecord = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAttendance Manager");
            System.out.println("1. Mark Attendance");
            System.out.println("2. View Student Attendance");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date (e.g., 2026-02-15): ");
                    String date = scanner.nextLine();
                    attendanceRecord.computeIfAbsent(name, k -> new ArrayList<>()).add(date);
                    System.out.println("Attendance marked.");
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String searchName = scanner.nextLine();
                    if (attendanceRecord.containsKey(searchName)) {
                        System.out.println("Attendance for " + searchName + ": " + attendanceRecord.get(searchName));
                    } else {
                        System.out.println("No records found for " + searchName);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
