/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Seller;

/**
 *
 * @author 30481
 */
public class Menu {
    private String SetName;
    private Double SetPrice;
    private String describe;

    Menu(String name, Double price, String describe) {
         //To change body of generated methods, choose Tools | Templates.
         SetName = name;
         SetPrice = price;
         this.describe = describe;
    }
    
    public String getSetName() {
        return SetName;
    }

    public void setSetName(String SetName) {
        this.SetName = SetName;
    }

    public Double getSetPrice() {
        return SetPrice;
    }

    public void setSetPrice(Double SetPrice) {
        this.SetPrice = SetPrice;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    
    
}
