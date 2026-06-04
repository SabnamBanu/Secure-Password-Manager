package self_practice;
import java.util.Arrays;


public class Arrayss {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 78;
        marks[1] = 98;
        marks[2] = 88;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println("\n");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

    }
}
