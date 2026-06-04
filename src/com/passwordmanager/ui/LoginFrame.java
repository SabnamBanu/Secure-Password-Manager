package com.passwordmanager.ui;

import javax.swing.*;
import com.passwordmanager.dao.UserDAO;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login");
        setSize(350,250);
        setLayout(null);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(
                LoginFrame.class.getResource("/logo.png")
        );
        setIconImage(icon.getImage());

        JLabel l1 = new JLabel("Username");
        l1.setBounds(50, 20, 100, 25);
        add(l1);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(50, 60, 100, 25);
        add(l2);

        JTextField user = new JTextField();
        user.setBounds(150,20,120,25);
        add(user);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(150,60,120,25);
        add(pass);

        JButton login = new JButton("Login");
        login.setBounds(100,100,100,25);
        add(login);

        JButton register = new JButton("Register");
        register.setBounds(100,130,100,25);
        add(register);

        login.addActionListener(e -> {
            UserDAO dao = new UserDAO();
            int id = dao.login(user.getText(), new String(pass.getPassword()));

            if (id != -1) {
                new DashboardFrame(id);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this,"Invalid");
            }
        });

        register.addActionListener(e -> new RegisterFrame());

        setVisible(true);
    }
}
