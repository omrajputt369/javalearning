import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionArrays {

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int i : arr2) {
            if (set1.contains(i)) {
                intersectionSet.add(i);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int i : intersectionSet) {
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size for first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < n1; i++)
            arr1[i] = scanner.nextInt();

        System.out.print("Enter size for second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < n2; i++)
            arr2[i] = scanner.nextInt();

        System.out.println("\nArray 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        int[] result = findIntersection(arr1, arr2);
        System.out.println("\nIntersection: " + Arrays.toString(result));

        scanner.close();
    }
}
