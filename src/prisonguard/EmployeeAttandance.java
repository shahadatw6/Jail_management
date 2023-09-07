/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisonguard;

import java.io.Serializable;
import java.util.Date;
import user.AuthorityUser;

/**
 *
 * @author raiha
 */
public class EmployeeAttandance implements Serializable {
    
    private int EmployeeID;
    private String EmployeeName;
    private Date entry;
    private Date exit;

    public EmployeeAttandance(AuthorityUser au, Date entry, Date exit) {
        this.EmployeeID = au.getId();
        this.EmployeeName = au.getName();
        this.entry = entry;
        this.exit = exit;
    }
    
    
    

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public Date getEntry() {
        return entry;
    }

    public void setEntry(Date entry) {
        this.entry = entry;
    }

    public Date getExit() {
        return exit;
    }

    public void setExit(Date exit) {
        this.exit = exit;
    }

    @Override
    public String toString() {
        return "Employee ID: " + Integer.toString(EmployeeID) + 
                ", Employee Name: " + EmployeeName + 
                ", Entry: " + entry + 
                ", Exit: " + exit + "\n";
    }
    
}
