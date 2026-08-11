import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of lines
        int n = sc.nextInt();

        // ArrayList containing ArrayLists
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        // Read each line
        for (int i = 0; i < n; i++) {

            int count = sc.nextInt();

            ArrayList<Integer> numbers = new ArrayList<>();

            for (int j = 0; j < count; j++) {
                numbers.add(sc.nextInt());
            }

            lines.add(numbers);
        }

        // Number of queries
        int queries = sc.nextInt();

        // Process queries
        for (int i = 0; i < queries; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // Convert 1-based positions to 0-based indexes
            if (x >= 1 && x <= lines.size()
                    && y >= 1 && y <= lines.get(x - 1).size()) {

                System.out.println(lines.get(x - 1).get(y - 1));

            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}