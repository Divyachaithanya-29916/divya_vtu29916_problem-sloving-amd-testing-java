import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Total number of integers
        int m = sc.nextInt(); // Size of the subarray

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            deque.addLast(num);
            set.add(num);

            if (deque.size() == m) {
                max = Math.max(max, set.size());

                int first = deque.removeFirst();

                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}