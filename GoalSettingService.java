import java.util.ArrayList;
import java.util.List;

/**
 * Milestone management for long-term health and fitness goals.
 */
public class GoalSettingService implements HealthInterface {
    private List<String> milestones;
    private int completedCount;

    @Override
    public void initializeComponent() {
        milestones = new ArrayList<>();
        completedCount = 0;
        System.out.println("Goal Setting Service Initialized.");
    }

    public void addGoal(String description) {
        milestones.add("[ ] " + description);
        System.out.println("New Goal Added: " + description);
    }

    public void completeGoal(int index) {
        if (index >= 0 && index < milestones.size()) {
            String goal = milestones.get(index);
            if (goal.startsWith("[ ]")) {
                milestones.set(index, goal.replace("[ ]", "[X]"));
                completedCount++;
                System.out.println("Goal Completed: " + goal.substring(4));
            }
        }
    }

    @Override
    public void updateData(double progress) {
        // Could represent percentage of a specific goal
        System.out.println("Overall goal progress updated by: " + progress + "%");
    }

    @Override
    public String getStatus() {
        int total = milestones.size();
        double percent = total == 0 ? 0 : (double) completedCount / total * 100;

        StringBuilder sb = new StringBuilder();
        sb.append("Fitness Goals Status: ").append(String.format("%.1f%% Complete", percent)).append("\n");
        for (String m : milestones) {
            sb.append("  ").append(m).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        GoalSettingService service = new GoalSettingService();
        service.initializeComponent();

        service.addGoal("Run 5km without stopping");
        service.addGoal("Reach 75kg body weight");
        service.addGoal("Drink 3L water daily for a week");

        service.completeGoal(0);
        System.out.println(service.getStatus());
    }
}
