/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yblts;

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
 * @author rabor-ch
 */
public class Distance extends javax.swing.JFrame {
DefaultTableModel dtm = new DefaultTableModel();
int transaction = 0;
String status = "DELETED";
String nameS;

    /**
     * Creates new form Distance_Rate
     */
    public Distance() {
        initComponents();
        displayTable();
        txtdistance.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdistanceV = new javax.swing.JTextField();
        txtto = new javax.swing.JTextField();
        txtfrom = new javax.swing.JTextField();
        txtdistance = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Distance Rate Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 720));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        table.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Distance Code", "From", "To", "Distance Value/km"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(37, 18, 133));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yblts/Search2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 18, 133));
        jLabel1.setText("Distance Code:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 18, 133));
        jLabel2.setText("From:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 18, 133));
        jLabel3.setText("To:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 18, 133));
        jLabel4.setText("Distance Value/km:");

        txtdistanceV.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtdistanceV.setForeground(new java.awt.Color(37, 18, 133));

        txtto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtto.setForeground(new java.awt.Color(37, 18, 133));

        txtfrom.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtfrom.setForeground(new java.awt.Color(37, 18, 133));

        txtdistance.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtdistance.setForeground(new java.awt.Color(37, 18, 133));
        txtdistance.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yblts/images.jpg"))); // NOI18N
        jLabel9.setText("YBL Ticketing System");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, null, null));

        btnexit.setBackground(new java.awt.Color(255, 255, 255));
        btnexit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(37, 18, 133));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 255, 255));
        btndelete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(37, 18, 133));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(37, 18, 133));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit)
                    .addComponent(btndelete)
                    .addComponent(btnsave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(37, 18, 133));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yblts/Search2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdistanceV, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdistance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(txtfrom, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtdistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdistanceV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       if (transaction==1)
        { 
        if(txtfrom.getText().length()>0
                 &&txtto.getText().length()>0
                 &&txtdistanceV.getText().length()>0)
        {
        updateRate();
        clearFields();
        displayTable();
        txtdistance.setEnabled(false);
        transaction=0;
        }
         else{
          JOptionPane.showMessageDialog(null,"Some Fields Are Empty");   
         }
        }
        
        else
        {       
        if(txtfrom.getText().length()>0
                 &&txtto.getText().length()>0
                 &&txtdistanceV.getText().length()>0)
        {
         addRate();
         displayTable(); 
         clearFields();
         }
         else{
          JOptionPane.showMessageDialog(null,"Some Fields Are Empty");   
         }
       
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int x = table.getSelectedRow();
        if(txtfrom.getText().length()>0
                 &&txtto.getText().length()>0
                 &&txtdistanceV.getText().length()>0)
        {
        deleteRate(dtm.getValueAt(x,0).toString());
        dtm.removeRow(table.getSelectedRow());
        clearFields();
        clearFields();
        }
        
        else{JOptionPane.showMessageDialog(null,"Select row from table to delete!"); }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        transaction=1;
       txtdistance.setText(dtm.getValueAt(table.getSelectedRow(),0).toString());
       txtfrom.setText(dtm.getValueAt(table.getSelectedRow(),1).toString());
       txtto.setText(dtm.getValueAt(table.getSelectedRow(),2).toString());
       txtdistanceV.setText(dtm.getValueAt(table.getSelectedRow(),4).toString());
       txtdistance.setEnabled(false);
    }//GEN-LAST:event_tableMouseClicked

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        Home as = new Home();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      nameS = txtfrom.getText().toString().trim();
      displayTableSearch();
      clearFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      nameS = txtfrom.getText().toString().trim();
      displayTableSearch2();
      clearFields();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Distance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Distance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtdistance;
    private javax.swing.JTextField txtdistanceV;
    private javax.swing.JTextField txtfrom;
    private javax.swing.JTextField txtto;
    // End of variables declaration//GEN-END:variables

    private void addRate() {
       // String distance = txtdistance.getText();
        String from = txtfrom.getText();
        String to = txtto.getText();
        String distanceV = txtdistanceV.getText();
        String route = "Vice Versa";
              
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        
        YBLTSconnectionDB d2 = new YBLTSconnectionDB();
        d2.main();
       
        Statement stmt = null;
        Statement stmt2 = null;
        String sql, sql2;
    try {    
        stmt=d.conn.createStatement();
        sql="SELECT * FROM distance_traveled WHERE (distance_base = '"+to+"' AND via_from ='"+from+"' )  AND Status IS NULL";
        ResultSet rs = stmt.executeQuery(sql);
        
        if(!rs.isBeforeFirst()){
         
          stmt=d.conn.createStatement();
          sql="INSERT INTO `yellowbusdb`.`distance_traveled`(`distance_base`,`distance_to`,`route`,`Distance_value`, `via_from`, `via_to`)VALUES('"+from+"','"+to+"','"+route+"','"+distanceV+"','"+to+"','"+from+"');";
         
         
          int success = stmt.executeUpdate(sql);
          
          
          if(success==1){
          System.out.println("success");
          }
           
           }
           
           else{
           JOptionPane.showMessageDialog(null,"Distance range exist!");
           txtfrom.setText(null);
           txtto.setText(null);
           txtfrom.requestFocus();
              
        }
         stmt2=d2.conn.createStatement();
         sql2="INSERT INTO `yellowbusdb`.`distance_traveled`(`distance_base`,`distance_to`,`Distance_value`)VALUES('"+to+"','"+from+"','"+distanceV+"');";
         stmt2.executeUpdate(sql2);
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Distance.class.getName()).log(Level.SEVERE, null, ex);
    }
       
        
    }
    private void displayTable() {
     YBLTSconnectionDB d = new YBLTSconnectionDB();
     d.main();
  
    Statement stmt = null;
    String sql;  
        
    try {
            stmt=d.conn.createStatement();
             sql="SELECT distance_code,distance_base,distance_to,route, Distance_value FROM distance_traveled WHERE Status IS NULL and route IS NOT NULL ";
             ResultSet rs = stmt.executeQuery(sql);
             
             dtm = new DefaultTableModel();
             table.setModel(dtm);
             dtm.addColumn("Distance Code");
             dtm.addColumn("From");
             dtm.addColumn("To");
             dtm.addColumn("Route");
             dtm.addColumn("Distance Value");
           
             while(rs.next()){
               Object[] ob = {
               rs.getString("distance_code"),
               rs.getString("distance_base"),
               rs.getString("distance_to"),
               rs.getString("route"),
               rs.getString("Distance_value")      
               };
               dtm.addRow(ob);
               
             }
        } catch (SQLException ex) {
            Logger.getLogger(Distance.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    private void clearFields() {
    txtdistance.setText(null);
    txtfrom.setText(null);
    txtto.setText(null);
    txtdistanceV.setText(null);

    }

    private void updateRate() {
          
        int x = table.getSelectedRow();
        String PK = dtm.getValueAt(x,0).toString(); 
        String distance = txtdistance.getText();
        String from = txtfrom.getText();
        String to = txtto.getText();
        String distanceV = txtdistanceV.getText();

        
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        PreparedStatement stmt = null;
        String sql;

        try {
         sql = "UPDATE `yellowbusdb`.`distance_traveled` SET `distance_base`=?,`distance_to`=?,`Distance_value`=?,`distance_code`=?, `via_from`=?, `via_to`=? WHERE `distance_code`=?";
         stmt = d.conn.prepareStatement(sql);   
         
         
         stmt.setString(1, from);
         stmt.setString(2, to);
         stmt.setString(3, distanceV);
         stmt.setString(4, distance);
         stmt.setString(5, to);
         stmt.setString(6, from);
         stmt.setString(7, PK);
    
         int success = stmt.executeUpdate();
         if (success == 1) {
        System.out.println("success");
         dtm.setValueAt(PK, table.getSelectedRow(), 0);       
         dtm.setValueAt(from, table.getSelectedRow(), 1);
         dtm.setValueAt(to, table.getSelectedRow(), 2);
         dtm.setValueAt(distanceV, table.getSelectedRow(), 3);
         
        }}catch (SQLException ex) {
        Logger.getLogger(Distance.class.getName()).log(Level.SEVERE, null, ex);
        }    
    
    }

    private void deleteRate(String toString) {
      String[] buttons = {"YES","NO"};
    int returnValue = JOptionPane.showOptionDialog(null,"Do You Want To Delete The Records?", "NARRATIVE",
            JOptionPane.WARNING_MESSAGE,0,null,buttons,buttons);
    System.out.print(returnValue);

    if(returnValue==JOptionPane.YES_OPTION){ 
    int x = table.getSelectedRow();
        String PK = dtm.getValueAt(x,0).toString(); 
        String distance = txtdistance.getText();
        String from = txtfrom.getText();
        String to = txtto.getText();
        String distanceV = txtdistanceV.getText();
        
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        PreparedStatement stmt = null;
        String sql;
        

        try {
          sql = "UPDATE `yellowbusdb`.`distance_traveled` SET `distance_base`=?,`distance_to`=?,`Distance_value`=?,`distance_code`=?, `Status`=? WHERE `distance_code`=?";
         stmt = d.conn.prepareStatement(sql);   
         
         
         stmt.setString(1, from);
         stmt.setString(2, to);
         stmt.setString(3, distanceV);
         stmt.setString(4, distance);
         stmt.setString(5, status);
         stmt.setString(6, PK);
         
         int success = stmt.executeUpdate();
        
        }catch (SQLException ex) {
        Logger.getLogger(yblts.Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
      else{
        this.dispose();
        yblts.Bus as = new yblts.Bus();
        as.setVisible(true);
    }}

    private void displayTableSearch() {
        YBLTSconnectionDB d = new YBLTSconnectionDB();
     d.main();
  
     
    Statement stmt = null;
    String sql;  
    String stats = null;    
    try {
            stmt=d.conn.createStatement();
            //sql="SELECT Employee_ID,Employee_Fname,Employee_Mname,Emp_Lname,Job_Description FROM employee WHERE Emp_Lname LIKE '"+emplname.getText().toString()+"%' AND Status IS NULL  ";
            //sql="SELECT Bus_Number,Bus_Class,Succeeding_fare FROM bus WHERE Bus_Class LIKE '"+txtBusClass.getText().toString()+"%' AND Status IS NULL ";
            sql="SELECT distance_code,distance_base,distance_to,Distance_value FROM distance_traveled WHERE distance_base LIKE '"+txtfrom.getText().toString()+"%' AND Status IS NULL";
            
         ResultSet rs = stmt.executeQuery(sql);
             
             dtm = new DefaultTableModel();
             table.setModel(dtm);
             dtm.addColumn("Distance Code");
             dtm.addColumn("From");
             dtm.addColumn("To");
             dtm.addColumn("Distance Value");
           
             while(rs.next()){
               Object[] ob = {
               rs.getString("distance_code"),
               rs.getString("distance_base"),
               rs.getString("distance_to"),
               rs.getString("Distance_value")      
               };
               dtm.addRow(ob);
               
             }
        } catch (SQLException ex) {
            Logger.getLogger(Distance.class.getName()).log(Level.SEVERE, null, ex);
        }   
           
           
    
    }

    private void displayTableSearch2() {
    YBLTSconnectionDB d = new YBLTSconnectionDB();
     d.main();
  
     
    Statement stmt = null;
    String sql;  
    String stats = null;    
    try {
            stmt=d.conn.createStatement();
            sql="SELECT distance_code,distance_base,distance_to,Distance_value FROM distance_traveled WHERE distance_to LIKE '"+txtto.getText().toString()+"%' AND Status IS NULL";
            
         ResultSet rs = stmt.executeQuery(sql);
             
             dtm = new DefaultTableModel();
             table.setModel(dtm);
             dtm.addColumn("Distance Code");
             dtm.addColumn("From");
             dtm.addColumn("To");
             dtm.addColumn("Distance Value");
           
             while(rs.next()){
               Object[] ob = {
               rs.getString("distance_code"),
               rs.getString("distance_base"),
               rs.getString("distance_to"),
               rs.getString("Distance_value")      
               };
               dtm.addRow(ob);
               
             }
        } catch (SQLException ex) {
            Logger.getLogger(Distance.class.getName()).log(Level.SEVERE, null, ex);
        }   
              
    
    }

}

