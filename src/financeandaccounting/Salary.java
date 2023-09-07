package financeandaccounting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import user.AuthorityUser;


public class Salary implements Serializable {
    private AuthorityUser Employee;
    private String Month;
    private int Year;
    private int EmployeeID;
    private int BaseSalary;
    private int Bonus;
    private int TotalPay;

    public Salary(AuthorityUser Employee, String Month, int Year, int EmployeeID, int BaseSalary, int Bonus) {
        this.Employee = Employee;
        this.Month = Month;
        this.Year = Year;
        this.EmployeeID = EmployeeID;
        this.BaseSalary = BaseSalary;
        this.Bonus = Bonus;
        this.TotalPay = BaseSalary + Bonus;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }

    public int getTotalPay() {
        return TotalPay;
    }

    public void setTotalPay(int TotalPay) {
        this.TotalPay = TotalPay;
    }

    public AuthorityUser getEmployee() {
        return Employee;
    }

    public void setEmployee(AuthorityUser Employee) {
        this.Employee = Employee;
    }
}
