import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array size must be at least 2!");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nArray: " + Arrays.toString(arr));

        int result = findSecondLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be same).");
        } else {
            System.out.println("The second largest element is: " + result);
        }

        scanner.close();
    }
}
