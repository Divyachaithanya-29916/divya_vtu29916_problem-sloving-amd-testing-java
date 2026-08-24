import java.util.Arrays;

public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create new matrix with swapped dimensions
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Example 1:");
        System.out.println("Input : " + Arrays.deepToString(matrix1));
        int[][] result1 = transpose(matrix1);
        System.out.println("Output: " + Arrays.deepToString(result1));
        System.out.println();

        // Example 2
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Example 2:");
        System.out.println("Input : " + Arrays.deepToString(matrix2));
        int[][] result2 = transpose(matrix2);
        System.out.println("Output: " + Arrays.deepToString(result2));
    }
}