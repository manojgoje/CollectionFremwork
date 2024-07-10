import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Accesing_data_using_Itrator {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);

//        System.out.println(al);

        // we can fetch the data by using for loop but it is not recommended

//        for (int i =0;i<al.size();i++)
//        {
//            System.out.println(al.get(i));
//        }

//        Iterator itr = al.iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//
//        }


        // or we can use ListIterator in only List class

        ListIterator litr = al.listIterator(al.size());

        while (litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }
}
