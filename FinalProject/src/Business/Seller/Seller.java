/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

import Business.Employee.Employee;
import Business.Item.Items;
import Business.PriceManager.PriceManagerDir;
import Business.ProductManager.ProductManagerDir;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harold
 */
public class Seller {
    private String name;
    private String telephone; 
    private String address;
    private String position;
    private UserAccount userAccount;
    private Items items;
    private PriceManagerDir priceManagerDir;
    private ProductManagerDir productManagerDir;
    private String type;

   

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Items getSellerGoodCatalog() {
        if(items==null){
            items = new Items();
        }
        return items;
    }

    public void setSellerGoodCatalog(Items sellerGoodCatalog) {
        this.items = sellerGoodCatalog;
    }

    public PriceManagerDir getPriceManagerDir() {
        if(priceManagerDir==null){
            priceManagerDir = new PriceManagerDir();
        }
        return priceManagerDir;
    }

    public void setPriceManagerDir(PriceManagerDir priceManageDir) {
        this.priceManagerDir = priceManageDir;
    }

    public ProductManagerDir getProductManagerDir() {
        if(productManagerDir==null){
            productManagerDir = new ProductManagerDir();
        }
        return productManagerDir;
    }

    public void setProductManagerDir(ProductManagerDir productManagerDir) {
        this.productManagerDir = productManagerDir;
    }

  

  
    
    @Override
    public String toString() {
        return name;
    }
}
