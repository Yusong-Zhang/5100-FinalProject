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
        
        
       
//        Customer c1 = system.getCustomerDirectory().createCustomer(1, "Name", "username", "password");
//        DeliveryMan m1 = system.getDeliveryManDirectory().createDeliveryMan(2, "Name", "username", "password");
//        system.getSellerDirectory().createRestaurant(3, "1", "2", "3");
//      Restaurant r1 = system.getRestaurantDirectory().createRestaurant(3, "Name", "username", "password");
//        
        return system;
    }
    
}
