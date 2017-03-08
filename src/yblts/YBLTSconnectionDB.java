/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yblts;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rabor-ch
 */
public class YBLTSconnectionDB {
    
    LogIn conString = new LogIn();
    //String server = conString.getSERVER().getText();
   // String servername = conString.getSERVER().getText();
   // String serverpw = conString.getSERVER().getText();
   // String serverdb = conString.getSERVER().getText();
      
    
   static final String JDBC_Driver = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/yellowbusdb/yellowbusdb";
    static final String USER = "root@localhost";
    //static final String PASS = "xxxx";
    
     Connection conn = null;
     public void main() {
        //PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database!...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yellowbusdb","root","");                            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//staticvoid 
     
   /* static connectionString conString;
   static String server = conString.getSERVER();
   static String database = conString.getSDB();
   static String servername = conString.getSNAME();
   static String serverPW = conString.getSPW();
    
    static final String JDBC_Driver = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://"+server+ "/" + database;  //"jdbc:mysql://localhost/yellowbusdb";
    static final String USER = servername;
    static final String PASS = serverPW;
    
     Connection conn = null;
     public void main() {
        //PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database!...");
            conn = DriverManager.getConnection("jdbc:mysql://"+server+ "/" + database,servername,serverPW);                            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//staticvoid */
     
    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            conn = null;
        }
    } 
//==============================HASHING ADD============================================
    void hash(String username, String pass, String type) {
       YBLTSconnectionDB d = new YBLTSconnectionDB();
       d.main();     
        Statement stmt = null;
        String sql;
        
        try{
          stmt=d.conn.createStatement();
          sql="INSERT INTO `yellowbusdb`.`account` (`Username`,`Password`,`Emp_Type`,`pw` )VALUES('"+username+"','"+PasswordHash.createHash(pass)+"','"+type+"','"+username+"');";
         
          int success = stmt.executeUpdate(sql);
          if(success==1){
          System.out.println("success");
          }
        }catch(SQLException ex) {
              Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
              } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(YBLTSconnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(YBLTSconnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    //==============================HASHING UPDATE============================================
    void hash2(String username, String pass, String type) throws NoSuchAlgorithmException, InvalidKeySpecException {
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        PreparedStatement stmt = null;
        String sql;
        
        try{
          sql = "UPDATE `yellowbusdb`.`account` SET `Emp_Type` = '"+type+"', `Password`= '"+PasswordHash.createHash(pass)+"', `pw`= '"+pass+"' WHERE `Username`='"+username+"'"; 
          stmt = d.conn.prepareStatement(sql); 
          
          int success = stmt.executeUpdate(sql);
          if(success==1){
          System.out.println("success");
          }
        }catch(SQLException ex) {
              Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
              }
    }
    
//=========================VALIDATE PW=========================================
    void validate(String username, String pass) {
      try {
        YBLTSconnectionDB d = new YBLTSconnectionDB();
        d.main();
        PreparedStatement stmt = null;
        String sql = null;     
       //d.validate(username, pass);
        
        sql = "SELECT password FROM account WHERE username = ?";
        stmt=d.conn.prepareStatement(sql);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();
       
        
        if(!rs.isBeforeFirst()){
           JOptionPane.showMessageDialog(null,"Account Dont Exist!");
           LogIn log = new LogIn();
           log.getTxtUsername().setText(null);
           log.getTxtPassword().setText(null);
           log.setVisible(true);
           
           
           }
           
           else{
           
        while(rs.next()){
        String hash = rs.getString("password");
        try{
                if(PasswordHash.validatePassword(pass, hash)){
                 JOptionPane.showMessageDialog(null,"Correct Password");               
                 Home as = new Home();
                 as.setVisible(true);
                 
                }
                
                else{
                 JOptionPane.showMessageDialog(null,"Wrong Password"); 
                 LogIn as = new LogIn();
                   as.setVisible(true);
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(YBLTSconnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(YBLTSconnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }}
        }catch (SQLException ex) {
        Logger.getLogger(YBLTSconnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
    }

}
