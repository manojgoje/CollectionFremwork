import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);

        System.out.println(al);
        al.add(2,5000);
        System.out.println(al);

        al.remove(2);
        System.out.println(al);

        al.set(2,9000);
        System.out.println(al);

        System.out.println(al.contains(300));

        System.out.println(al.get(4));

        ArrayList al3 = new ArrayList<>();
        al3.add("A");
        al3.add("B");
        al3.add("C");
        al3.add("D");
        al3.add("E");

        al3.addAll(al);
        System.out.println(al3);
        // fetching Data From The List

        for (int i=0;i<al3.size();i++) {
            System.out.println(al3.get(i));
        }

        Iterator it = al3.listIterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
