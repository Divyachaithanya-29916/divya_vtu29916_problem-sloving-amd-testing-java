import java.util.*;

public class MatrixRotation {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            // Collect the current layer into a list
            List<Integer> elements = new ArrayList<>();

            // Top row (left to right)
            for (int j = layer; j < n - layer; j++) {
                elements.add(matrix.get(layer).get(j));
            }
            // Right column (top to bottom)
            for (int i = layer + 1; i < m - layer; i++) {
                elements.add(matrix.get(i).get(n - layer - 1));
            }
            // Bottom row (right to left)
            for (int j = n - layer - 2; j >= layer; j--) {
                elements.add(matrix.get(m - layer - 1).get(j));
            }
            // Left column (bottom to top)
            for (int i = m - layer - 2; i > layer; i--) {
                elements.add(matrix.get(i).get(layer));
            }

            // Effective rotations
            int len = elements.size();
            int effectiveR = r % len;

            // Rotate anti-clockwise → move first 'effectiveR' elements to the end
            List<Integer> rotated = new ArrayList<>();
            for (int i = effectiveR; i < len; i++) {
                rotated.add(elements.get(i));
            }
            for (int i = 0; i < effectiveR; i++) {
                rotated.add(elements.get(i));
            }

            // Put the rotated values back into the matrix
            int idx = 0;

            // Top row
            for (int j = layer; j < n - layer; j++) {
                matrix.get(layer).set(j, rotated.get(idx++));
            }
            // Right column
            for (int i = layer + 1; i < m - layer; i++) {
                matrix.get(i).set(n - layer - 1, rotated.get(idx++));
            }
            // Bottom row
            for (int j = n - layer - 2; j >= layer; j--) {
                matrix.get(m - layer - 1).set(j, rotated.get(idx++));
            }
            // Left column
            for (int i = m - layer - 2; i > layer; i--) {
                matrix.get(i).set(layer, rotated.get(idx++));
            }
        }

        // Print the result
        for (List<Integer> row : matrix) {
            for (int i = 0; i < row.size(); i++) {
                System.out.print(row.get(i));
                if (i < row.size() - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Sample Input #01
        List<List<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(Arrays.asList(1, 2, 3, 4));
        matrix1.add(Arrays.asList(5, 6, 7, 8));
        matrix1.add(Arrays.asList(9, 10, 11, 12));
        matrix1.add(Arrays.asList(13, 14, 15, 16));

        System.out.println("Sample Input #01 (r = 2):");
        matrixRotation(matrix1, 2);
        System.out.println();

        // Sample Input #03
        List<List<Integer>> matrix3 = new ArrayList<>();
        matrix3.add(Arrays.asList(1, 1));
        matrix3.add(Arrays.asList(1, 1));

        System.out.println("Sample Input #03 (r = 3):");
        matrixRotation(matrix3, 3);
    }
}