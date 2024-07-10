import java.util.LinkedList;

public class LearnQueue_LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.offer(10);
        ll.offer(20);
        ll.offer(30);
        ll.offer(40);
        ll.offer(50);
        System.out.println(ll);
        System.out.println(ll.peek());

        System.out.println(ll.poll());
        System.out.println(ll);

        ll.add(2,2000);
        System.out.println(ll);
    }
}
