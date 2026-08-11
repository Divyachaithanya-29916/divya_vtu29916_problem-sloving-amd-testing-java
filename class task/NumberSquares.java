import java.util.*;
import java.util.stream.Collectors;

public class NumberSquares {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // map() is used to square each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squares);
    }
}