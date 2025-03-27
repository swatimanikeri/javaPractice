import java.util.*;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student other) {
        if (this.cgpa != other.cgpa) {
            return Double.compare(other.cgpa, this.cgpa); // Higher CGPA first
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name); // Alphabetical order
        } else {
            return Integer.compare(this.id, other.id); // Lower ID first
        }
    }
}

class Priorities {
    private PriorityQueue<Student> queue = new PriorityQueue<>();

    public List<Student> getStudents(List<String> events) {
        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                queue.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED") && !queue.isEmpty()) {
                queue.poll();
            }
        }

        List<Student> remainingStudents = new ArrayList<>(queue);
        remainingStudents.sort(Collections.reverseOrder()); // Ensures correct order

        return remainingStudents;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEvents = Integer.parseInt(scanner.nextLine().trim()); // Trim input

        List<String> events = new ArrayList<>();
        for (int i = 0; i < totalEvents; i++) {
            String line = scanner.nextLine().trim(); // Trim input
            if (!line.isEmpty()) {
                events.add(line);
            }
        }
        scanner.close();

        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}
