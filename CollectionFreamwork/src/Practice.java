class Demo{
    private String name;
    private int age;
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public int setAge(int age){
        this.age = age;
        return age;
    }
    public void getName(){
        System.out.println(name);
    }
    public void getAge(){
        System.out.println(age);

    }


}



public class Practice {
    public static void main(String[] args) {
        System.out.println("Main Class");
        Demo d1 = new Demo();
       d1.setName("Manoj");
        d1.setAge(20);
        d1.getName();
        d1.getAge();
    }
}


