import java.util.Iterator;
import java.util.Stack;

public class Stack_Learn_in_List {
    public static void main(String[] args) {

        Stack st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println(st.peek());

        st.pop();
        System.out.println(st);
        System.out.println(  st.search(30));
        Iterator it = st.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
