package view;

import dao.dbConnect;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UserChangePass extends javax.swing.JFrame {

    /**
     * Creates new form UserChangePass
     */
    public UserChangePass() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtOLDpass = new javax.swing.JPasswordField();
        txtNEWpass = new javax.swing.JPasswordField();
        txtCONpass = new javax.swing.JPasswordField();
        showcon = new javax.swing.JCheckBox();
        shownew = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("User Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 138, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Old Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("New Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Confirm Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("New Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 184, 30));

        btnBack.setBackground(new java.awt.Color(153, 255, 255));
        btnBack.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon("E:\\1.Apteach hk1\\sem 2\\java1\\Quiz_project-main\\src\\img\\left-arrow1.png")); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        btnSave.setBackground(new java.awt.Color(204, 204, 255));
        btnSave.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon("E:\\1.Apteach hk1\\sem 2\\java1\\Quiz_project-main\\src\\img\\save.png")); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 163, -1));

        txtOLDpass.setForeground(new java.awt.Color(0, 0, 0));
        txtOLDpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOLDpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtOLDpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 163, -1));

        txtNEWpass.setForeground(new java.awt.Color(0, 0, 0));
        txtNEWpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNEWpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtNEWpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 163, -1));

        txtCONpass.setForeground(new java.awt.Color(0, 0, 0));
        txtCONpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCONpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtCONpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 163, -1));

        showcon.setBackground(new java.awt.Color(0, 0, 0));
        showcon.setForeground(new java.awt.Color(0, 0, 0));
        showcon.setText("show password");
        showcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showconActionPerformed(evt);
            }
        });
        getContentPane().add(showcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 107, -1));

        shownew.setForeground(new java.awt.Color(0, 0, 0));
        shownew.setText("show password");
        shownew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shownewActionPerformed(evt);
            }
        });
        getContentPane().add(shownew, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 107, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\1.Apteach hk1\\sem 2\\java1\\Quiz_project-main\\src\\img\\backgrond-maytinh.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String uid, oldpass, newpass, cnfpass;

        uid = txtUsername.getText();
        oldpass = String.valueOf(txtOLDpass.getPassword());
        newpass = String.valueOf(txtNEWpass.getPassword());
        cnfpass = String.valueOf(txtCONpass.getPassword());

        // Kiểm tra xem mật khẩu cũ có khớp với mật khẩu hiện tại không
        String checkOldPassQuery = "SELECT * FROM tbUser WHERE username=? AND PASSWORD=?";
        try (Connection conn = dbConnect.Connection(); PreparedStatement checkOldPassStmt = conn.prepareStatement(checkOldPassQuery)) {

            checkOldPassStmt.setString(1, uid);
            checkOldPassStmt.setString(2, oldpass);

            ResultSet rs = checkOldPassStmt.executeQuery();

            if (rs.next()) {
                // Mật khẩu cũ khớp, tiến hành cập nhật mật khẩu mới
                String updatePassQuery = "UPDATE tbUser SET PASSWORD=? WHERE username=?";
                try (PreparedStatement updatePassStmt = conn.prepareStatement(updatePassQuery)) {
                    
                    
                    updatePassStmt.setString(1, newpass);
                    updatePassStmt.setString(2, uid);

                    int rowsAffected = updatePassStmt.executeUpdate();

                    if (rowsAffected > 0) {
                        // Cập nhật thành công
                        JOptionPane.showMessageDialog(this, "Password changed successfully!");
                    } else {
                        // Cập nhật thất bại
                        JOptionPane.showMessageDialog(this, "Failed to change password. Please try again.");
                    }
                }
            } else {
                // Mật khẩu cũ không khớp
                JOptionPane.showMessageDialog(this, "Incorrect old password. Please try again.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred. Please try again later.");
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtOLDpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOLDpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOLDpassActionPerformed

    private void txtNEWpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNEWpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNEWpassActionPerformed

    private void txtCONpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCONpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCONpassActionPerformed

    private void showconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showconActionPerformed
        // TODO add your handling code here:
        if(shownew.isSelected()){
            txtCONpass.setEchoChar((char)0);
        }else{
            txtCONpass.setEchoChar('*');
        }
    }//GEN-LAST:event_showconActionPerformed

    private void shownewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shownewActionPerformed
        // TODO add your handling code here:
        if(shownew.isSelected()){
            txtNEWpass.setEchoChar((char)0);
        }else{
            txtNEWpass.setEchoChar('*');
        }
    }//GEN-LAST:event_shownewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
//        setVisible(false);
//        new InfoUser().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(UserChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JCheckBox showcon;
    private javax.swing.JCheckBox shownew;
    private javax.swing.JPasswordField txtCONpass;
    private javax.swing.JPasswordField txtNEWpass;
    private javax.swing.JPasswordField txtOLDpass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}