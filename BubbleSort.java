import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

    // Method to perform bubble sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to perform bubble sort with visualization
    public static void bubbleSortVisualized(int[] arr) {
        int n = arr.length;
        boolean swapped;

        System.out.println("Initial array: " + Arrays.toString(arr));
        System.out.println("\nSorting process:");

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Pass " + (i + 1) + ":");

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                    System.out.println("  Swapped " + arr[j + 1] + " and " + arr[j] +
                            " -> " + Arrays.toString(arr));
                }
            }

            if (!swapped) {
                System.out.println("  No swaps - array is sorted!");
                break;
            }
        }

        System.out.println("\nFinal sorted array: " + Arrays.toString(arr));
    }

    // Method to sort in descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Changed comparison for descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bubble Sort Program ===");
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive!");
            scanner.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nChoose sorting option:");
        System.out.println("1. Sort in ascending order");
        System.out.println("2. Sort in descending order");
        System.out.println("3. Sort with visualization (ascending)");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        int[] originalArr = arr.clone();

        switch (choice) {
            case 1:
                bubbleSort(arr);
                System.out.println("\nOriginal array: " + Arrays.toString(originalArr));
                System.out.println("Sorted array (ascending): " + Arrays.toString(arr));
                break;

            case 2:
                bubbleSortDescending(arr);
                System.out.println("\nOriginal array: " + Arrays.toString(originalArr));
                System.out.println("Sorted array (descending): " + Arrays.toString(arr));
                break;

            case 3:
                bubbleSortVisualized(arr);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
