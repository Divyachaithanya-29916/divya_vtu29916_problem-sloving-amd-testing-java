import java.util.*;

public class PatternMatcher {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            Map<Character, Character> patternToWord = new HashMap<>();
            Map<Character, Character> wordToPattern = new HashMap<>();

            boolean match = true;

            for (int i = 0; i < pattern.length(); i++) {
                char p = pattern.charAt(i);
                char w = word.charAt(i);

                // Check pattern -> word mapping
                if (patternToWord.containsKey(p) && patternToWord.get(p) != w) {
                    match = false;
                    break;
                }

                // Check word -> pattern mapping
                if (wordToPattern.containsKey(w) && wordToPattern.get(w) != p) {
                    match = false;
                    break;
                }

                patternToWord.put(p, w);
                wordToPattern.put(w, p);
            }

            if (match) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        List<String> answer = findAndReplacePattern(words, pattern);

        System.out.println(answer);
    }
}