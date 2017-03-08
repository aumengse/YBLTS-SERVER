/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yblts;

/**
 *
 * @author balanay-au
 */
public class connectionString {
    private String SERVER;
    private String SNAME;
    private String SPW;
    private String SDB;

    public connectionString(String S, String SN, String SP, String SD) {
        this.SERVER = S;
        this.SNAME = SN;
        this.SPW = SP;
        this.SDB = SD;
    }
    
    

    public String getSERVER() {
        return SERVER;
    }

    public void setSERVER(String SERVER) {
        this.SERVER = SERVER;
    }

    public String getSNAME() {
        return SNAME;
    }

    public void setSNAME(String SNAME) {
        this.SNAME = SNAME;
    }

    public String getSPW() {
        return SPW;
    }

    public void setSPW(String SPW) {
        this.SPW = SPW;
    }

    public String getSDB() {
        return SDB;
    }

    public void setSDB(String SDB) {
        this.SDB = SDB;
    }
    
    
    
    
}
