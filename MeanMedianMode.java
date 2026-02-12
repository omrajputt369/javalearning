import java.util.*;

public class MeanMedianMode {

    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int x : arr)
            sum += x;
        return sum / arr.length;
    }

    public static double calculateMedian(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int n = sortedArr.length;
        if (n % 2 != 0) {
            return sortedArr[n / 2];
        }
        return (sortedArr[(n - 1) / 2] + sortedArr[n / 2]) / 2.0;
    }

    public static List<Integer> calculateMode(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int x : arr) {
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }

        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            if (freq > maxFreq)
                maxFreq = freq;
        }

        List<List<Integer>> modes = new ArrayList<>();
        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modeList.add(entry.getKey());
            }
        }
        return modeList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Size must be positive!");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println("\nArray: " + Arrays.toString(arr));
        System.out.println("---------------------");
        System.out.printf("Mean:   %.2f\n", calculateMean(arr));
        System.out.printf("Median: %.2f\n", calculateMedian(arr));
        System.out.println("Mode:   " + calculateMode(arr));

        scanner.close();
    }
}
