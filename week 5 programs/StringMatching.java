import java.util.*;

public class StringMatching {

    public static List<String> stringMatching(String[] words) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {

                // Don't compare the word with itself
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        List<String> result = stringMatching(words);

        System.out.println(result);

        sc.close();
    }
}