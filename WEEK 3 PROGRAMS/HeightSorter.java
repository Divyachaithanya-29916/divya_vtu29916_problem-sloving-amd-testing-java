import java.util.*;

public class HeightSorter {

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        // Store height and name together
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            people[i] = new Person(names[i], heights[i]);
        }

        // Sort by height in descending order
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return b.height - a.height;
            }
        });

        // Create the result
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = people[i].name;
        }

        return result;
    }

    // Person class
    static class Person {
        String name;
        int height;

        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }

    // Main method only for running in VS Code
    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] result = sortPeople(names, heights);

        System.out.println(Arrays.toString(result));
    }
}