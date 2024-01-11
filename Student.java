// Student.java

public class Student {
    private int studentId;
    private String name;
    private double grade;

    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + ", Grade: " + grade);
    }
}
