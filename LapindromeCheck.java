public class LapindromeCheck {

    public static String checkLapindrome(String s) {
        int n = s.length();
        int mid = n / 2;

        int[] left = new int[26];
        int[] right = new int[26];

        // Count characters in left half
        for (int i = 0; i < mid; i++) {
            left[s.charAt(i) - 'a']++;
        }

        // Count characters in right half (skip middle if odd length)
        int start = (n % 2 == 0) ? mid : mid + 1;
        for (int i = start; i < n; i++) {
            right[s.charAt(i) - 'a']++;
        }

        // Compare both sides
        for (int i = 0; i < 26; i++) {
            if (left[i] != right[i]) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        String[] tests = {
            "gaga",
            "abcde",
            "rotor",
            "xyzxy",
            "abbaab",
            "ababc"
        };

        System.out.println("Output:");
        for (String str : tests) {
            System.out.println(checkLapindrome(str));
        }
    }
}