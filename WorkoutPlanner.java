import java.util.ArrayList;
import java.util.List;

/**
 * Generates workout plans based on user fitness level.
 */
public class WorkoutPlanner implements HealthInterface {
    private String userLevel;
    private List<String> currentRoutine;
    private int sessionMinutes;

    public WorkoutPlanner(String level) {
        this.userLevel = level;
        this.currentRoutine = new ArrayList<>();
    }

    @Override
    public void initializeComponent() {
        generateRoutine();
        System.out.println("Workout Planner Initialized for level: " + userLevel);
    }

    private void generateRoutine() {
        currentRoutine.clear();
        switch (userLevel.toLowerCase()) {
            case "beginner":
                currentRoutine.add("10 min Brisk Walk");
                currentRoutine.add("3 sets of 10 Bodyweight Squats");
                currentRoutine.add("3 sets of 5 Knee Push-ups");
                currentRoutine.add("20 sec Plank");
                sessionMinutes = 30;
                break;
            case "intermediate":
                currentRoutine.add("5 min Jog");
                currentRoutine.add("4 sets of 12 Dumbbell Press");
                currentRoutine.add("4 sets of 10 Pull-ups");
                currentRoutine.add("45 sec Plank");
                sessionMinutes = 45;
                break;
            case "advanced":
                currentRoutine.add("10 min High Intensity Run");
                currentRoutine.add("5 sets of 5 Deadlifts");
                currentRoutine.add("5 sets of 8 Clean and Press");
                currentRoutine.add("Weighted Plank 2 mins");
                sessionMinutes = 60;
                break;
            default:
                currentRoutine.add("General 30 min Walk");
                sessionMinutes = 30;
        }
    }

    @Override
    public void updateData(double completedMinutes) {
        this.sessionMinutes = (int) completedMinutes;
        System.out.println("Session duration adjusted to: " + sessionMinutes + " mins");
    }

    @Override
    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("Level: ").append(userLevel).append(" | Est. Time: ").append(sessionMinutes).append(" mins\n");
        sb.append("Routine: ");
        for (int i = 0; i < currentRoutine.size(); i++) {
            sb.append("\n  ").append(i + 1).append(". ").append(currentRoutine.get(i));
        }
        return sb.toString();
    }

    @Override
    public void reset() {
        generateRoutine();
    }

    public static void main(String[] args) {
        WorkoutPlanner beginnerPlan = new WorkoutPlanner("Beginner");
        beginnerPlan.initializeComponent();
        System.out.println(beginnerPlan.getStatus());

        System.out.println("\n--- Switching to Advanced ---");
        WorkoutPlanner advancedPlan = new WorkoutPlanner("Advanced");
        advancedPlan.initializeComponent();
        System.out.println(advancedPlan.getStatus());
    }
}
