/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Epay;

import Business.Express.DeliveryMan;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 13522
 */
public class EpayerDir {
     private ArrayList<Epayer> epayerList;
    
    public EpayerDir(){
        epayerList = new ArrayList();
    }
    
    public ArrayList<Epayer> getEpayerList(){
        return epayerList;
    }
    
    public Epayer authenticateUser(String username, String password){
        for(Epayer ep : epayerList)
            if(ep.getUserAccount().getUsername().equals(username) && ep.getUserAccount().getPassword().equals(password)){
                return ep;
            }
        return null;
    }
    
    public Epayer createEpayer(String Name, String phone, UserAccount useraccount){
        Epayer ep = new Epayer( Name,phone,useraccount);
        epayerList.add(ep);
        return ep;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for(Epayer ep : epayerList){
            if(ep.getUserAccount().getUsername().equals(username))
                return false;
        }
        return true;
    }
}
