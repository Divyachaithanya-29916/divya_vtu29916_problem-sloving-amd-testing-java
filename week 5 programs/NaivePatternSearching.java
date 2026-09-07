import java.util.*;

public class NaivePatternSearching {

    public static List<Integer> searchPattern(String text, String pattern) {

        List<Integer> result = new ArrayList<>();

        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {

            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        List<Integer> result = searchPattern(text, pattern);

        System.out.println(result);

        sc.close();
    }
}