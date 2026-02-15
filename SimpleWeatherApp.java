import java.util.*;

/**
 * A simple program that simulates fetching weather data for different cities.
 */
public class SimpleWeatherApp {
    private static Map<String, String> weatherData = new HashMap<>();

    static {
        weatherData.put("Pune", "Sunny, 32°C");
        weatherData.put("Mumbai", "Humid, 30°C");
        weatherData.put("Delhi", "Foggy, 15°C");
        weatherData.put("Bangalore", "Pleasant, 24°C");
        weatherData.put("New York", "Snowy, -2°C");
        weatherData.put("London", "Rainy, 10°C");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Weather App");

        while (true) {
            System.out.print("Enter city name (or 'exit' to quit): ");
            String city = scanner.nextLine().trim();

            if (city.equalsIgnoreCase("exit")) {
                break;
            }

            // Normalize city name for lookup
            String normalizedCity = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();

            if (weatherData.containsKey(normalizedCity)) {
                System.out.println("Weather in " + normalizedCity + ": " + weatherData.get(normalizedCity));
            } else {
                System.out.println("Weather data not available for " + city);
            }
            System.out.println();
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
