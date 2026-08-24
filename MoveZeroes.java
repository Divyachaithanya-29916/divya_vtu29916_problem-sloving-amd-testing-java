import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int index = 0;  // position to place the next non-zero element

        // First pass: move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Second pass: fill the remaining positions with 0
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("Input : " + Arrays.toString(nums1));
        moveZeroes(nums1);
        System.out.println("Output: " + Arrays.toString(nums1));
        System.out.println();

        // Example 2
        int[] nums2 = {0};
        System.out.println("Input : " + Arrays.toString(nums2));
        moveZeroes(nums2);
        System.out.println("Output: " + Arrays.toString(nums2));
        System.out.println();

        // Extra test
        int[] nums3 = {0, 0, 1, 0, 2, 3, 0};
        System.out.println("Input : " + Arrays.toString(nums3));
        moveZeroes(nums3);
        System.out.println("Output: " + Arrays.toString(nums3));
    }
}