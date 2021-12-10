/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Customer.CustomerDirectory;
import Business.CustomerOrder.BuyOrderItem;
import Business.Epay.EpayerDir;

import Business.Express.ExpressManagerDir;
import Business.Item.Items;
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
    private ExpressManagerDir expressManagerDir;
    private EpayerDir epayerdir;
    private UserAccountDirectory userAccountDirectory;


    
    
    
    
   
 
    
    public EpayerDir getEpayerdir() {
        return epayerdir;
    }

    public void setEpayerdir(EpayerDir epayerdir) {
        this.epayerdir = epayerdir;
    }

    public void setSellerDirectory(SellerDirectory sellerDirectory) {
        this.sellerDirectory = sellerDirectory;
    }

    public void setExpressManagerDir(ExpressManagerDir expressManagerDir) {
        this.expressManagerDir = expressManagerDir;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
   

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }


    
    
    
    
    
    public Network(){
        userAccountDirectory=new UserAccountDirectory();
        sellerDirectory=new SellerDirectory();
        customerDirectory =new CustomerDirectory();
        expressManagerDir=new ExpressManagerDir();
        epayerdir=new EpayerDir();
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

    

    public ExpressManagerDir getExpressManagerDir() {
        return expressManagerDir;
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
