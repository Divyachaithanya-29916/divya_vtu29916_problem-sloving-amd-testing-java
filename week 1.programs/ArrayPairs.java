public class ArrayPairs {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        System.out.println("All possible pairs are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}
