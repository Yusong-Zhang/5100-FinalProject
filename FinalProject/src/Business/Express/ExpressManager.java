/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Express;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author 13522
 */
public class ExpressManager {
    private int ID;
    private static int count=200;

   
    private String name;
    private String address;
    private String phone;
    private String company;
    private UserAccount useraccount;
    private Employee employee;
    private Role role;
 
    public ExpressManager(){
    
    }
    public ExpressManager(String Name,UserAccount useraccount,String company,String address,String phone){
    ID=count++;
        this.name = name;
        this.useraccount=useraccount;
        this.company=company;
        this.address=address;
        this.phone=phone;
    }
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company= company;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return useraccount.getUsername();
    }  
}
