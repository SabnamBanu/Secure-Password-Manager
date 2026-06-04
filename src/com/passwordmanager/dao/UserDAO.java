package com.passwordmanager.dao;

import com.passwordmanager.util.DBConnection;
import java.sql.*;

public class UserDAO {

    public boolean register(String username, String password) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "INSERT INTO users(username,password) VALUES(?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int login(String username, String password) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {}
        return -1;
    }
}