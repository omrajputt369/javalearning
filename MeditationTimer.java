import java.util.ArrayList;
import java.util.List;

/**
 * Mindfulness session tracking and meditation timer.
 */
public class MeditationTimer implements HealthInterface {
    private int totalMinutes;
    private List<String> sessionHistory;

    @Override
    public void initializeComponent() {
        this.totalMinutes = 0;
        this.sessionHistory = new ArrayList<>();
        System.out.println("Meditation Timer Initialized.");
    }

    @Override
    public void updateData(double sessionMinutes) {
        int mins = (int) sessionMinutes;
        this.totalMinutes += mins;
        sessionHistory.add(mins + " minute session");
        System.out.println("Meditation session of " + mins + " minutes recorded.");
    }

    @Override
    public String getStatus() {
        return String.format(
                "Total Meditation Time: %d mins | Sessions: %d | Last: %s",
                totalMinutes, sessionHistory.size(),
                sessionHistory.isEmpty() ? "None" : sessionHistory.get(sessionHistory.size() - 1));
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        MeditationTimer timer = new MeditationTimer();
        timer.initializeComponent();

        timer.updateData(10);
        timer.updateData(20);

        System.out.println(timer.getStatus());
    }
}
