/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yblts;

/**
 *
 * @author Aerole
 */
public class DependentsActivity {
     String DepID;
     String DepFname;
    String DepMname;
    String DepLname;
     String DepRel;
     String DepEmpID;

    DependentsActivity(){}

    public DependentsActivity(String ID, String Fname, String Mname, String Lname, String Rel, String EmpID) {
        this.DepID    = ID;
        this.DepFname = Fname;
        this.DepMname = Mname;
        this.DepLname = Lname;
        this.DepRel   = Rel;
        this.DepEmpID = EmpID;
    }

    

    public String getDepID() {
        return DepID;
    }

    public void setDepID(String DepID) {
        this.DepID = DepID;
    }

    public String getDepFname() {
        return DepFname;
    }

    public void setDepFname(String DepFname) {
        this.DepFname = DepFname;
    }

    public String getDepMname() {
        return DepMname;
    }

    public void setDepMname(String DepMname) {
        this.DepMname = DepMname;
    }

    public String getDepLname() {
        return DepLname;
    }

    public void setDepLname(String DepLname) {
        this.DepLname = DepLname;
    }

    public String getDepRel() {
        return DepRel;
    }

    public void setDepRel(String DepRel) {
        this.DepRel = DepRel;
    }

    public String getDepEmpID() {
        return DepEmpID;
    }

    public void setDepEmpID(String DepEmpID) {
        this.DepEmpID = DepEmpID;
    }
    
    
    
}
