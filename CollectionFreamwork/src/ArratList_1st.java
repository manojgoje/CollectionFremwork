import java.util.ArrayList;

public class ArratList_1st {
    public static void main(String[] args) {

        ArrayList ar1 = new ArrayList();

        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(50);
        ar1.add(60);

        System.out.println(ar1);

        System.out.println("*****************************************");

        ArrayList al2  = new ArrayList();
        al2.add("A");
        al2.add("B");
        al2.add("C");
        al2.add("D");
        al2.add("E");
        al2.add("100");

        System.out.println(al2);

        System.out.println("*****************************************");

        // adding al1 Collection in al2 collection
        al2.addAll(ar1);
        System.out.println(al2);



        // adding element at specific index

        ArrayList al3 = new ArrayList();
        System.out.println("**********************************");

        al3.add("a");
        al3.add("b");
        al3.add("c");
        al3.add("d");
        al3.add("e");
        System.out.println(al3);

        System.out.println("After Changing Element at 3 index");
        al3.add(2,"C");

        System.out.println(al3);


        //adding an collection in specific index

        ArrayList al4 = new ArrayList();

        al4.add(100);
        al4.add(200);
        al4.add(300);
        al4.add(400);
        al4.add(500);

        al4.addAll(2,ar1);

        System.out.println(al4);





    }

}
