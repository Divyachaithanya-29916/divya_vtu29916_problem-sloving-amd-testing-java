import java.util.Scanner;

public class StringSimilarity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine().trim();
            System.out.println(sumOfSimilarities(s));
        }
        sc.close();
    }

    private static long sumOfSimilarities(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] z = computeZArray(s);
        long sum = n; // Z[0] is conventionally the full length

        for (int i = 1; i < n; i++) {
            sum += z[i];
        }
        return sum;
    }

    private static int[] computeZArray(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;

        for (int i = 1; i < n; i++) {
            if (i < r) {
                z[i] = Math.min(r - i, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] > r) {
                l = i;
                r = i + z[i];
            }
        }
        return z;
    }
}