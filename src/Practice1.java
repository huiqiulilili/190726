class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Student extends Person{
    private String school;

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }

}
public class Practice1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(10);
        student.setName("张三");
        student.setSchool("北京大学");
        System.out.println("姓名:" + student.getName() + ",年龄：" + student.getAge()+",学校："+student.getSchool());
    }
}
