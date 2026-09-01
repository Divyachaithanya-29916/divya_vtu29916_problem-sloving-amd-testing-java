public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        // A string of length 1 can never be formed by repeating a substring
        if (n <= 1) return false;

        // Check every possible substring length that divides n
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String pattern = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                int times = n / len;
                for (int i = 0; i < times; i++) {
                    sb.append(pattern);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optional main method for quick testing in VS Code
    public static void main(String[] args) {
        RepeatedSubstringPattern sol = new RepeatedSubstringPattern();

        System.out.println(sol.repeatedSubstringPattern("abab"));          // true
        System.out.println(sol.repeatedSubstringPattern("aba"));           // false
        System.out.println(sol.repeatedSubstringPattern("abcabcabcabc"));  // true
        System.out.println(sol.repeatedSubstringPattern("a"));             // false
        System.out.println(sol.repeatedSubstringPattern("aa"));            // true
    }
}