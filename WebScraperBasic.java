import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * A basic web scraper that fetches and prints the HTML content of a given URL.
 */
public class WebScraperBasic {

    public static void main(String[] args) {
        String urlString = "https://www.google.com"; // Example URL

        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            System.out.println("Fetching content from: " + urlString);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // In a real scraper, you would parse the HTML here.
            }
            reader.close();

        } catch (Exception e) {
            System.err.println("Error fetching URL: " + e.getMessage());
        }
    }
}
