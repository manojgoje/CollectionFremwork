import java.util.HashSet;
import java.util.LinkedHashSet;

public class Learn_Set_hashset {
    public static void main(String[] args) {
//        HashSet hs = new HashSet();    // hashset and LinkedHashSet is 99.9% same only difernce is hashset does not follow order of insertion and Linked HasSet Follw order Of Insertion
        HashSet hs = new LinkedHashSet();
        hs.add("Aa");
        hs.add("Ba");
        hs.add("Ca");
        hs.add("Da");
        hs.add("Ea");;
        hs.add("Fa");
        hs.add("Ga");
        System.out.println(hs);

        System.out.println(hs.contains("BB"));
        System.out.println(hs.contains(9000));
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());


    }
}
