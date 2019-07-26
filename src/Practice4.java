class Person4{
    public void print(){
        System.out.println("Person");
    }
}

class Student4 extends Person4{
    public void print(){
        System.out.println("Student");
    }
}
public class Practice4 {
    public static void main(String[] args) {
        new Student4().print();
    }
}
