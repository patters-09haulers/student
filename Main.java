// Main.java

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student alice = new Student(1, "Alice", 85.5);

        // Create a course
        Course mathCourse = new Course(101, "Mathematics", 5);

        // Add the student to the course
        mathCourse.addStudent(alice);

        // Display the course details
        mathCourse.display();
    }
}
