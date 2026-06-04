
class Pen{
    String color;
    String type;

    public void printPen(){
        System.out.println("Color is: "+this.color);
        System.out.println("And it's type is: "+this.type);
    }
}

public class ThisUsingMethods{
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "Ball";
        p1.printPen();

        System.out.println();

        Pen p2 = new Pen();
        p2.color = "Blue";
        p2.type = "Jell";
        p2.printPen();

    }

}