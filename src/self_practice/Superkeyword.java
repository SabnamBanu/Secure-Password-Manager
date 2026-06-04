package self_practice;

//super here we used in constructor
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this .age = age;
    }
}
class Employee extends Person{
    int Emp_id;
    Employee(String name,int age,int Emp_id){
        super(name,age);
        this.Emp_id = Emp_id;
    }
    void showDetails(){
        System.out.println("Name: "+name+"\nAge: "+ age);
        System.out.println("Emp_id: "+Emp_id);
    }
}
public class Superkeyword {
    public static void main(String[] args){
        Employee e1 = new Employee("Shabnam",19,101);
        e1.showDetails();
    }
}


//super in methods
//class A1{
//    void show(){
//        System.out.println("this is method of A1");
//    }
//}
//class A2 extends A1{
//    void show(){
//        super.show();
//        System.out.println("this is method of A2");
//    }
//}
//public class Superkeyword{
//    public static void main(String[] args){
//        A2 a = new A2();
//        a.show();
//    }
//}


//super in variable
//class B1{
//    String name = "Shabnam";
//}
//class B2 extends B1{
//    int age = 19;
//    void showDetails(){
//        System.out.println("Name: "+super.name);
//        System.out.println("Age: "+ age);
//    }
//}
//
//public class Superkeyword{
//    public static void main(String[] args){
//        B2 b = new B2();
//        b.showDetails();
//    }
//}