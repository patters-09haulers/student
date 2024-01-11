// Course.java

public class Course {
    private int courseId;
    private String courseName;
    private Student[] students;
    private int studentCount;

    public Course(int courseId, String courseName, int maxStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Cannot add more students to the course.");
        }
    }

    public void display() {
        System.out.println("Course ID: " + courseId + ", Course Name: " + courseName);
        System.out.println("Students enrolled:");
        for (int i = 0; i < studentCount; ++i) {
            students[i].display();
        }
    }
}
