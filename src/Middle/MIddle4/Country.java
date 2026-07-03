package Middle.MIddle4;

public class Country implements Comparable<Country>{

    String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Country other) {
        if (this.name.equals("Греция") && !other.name.equals("Греция")) {
            return -1;
        } else if (!this.name.equals("Греция") && other.name.equals("Греция")) {
            return 1;
        }else {
            return this.name.compareTo(other.name);
        }
    }


}
