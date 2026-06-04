package self_practice;

class Info{
    private String password;

    public String getPassword(){

        return "Password is: "+this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Info s1 = new Info();
        s1.setPassword("abcd123");
        System.out.println(s1.getPassword());
    }
}
