import java.util.Scanner;

public class BirthdayChocolate {

    /**
     * Returns the number of ways Lily can divide the chocolate bar.
     *
     * @param s the numbers on the chocolate squares
     * @param d Ron's birth day
     * @param m Ron's birth month
     * @return the number of valid contiguous segments
     */
    public static int birthday(int[] s, int d, int m) {
        int count = 0;
        int n = s.length;

        // Sliding window of size m
        for (int i = 0; i <= n - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n
        int n = scanner.nextInt();

        // Read the chocolate squares
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }

        // Read d and m
        int d = scanner.nextInt();
        int m = scanner.nextInt();

        // Compute and print the result
        System.out.println(birthday(s, d, m));

        scanner.close();
    }
}