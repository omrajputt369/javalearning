/**
 * Body fat percentage estimation using the U.S. Navy Method.
 */
public class BodyFatEstimator implements HealthInterface {
    private String gender; // M/F
    private double neck; // cm
    private double waist; // cm
    private double hip; // cm (only for females)
    private double height; // cm
    private double bodyFat;

    public BodyFatEstimator(String gender, double height) {
        this.gender = gender;
        this.height = height;
    }

    @Override
    public void initializeComponent() {
        System.out.println("Body Fat Estimator Initialized for " + (gender.equalsIgnoreCase("M") ? "Male" : "Female"));
    }

    public void setMeasurements(double neck, double waist, double hip) {
        this.neck = neck;
        this.waist = waist;
        this.hip = hip;
        calculateBodyFat();
    }

    private void calculateBodyFat() {
        if (gender.equalsIgnoreCase("M")) {
            // Formula for Men
            bodyFat = 495 / (1.0324 - 0.19077 * Math.log10(waist - neck) + 0.15456 * Math.log10(height)) - 450;
        } else {
            // Formula for Women
            bodyFat = 495 / (1.29579 - 0.35004 * Math.log10(waist + hip - neck) + 0.22100 * Math.log10(height)) - 450;
        }
    }

    @Override
    public void updateData(double factor) {
        // Adjust formula sensitivity factor
        System.out.println("Estimation sensitivity updated.");
    }

    @Override
    public String getStatus() {
        String category;
        if (gender.equalsIgnoreCase("M")) {
            if (bodyFat < 6)
                category = "Essential Fat";
            else if (bodyFat < 14)
                category = "Athletes";
            else if (bodyFat < 18)
                category = "Fitness";
            else if (bodyFat < 25)
                category = "Average";
            else
                category = "Obese";
        } else {
            if (bodyFat < 14)
                category = "Essential Fat";
            else if (bodyFat < 21)
                category = "Athletes";
            else if (bodyFat < 25)
                category = "Fitness";
            else if (bodyFat < 32)
                category = "Average";
            else
                category = "Obese";
        }
        return String.format("Estimated Body Fat: %.1f%% | Category: %s", bodyFat, category);
    }

    @Override
    public void reset() {
        this.bodyFat = 0;
    }

    public static void main(String[] args) {
        BodyFatEstimator male = new BodyFatEstimator("M", 180);
        male.setMeasurements(40, 90, 0);
        System.out.println("Male: " + male.getStatus());

        BodyFatEstimator female = new BodyFatEstimator("F", 165);
        female.setMeasurements(35, 75, 95);
        System.out.println("Female: " + female.getStatus());
    }
}
