package Middle.Middle4;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        if (o1.name.equals("Греция") && !o2.name.equals("Греция")) {
            return -1;
        } else if (!o1.name.equals("Греция") && o2.name.equals("Греция")) {
            return 1;
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
}