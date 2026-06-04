package self_practice;

interface A{
    void sound();
}
interface B{
    void walk();
}

class C implements A,B{
    public void sound(){
        System.out.println("Animal makes sound");
    }
    public void walk(){
        System.out.println("Animal walks");
    }

}
public class Interface {
    public static void main(String[] args){

        C c1 = new C();
        c1.sound();
        c1.walk();
    }
}
