package com.passwordmanager.ui;

import javax.swing.*;
import com.passwordmanager.dao.CredentialDAO;
import java.util.List;

public class DashboardFrame extends JFrame {

    public DashboardFrame(int userId) {
        setTitle("Dashboard");
        setSize(450,350);
        setLayout(null);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel l1 = new JLabel("Website");
        l1.setBounds(20, 0, 100, 20);
        add(l1);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(150, 0, 100, 20);
        add(l2);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(280, 0, 100, 20);
        add(l3);

        JTextField site = new JTextField();
        site.setBounds(20,20,120,25);
        add(site);

        JTextField user = new JTextField();
        user.setBounds(150,20,120,25);
        add(user);

        JTextField pass = new JTextField();
        pass.setBounds(280,20,100,25);
        add(pass);

        String[] columns = {"Website", "Username", "Password"};

        javax.swing.table.DefaultTableModel model =
                new javax.swing.table.DefaultTableModel(columns, 0);

        JTable table = new JTable(model);

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(20, 60, 360, 150);
        add(scroll);

        JButton add = new JButton("Add");
        add.setBounds(50,220,80,25);
        add(add);

        JButton view = new JButton("View");
        view.setBounds(150,220,80,25);
        add(view);

        JButton delete = new JButton("Delete");
        delete.setBounds(250,220,80,25);
        add(delete);

        CredentialDAO dao = new CredentialDAO();

        add.addActionListener(e -> {
            dao.addCredential(userId, site.getText(), user.getText(), pass.getText());
            JOptionPane.showMessageDialog(this,"Added");

            //clear fields
            site.setText("");
            user.setText("");
            pass.setText("");

            // refresh table
            model.setRowCount(0);
            List<String[]> list = dao.getCredentials(userId);
            for (String[] row : list) {
                model.addRow(row);
            }
        });

        view.addActionListener(e -> {

            model.setRowCount(0); // 1️⃣ clear old data

            List<String[]> list = dao.getCredentials(userId); // 2️⃣ get data from DB

            for (String[] row : list) { // 3️⃣ loop through data
                model.addRow(row);     // 4️⃣ add each row to table
            }
        });

        delete.addActionListener(e -> {
            dao.deleteCredential(site.getText(), userId);
            JOptionPane.showMessageDialog(this,"Deleted");
        });

        setVisible(true);
    }
}
