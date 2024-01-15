package dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class UserDAO {

    public static User authenticateUser(String username, String password) {
        
        User user= null;
        try {
            Connection conn = dbConnect.Connection();
            String sql = "SELECT * FROM tbUser WHERE username=? AND PASSWORD=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                System.out.println("rs: " + rs);
                user = new User();
                user.userID = rs.getInt("userID");
                user.name = rs.getString("name");
                user.username = rs.getString("username");
                user.email = rs.getString("email");
                user.gender = rs.getString("gender");        
                user.bod = rs.getString("bod");
                user.role = rs.getString("role");
                user.phone = rs.getString("phone");
                user.PASSWORD = rs.getString("PASSWORD");

            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return user;
    }

    public static List<User> get(int id) {
        List<User> ds = new ArrayList<>();

        // 1. tao connect voi db"sem2-demo", neu thanh cong ket noi luu trong nien cn
        Connection cn = dbConnect.Connection();
        if (cn != null) {
            try {
                //2. tao doi tuong doi tuong Statment de thuc hien lenh select-sql
                Statement st = cn.createStatement();
//                //3. thi hanh lenh select, 
//                //neu chay lenh executeQuery()  : chay lenh SELECT ->ket qua tra  ve la ResultSet
//                //neu chay lenh executeUpdate() : chay lenh INSERT, UPDATE, CREATE... -> ket qua tra ve la 1 so nguyen
//                //neu chay lenh execute()       : chay nhieu lenh SELECT 
               String sql = "select * from tbUser where userid LIKE ?";
                ResultSet rs = st.executeQuery(sql);


                //4. duyet su lieu trong 'rs', luu vo 'ds'
                while (rs.next()) {
                    //doc dong hien tai, tao thanh 1 doi tuong User
                    User b = new User();
                    b.userID = rs.getInt("userID");
                    b.name = rs.getString("name");
                    b.phone = rs.getString("phone");
                    b.gender = rs.getString("gender");
                    b.bod = rs.getString("bod");
                    b.role = rs.getString("role");
                    b.username = rs.getString("username");
                    b.PASSWORD = rs.getString("PASSWORD");
                    b.email = rs.getString("email");

                    ds.add(b);
                    System.out.println("");
                }
                //5. dong tai nguyen
                rs.close();
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.err.println(">> LOi:" + ex.getMessage());
            }

        }
        return ds;

    }
    
    
    /// update
    public static User useUpdate(int userID ,   String name,String phone,String gender, String bod,String email) {
        
        User user= null;
        try {
            Connection conn = dbConnect.Connection();
            String sql = "SELECT * FROM tbUser WHERE userID=? ";
            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, userID);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, gender);
            ps.setString(4, bod);
            ps.setString(5, email);
            
            ps.setInt(6, userID);
            
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                System.out.println("rs: " + rs);
                user = new User();
//                user.userID = rs.getInt("userID");
                user.name = rs.getString("name");
                user.username = rs.getString("username");
                user.email = rs.getString("email");
                user.gender = rs.getString("gender");        
                user.bod = rs.getString("bod");
                user.role = rs.getString("role");
                user.phone = rs.getString("phone");
                user.PASSWORD = rs.getString("PASSWORD");

            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return user;
    }
}
