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
       private ArrayList<PriceManager> PriceManageList;

    public  PriceManagerDir() {
        PriceManageList = new ArrayList();
    }

    public ArrayList<PriceManager> getPriceManageList() {
        return PriceManageList;
    }
}
