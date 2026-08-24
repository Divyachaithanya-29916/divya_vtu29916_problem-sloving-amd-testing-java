import java.util.Arrays;

public class MatrixBlockSum {

    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] answer = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;

                // Calculate the range for rows and columns
                int rowStart = Math.max(0, i - k);
                int rowEnd   = Math.min(m - 1, i + k);
                int colStart = Math.max(0, j - k);
                int colEnd   = Math.min(n - 1, j + k);

                // Sum all elements in the valid range
                for (int r = rowStart; r <= rowEnd; r++) {
                    for (int c = colStart; c <= colEnd; c++) {
                        sum += mat[r][c];
                    }
                }

                answer[i][j] = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k1 = 1;

        System.out.println("Example 1:");
        System.out.println("Input mat = " + Arrays.deepToString(mat1) + ", k = " + k1);
        int[][] result1 = matrixBlockSum(mat1, k1);
        System.out.println("Output    = " + Arrays.deepToString(result1));
        System.out.println();

        // Example 2
        int[][] mat2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k2 = 2;

        System.out.println("Example 2:");
        System.out.println("Input mat = " + Arrays.deepToString(mat2) + ", k = " + k2);
        int[][] result2 = matrixBlockSum(mat2, k2);
        System.out.println("Output    = " + Arrays.deepToString(result2));
    }
}