/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yblts;

import java.awt.Dimension;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author balanay-au
 */
public class EditPassword extends javax.swing.JDialog {
    /**
     * Creates new form SignUp
     */
    String passwordS;
    
    public EditPassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setViewFalse();
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSign = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox();
        btnUnameSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelSign.setBackground(new java.awt.Color(255, 255, 255));
        panelSign.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Edit Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        panelSign.setPreferredSize(new java.awt.Dimension(300, 200));

        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("New Password:");

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Employee Type:");

        cmbType.setEditable(true);
        cmbType.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Employee Type", "Admin", "Conductor", "Inspector" }));
        cmbType.setName(""); // NOI18N

        btnUnameSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnUnameSearch.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnUnameSearch.setForeground(new java.awt.Color(37, 18, 133));
        btnUnameSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yblts/Search2.png"))); // NOI18N
        btnUnameSearch.setName("btnUnameSearch"); // NOI18N
        btnUnameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnameSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSignLayout = new javax.swing.GroupLayout(panelSign);
        panelSign.setLayout(panelSignLayout);
        panelSignLayout.setHorizontalGroup(
            panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSignLayout.createSequentialGroup()
                        .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(txtUsername)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSignLayout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSignLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btnUnameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSignLayout.setVerticalGroup(
            panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUnameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnSave))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSign, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSign, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       int x = cmbType.getSelectedIndex();
    
        if (txtPassword.getPassword().length >0 && x>0 ){
         updateAccount();
         clearFields();
        JOptionPane.showMessageDialog(null,"Password Changed!");
        LogIn as = new LogIn();
        as.setVisible(true);
        this.dispose();
        
        }
        else{
        
        JOptionPane.showMessageDialog(null,"Some Fields are EMPTY!");
        } 
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       LogIn as = new LogIn();
       this.dispose();
       as.setVisible(true);
       
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnUnameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnameSearchActionPerformed
    searchUname();
   
    }//GEN-LAST:event_btnUnameSearchActionPerformed

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
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditPassword dialog = new EditPassword(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUnameSearch;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelSign;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

   private void updateAccount() {
       String username = txtUsername.getText();
       String pass = new String (txtPassword.getPassword());
       String type = cmbType.getSelectedItem().toString();
       YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();     
        try {
            d.hash2(username, pass, type);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(EditPassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(EditPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearFields() {
    txtUsername.setText(null);
    txtPassword.setText(null);
    cmbType.setSelectedItem(null);
    }

    private void setViewFalse() {
    txtPassword.setEnabled(false);
    cmbType.setEnabled(false);
    btnSave.setEnabled(false);
    //btnExit.setEnabled(false);
    }

    private void searchUname() {
        
     YBLTSconnectionDB d = new YBLTSconnectionDB();
     d.main();
    Statement stmt = null;
    String sql;  
    String stats = null; 
   
    
   
        try {
           stmt=d.conn.createStatement();
           sql="SELECT Username, Password, Emp_Type, Status FROM account WHERE Username =  '"+txtUsername.getText().toString()+"' AND Status IS NULL";
           ResultSet rs = stmt.executeQuery(sql);
           
       
          if(!rs.isBeforeFirst()){
           JOptionPane.showMessageDialog(null,"Username dont Exist");
           txtUsername.setText(null);
           }
           
           else{
           JOptionPane.showMessageDialog(null,"Username Exist");
           updatePW();
           
           if(rs.next()){
           cmbType.setSelectedItem(rs.getString("Emp_Type")); }
           
           setViewTrue();
        
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(EditPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    
    }

    private void updatePW() {
       YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        PreparedStatement stmt = null;
        String sql;
        
              
        try {
             sql = "UPDATE `yellowbusdb`.`account` SET `Password`=? WHERE `Username`=?"; 
            stmt = d.conn.prepareStatement(sql); 
            
         stmt.setString(1, null);
         stmt.setString(2, txtUsername.getText().toString().trim());
         
         
         int success = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EditPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    
    }

    private void setViewTrue() {
           txtPassword.setEnabled(true);
           cmbType.setEnabled(true);
           btnSave.setEnabled(true);
           btnExit.setEnabled(true);
           txtUsername.setEnabled(false);
    }
}
