/**
 * Breakdown of protein, carbohydrate, and fat requirements.
 */
public class MacroNutrientEngine implements HealthInterface {
    private double totalCalories;
    private double proteinGrams;
    private double carbGrams;
    private double fatGrams;

    @Override
    public void initializeComponent() {
        this.totalCalories = 2000; // default
        calculateMacros();
        System.out.println("Macro Nutrient Engine Initialized.");
    }

    private void calculateMacros() {
        // Balanced ratio: 30% Protein, 40% Carbs, 30% Fat
        // 1g Protein = 4 kcal, 1g Carb = 4 kcal, 1g Fat = 9 kcal
        proteinGrams = (totalCalories * 0.30) / 4;
        carbGrams = (totalCalories * 0.40) / 4;
        fatGrams = (totalCalories * 0.30) / 9;
    }

    @Override
    public void updateData(double calories) {
        this.totalCalories = calories;
        calculateMacros();
        System.out.println("Daily calories updated. Macros recalculated.");
    }

    @Override
    public String getStatus() {
        return String.format(
                "Target: %.0f kcal | Macros: P: %.1fg | C: %.1fg | F: %.1fg",
                totalCalories, proteinGrams, carbGrams, fatGrams);
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        MacroNutrientEngine engine = new MacroNutrientEngine();
        engine.initializeComponent();
        System.out.println(engine.getStatus());

        engine.updateData(2500);
        System.out.println(engine.getStatus());
    }
}
