import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class PythonToJava {

    static int secondSmallest(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        if (uniqueNumbers.size() > 1) {
            ArrayList<Integer> SortedUniqueNumbers = new ArrayList<>(uniqueNumbers);
            return SortedUniqueNumbers.get(1);
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(25);
        myNumbers.add(30);
        myNumbers.add(10);
        int result = secondSmallest(myNumbers);
        System.out.println("The second smallest number is: " +result);

    }
}