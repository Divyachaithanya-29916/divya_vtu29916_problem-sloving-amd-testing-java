import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

public class Priorities {

    public List<Student> getStudents(List<String> events) {

        // PriorityQueue comparator
        PriorityQueue<Student> queue = new PriorityQueue<>(
            new Comparator<Student>() {
                @Override
                public int compare(Student a, Student b) {

                    // 1. Higher CGPA first
                    if (a.getCGPA() != b.getCGPA()) {
                        return Double.compare(b.getCGPA(), a.getCGPA());
                    }

                    // 2. Same CGPA -> alphabetical name
                    int nameCompare = a.getName().compareTo(b.getName());

                    if (nameCompare != 0) {
                        return nameCompare;
                    }

                    // 3. Same CGPA and name -> smaller ID first
                    return Integer.compare(a.getID(), b.getID());
                }
            }
        );

        // Process events
        for (String event : events) {

            String[] parts = event.split(" ");

            if (parts[0].equals("ENTER")) {

                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                queue.add(new Student(id, name, cgpa));

            } else if (parts[0].equals("SERVED")) {

                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }

        // Get remaining students in priority order
        List<Student> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }

        return result;
    }

    // Main method for VS Code testing
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            events.add(scanner.nextLine());
        }

        Priorities priorities = new Priorities();

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }

        scanner.close();
    }
}