package self_practice;

abstract class Vehicle{
    abstract void start();
    void name(){
        System.out.println("Shabnam");
    }
}
class BMW extends Vehicle{
    void start(){
        System.out.println("BMW is starting");
    }
}
class Toyota extends Vehicle{
    void start(){
        System.out.println("Toyota is starting");
    }
}
public class Abstraction {
    public static void main(String[] args){
        BMW c1 = new BMW();
        Toyota c2 = new Toyota();

        c1.start();
        c2.start();
    }
}
