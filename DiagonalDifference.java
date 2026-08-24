public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int primarySum = 0;   // left-to-right diagonal
        int secondarySum = 0; // right-to-left diagonal

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];                 // primary diagonal
            secondarySum += arr[i][n - 1 - i];       // secondary diagonal
        }

        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        // Sample Input
        int[][] arr = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        System.out.println("Matrix:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        int result = diagonalDifference(arr);
        System.out.println("\nAbsolute Difference: " + result);
    }
}