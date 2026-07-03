package Middle.Middle1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String line = "Идут три брата: брат Клим брит, брат Глеб брит, брат Игнат бородат.";

        line = line.toLowerCase().replace(",", "").replace(":", "").replace(".", "");
        String[] array = line.split(" ");

        List<String> listWord = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            listWord.add(array[i]);
        }

        Map<String, Integer> map = new HashMap<>();

        for (String o : listWord) {
            if (!map.containsKey(o)) {
                map.put(o, 1);
            } else {
                int oldMeaning = map.get(o);
                map.put(o, oldMeaning + 1);
            }
        }
        System.out.println(map);
    }

}
