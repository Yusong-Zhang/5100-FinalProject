/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.CustomerOrder.BuyOrder;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harold
 */
public class Customer {
    private static int count=0;
    private int ID;
    private String name;
    private String username;
    private String password;
    private String address;
    private String phone;
    private UserAccount userAccount;
    private Role role;
    private WorkQueue workQueue;  
    private BuyOrder buyOrder;

    
    public Customer(String Name,String username,String password,String address,String phone,UserAccount useraccount) {
        workQueue = new WorkQueue();
        ID = ++count;
        this.name = Name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone=phone;
        this.userAccount=useraccount;
    }
    public Customer(){
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
    
    private Employee employee;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
   
  
   
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

 public BuyOrder getBuyOrder() {
        if(buyOrder==null){
            buyOrder = new BuyOrder();
        }
        return buyOrder;
    }

  @Override
    public String toString() {
        return userAccount.getUsername();
    }
    
}
