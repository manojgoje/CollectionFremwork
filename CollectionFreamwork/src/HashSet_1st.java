import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashSet_1st {
    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(11);
        hs.add(21);
        hs.add(31);
        hs.add(42);
        hs.add(53);
        hs.add(200);
        hs.add(900);
        hs.add(999);
        hs.add(989);


        // it followes the Hash table
        // default size is 16 when 75% is feilld then it automatically expand tp dobule
        System.out.println(hs);
        System.out.println(hs.hashCode());

        System.out.println("*********************************************************");

        // if we want to preserve the insertion order then we use the LinkedHashSet Class

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(200);
        lhs.add(300);
        lhs.add(400);
        lhs.add(500);
        lhs.add(600);
        lhs.add(700);
        System.out.println(lhs);
    }
}
