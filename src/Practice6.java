class Person6{
    public String info = "Person";
}

class Student6 extends Person6{
    public String info = "Student";
}
public class Practice6 {
    public static void main(String[] args) {
        System.out.println(new Student6().info);
    }
}
