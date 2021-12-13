
package Business.Express;

import Business.CustomerOrder.BuyOrder;
import Business.UserAccount.UserAccount;


public class DeliveryMan {
    private String telephone;
    private String address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        if(status==null){
            status =new String("Work");}
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
        return name;
    }
}
