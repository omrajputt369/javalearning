import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        // Using LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int i : set) {
            result[index++] = i;
        }
        return result;
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

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
        System.out.println("New size: " + uniqueArr.length);

        scanner.close();
    }
}
