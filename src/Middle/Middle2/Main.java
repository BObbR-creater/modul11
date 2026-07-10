package Middle.Middle2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это счётчик уникальных чисел!");
        System.out.println("Вводи любые числа, чтобы завершить нажми - 0");

        int me = scanner.nextInt();
        while (me != 0){
            integerSet.add(me);
            me = scanner.nextInt();
        }

        System.out.println("Коллекция - " + integerSet);
        System.out.println("Уникальых чисел - " + integerSet.size());
    }

}
