class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0;
        int n = s.length();

        // 1. Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle optional sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        long result = 0; // use long to detect overflow

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // 4. Check for overflow and clamp to 32-bit range
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }
}

// Driver class to test in VS Code
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.myAtoi("42"));             // 42
        System.out.println(sol.myAtoi("   -042"));        // -42
        System.out.println(sol.myAtoi("1337c0d3"));       // 1337
        System.out.println(sol.myAtoi("0-1"));            // 0
        System.out.println(sol.myAtoi("words and 987"));  // 0
        System.out.println(sol.myAtoi("-91283472332"));   // -2147483648 (clamped)
        System.out.println(sol.myAtoi("91283472332"));    // 2147483647 (clamped)
        System.out.println(sol.myAtoi(""));               // 0
        System.out.println(sol.myAtoi("   +0 123"));      // 0
    }
}