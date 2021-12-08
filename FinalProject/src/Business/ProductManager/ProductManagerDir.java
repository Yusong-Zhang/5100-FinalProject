/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductManager;

import Business.Epay.Epayer;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 86133
 */
public class ProductManagerDir {
     private ArrayList<ProductManager> productlist;
    
    public ProductManagerDir(){
        productlist = new ArrayList();
    }
    
    public ArrayList<ProductManager> getEpayerList(){
        return productlist;
    }
    
    public ProductManager authenticateUser(String username, String password){
        for(ProductManager pm : productlist)
            if(pm.getUseraccount().getUsername().equals(username) && pm.getUseraccount().getPassword().equals(password)){
                return pm;
            }
        return null;
    }
    
    public ProductManager createEpayer(String Name, String phone, UserAccount useraccount){
        ProductManager ep = new ProductManager( Name,phone,useraccount);
        productlist.add(ep);
        return ep;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for(ProductManager ep : productlist){
            if(ep.getUseraccount().getUsername().equals(username))
                return false;
        }
        return true;
    }
}
