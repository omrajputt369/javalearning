import java.util.ArrayList;
import java.util.List;

/**
 * Daily and weekly gamified fitness tasks.
 */
public class FitnessChallengeSystem implements HealthInterface {
    private List<String> currentChallenges;
    private int pointsEarned;

    @Override
    public void initializeComponent() {
        currentChallenges = new ArrayList<>();
        pointsEarned = 0;
        currentChallenges.add("10k Steps Challenge (10 pts)");
        currentChallenges.add("Drink 3L Water (5 pts)");
        currentChallenges.add("30 min Cardio (15 pts)");
        System.out.println("Fitness Challenge System Initialized.");
    }

    @Override
    public void updateData(double points) {
        this.pointsEarned += (int) points;
        System.out.println("Points updated! Total: " + pointsEarned);
    }

    public void completeChallenge(int index, int points) {
        if (index >= 0 && index < currentChallenges.size()) {
            System.out.println("Challenge Completed: " + currentChallenges.get(index));
            updateData(points);
        }
    }

    @Override
    public String getStatus() {
        return String.format(
                "Points: %d | Level: %d | Active Challenges: %d",
                pointsEarned, (pointsEarned / 100) + 1, currentChallenges.size());
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        FitnessChallengeSystem system = new FitnessChallengeSystem();
        system.initializeComponent();

        system.completeChallenge(0, 10);
        system.completeChallenge(2, 15);

        System.out.println(system.getStatus());
    }
}
