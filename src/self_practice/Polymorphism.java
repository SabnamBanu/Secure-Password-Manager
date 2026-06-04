package self_practice;

class Information{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("Name is: "+this.name);
    }
    public void printInfo(int age){
        System.out.println("Age is: "+this.age);
    }
    public void printInfo(){
        System.out.println("Name is: "+this.name);
        System.out.println("Age is: "+this.age);
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Information i1 = new Information();
        i1.name = "Shabnam\n";
        i1.age = 19;

        i1.printInfo(i1.name);
        i1.printInfo(i1.age);
        i1.printInfo();


    }
}
