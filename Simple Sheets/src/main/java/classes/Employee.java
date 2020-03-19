
//Package Name
package main.java.classes;

//Imports
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {

    // Members
    private Date hireDate;
    private double salary;
    private String department;
    private double commission;
    

    public Employee(int iDNumber, String firstName, String lastName, String phoneNumber, String eMail,
                    Address mailingAddress, String hireDate, double salary, String department, double commission)throws ParseException {
        setiDNumber(iDNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        seteMail(eMail);
        setMailingAddress(mailingAddress);
        setHireDate(hireDate);        
        setSalary(salary);
        setDepartment(department);
        setCommission(commission);
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate)throws ParseException{
        SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
        Date date = formatDate.parse(hireDate);
        this.hireDate = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
  
}

