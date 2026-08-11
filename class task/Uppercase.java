import java.util.*;
import java.util.stream.Collectors;

public class Uppercase {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "arun",
            "bala",
            "charan",
            "dinesh"
        );
        List<String> uppercaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);
    }
}