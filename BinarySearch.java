import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    // Iterative binary search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Recursive binary search
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }

    // Binary search with steps
    public static void binarySearchWithSteps(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int step = 1;

        System.out.println("\n=== Binary Search Steps ===");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target + "\n");

        while (left <= right) {
            int mid = left + (right - left) / 2;

            System.out.println("Step " + step + ":");
            System.out.println("  Range: [" + left + ", " + right + "]");
            System.out.println("  Middle index: " + mid + ", Value: " + arr[mid]);

            if (arr[mid] == target) {
                System.out.println("  ✓ Found at index " + mid + "!");
                return;
            } else if (arr[mid] < target) {
                System.out.println("  Target > " + arr[mid] + ", search right half");
                left = mid + 1;
            } else {
                System.out.println("  Target < " + arr[mid] + ", search left half");
                right = mid - 1;
            }

            step++;
        }

        System.out.println("\n✗ Target not found");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Binary Search ===");
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort array if not sorted
        Arrays.sort(arr);

        System.out.println("\n1. Binary Search (Iterative)");
        System.out.println("2. Binary Search (Recursive)");
        System.out.println("3. Binary Search with Steps");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();

        int result;

        switch (choice) {
            case 1:
                result = binarySearchIterative(arr, target);
                if (result != -1) {
                    System.out.println("\nElement found at index: " + result);
                } else {
                    System.out.println("\nElement not found");
                }
                break;

            case 2:
                result = binarySearchRecursive(arr, target, 0, arr.length - 1);
                if (result != -1) {
                    System.out.println("\nElement found at index: " + result);
                } else {
                    System.out.println("\nElement not found");
                }
                break;

            case 3:
                binarySearchWithSteps(arr, target);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
