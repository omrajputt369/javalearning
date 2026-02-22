import java.util.HashMap;
import java.util.Map;

/**
 * Simulates an internal ticketing system for managing customer support
 * requests.
 */
public class CustomerSupportTicketing {
    public enum TicketStatus {
        OPEN, IN_PROGRESS, RESOLVED, CLOSED
    }

    private Map<String, TicketStatus> ticketDatabase = new HashMap<>();
    private static int ticketCounter = 1000;

    public String createTicket(String customerId, String issue) {
        String ticketId = "TKT-" + (++ticketCounter);
        ticketDatabase.put(ticketId, TicketStatus.OPEN);
        System.out.println("Ticket created for " + customerId + ": " + ticketId);
        System.out.println("Description: " + issue);
        return ticketId;
    }

    public void updateStatus(String ticketId, TicketStatus newStatus) {
        if (ticketDatabase.containsKey(ticketId)) {
            ticketDatabase.put(ticketId, newStatus);
            System.out.println("Ticket " + ticketId + " updated to status: " + newStatus);
        } else {
            System.out.println("Update failed: Ticket ID not found.");
        }
    }

    public void displayAllTickets() {
        System.out.println("\n--- SUPPORT TICKETS DASHBOARD ---");
        for (Map.Entry<String, TicketStatus> entry : ticketDatabase.entrySet()) {
            System.out.println("Ticket ID: " + entry.getKey() + " | Status: " + entry.getValue());
        }
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        CustomerSupportTicketing support = new CustomerSupportTicketing();

        System.out.println("--- Bank Customer Support System ---");

        String t1 = support.createTicket("USR-123", "Amount deducted but not received.");
        String t2 = support.createTicket("USR-456", "Cannot activate Debit Card.");

        support.updateStatus(t1, TicketStatus.IN_PROGRESS);
        support.updateStatus(t2, TicketStatus.RESOLVED);

        support.displayAllTickets();
    }
}
