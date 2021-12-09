/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Express;

import Business.CustomerOrder.BuyOrder;
import Business.UserAccount.UserAccount;

/**
 *
 * @author 86133
 */
public class DeliveryMan {
    private String telephone;
    private String position;
    private String status;
    public UserAccount userAccount;
    private BuyOrder buyOrder;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public BuyOrder getBuyOrder() {
        if(buyOrder == null){
            buyOrder = new BuyOrder();
        }
        return buyOrder;
    }

    public void setBuyOrder(BuyOrder buyOrder) {
        this.buyOrder = buyOrder;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    @Override
    public String toString() {
        return position;
    }
}
