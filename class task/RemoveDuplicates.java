import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 20, 10, 30, 20, 40, 30
        );

        // Remove duplicates using distinct()
        List<Integer> result = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}