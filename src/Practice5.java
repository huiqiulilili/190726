class Person5{
    public void fun(){
        this.print();
    }

    private void print(){
        System.out.println("Person中的print方法");
    }
}

class Student5 extends Person5{
    public void print(){
        System.out.println("Student中的方法");
    }
}
public class Practice5 {

    public static void main(String[] args) {
        new Student5().fun();
    }
}
