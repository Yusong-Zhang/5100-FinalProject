/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class SellerDirectory {
    private ArrayList<Seller> restaurantList;
    private ArrayList<Menu> ml;
    public SellerDirectory(){
        restaurantList = new ArrayList();
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
    public ArrayList<Seller> getRestaurantList(){
        return restaurantList;
    }
    
    public Seller authenticateUser(String username, String password){
        for(Seller r : restaurantList)
            if(r.getUsername().equals(username) && r.getPassword().equals(password)){
                return r;
            }
        return null;
    }
    
    public Seller createRestaurant(int ID, String Name, String username, String password){
        Seller r = new Seller(ID, Name, username, password);
        
        restaurantList.add(r);
        return r;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for(Seller r : restaurantList){
            if(r.getUsername().equals(username))
                return false;
        }
    return true;
    }
}
