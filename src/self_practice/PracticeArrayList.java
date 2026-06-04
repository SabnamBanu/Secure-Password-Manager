package self_practice;
import java.util.*;

public class PracticeArrayList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Shabnam");
        list.add("Maya");
        list.add("Riya");
        System.out.println(list);
        list.add(1,"Shreya");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.contains("Riya"));

    }
}
