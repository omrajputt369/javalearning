import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of an organizational chart for visualizing management
 * hierarchies.
 */
public class OrganizationalChart {
    private Map<String, List<String>> reportingLines;

    public OrganizationalChart() {
        reportingLines = new HashMap<>();
    }

    public void addReport(String managerId, String reportId) {
        reportingLines.computeIfAbsent(managerId, k -> new ArrayList<>()).add(reportId);
    }

    public void printHierarchy(String managerId, int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + "+-- " + managerId);

        List<String> reports = reportingLines.get(managerId);
        if (reports != null) {
            for (String reportId : reports) {
                printHierarchy(reportId, level + 1);
            }
        }
    }

    public static void main(String[] args) {
        OrganizationalChart chart = new OrganizationalChart();

        // CTO -> Engineering Manager -> Developers
        chart.addReport("CEO", "CTO");
        chart.addReport("CEO", "CFO");
        chart.addReport("CTO", "Manager_Eng");
        chart.addReport("Manager_Eng", "DEV-001");
        chart.addReport("Manager_Eng", "DEV-002");
        chart.addReport("CFO", "Acc-001");

        System.out.println("--- Organizational Hierarchy ---");
        chart.printHierarchy("CEO", 0);
    }
}
