import java.util.ArrayList;
class student{
    String name;
    int id;

}
class Emplolyee{

    String name;
    int id;

}
public class GenericsApplying {
    public static void main(String[] args) {
//
//        student s1 = new student();
//        student s2 = new student();
//
//        Emplolyee em = new Emplolyee();
//        Emplolyee em2 = new Emplolyee();
//
//        ArrayList al = new ArrayList<>();
//        al.add(s1);
//        al.add(s2);
//        al.add(em);
//        al.add(em2);
//        System.out.println(al);

        // after applying Genrics here

        student s1 = new student();
        student s2 = new student();

        Emplolyee em = new Emplolyee();
        Emplolyee em2 = new Emplolyee();

        ArrayList <student> al = new ArrayList<student>();
        al.add(s1);
        al.add(s2);

        // if we add specific class name then we arraylist store object of that class only not a employee class
//        al.add(em);
//        al.add(em2);
        System.out.println(al);
    }
}
