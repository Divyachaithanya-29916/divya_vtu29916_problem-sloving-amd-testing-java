public class LongestPalindrome {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes (centered at i)
            int len1 = expandAroundCenter(s, i, i);
            // Even length palindromes (centered between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();

        // Example 1
        String s1 = "babad";
        System.out.println("Example 1:");
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: \"" + solution.longestPalindrome(s1) + "\"");

        // Example 2
        String s2 = "cbbd";
        System.out.println("\nExample 2:");
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output: \"" + solution.longestPalindrome(s2) + "\"");
    }
}