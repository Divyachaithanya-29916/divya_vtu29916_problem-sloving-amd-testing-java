import java.util.*;

public class PalindromeIndex {

    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Check if removing left character works
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }
                // Check if removing right character works
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }
                // No solution
                return -1;
            }
            left++;
            right--;
        }
        // Already a palindrome
        return -1;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline

        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            System.out.println(palindromeIndex(s));
        }

        scanner.close();
    }
}