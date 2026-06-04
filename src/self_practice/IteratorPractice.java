package self_practice;
import java.util.*;

public class IteratorPractice {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Shabnam");
        list.add("Ronak");
        list.add("Jisha");
        list.add("Trisha");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String name = it.next();
            if(name.equals("Ronak")){
                it.remove();
            }
        }
        System.out.println(list);
    }

}
