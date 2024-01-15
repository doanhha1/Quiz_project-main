/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.User;
import dao.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;




public class InfoUser extends javax.swing.JFrame {

    private User user;
    private Object com;

    public InfoUser(User user) {
        initComponents();

        this.user = user;
        infouser();
    }

    public InfoUser() {
        initComponents();
        infouser();
       
    }
    int index = 0;
    ArrayList<User> ds = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtBod = new com.toedter.calendar.JDateChooser();
        txtMail = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnFemale = new javax.swing.JRadioButton();
        btnMale = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton_avatar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 205, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INFOMATION USER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 21, 268, 64));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 69, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Phone :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 69, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 69, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bod :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 41, 29));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 55, -1));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, -1));

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 182, -1));

        txtBod.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtBod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 182, -1));

        txtMail.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 182, -1));

        btnUpdate.setText("UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        btnChangePass.setText("Change Password");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        jPanel2.add(btnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("userID :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 182, -1));

        GenderGroup.add(btnFemale);
        btnFemale.setForeground(new java.awt.Color(0, 0, 0));
        btnFemale.setText("Female");
        jPanel2.add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        GenderGroup.add(btnMale);
        btnMale.setForeground(new java.awt.Color(0, 0, 0));
        btnMale.setText("Male");
        jPanel2.add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 380, 490));

        jButton1.setBackground(new java.awt.Color(255, 205, 41));
        jButton1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("START");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 124, 91));

        jComboBox2.setBackground(new java.awt.Color(255, 205, 41));
        jComboBox2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chủ Đề", "Angular JS", "HCJS (HTML + CSS + JAVASCRipt)", "Java", "(C++)", "PHP Laravel", " " }));
        jComboBox2.setName(""); // NOI18N
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 124, 93));

        jComboBox3.setBackground(new java.awt.Color(255, 205, 41));
        jComboBox3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Độ Khó :", "HIGHT", "MEDIUM", "LOW" }));
        jComboBox3.setName(""); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 124, 93));

        jButton_avatar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton_avatar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_avatar.setText("chọn ảnh");
        jButton_avatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_avatarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 1070, 560));

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\1.Apteach hk1\\sem 2\\java1\\Quiz_project-main\\src\\img\\Orders_background.png")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infouser() {
        
//        System.out.println("user: " + user);
//        txtName.setText(user.name);
//        txtPhone.setText(user.phone);
//        txtGender.setText(user.gender);
//        
////        Date Bod = new Date();
////        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////        String date = dateFormat.format(txtBod.setDate(user.bod));
////        Date date = dateFormat.parse(dateString);
////        txtBod.setDate(user.bod);
//
//       
//        txtMail.setText(user.email);

////// phan sua
System.out.println("user: " + user);
txtID.setText(String.valueOf(user.userID)); // Convert int to String
txtName.setText(user.name);
txtPhone.setText(user.phone);
//GenderGroup.isSelected(user.gender);
if ("Male".equals(user.gender)) {
    GenderGroup.setSelected(btnMale.getModel(), true);
    btnFemale.setSelected(false);
} else {
    GenderGroup.setSelected(btnMale.getModel(), false);
    btnFemale.setSelected(true);
}

String dateString = user.bod; // Giả sử user.bod là một chuỗi có định dạng "yyyy-MM-dd"
if (dateString != null) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        Date date = dateFormat.parse(dateString);
        txtBod.setDate(date);
    } catch (ParseException e) {
        e.printStackTrace(); // Xử lý ngoại lệ phân tích cú pháp một cách thích hợp
    }
}
txtMail.setText(user.email);

    }
    private void jButton_avatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_avatarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton_avatarActionPerformed
/////////////////////////////////////////////////////////////////
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        setVisible(false);
//        new UserUpdate().setVisible(true);


    ////----------------------------
String name = txtName.getText();
String phone = txtPhone.getText();
String gender = btnMale.isSelected() ? "Male" : "Female";
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
String bod = dateFormat.format(txtBod.getDate());
String email = txtMail.getText();
String userID = txtID.getText();

Connection cn = dbConnect.Connection();
PreparedStatement ps = null;
///    sua doan code try o duoi
try {
    String sql = "UPDATE tbUser SET name=?, phone=?, gender=?, bod=?, email=? WHERE userID=?";
    ps = cn.prepareStatement(sql);
    ps.setString(1, name);
    ps.setString(2, phone);
    ps.setString(3, gender);
    ps.setString(4, bod);
    ps.setString(5, email);
    ps.setString(6, userID);
  

    int rowsAffected = ps.executeUpdate();

    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(this, "Record updated successfully");
    } else {
        JOptionPane.showMessageDialog(this, "No records updated. User with userID " + userID + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(this, "Database error", "Error", JOptionPane.ERROR_MESSAGE);
} finally {
    // Close resources
    try {
        if (ps != null) {
            ps.close();
        }
        if (cn != null) {
            cn.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new UserChangePass().setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
//        infoUser().

    new UserUpdate().setVisible(true);
    }//GEN-LAST:event_btnUpdateMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User user = new User();
                new InfoUser(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_avatar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser txtBod;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
