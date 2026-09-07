import java.util.*;

public class MaxCircularSubarray {

    public static int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        // For maximum subarray
        int currentMax = nums[0];
        int maxSum = nums[0];

        // For minimum subarray
        int currentMin = nums[0];
        int minSum = nums[0];

        totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Maximum subarray (Kadane's Algorithm)
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            // Minimum subarray
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);

            totalSum += nums[i];
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular sum
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubarraySumCircular(nums);

        System.out.println(result);

        sc.close();
    }
}