import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        // Create student instances and add them to the list
        studentList.add(new Student("Ryan", 85));
        studentList.add(new Student("Sydnie", 90));
        studentList.add(new Student("Jim", 77));

        // Display the list of students and their grades
        System.out.println("Student List:");
        for (Student student : studentList) {
            System.out.println(student.getName() + ": " + student.getGrade());
        }

        // Calculate and display the average grade
        double totalGrade = 0.0;
        for (Student student : studentList) {
            totalGrade += student.getGrade();
        }
        double average = totalGrade / studentList.size();
        System.out.println("The class's average grade is " + average);
    }
}

