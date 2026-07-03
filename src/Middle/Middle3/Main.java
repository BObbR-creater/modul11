package Middle.Middle3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String line = "Старый князь в это утро был чрезвычайно ласков и старателен в своем обращении с дочерью. Это выражение старательности хорошо знала княжна Марья. Это было то выражение, которое бывало на его лице в те минуты, когда сухие руки его сжимались в кулак от досады за то, что княжна Марья не понимала арифметической задачи, и он, вставая, отходил от нее и тихим голосом повторял несколько раз одни и те же слова.";
        line = line.toLowerCase().replace(",", "").replace(":", "").replace(".", "");

        String[] array = line.split(" ");

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            stringList.add(array[i]);
        }

        Map<String, Integer> map = new HashMap<>();

        for (String o : stringList) {
            if (!map.containsKey(o)) {
                map.put(o, 1);
            } else {
                int oldMeaning = map.get(o);
                map.put(o, oldMeaning + 1);
            }
        }

        int maxCount = 0;
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            if (value.getValue() > maxCount) {
                maxCount = value.getValue();
            }
        }

        System.out.println("Максимальное количество повторений: " + maxCount);

        System.out.println("Самые частые слова:");
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            if (value.getValue() == maxCount) {
                System.out.println("'" + value.getKey() + "'" + " было написано - " + " [" + value.getValue() + "]" + " раз.");
            }
        }

    }

}
