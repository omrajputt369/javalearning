import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {

    public static void countFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("\nCharacter Frequencies:");
        System.out.println("----------------------");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Character Frequency Counter ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("String is empty!");
        } else {
            countFrequency(input);
        }

        scanner.close();
    }
}
