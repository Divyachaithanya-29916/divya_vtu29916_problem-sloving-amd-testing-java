import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;   // Found a duplicate
            }
            seen.add(num);
        }

        return false;  // All elements are distinct
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Input: [1,2,3,1]");
        System.out.println("Output: " + containsDuplicate(nums1));
        System.out.println();

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Input: [1,2,3,4]");
        System.out.println("Output: " + containsDuplicate(nums2));
        System.out.println();

        // Example 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Input: [1,1,1,3,3,4,3,2,4,2]");
        System.out.println("Output: " + containsDuplicate(nums3));
    }
}