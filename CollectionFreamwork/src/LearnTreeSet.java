import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {

        // treeset use the Binar sort tree for sorting

        TreeSet ts = new TreeSet();

        ts.add("manoj");
        ts.add("goje");
        ts.add("Pranav");
        ts.add("rahul");
        ts.add("Pratik");
        ts.add("umesh");
        ts.add("Dipak");

        System.out.println(ts);
        System.out.println(ts.contains("manoj"));
        System.out.println(ts.isEmpty());
        ts.remove("Dipak");
        System.out.println(ts);
        System.out.println(ts.size());


        TreeSet ts1 = new TreeSet();

        ts1.add(23);
        ts1.add(47);
        ts1.add(57);
        ts1.add(87);
        ts1.add(3);
        ts1.add(41);
        ts1.add(56);
        System.out.println(ts1);
        System.out.println(ts1.contains(90));
        System.out.println(ts1.isEmpty());
        ts1.remove(57);
        System.out.println(ts1);
        System.out.println(ts1.size());

    }
}
