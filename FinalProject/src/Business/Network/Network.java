/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Customer.CustomerDirectory;

import Business.Express.ExpressManagerDir;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private SellerDirectory sellerDirectory;
    private CustomerDirectory customerDirectory;
    private ExpressManagerDir expressCompanyDir;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    
    
    
    public Network(){
        userAccountDirectory=new UserAccountDirectory();
        sellerDirectory=new SellerDirectory();
        customerDirectory =new CustomerDirectory();
        expressCompanyDir=new ExpressManagerDir();
        workQueue= new WorkQueue(); 
        
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SellerDirectory getSellerDirectory() {
        return sellerDirectory;
    }

    public CustomerDirectory getBuyerDirectory() {
        return customerDirectory;
    }

    public ExpressManagerDir getExpressCompanyDir() {
        return expressCompanyDir;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
     public boolean checkIfUserIsUnique(String userName){
        
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return name;
    }
    
}
