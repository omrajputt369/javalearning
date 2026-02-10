import java.util.Scanner;
import java.util.Arrays;

public class SearchingSortingDemo {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void compareSearchAlgorithms(int[] arr, int target) {
        System.out.println("\n=== Search Algorithm Comparison ===");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target + "\n");

        // Linear Search
        long startTime = System.nanoTime();
        int linearResult = linearSearch(arr, target);
        long linearTime = System.nanoTime() - startTime;

        System.out.println("LINEAR SEARCH:");
        System.out.println("  Result: " + (linearResult != -1 ? "Found at index " + linearResult : "Not found"));
        System.out.println("  Time: " + linearTime + " nanoseconds");

        // Binary Search (on sorted array)
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        startTime = System.nanoTime();
        int binaryResult = binarySearch(sorted, target);
        long binaryTime = System.nanoTime() - startTime;

        System.out.println("\nBINARY SEARCH (on sorted):");
        System.out.println("  Result: " + (binaryResult != -1 ? "Found at index " + binaryResult : "Not found"));
        System.out.println("  Time: " + binaryTime + " nanoseconds");

        System.out.println("\n✓ Binary search is " + (linearTime / (binaryTime + 1)) + "x faster!");
    }

    public static void compareSortAlgorithms(int[] arr) {
        System.out.println("\n=== Sort Algorithm Comparison ===");
        System.out.println("Original: " + Arrays.toString(arr));

        // Bubble Sort
        int[] arr1 = arr.clone();
        long startTime = System.nanoTime();
        bubbleSort(arr1);
        long bubbleTime = System.nanoTime() - startTime;

        // Built-in Sort (optimized)
        int[] arr2 = arr.clone();
        startTime = System.nanoTime();
        Arrays.sort(arr2);
        long builtInTime = System.nanoTime() - startTime;

        System.out.println("\nBUBBLE SORT:");
        System.out.println("  Result: " + Arrays.toString(arr1));
        System.out.println("  Time: " + bubbleTime + " nanoseconds");

        System.out.println("\nBUILT-IN SORT (Optimized):");
        System.out.println("  Result: " + Arrays.toString(arr2));
        System.out.println("  Time: " + builtInTime + " nanoseconds");

        System.out.println("\n✓ Built-in sort is " + (bubbleTime / (builtInTime + 1)) + "x faster!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Searching & Sorting Algorithm Demo ===");
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\n1. Compare Search Algorithms");
        System.out.println("2. Compare Sort Algorithms");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter element to search: ");
            int target = scanner.nextInt();
            compareSearchAlgorithms(arr, target);
        } else if (choice == 2) {
            compareSortAlgorithms(arr);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
