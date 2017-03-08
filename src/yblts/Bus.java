package yblts;


import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Bus extends javax.swing.JFrame {

DefaultTableModel dtm = new DefaultTableModel();
int transaction = 0;
String status = "DELETED";
String nameS;

    public Bus() {
        initComponents();
        displayTable();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        authorsave2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        busTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBusNum = new javax.swing.JTextField();
        txtBusClass = new javax.swing.JTextField();
        txtSucceeding = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        authorsave2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        authorsave2.setForeground(new java.awt.Color(37, 18, 133));
        authorsave2.setText("Save");
        authorsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorsave2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bus Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 720));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        busTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        busTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Bus Number", "Bus Class", "Succeeding Fare"
            }
        ));
        busTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(busTable);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 18, 133));
        jLabel1.setText("Bus Number:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 18, 133));
        jLabel2.setText("Bus Class:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 18, 133));
        jLabel3.setText("Succeeding Fare:");

        txtBusNum.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtBusNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusNumActionPerformed(evt);
            }
        });

        txtBusClass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtBusClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusClassActionPerformed(evt);
            }
        });

        txtSucceeding.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtSucceeding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSucceedingActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(37, 18, 133));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yblts/Search2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, null, null));

        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(37, 18, 133));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
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

        btnexit.setBackground(new java.awt.Color(255, 255, 255));
        btnexit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(37, 18, 133));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
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
                .addComponent(btndelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btndelete)
                    .addComponent(btnexit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yblts/images.jpg"))); // NOI18N
        jLabel9.setText("YBL Ticketing System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(77, 77, 77))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSucceeding, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBusNum)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBusClass, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBusClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))
                            .addComponent(txtBusNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSucceeding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authorsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorsave2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorsave2ActionPerformed

    private void busTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busTableMouseClicked
       transaction=1;
       txtBusNum.setText(dtm.getValueAt(busTable.getSelectedRow(),0).toString());
       txtBusClass.setText(dtm.getValueAt(busTable.getSelectedRow(),1).toString());
       txtSucceeding.setText(dtm.getValueAt(busTable.getSelectedRow(),2).toString());
       txtBusNum.setEnabled(false);
    }//GEN-LAST:event_busTableMouseClicked

    private void txtBusNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusNumActionPerformed

    }//GEN-LAST:event_txtBusNumActionPerformed

    private void txtBusClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusClassActionPerformed

    private void txtSucceedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSucceedingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSucceedingActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
     if (transaction==1)
        { 
        if(txtBusNum.getText().length()>0 
                 &&txtBusClass.getText().length()>0
                 &&txtSucceeding.getText().length()>0)
        {
        updateBus();
        clearFields();
        displayTable();
        txtBusNum.setEnabled(true);
        transaction=0;
        }
         else{
          JOptionPane.showMessageDialog(null,"Some Fields Are Empty");   
         }
        }
        
        else
        {       
        if(txtBusNum.getText().length()>0 
                 &&txtBusClass.getText().length()>0
                 &&txtSucceeding.getText().length()>0){
       
         addBus();
         displayTable(); 
         
         }
         else{
          JOptionPane.showMessageDialog(null,"Some Fields Are Empty");   
         }
       
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int x = busTable.getSelectedRow();
        
        if(txtBusNum.getText().length()>0 
                 &&txtBusClass.getText().length()>0
                 &&txtSucceeding.getText().length()>0)
        {
        deleteBus(dtm.getValueAt(x,0).toString());
        dtm.removeRow(busTable.getSelectedRow());
        clearFields();
        txtBusNum.setEnabled(true);
        }
        
        else{
         JOptionPane.showMessageDialog(null,"Select row from table to delete!");  
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       Home as = new Home();
       as.setVisible(true);
       this.dispose();
      
    }//GEN-LAST:event_btnexitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nameS = txtBusClass.getText().toString().trim();
        displayTableSearch();
        clearFields();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorsave2;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JTable busTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusClass;
    private javax.swing.JTextField txtBusNum;
    private javax.swing.JTextField txtSucceeding;
    // End of variables declaration//GEN-END:variables

    private void addBus() {
        String BusNum = txtBusNum.getText();
        String BusClass = txtBusClass.getText();
        String BusSucceed = txtSucceeding.getText();
        
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        Statement stmt = null;
        String sql;
    try {        
        stmt=d.conn.createStatement();
        sql="SELECT * FROM bus WHERE Bus_Number = '"+BusNum+"' and Status IS NULL "; 
        ResultSet rs = stmt.executeQuery(sql);
        
        if(!rs.isBeforeFirst())
        {
           
          stmt=d.conn.createStatement();
          sql="INSERT INTO `yellowbusdb`.`bus`(`Bus_Number`,`Bus_Class`,`Succeeding_fare`)VALUES('"+BusNum+"','"+BusClass+"','"+BusSucceed+"');";
         
          int success = stmt.executeUpdate(sql);
          clearFields();
          if(success==1){
          System.out.println("success");
          
          }
        
        }
        else{
             JOptionPane.showMessageDialog(null,"Duplicate Bus Number!");
             txtBusNum.setText(null);
             txtBusNum.requestFocus();
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
    }
       
         
        
        
    }

    private void displayTable() {
    YBLTSconnectionDB d = new YBLTSconnectionDB();
    d.main();
    Statement stmt = null;
    String sql;  
        
    try {
            stmt=d.conn.createStatement();
            sql="SELECT Bus_Number,Bus_Class,Succeeding_fare FROM bus WHERE Status IS NULL "; 
            ResultSet rs = stmt.executeQuery(sql);
             
             dtm = new DefaultTableModel();
             busTable.setModel(dtm);
             dtm.addColumn("Bus Number");
             dtm.addColumn("Bus Class");
             dtm.addColumn("Succeeding Fare");
             while(rs.next()){
               Object[] ob = {
               rs.getString("Bus_Number"),
               rs.getString("Bus_Class"),
               rs.getString("Succeeding_fare")
               };
               dtm.addRow(ob);
               
             }
        } catch (SQLException ex) {
            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
        }     
    
    }

    private void deleteBus(String toString) {
      String[] buttons = {"YES","NO"};
    int returnValue = JOptionPane.showOptionDialog(null,"Do You Want To Delete The Records?", "NARRATIVE",
            JOptionPane.WARNING_MESSAGE,0,null,buttons,buttons);
    System.out.print(returnValue);

    if(returnValue==JOptionPane.YES_OPTION){ 
    int x = busTable.getSelectedRow();
        String PK = dtm.getValueAt(x,0).toString(); 
        String id = txtBusNum.getText();
        String busClass = txtBusClass.getText();
        String busSuc = txtSucceeding.getText();
        
        
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        PreparedStatement stmt = null;
        String sql;
        

        try {
         sql = "UPDATE `yellowbusdb`.`bus` SET `Bus_Class`=?,`Succeeding_fare`=?,`Bus_Number`=?,`Status`=? WHERE `Bus_Number`=?";       
         stmt = d.conn.prepareStatement(sql);   
         
         
         stmt.setString(1, busClass);
         stmt.setString(2, busSuc);
         stmt.setString(3, id);
         stmt.setString(4, status);
         stmt.setString(5, PK);
         
         int success = stmt.executeUpdate();
        
        }catch (SQLException ex) {
        Logger.getLogger(yblts.Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
      else{
        this.dispose();
        yblts.Bus as = new yblts.Bus();
        as.setVisible(true);
    }
    }

    private void updateBus() {
      int x = busTable.getSelectedRow();
        String PK = dtm.getValueAt(x,0).toString(); 
        String BusNum = txtBusNum.getText();
        String BusClass = txtBusClass.getText();
        String BusSucceed = txtSucceeding.getText();
        
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        PreparedStatement stmt = null;
        String sql;

        try {
         sql = "UPDATE `yellowbusdb`.`bus` SET `Bus_Class`=?,`Succeeding_fare`=?,`Bus_Number`=? WHERE `Bus_Number`=?";
         stmt = d.conn.prepareStatement(sql);   
         
         
         stmt.setString(1, BusClass);
         stmt.setString(2, BusSucceed);
         stmt.setString(3, BusNum);
         stmt.setString(4, PK);
    
         int success = stmt.executeUpdate();
         if (success == 1) {
        System.out.println("success");
         dtm.setValueAt(PK, busTable.getSelectedRow(), 0);       
         dtm.setValueAt(BusClass, busTable.getSelectedRow(), 1);
         dtm.setValueAt(BusSucceed, busTable.getSelectedRow(), 2);
         
         
        }}catch (SQLException ex) {
        Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
       
        
    }

    private void refresh(boolean b) {
        
    }

    private void clearFields() {
       txtBusClass.setText(null);
       txtBusNum.setText(null);
       txtSucceeding.setText(null);
    }

    private void displayTableSearch() {
    YBLTSconnectionDB d = new YBLTSconnectionDB();
     d.main();
  
     
    Statement stmt = null;
    String sql;  
    String stats = null;    
    try {
            stmt=d.conn.createStatement();
           sql="SELECT Bus_Number,Bus_Class,Succeeding_fare FROM bus WHERE Bus_Class LIKE '"+txtBusClass.getText().toString()+"%' AND Status IS NULL ";
            
           ResultSet rs = stmt.executeQuery(sql);
             
             dtm = new DefaultTableModel();
             busTable.setModel(dtm);
             dtm.addColumn("Bus Number");
             dtm.addColumn("Bus Class");
             dtm.addColumn("Succeeding Fare");
             while(rs.next()){
               Object[] ob = {
               rs.getString("Bus_Number"),
               rs.getString("Bus_Class"),
               rs.getString("Succeeding_fare")
               };
               dtm.addRow(ob);
               
             }
        } catch (SQLException ex) {
            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
        }     
       
    }

  
}
