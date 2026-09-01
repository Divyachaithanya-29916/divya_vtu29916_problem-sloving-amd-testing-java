public class RotateString {
    public boolean rotateString(String s, String goal) {
        // Strings of different lengths can never be rotations of each other
        if (s.length() != goal.length()) {
            return false;
        }
        // A string is a rotation of another if goal appears in (s + s)
        return (s + s).contains(goal);
    }

    // For testing in VS Code
    public static void main(String[] args) {
        RotateString sol = new RotateString();

        System.out.println(sol.rotateString("abcde", "cdeab")); // true
        System.out.println(sol.rotateString("abcde", "abced")); // false
        System.out.println(sol.rotateString("aa", "aa"));       // true
    }
}