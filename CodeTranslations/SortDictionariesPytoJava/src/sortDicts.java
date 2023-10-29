import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class sortDicts {

    static void sortListOfDicts(List<HashMap<String, Integer>> listOfDicts, String key) {
        Collections.sort(listOfDicts, Comparator.comparingInt(dict -> dict.get(key)));
    }


    public static void main(String[] args) {

    }
}
