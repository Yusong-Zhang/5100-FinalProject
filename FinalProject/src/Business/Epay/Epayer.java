/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Epay;

import Business.UserAccount.UserAccount;

/**
 *
 * @author 13522
 */
public class Epayer {
    public static int count=300;
    private int ID;
    private String name;
    private String phone;
    private UserAccount useraccount;

    public Epayer( String name, String phone, UserAccount account) {
        this.ID = count;
        this.name = name;
        this.phone = phone;
        this.useraccount = account;
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

    public UserAccount getUserAccount() {
        return useraccount;
    }

    public void setUserAccount(UserAccount account) {
        this.useraccount = account;
    }
    @Override
    public String toString() {
        return name;
    }
    
}
