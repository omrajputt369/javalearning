import java.util.HashMap;
import java.util.Map;

/**
 * In-memory collection of food item profiles and their nutritional values.
 */
public class NutritionDatabase implements HealthInterface {
    private Map<String, Double> caloriesPer100g;

    @Override
    public void initializeComponent() {
        caloriesPer100g = new HashMap<>();
        macroRatios = new HashMap<>();

        // Populate sample data
        caloriesPer100g.put("Apple", 52.0);
        caloriesPer100g.put("Chicken Breast", 165.0);
        caloriesPer100g.put("Brown Rice", 111.0);
        caloriesPer100g.put("Broccoli", 34.0);
        caloriesPer100g.put("Salmon", 208.0);
        caloriesPer100g.put("Almonds", 579.0);

        System.out.println("Nutrition Database Initialized with " + caloriesPer100g.size() + " items.");
    }

    @Override
    public void updateData(double value) {
        // value could represent a scaling factor or a new item being 'used'
        System.out.println("Database accessed. Frequency metric updated.");
    }

    public double getCalories(String item, double grams) {
        if (caloriesPer100g.containsKey(item)) {
            return (caloriesPer100g.get(item) / 100) * grams;
        }
        return -1;
    }

    @Override
    public String getStatus() {
        return "Database Status: Online | Items: " + caloriesPer100g.keySet();
    }

    @Override
    public void reset() {
        initializeComponent();
    }

    public static void main(String[] args) {
        NutritionDatabase db = new NutritionDatabase();
        db.initializeComponent();

        String food = "Chicken Breast";
        double quantity = 250;
        double intake = db.getCalories(food, quantity);

        System.out.printf("Calories for %.1fg of %s: %.1f kcal\n", quantity, food, intake);
        System.out.println(db.getStatus());
    }
}
