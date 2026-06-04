package self_practice;

public class EgOfExceptionHandling {
    public static void main(String[] args){
        int[] marks = {78,97,95};
        try{
            System.out.println(marks[5]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello Everyone!!");
    }
}
