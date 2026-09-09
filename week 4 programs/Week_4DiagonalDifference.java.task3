import java.util.*;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];
            secondarySum += arr[i][n - 1 - i];
        }

        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = diagonalDifference(arr);

        System.out.println("Output: " + result);

        sc.close();
    }
}
