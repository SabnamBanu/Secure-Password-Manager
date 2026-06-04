package self_practice;

class Animal1{
    void sound(){
        System.out.println("Animal makes sound.");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){
        Animal a = new Animal(){
            @Override
            public void sound(){
                System.out.println("Dog barks");
            }
        };
        a.sound();
    }
}
