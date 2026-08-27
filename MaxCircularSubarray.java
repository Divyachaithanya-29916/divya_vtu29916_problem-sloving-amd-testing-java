import java.util.Scanner;

public class MaxCircularSubarray {

    /**
     * Returns the maximum possible sum of a non-empty subarray
     * in a circular array.
     */
    public static int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        // Case 1: Normal (non-wrapping) maximum subarray sum (Kadane)
        int maxKadane = kadaneMax(nums);

        // Case 2: Maximum wrapping sum = total sum - minimum subarray sum
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int minKadane = kadaneMin(nums);
        int maxWrapping = totalSum - minKadane;

        // If all elements are negative, maxWrapping becomes 0 (empty),
        // so we must return the normal Kadane result (the largest element)
        if (maxWrapping == 0) {
            return maxKadane;
        }

        return Math.max(maxKadane, maxWrapping);
    }

    // Standard Kadane for maximum subarray sum
    private static int kadaneMax(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    // Kadane for minimum subarray sum
    private static int kadaneMin(int[] nums) {
        int minEndingHere = nums[0];
        int minSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            minEndingHere = Math.min(nums[i], minEndingHere + nums[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        return minSoFar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array (space-separated integers on one line)
        // Example input: 1 -2 3 -2
        String line = scanner.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println(0);
            scanner.close();
            return;
        }

        String[] parts = line.split("\\s+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(maxSubarraySumCircular(nums));
        scanner.close();
    }
}