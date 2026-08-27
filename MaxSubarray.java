import java.util.Scanner;

public class MaxSubarray {

    /**
     * Returns an array of two integers:
     * [0] = maximum subarray sum (contiguous)
     * [1] = maximum subsequence sum (any subset)
     */
    public static int[] maxSubarray(int[] arr) {
        // ---------- Maximum Subarray Sum (Kadane's Algorithm) ----------
        int maxSubarray = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maxSubarray = Math.max(maxSubarray, current);
        }

        // ---------- Maximum Subsequence Sum ----------
        int maxSubsequence = 0;
        int maxElement = arr[0];
        boolean hasPositive = false;

        for (int num : arr) {
            if (num > 0) {
                maxSubsequence += num;
                hasPositive = true;
            }
            if (num > maxElement) {
                maxElement = num;
            }
        }

        // If all numbers are negative, both answers are the largest element
        if (!hasPositive) {
            maxSubsequence = maxElement;
        }

        return new int[]{maxSubarray, maxSubsequence};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();          // number of test cases

        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int[] result = maxSubarray(arr);
            System.out.println(result[0] + " " + result[1]);
        }

        scanner.close();
    }
}