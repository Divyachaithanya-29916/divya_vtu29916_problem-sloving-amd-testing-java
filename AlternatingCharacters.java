import java.util.Scanner;

class Solution {
    public static int alternatingCharacters(String s) {
        int deletions = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }
        
        return deletions;
    }
}

// Driver class to test in VS Code (reads input like HackerRank)
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int q = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline
        
        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            System.out.println(Solution.alternatingCharacters(s));
        }
        
        scanner.close();
    }
}