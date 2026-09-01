import java.util.*;

public class AnagramFinder {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count frequency of characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();

        // Initialize the first window
        for (int i = 0; i < windowSize; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = windowSize; i < s.length(); i++) {
            // Add the new character
            sCount[s.charAt(i) - 'a']++;
            // Remove the character that is sliding out
            sCount[s.charAt(i - windowSize) - 'a']--;

            // Check if current window is an anagram
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AnagramFinder finder = new AnagramFinder();

        // Example 1
        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println("Example 1:");
        System.out.println("Input: s = \"" + s1 + "\", p = \"" + p1 + "\"");
        System.out.println("Output: " + finder.findAnagrams(s1, p1));

        // Example 2
        String s2 = "abab";
        String p2 = "ab";
        System.out.println("\nExample 2:");
        System.out.println("Input: s = \"" + s2 + "\", p = \"" + p2 + "\"");
        System.out.println("Output: " + finder.findAnagrams(s2, p2));
    }
}