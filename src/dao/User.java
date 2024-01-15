/*
 
 */
package dao;

public class User {

    public int userID;
    public String name;
    public String phone;
    public String gender;
    public String bod;
    public String role;
    public String username;
    public String PASSWORD;
    public String email;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", name=" + name + ", phone=" + phone + ", gender=" + gender + ", bod=" + bod + ", role=" + role + ", username=" + username + ", PASSWORD=" + PASSWORD + ", email=" + email + '}';
    }

    

}

