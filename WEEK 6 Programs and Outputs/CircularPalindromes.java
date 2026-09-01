import java.util.*;

public class CircularPalindromes {

    // Find the length of the longest palindromic substring in a given string
    private static int longestPalindromeLength(String s) {
        if (s == null || s.length() == 0) return 0;
        int n = s.length();
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            maxLen = Math.max(maxLen, expand(s, i, i));
            // Even length palindromes
            maxLen = Math.max(maxLen, expand(s, i, i + 1));
        }
        return maxLen;
    }

    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String s = scanner.nextLine().trim();

        // For each possible rotation
        for (int k = 0; k < n; k++) {
            // Create the rotated string: s[k..n-1] + s[0..k-1]
            String rotated = s.substring(k) + s.substring(0, k);
            System.out.println(longestPalindromeLength(rotated));
        }

        scanner.close();
    }
}