class Person2{
    public Person2(){
        System.out.println("**Person2类对象产生**");
    }

}

class Student2 extends Person2{
    public Student2(){
        super();
        System.out.println("**Student2类对象产生**");
    }
}
public class Practice2 {
    public static void main(String[] args) {
        new Student2();
    }
}
