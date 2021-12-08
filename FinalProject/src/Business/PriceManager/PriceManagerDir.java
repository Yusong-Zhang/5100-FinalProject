/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PriceManager;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 86133
 */
public class PriceManagerDir {
      private ArrayList<PriceManager> pricelist;
    
    public PriceManagerDir(){
        pricelist = new ArrayList();
    }
    
    public ArrayList<PriceManager> getEpayerList(){
        return pricelist;
    }
    
    public PriceManager authenticateUser(String username, String password){
        for(PriceManager ep : pricelist)
            if(ep.getUseraccount().getUsername().equals(username) && ep.getUseraccount().getPassword().equals(password)){
                return ep;
            }
        return null;
    }
    
    public PriceManager createEpayer(String Name, String phone, UserAccount useraccount){
       PriceManager ep = new PriceManager( Name,phone,useraccount);
        pricelist.add(ep);
        return ep;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for(PriceManager ep : pricelist){
            if(ep.getUseraccount().getUsername().equals(username))
                return false;
        }
        return true;
    }
}
