import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String left = sc.next();
            String right = sc.next();

            set.add(left + " " + right);
            System.out.println(set.size());
        }

        sc.close();
    }
}