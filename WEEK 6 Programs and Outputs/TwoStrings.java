import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        
        // Add all characters of the first string to the set
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        
        // Check if any character of the second string exists in the set
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            System.out.println(twoStrings(s1, s2));
        }
        sc.close();
    }
}