package self_practice;

class test{
    static void call(){
        System.out.println("Calling static method");
    }
}

public class EfOfStaticKeyword {
//    static void display(){
//        System.out.println("'This is static method'");
//    }
    public static void main(String[] args){
//        display();
        test.call();
    }
}
