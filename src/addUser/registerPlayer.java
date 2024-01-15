/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addUser;

import dao.dbConnect;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class registerPlayer {

    public void insertPlayer(String name, String phone, String gender, String bod, String role, String username, String PASSWORD, String email) {
        Connection cn = dbConnect.Connection();
        PreparedStatement ps;

        try {
            ps = cn.prepareStatement("insert into tbUser(name,phone,gender,bod,role,username,PASSWORD,email) values (?,?,?,?,?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, gender);
            ps.setString(4, bod);
            ps.setString(5, role);
            ps.setString(6, username);
            ps.setString(7, PASSWORD);
            ps.setString(8, email);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New player");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
public void UpdatePlayer(String name, String phone, String gender,String bod, String email, int userID){
    Connection cn = dbConnect.Connection();
        PreparedStatement ps;
        
        try {
         ps = cn.prepareStatement("UPDATE tbUser SET name=?, phone=?, gender=?, bod=?, email=? WHERE userID=?");

            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, gender);
            ps.setString(4, bod);            
            ps.setString(5, email);
            ps.setInt(6, userID);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New player");
            }
    } catch (Exception e) {
         e.printStackTrace();
    }
}
    public static void main(String[] args) {
        registerPlayer regis = new registerPlayer();
        regis.UpdatePlayer("quy", "46215", "Female", "2000-03-04", "quy@gmail.com", 12);
        
        
    }
   
}
