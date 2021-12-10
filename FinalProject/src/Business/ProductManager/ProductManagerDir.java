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
      private ArrayList<ProductManager> PorductManagerList;

    public  ProductManagerDir() {
        PorductManagerList = new ArrayList();
    }

    public ArrayList<ProductManager> getProductManagerList() {
        return PorductManagerList;
    }
}
