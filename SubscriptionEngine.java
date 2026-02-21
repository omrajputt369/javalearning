import java.util.ArrayList;
import java.util.List;

/**
 * Handles recurring billing and subscription states for users.
 */
class Subscription {
    String userId;
    String planName;
    double monthlyFee;
    boolean isActive;

    public Subscription(String userId, String planName, double monthlyFee) {
        this.userId = userId;
        this.planName = planName;
        this.monthlyFee = monthlyFee;
        this.isActive = true;
    }

    @Override
    public String toString() {
        return "Subscription [User=" + userId + ", Plan=" + planName +
                ", Fee=$" + monthlyFee + ", Active=" + isActive + "]";
    }
}

public class SubscriptionEngine {
    private List<Subscription> subscriptions = new ArrayList<>();

    public void addSubscription(String userId, String plan, double fee) {
        Subscription s = new Subscription(userId, plan, fee);
        subscriptions.add(s);
        System.out.println("New Subscription added: " + s);
    }

    public void runBillingCycle() {
        System.out.println("\n--- Starting Monthly Billing Cycle ---");
        for (Subscription s : subscriptions) {
            if (s.isActive) {
                System.out.println(
                        "Charging User: " + s.userId + " Amount: $" + s.monthlyFee + " for plan: " + s.planName);
            }
        }
        System.out.println("Cycle completed.\n");
    }

    public void cancelSubscription(String userId) {
        for (Subscription s : subscriptions) {
            if (s.userId.equals(userId)) {
                s.isActive = false;
                System.out.println("Subscription cancelled for user: " + userId);
                return;
            }
        }
        System.out.println("User not found: " + userId);
    }

    public static void main(String[] args) {
        SubscriptionEngine engine = new SubscriptionEngine();

        engine.addSubscription("user_101", "Premium", 19.99);
        engine.addSubscription("user_202", "Basic", 9.99);

        engine.runBillingCycle();

        engine.cancelSubscription("user_202");
        engine.runBillingCycle();
    }
}
