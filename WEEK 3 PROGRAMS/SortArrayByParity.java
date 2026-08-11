import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> Integer.compare(a % 2, b % 2));
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] sorted = sortArrayByParity(nums);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Sorted by Parity: " + Arrays.toString(sorted));
    }
}