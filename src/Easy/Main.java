package Easy;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Василий Пупкин", "01.01.1990");
        Human human2 = new Human("Василий Пупкин", "01.01.1990");
        Human human3 = human2;
        System.out.println(human1.equals(human2));
        System.out.println(human3.equals(human2));
    }
}
