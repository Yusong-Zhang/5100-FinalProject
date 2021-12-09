/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Item;

import Business.Seller.Seller;
import java.util.ArrayList;

/**
 *
 * @author 13522
 */
public class Items {
     private ArrayList<Item> itemCatalog;

    public Items() {
        itemCatalog = new ArrayList<Item>();
    }
    
    public ArrayList<Item> getItemCatalog(){
//        if(itemCatalog ==null){
//            itemCatalog = new ArrayList<Item>();
//        }
        return itemCatalog;
    }
    
    
    public Item addItem(){
        Item i = new Item();
        itemCatalog.add(i);
        return i;
    }
    public Item addItem(String itemName,int price, String discribe,int quantity,Seller seller){
        Item i = new Item(itemName,price,discribe,quantity,seller);
        itemCatalog.add(i);
        System.out.println(i);
        return i;
    }
    public void removeItem(Item i){
        itemCatalog.remove(i);
    }
    
    public Item searchItem(int id){
        for (Item item : itemCatalog) {
//            if(product.getModelNumber()==id){
                return item;
            }
       return null;
        }
}
