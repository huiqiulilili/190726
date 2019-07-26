class Person3{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Student3 extends Person3{
    public void fun(){
        System.out.println(getName());
    }
}
public class Practice3 {
    public static void main(String[] args) {
        Student3 student3 = new Student3();
        student3.setName("张三");
        System.out.println(student3.getName());
        student3.fun();
    }
}
