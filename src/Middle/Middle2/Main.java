package Middle.Middle2;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(3);
        integerSet.add(5);
        integerSet.add(6);
        integerSet.add(7);
        integerSet.add(7);
        integerSet.add(7);
        integerSet.add(8);

        System.out.println("Уникальых чисел - " + integerSet.size());
    }

}
