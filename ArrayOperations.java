import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {

    // Method to find maximum element
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find minimum element
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to calculate sum
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate average
    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    // Method to reverse array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Method to search for an element
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Method to count occurrences
    public static int countOccurrences(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }

    // Method to remove duplicates
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        return Arrays.copyOf(temp, j);
    }

    // Method to find second largest
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    // Method to check if array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Array Operations ===");
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size!");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nChoose operation:");
        System.out.println("1. Find maximum");
        System.out.println("2. Find minimum");
        System.out.println("3. Calculate sum");
        System.out.println("4. Calculate average");
        System.out.println("5. Reverse array");
        System.out.println("6. Search element");
        System.out.println("7. Count occurrences");
        System.out.println("8. Remove duplicates");
        System.out.println("9. Find second largest");
        System.out.println("10. Check if sorted");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        System.out.println("\nOriginal array: " + Arrays.toString(arr));

        switch (choice) {
            case 1:
                System.out.println("Maximum element: " + findMax(arr));
                break;
            case 2:
                System.out.println("Minimum element: " + findMin(arr));
                break;
            case 3:
                System.out.println("Sum of elements: " + calculateSum(arr));
                break;
            case 4:
                System.out.printf("Average: %.2f\n", calculateAverage(arr));
                break;
            case 5:
                reverseArray(arr);
                System.out.println("Reversed array: " + Arrays.toString(arr));
                break;
            case 6:
                System.out.print("Enter element to search: ");
                int target = scanner.nextInt();
                int index = linearSearch(arr, target);
                if (index != -1) {
                    System.out.println("Element found at index: " + index);
                } else {
                    System.out.println("Element not found");
                }
                break;
            case 7:
                System.out.print("Enter element to count: ");
                int element = scanner.nextInt();
                System.out.println("Occurrences: " + countOccurrences(arr, element));
                break;
            case 8:
                int[] unique = removeDuplicates(arr);
                System.out.println("Array without duplicates: " + Arrays.toString(unique));
                break;
            case 9:
                int secondLargest = findSecondLargest(arr);
                if (secondLargest != -1) {
                    System.out.println("Second largest: " + secondLargest);
                } else {
                    System.out.println("No second largest element exists");
                }
                break;
            case 10:
                if (isSorted(arr)) {
                    System.out.println("Array is sorted in ascending order");
                } else {
                    System.out.println("Array is not sorted");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
