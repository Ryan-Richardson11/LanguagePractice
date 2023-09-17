import java.util.ArrayList;

public class Student {

    private String name;
    private int grade;
    private ArrayList<String> nameList = new ArrayList<String>();
    private ArrayList<Integer> gradeList = new ArrayList<Integer>();

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    void addStudent(String name, int grade) {
        nameList.add(name);
        gradeList.add(grade);
    }

    int averageGrade(){
        int total = 0;
        int count = 0;
        for (int i = 0; i < gradeList.size(); i++){
            total += gradeList.get(i);
            count ++;
        }
        return total / count;
    }

    void displayList(){
        for (int i = 0; i < nameList.size(); i++){
            for (int j = 0; j < gradeList.size(); j++){
                System.out.println(nameList.get(i) + " " + gradeList.get(j));
            }
        }
    }

    public static void main(String[] args) {
        Student myStudents = new Student("Ryan", 85);
        myStudents.addStudent("Sydnie", 90);
        myStudents.addStudent("Jim", 77);
        myStudents.displayList();
        double average = myStudents.averageGrade();
        System.out.println("The classes average grade is " + average);
    }
}
