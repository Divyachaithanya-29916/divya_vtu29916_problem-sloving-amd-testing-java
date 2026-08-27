import java.util.HashMap;
import java.util.Map;

class SolutionLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> lastIndex = new HashMap<>();
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
                left = lastIndex.get(c) + 1;
            }
            lastIndex.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

class MainLongestSubstring {
    public static void main(String[] args) {
        SolutionLongestSubstring sol = new SolutionLongestSubstring();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));     // 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));    // 3
    }
}