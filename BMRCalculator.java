/**
 * Calculation of Basal Metabolic Rate using Mifflin-St Jeor Equation.
 */
public class BMRCalculator implements HealthInterface {
    private double weight; // kg
    private double height; // cm
    private int age;
    private String gender; // M/F
    private double bmr;

    public BMRCalculator(double weight, double height, int age, String gender) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void initializeComponent() {
        calculateBMR();
        System.out.println("BMR Calculator Initialized.");
    }

    private void calculateBMR() {
        if (gender.equalsIgnoreCase("M")) {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }
    }

    @Override
    public void updateData(double newWeight) {
        this.weight = newWeight;
        calculateBMR();
        System.out.println("Weight updated to " + weight + " kg. BMR recalculated.");
    }

    @Override
    public String getStatus() {
        return String.format(
                "Profile: [%s, %d yrs, %.1f cm, %.1f kg] | BMR: %.1f kcal/day",
                gender.toUpperCase(), age, height, weight, bmr);
    }

    @Override
    public void reset() {
        calculateBMR();
    }

    public static void main(String[] args) {
        BMRCalculator maleBmr = new BMRCalculator(80, 180, 30, "M");
        maleBmr.initializeComponent();
        System.out.println(maleBmr.getStatus());

        BMRCalculator femaleBmr = new BMRCalculator(65, 165, 28, "F");
        femaleBmr.initializeComponent();
        System.out.println(femaleBmr.getStatus());
    }
}
