import java.util.ArrayList;

public class GFG {

    // Function to search for all occurrences of 'pat' in 'txt' using Naive Approach
    static ArrayList<Integer> search(String pat, String txt) {
        // Length of the pattern
        int m = pat.length();
        // Length of the text
        int n = txt.length();

        ArrayList<Integer> ans = new ArrayList<>();

        // Slide the pattern over text one by one
        for (int i = 0; i <= n - m; i++) {
            int j;

            // Check for pattern match at index i
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            }

            // If pattern matches, store index
            if (j == m)
                ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String txt = "aabaacaadaabaaba";
        String pat = "aaba";

        ArrayList<Integer> res = search(pat, txt);

        for (int it : res) {
            System.out.print(it + " ");
        }
    }
}