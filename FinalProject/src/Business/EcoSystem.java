/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.Express.DeliveryManDir;
import Business.Network.Network;
import Business.Seller.SellerDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */

public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private SellerDirectory sellerDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDir deliveryManDirectory;
    private WorkQueue wq;

     public Network createAndAddNetwork(String name){
        Network network=new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    sellerDirectory= new SellerDirectory();
    customerDirectory= new CustomerDirectory();
    deliveryManDirectory = new DeliveryManDir();
    networkList=new ArrayList<Network>();
    wq = new WorkQueue();
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public WorkQueue getWq() {
        return wq;
    }

    public void setWq(WorkQueue wq) {
        this.wq = wq;
    }

    public SellerDirectory getSellerDirectory() {
        return sellerDirectory;
    }

    public void setRestaurantDirectory(SellerDirectory restaurantDirectory) {
        this.sellerDirectory = restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDir getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDir deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
