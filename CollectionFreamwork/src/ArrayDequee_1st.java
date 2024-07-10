import java.util.ArrayDeque;

public class ArrayDequee_1st {
    public static void main(String[] args) {

        ArrayDeque ad1 = new ArrayDeque();

        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        ad1.add(400);
        System.out.println(ad1);

        ad1.addLast("last");
        ad1.addFirst("first");

        System.out.println(ad1);

        System.out.println("****************************************");
        // offer() method is also works like a add () method but there is no gurentee of data add in queue in offer()


        ArrayDeque al2 = new ArrayDeque();

        al2.offer("A");
        al2.offer("B");
        al2.offer("C");
        al2.offer("D");
        al2.offer("E");

        al2.offerFirst("Manoj");
        al2.addLast("Goje");
        System.out.println(al2);



    }
}
