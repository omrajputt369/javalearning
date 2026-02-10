import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchEnhanced {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findAllOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target)
                count++;
        }

        if (count == 0)
            return new int[0];

        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices[index++] = i;
            }
        }
        return indices;
    }

    public static void visualSearch(int[] arr, int target) {
        System.out.println("\n=== Linear Search Visualization ===");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target + "\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Step " + (i + 1) + ": Checking index " + i + " -> " + arr[i]);

            if (arr[i] == target) {
                System.out.println(" ✓ FOUND!");
                return;
            } else {
                System.out.println(" ✗");
            }
        }

        System.out.println("\nElement not found!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Enhanced Linear Search ===");
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n1. Linear Search (first occurrence)");
        System.out.println("2. Find all occurrences");
        System.out.println("3. Visualized search");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();

        switch (choice) {
            case 1:
                int index = linearSearch(arr, target);
                if (index != -1) {
                    System.out.println("\nElement found at index: " + index);
                } else {
                    System.out.println("\nElement not found");
                }
                break;

            case 2:
                int[] indices = findAllOccurrences(arr, target);
                if (indices.length > 0) {
                    System.out.println("\nElement found at indices: " + Arrays.toString(indices));
                    System.out.println("Total occurrences: " + indices.length);
                } else {
                    System.out.println("\nElement not found");
                }
                break;

            case 3:
                visualSearch(arr, target);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
