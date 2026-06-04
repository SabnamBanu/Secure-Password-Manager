package self_practice;

class Student1{
    int age;
    String name;
    int marks;

    Student1(int age,String name){
        this.age = age;
        this.name = name;
    }
    Student1(int age,String name,int marks){
        this.age = age;
        this.name = name;
        this.marks = marks;

    }
}

public class ContructorOverloading {
    public static void main(String[] args){
        Student1 s1 = new Student1(19,"Anu",98);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.marks);

    }



}

