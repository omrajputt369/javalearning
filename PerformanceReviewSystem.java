import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of a performance review system for employee appraisals and
 * feedback.
 */
public class PerformanceReviewSystem {
    private Map<String, Double> ratings;
    private Map<String, String> feedbackLogs;

    public PerformanceReviewSystem() {
        this.ratings = new HashMap<>();
        this.feedbackLogs = new HashMap<>();
    }

    public void submitReview(String employeeId, double rating, String feedback) {
        if (rating < 1.0 || rating > 5.0) {
            System.out.println("Invalid rating for " + employeeId + ". Must be between 1 and 5.");
            return;
        }
        ratings.put(employeeId, rating);
        feedbackLogs.put(employeeId, feedback);
        System.out.println("Review submitted for " + employeeId + ". Rating: " + rating);
    }

    public void printReview(String employeeId) {
        System.out.println("\n--- Performance Review for " + employeeId + " ---");
        if (ratings.containsKey(employeeId)) {
            System.out.println("Rating: " + ratings.get(employeeId) + "/5.0");
            System.out.println("Feedback: " + feedbackLogs.get(employeeId));
        } else {
            System.out.println("No review found for this employee.");
        }
    }

    public static void main(String[] args) {
        PerformanceReviewSystem system = new PerformanceReviewSystem();

        system.submitReview("FT-101", 4.5, "Excellent teamwork and technical contributions.");
        system.submitReview("DEV-001", 4.8, "Exceptional coding skills and problem-solving.");
        system.submitReview("PT-102", 3.2, "Good progress, but needs to improve attendance.");

        system.printReview("FT-101");
        system.printReview("DEV-001");
        system.printReview("PT-102");
    }
}
