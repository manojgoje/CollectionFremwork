import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Learn_priority_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        //it only deal with Integer or number can not deal with null value

        pq.offer(100);
        pq.offer(150);
        pq.offer(200);
        pq.offer(250);
        pq.offer(300);
        pq.offer(350);
        pq.offer(400);

        System.out.println(pq);
        System.out.println(pq.peek());

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println( pq.contains(300));

        // if we wnat the priority queue act in reverce than use

        PriorityQueue pq1 = new PriorityQueue(Comparator.reverseOrder());
        pq1.offer(100);
        pq1.offer(150);
        pq1.offer(200);
        pq1.offer(250);
        pq1.offer(300);
        pq1.offer(350);
        pq1.offer(400);

        Iterator it = pq1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
