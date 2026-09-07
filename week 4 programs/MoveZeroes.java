      import java.util.*;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.print("Output: [");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        sc.close();
    }
}