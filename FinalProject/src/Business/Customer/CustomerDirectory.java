/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomersList() {
    
        return customerList;
    }
    
    public Customer authenticateUser(String username, String password){
        for (Customer c : customerList)
            if (c.getUsername().equals(username) && c.getPassword().equals(password)){
                return c;
            }
        return null;
    }
    
    public Customer createCustomer(int ID, String Name, String username, String password){
        Customer c = new Customer(ID,Name,username,password);

        customerList.add(c);
        return c;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Customer c : customerList){
            if (c.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
