import java.util.*;
import java.util.stream.*;

public class CalculateAverage {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(75, 80, 65, 90, 85);
        int total = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);


        int maximum = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        int minimum = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}