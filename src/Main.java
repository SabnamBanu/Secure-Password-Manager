class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
public class Main{
    public static void main(String[] args){
        Animal obj = new Animal(){
            void sound(){
                System.out.println("Dog barks");
            }
        };
        obj.sound();
    }
}