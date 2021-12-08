package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Express.DeliveryMan;
import Business.Express.DeliveryManDir;
import Business.Employee.Employee;
import Business.Item.Items;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.Seller.SellerDirectory;
import Business.Role.SellerRole;
import Business.Role.CustomerRole;
import Business.Role.DeliveryManRole;
import Business.Role.EpayerRole;
import Business.Role.ExpressManagerRole;
import Business.Role.FeedbackRole;
import Business.Role.PriceManagerRole;
import Business.Role.ProductManagerRole;
import Business.Role.SystemAdminRole;
import Business.Role.TransportRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
        
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Network net=system.createAndAddNetwork("China");
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        UserAccount useraccount=new UserAccount();
        Seller seller= new Seller();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee e1 = system.getEmployeeDirectory().createEmployee("CP");
        Employee e2 = system.getEmployeeDirectory().createEmployee("CX");
        Employee e3 = system.getEmployeeDirectory().createEmployee("CM");
        Employee e4 = system.getEmployeeDirectory().createEmployee("CD");
        Employee e5 = system.getEmployeeDirectory().createEmployee("CN");
        Employee e6 = system.getEmployeeDirectory().createEmployee("CH");
        Employee e7 = system.getEmployeeDirectory().createEmployee("CV");
        Employee e8 = system.getEmployeeDirectory().createEmployee("CB");
        Employee e9 = system.getEmployeeDirectory().createEmployee("CE");
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        system.getUserAccountDirectory().createUserAccount("1","1", e1, new CustomerRole());
        system.getUserAccountDirectory().createUserAccount("2","2", e2, new ExpressManagerRole());
        useraccount =system.getUserAccountDirectory().createUserAccount("3","3", e3, new SellerRole());
        system.getUserAccountDirectory().createUserAccount("4","4", e4, new EpayerRole());
        system.getUserAccountDirectory().createUserAccount("5","5", e5, new ProductManagerRole());
        system.getUserAccountDirectory().createUserAccount("6","6", e6, new PriceManagerRole());
        system.getUserAccountDirectory().createUserAccount("7","7", e7, new DeliveryManRole());
        system.getUserAccountDirectory().createUserAccount("8","8", e8, new TransportRole());
        system.getUserAccountDirectory().createUserAccount("9","9", e9, new FeedbackRole());
        
        seller.setName("CM");
        seller.setPhone("test");
        seller.setAddress("test");
        seller.setUserAccount(useraccount);
        seller.setType("test");
        net.getSellerDirectory().getSellerList().add(seller);
        
        net.getItems().addItem("socks",10,"cotton socks",10,seller);
       
//        Customer c1 = system.getCustomerDirectory().createCustomer(1, "Name", "username", "password");
//        DeliveryMan m1 = system.getDeliveryManDirectory().createDeliveryMan(2, "Name", "username", "password");
//        system.getSellerDirectory().createRestaurant(3, "1", "2", "3");
//      Restaurant r1 = system.getRestaurantDirectory().createRestaurant(3, "Name", "username", "password");
//        
        return system;
    }
    
}
