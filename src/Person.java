import java.util.Comparator;

public class Person implements Comparator {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
    @Override
    public String toString() {
        return "" + name + " - " + age;
    }
}

