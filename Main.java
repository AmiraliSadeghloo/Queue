 import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Person> people = new HashMap<Integer, Person>();
        int x = 0, date = 0, i;
        Queue q = new Queue();
        for (i = 0; i < 29; i++) {
            date += x;
            x = (int) (Math.random() * 3);
            people = q.enqueue(people, date, x, i);

        }

    }
}

