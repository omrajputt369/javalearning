import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {

    // Selection sort implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with first unsorted element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Selection sort with visualization
    public static void selectionSortVisualized(int[] arr) {
        int n = arr.length;

        System.out.println("Initial array: " + Arrays.toString(arr));
        System.out.println("\n=== Selection Sort Steps ===\n");

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            System.out.println("Pass " + (i + 1) + ":");
            System.out.println("  Finding minimum in " + Arrays.toString(Arrays.copyOfRange(arr, i, n)));

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                System.out.println("  Minimum: " + arr[minIndex] + " at index " + minIndex);
                System.out.println("  Swapping " + arr[i] + " with " + arr[minIndex]);

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            } else {
                System.out.println("  " + arr[i] + " already in correct position");
            }

            System.out.println("  Array: " + Arrays.toString(arr));
            System.out.println();
        }

        System.out.println("Final sorted array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Selection Sort ===");
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
                selectionSort(arr);
                System.out.println("\nOriginal: " + Arrays.toString(original));
                System.out.println("Sorted:   " + Arrays.toString(arr));
                break;

            case 2:
                selectionSortVisualized(arr);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
