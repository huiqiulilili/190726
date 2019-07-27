
class Person{
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("姓名：" + name + ",年龄： " + age);
    }
}
class Practice1{
    public static void main(String[] args) {
//        Person person = new Person("张三",20);
//        person.print();

    }
}
