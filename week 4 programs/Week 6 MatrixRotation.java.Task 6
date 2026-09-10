import java.util.*;

public class MatrixRotation {

    public static void matrixRotation(int[][] matrix, int r) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = rows - 1 - layer;
            int right = cols - 1 - layer;
            for (int j = left; j <= right; j++) {
                elements.add(matrix[top][j]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                elements.add(matrix[i][right]);
            }
            for (int j = right - 1; j >= left; j--) {
                elements.add(matrix[bottom][j]);
            }
            for (int i = bottom - 1; i > top; i--) {
                elements.add(matrix[i][left]);
            }

            int len = elements.size();
            int shift = r % len;

            int index = 0;
            for (int j = left; j <= right; j++) {
                matrix[top][j] = elements.get((index + shift) % len);
                index++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = elements.get((index + shift) % len);
                index++;
            }
            for (int j = right - 1; j >= left; j--) {
                matrix[bottom][j] = elements.get((index + shift) % len);
                index++;
            }
            for (int i = bottom - 1; i > top; i--) {
                matrix[i][left] = elements.get((index + shift) % len);
                index++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);

                if (j < cols - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        matrixRotation(matrix, r);

        sc.close();
    }
}
