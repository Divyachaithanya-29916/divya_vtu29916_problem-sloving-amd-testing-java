public class FirstOccurrence {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }

        // Using built-in method (simple & efficient enough for constraints)
        return haystack.indexOf(needle);

        /* Manual implementation (without using indexOf):
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
        */
    }

    public static void main(String[] args) {
        FirstOccurrence solution = new FirstOccurrence();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Example 1:");
        System.out.println("Input: haystack = \"" + haystack1 + "\", needle = \"" + needle1 + "\"");
        System.out.println("Output: " + solution.strStr(haystack1, needle1));

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("\nExample 2:");
        System.out.println("Input: haystack = \"" + haystack2 + "\", needle = \"" + needle2 + "\"");
        System.out.println("Output: " + solution.strStr(haystack2, needle2));
    }
}