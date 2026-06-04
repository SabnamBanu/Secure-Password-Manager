package com.passwordmanager.dao;

import com.passwordmanager.util.DBConnection;
import com.passwordmanager.util.Encryption;
import java.sql.*;
import java.util.*;

public class CredentialDAO {

    public void addCredential(int userId, String website, String username, String password) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "INSERT INTO credentials(user_id,website,site_username,site_password) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, userId);
            ps.setString(2, website);
            ps.setString(3, username);
            ps.setString(4, Encryption.encrypt(password));

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String[]> getCredentials(int userId) {
        List<String[]> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();
            String q = "SELECT * FROM credentials WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String website = rs.getString("website");
                String user = rs.getString("site_username");
                String pass = Encryption.decrypt(rs.getString("site_password"));

                list.add(new String[]{website, user, pass});
            }
        } catch (Exception e) {}

        return list;
    }

    public void deleteCredential(String website, int userId) {
        try {
            Connection con = DBConnection.getConnection();
            String q = "DELETE FROM credentials WHERE website=? AND user_id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, website);
            ps.setInt(2, userId);
            ps.executeUpdate();
        } catch (Exception e) {}
    }
}
