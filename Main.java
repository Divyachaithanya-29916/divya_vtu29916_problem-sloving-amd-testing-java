import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int n = s.length();
        int mid = n / 2;

        int count1 = 0; // vowels in first half
        int count2 = 0; // vowels in second half

        // Count vowels in first half (0 to mid-1)
        for (int i = 0; i < mid; i++) {
            if (vowels.contains(s.charAt(i))) {
                count1++;
            }
        }

        // Count vowels in second half (mid to n-1)
        for (int i = mid; i < n; i++) {
            if (vowels.contains(s.charAt(i))) {
                count2++;
            }
        }

        return count1 == count2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Example 1
        String s1 = "book";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + sol.halvesAreAlike(s1));
        System.out.println();

        // Test Example 2
        String s2 = "textbook";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + sol.halvesAreAlike(s2));
        System.out.println();

        // Extra test
        String s3 = "AbCdEfGh";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + sol.halvesAreAlike(s3));
    }
}