import java.util.*;

public class MatrixBlockSum {

    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] answer = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;

                int rowStart = Math.max(0, i - k);
                int rowEnd = Math.min(m - 1, i + k);

                int colStart = Math.max(0, j - k);
                int colEnd = Math.min(n - 1, j + k);

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
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        int[][] result = matrixBlockSum(mat, k);

        System.out.println("Output:");

        for (int i = 0; i < m; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]);

                if (j < n - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }

        sc.close();
    }
}
