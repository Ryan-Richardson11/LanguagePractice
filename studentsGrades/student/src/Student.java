import java.util.Scanner;
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
        for (int i = 0; i < gradeList; i++){
            total += gradeList[i];
            count += 1;
        }
        return total / count;
    }

    void displayList(){
        for (int i = 0; i < nameList; i++){
            for (int j = 0; j < gradeList; j++){
                System.out.println(i + " " + j +"\n");
            }
        }
    }

    public static void main(String[] args) {

    }
}
