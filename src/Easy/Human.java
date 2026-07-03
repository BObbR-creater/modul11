package Easy;

public class Human {
    private String birthday;
    private String fio;

    public Human(String fio, String birthday) {
        this.fio = fio;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "FIO " + fio + " Birthday " + birthday;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Human humanObj = (Human) obj;
        boolean result = fio.equals(humanObj.fio)
                && birthday.equals(humanObj.birthday);
        return result;
    }

    @Override
    public int hashCode() {
        return fio.hashCode() + birthday.hashCode();
    }
}
