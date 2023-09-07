
package financeandaccounting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import msc.AppendableObjectOutputStream;
import user.AuthorityUser;


public class FinanceAndAccountOfficer {

    
    
    public static AuthorityUser getInstance(int EmployeeID) {
        ObjectInputStream ois = null;
        AuthorityUser oc = null;
        try {
             AuthorityUser c;
             ois = new ObjectInputStream(new FileInputStream("AuthorityUserList.bin"));
             
            while(true){
                c = (AuthorityUser) ois.readObject();
                if(c.getId() == EmployeeID) {
                    oc = c;
                }
            }
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
        catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
        return oc;
    }
    public static void PaySalary (Salary c) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;

        try {
            f = new File("Salary.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            oos.writeObject(c);

        } catch (IOException ex) {
            Logger.getLogger(FinanceAndAccountOfficer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(FinanceAndAccountOfficer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static boolean CheckSalaryExistence (Salary ss) {
        ObjectInputStream ois = null;
        boolean result = false;
        try {
             Salary c;
             ois = new ObjectInputStream(new FileInputStream("Salary.bin"));
             
            while(true){
                c = (Salary) ois.readObject();
                if(c.getMonth().equals(ss.getMonth()) && c.getYear() == ss.getYear() && c.getEmployeeID() == ss.getEmployeeID()) {
                    result = true;
                    break;
                }
            }
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
        catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
        return result;
    }
    
}
