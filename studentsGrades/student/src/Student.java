import java.util.Scanner;
import java.util.ArrayList;

public class Student {

    private String name;
    private char grade;
    private ArrayList<String> nameList = new ArrayList<String>();
    private ArrayList<char> gradeList = new ArrayList<char>();

    void addStudent(String name, char grade) {
        nameList.add(name);
        gradeList.add(grade);
    }

    public static void main(String[] args) {

    }
}
