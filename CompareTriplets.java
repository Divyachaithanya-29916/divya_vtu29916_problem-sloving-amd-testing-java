import java.util.*;

class Solution {
    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
            // if equal → do nothing
        }

        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // ========== Sample Input 0 ==========
        List<Integer> a1 = Arrays.asList(5, 6, 7);
        List<Integer> b1 = Arrays.asList(3, 6, 10);

        List<Integer> result1 = sol.compareTriplets(a1, b1);
        System.out.println("Sample Input 0:");
        System.out.println("Alice: " + a1);
        System.out.println("Bob  : " + b1);
        System.out.println("Output: " + result1.get(0) + " " + result1.get(1));
        System.out.println();

        // ========== Sample Input 1 ==========
        List<Integer> a2 = Arrays.asList(17, 28, 30);
        List<Integer> b2 = Arrays.asList(99, 16, 8);

        List<Integer> result2 = sol.compareTriplets(a2, b2);
        System.out.println("Sample Input 1:");
        System.out.println("Alice: " + a2);
        System.out.println("Bob  : " + b2);
        System.out.println("Output: " + result2.get(0) + " " + result2.get(1));
    }
}