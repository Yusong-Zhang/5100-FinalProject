/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class SellerDirectory {
    private ArrayList<Seller> sellerList;
    private ArrayList<Menu> ml;
    public SellerDirectory(){
        sellerList = new ArrayList();
        ml = new ArrayList();
    }
    
      public ArrayList<Menu> getMl() {
        return ml;
    }

    public void setMl(ArrayList<Menu> ml) {
        this.ml = ml;
    }
    
    public void createMenu(String name,Double price,String describe){
        Menu m = new Menu(name,price,describe);
        ml.add(m);
    }
    public ArrayList getMenu(){
        return ml;
    }
    public void deleteMenu(Menu m){
        ml.remove(m);
    }
    public ArrayList<Seller> getSellerList(){
        return sellerList;
    }
    
    public Seller authenticateUser(String username, String password){
        for(Seller r : sellerList)
            if(r.getUserAccount().getUsername().equals(username) && r.getUserAccount().getPassword().equals(password)){
                return r;
            }
        return null;
    }
    
    public Seller createSeller(String Name,UserAccount useraccount,String type,String address,String phone){
        Seller r = new Seller( Name,useraccount,type,address,phone);
        
        sellerList.add(r);
        return r;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for(Seller r : sellerList){
            if(r.getUserAccount().getUsername().equals(username))
                return false;
        }
    return true;
    }
}
