import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortDicts {

    static void sortListOfDicts(List<HashMap<String, Integer>> listOfDicts, String key) {
        Collections.sort(listOfDicts, Comparator.comparingInt(dict -> dict.get(key)));
    }


    public static void main(String[] args) {
        List<HashMap<String, Integer>> listOfDicts = new ArrayList();

        HashMap<String, Integer> data = new HashMap<>();

        data.put("Ryan", 25);

        listOfDicts.add(data);

        sortListOfDicts(listOfDicts, "Ryan");

        for (HashMap<String, Integer> dict : listOfDicts) {
            System.out.println(dict);
        }
    }
}

