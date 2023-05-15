import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] arr = sc.nextLine().split(" ");
            if (Integer.parseInt(arr[1]) > 30) {
                personArrayList.add(new Person(arr[0], Integer.parseInt(arr[1])));
            }
        }
        Comparator<Person> comparator = Comparator.comparing (obj -> obj.getAge());
        personArrayList.sort(comparator);
        for (Person p: personArrayList) {
            System.out.println(p.toString());
        }

    }
}