package self_practice;
import javax.swing.*;
import java.awt.FlowLayout;

public class SwingExample {
    public static void main(String[] args){
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(350,400);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username: ");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);
        JLabel l2 = new JLabel("Password: ");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JButton btn = new JButton("Submit");
        f.add(btn);


    }
}
