import java.util.*;

public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {

        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {

            // If current character is same as previous,
            // delete the current character
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        return deletions;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {

            String s = sc.next();

            System.out.println(alternatingCharacters(s));
        }

        sc.close();
    }
}
