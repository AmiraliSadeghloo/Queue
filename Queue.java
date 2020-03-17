import java.util.HashMap;
import java.util.Scanner;

public class Queue {
    HashMap<Integer, Person> people = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    int date, x, i;

    public HashMap enqueue(HashMap people, int date, int x, int i) {
        this.i = i;
        this.x = x;
        this.date = date;
        this.people = people;
        int f = (2 * i) - x;
        System.out.println("enter name for a person");
        String s = scanner.nextLine();
        Person p = new Person(s, date);
        people.put(f, p);
        return people;
    }

    
}
