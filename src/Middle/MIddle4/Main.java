package Middle.MIddle4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Country> countries = new TreeSet<>();
        countries.add(new Country("Япония"));
        countries.add(new Country("Россия"));
        countries.add(new Country("Франция"));
        countries.add(new Country("Испания"));
        countries.add(new Country("США"));
        countries.add(new Country("Турция"));
        countries.add(new Country("Мексика"));
        countries.add(new Country("Китай"));
        countries.add(new Country("Великобритания"));
        countries.add(new Country("Таиланд"));
        countries.add(new Country("Греция"));
        countries.add(new Country("Австралия"));
        countries.add(new Country("Германия"));

        System.out.println(countries);
    }
}
