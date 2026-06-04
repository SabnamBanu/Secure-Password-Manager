package com.passwordmanager.ui;

import javax.swing.*;
import com.passwordmanager.dao.UserDAO;

public class RegisterFrame extends JFrame {

    public RegisterFrame() {
        setTitle("Register - Password Manager");
        setSize(350,250);
        setLayout(null);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(30, 20, 100, 25);
        add(l1);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(30, 70, 100, 25);
        add(l2);

        JTextField user = new JTextField();
        user.setBounds(140,20,150,25);
        add(user);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(140,70,150,25);
        add(pass);

        JButton btn = new JButton("Register");
        btn.setBounds(120,120,100,30);
        add(btn);

        btn.addActionListener(e -> {
            UserDAO dao = new UserDAO();
            if (dao.register(user.getText(), new String(pass.getPassword()))) {
                JOptionPane.showMessageDialog(this,"Success");
            }
        });

        setVisible(true);
    }
}
