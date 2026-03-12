import java.util.Scanner;

/**
 * Manages user biological data and fitness targets.
 */
public class UserFitnessProfile implements HealthInterface {
    private String name;
    private int age;
    private double weight; // in kg
    private double height; // in cm
    private double targetWeight;
    private String fitnessGoal;

    @Override
    public void initializeComponent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- User Fitness Profile Setup ---");
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Age: ");
        this.age = scanner.nextInt();
        System.out.print("Enter Current Weight (kg): ");
        this.weight = scanner.nextDouble();
        System.out.print("Enter Height (cm): ");
        this.height = scanner.nextDouble();
        System.out.print("Enter Target Weight (kg): ");
        this.targetWeight = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Fitness Goal (e.g., Weight Loss, Muscle Gain): ");
        this.fitnessGoal = scanner.nextLine();
        System.out.println("Profile Initialized Successfully!");
        scanner.close();
    }

    @Override
    public void updateData(double newWeight) {
        this.weight = newWeight;
        System.out.println("Weight updated to: " + this.weight + " kg");
    }

    @Override
    public String getStatus() {
        double bmi = weight / ((height / 100) * (height / 100));
        return String.format(
                "Profile: %s | Age: %d | Current: %.1f kg | Target: %.1f kg | Goal: %s | BMI: %.2f",
                name, age, weight, targetWeight, fitnessGoal, bmi);
    }

    @Override
    public void reset() {
        this.weight = 0;
        this.targetWeight = 0;
        System.out.println("Profile metrics reset.");
    }

    public static void main(String[] args) {
        UserFitnessProfile profile = new UserFitnessProfile();
        profile.initializeComponent();
        System.out.println(profile.getStatus());

        System.out.println("\nUpdating weight...");
        profile.updateData(profile.weight - 0.5);
        System.out.println(profile.getStatus());
    }
}
