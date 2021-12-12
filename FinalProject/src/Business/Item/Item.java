/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Item;

import Business.Seller.Seller;

/**
 *
 * @author 13522
 */
public class Item {
     private String itemName;
    private int price;
    private int modelNumber;
    private String discribe;
    private int quantity;
    private Seller seller;
    private String imagePath;
    private Comments comments;
    private String type;
    
    private static int count =0;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
  
    public Item(String itemName,int price, String discribe,int quantity,Seller seller) {
        this.itemName=itemName;
        this.price=price;
        this.discribe=discribe;
        this.quantity=quantity;
        this.seller=seller;
        this.modelNumber = count;
        count++;
    }
     public Item(){
 
 
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String prodName) {
        this.itemName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDiscribe() {
        return discribe;
    }

    public void setDiscribe(String discribe) {
        this.discribe = discribe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Comments getComments() {
        if(comments ==null){
            comments = new Comments();
        }
        return comments;
    }
    
    @Override
    public String toString() {
        return itemName;
    }
}
