public class MaximumSubarray {

    // Kadane's Algorithm - O(n) time, O(1) space
    public static int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the previous subarray or start a new one from current element
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            
            // Update global maximum if needed
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Example 1 Output: " + maxSubArray(nums1)); // 6

        // Example 2
        int[] nums2 = {1};
        System.out.println("Example 2 Output: " + maxSubArray(nums2)); // 1

        // Example 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Example 3 Output: " + maxSubArray(nums3)); // 23
    }
}