/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Express;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDir {
    private ArrayList<DeliveryMan> deliverymanList;
    
    public DeliveryManDir(){
        deliverymanList = new ArrayList();
    }
    
    public ArrayList<DeliveryMan> getDeliveryManList(){
        return deliverymanList;
    }
    
    public DeliveryMan authenticateUser(String username, String password){
        for(DeliveryMan dm : deliverymanList)
            if(dm.getUsername().equals(username) && dm.getPassword().equals(password)){
                return dm;
            }
        return null;
    }
    
    public DeliveryMan createDeliveryMan(int ID, String Name, String username, String password){
        DeliveryMan dm = new DeliveryMan(ID, Name, username, password);
        deliverymanList.add(dm);
        return dm;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for(DeliveryMan dm : deliverymanList){
            if(dm.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
