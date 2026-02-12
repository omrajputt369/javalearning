import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        System.out.print("\nEnter number of positions to rotate: ");
        int d = scanner.nextInt();

        System.out.println("Choose rotation direction:");
        System.out.println("1. Left Rotation");
        System.out.println("2. Right Rotation");
        int choice = scanner.nextInt();

        int[] rotatedArr = arr.clone();
        if (choice == 1) {
            rotateLeft(rotatedArr, d);
            System.out.println("\nArray after Left Rotation by " + d + ": " + Arrays.toString(rotatedArr));
        } else if (choice == 2) {
            rotateRight(rotatedArr, d);
            System.out.println("\nArray after Right Rotation by " + d + ": " + Arrays.toString(rotatedArr));
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
