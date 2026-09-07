import java.util.*;

public class MaxSubarray {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        int maxSubarray = arr.get(0);
        int currentSum = arr.get(0);

        int maxSubsequence = arr.get(0);
        int maxPositiveSum = 0;

        for (int i = 1; i < arr.size(); i++) {

            int value = arr.get(i);

            // Kadane's algorithm for maximum subarray
            currentSum = Math.max(value, currentSum + value);
            maxSubarray = Math.max(maxSubarray, currentSum);

            // Maximum subsequence
            if (value > 0) {
                maxPositiveSum += value;
            }

            maxSubsequence = Math.max(maxSubsequence, value);
        }

        // If there are positive numbers, use their sum
        if (maxPositiveSum > 0) {
            maxSubsequence = maxPositiveSum;
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxSubarray);
        result.add(maxSubsequence);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }

        sc.close();
    }
}