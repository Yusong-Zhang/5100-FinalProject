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
import Business.SellerOrder.SellOrder;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harold
 */
public class Seller {
    private int ID;
    private static int count=100;
    private String Name;
    private String type;
     private String address;
    private String phone;
    private UserAccount userAccount;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private Items items;
    private PriceManagerDir priceManageDir;
    private ProductManagerDir productManagerDir;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public PriceManagerDir getPriceManageDir() {
        return priceManageDir;
    }

    public void setPriceManageDir(PriceManagerDir priceManageDir) {
        this.priceManageDir = priceManageDir;
    }

    public ProductManagerDir getProductManagerDir() {
        return productManagerDir;
    }

    public void setProductManagerDir(ProductManagerDir productManagerDir) {
        this.productManagerDir = productManagerDir;
    }

    public SellOrder getSellOrder() {
        return sellOrder;
    }

    public void setSellOrder(SellOrder sellOrder) {
        this.sellOrder = sellOrder;
    }
    private SellOrder sellOrder;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
    public Seller( String Name,UserAccount useraccount,String type,String address,String phone){
       
        ID=count++;
        this.Name = Name;
        this.userAccount=useraccount;
        this.type=type;
        this.address=address;
        this.phone=phone;
    }
    public Seller(){
    
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString() {
        return Name;
    }
}
