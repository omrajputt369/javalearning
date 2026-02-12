import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(strings));

        // Sorting alphabetically
        Arrays.sort(strings);

        System.out.println("Sorted Array:   " + Arrays.toString(strings));

        // Sorting by length
        Arrays.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by length: " + Arrays.toString(strings));

        scanner.close();
    }
}
