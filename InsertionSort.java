import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

    // Insertion sort implementation
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Insertion sort with visualization
    public static void insertionSortVisualized(int[] arr) {
        int n = arr.length;

        System.out.println("Initial array: " + Arrays.toString(arr));
        System.out.println("\n=== Insertion Sort Steps ===\n");

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            System.out.println("Pass " + i + ": Inserting " + key);
            System.out.println("  Sorted part: " + Arrays.toString(Arrays.copyOfRange(arr, 0, i)));

            int shifts = 0;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shifts++;
            }

            arr[j + 1] = key;

            if (shifts > 0) {
                System.out.println("  Shifted " + shifts + " element(s) to the right");
            } else {
                System.out.println("  No shifts needed");
            }

            System.out.println("  Result: " + Arrays.toString(arr));
            System.out.println();
        }

        System.out.println("Final sorted array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Insertion Sort ===");
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n1. Sort (normal)");
        System.out.println("2. Sort with visualization");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        int[] original = arr.clone();

        switch (choice) {
            case 1:
                insertionSort(arr);
                System.out.println("\nOriginal: " + Arrays.toString(original));
                System.out.println("Sorted:   " + Arrays.toString(arr));
                break;

            case 2:
                insertionSortVisualized(arr);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
