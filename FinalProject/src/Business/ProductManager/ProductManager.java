/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductManager;

import Business.UserAccount.UserAccount;

/**
 *
 * @author 86133
 */
public class ProductManager {
    public static int count=300;

  
    private int ID;
    private String name;
    private String phone;
    private UserAccount useraccount;

    public ProductManager( String name, String phone, UserAccount account) {
        this.ID = count;
        this.name = name;
        this.phone = phone;
        this.useraccount = account;
    }
      public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
    
}
