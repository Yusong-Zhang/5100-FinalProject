package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Express.DeliveryMan;
import Business.Express.DeliveryManDir;
import Business.Employee.Employee;
import Business.Seller.Seller;
import Business.Seller.SellerDirectory;
import Business.Role.SellerRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
        
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        system.createAndAddNetwork("china");
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee e1 = system.getEmployeeDirectory().createEmployee("CP");
        Employee e2 = system.getEmployeeDirectory().createEmployee("CX");
        Employee e3 = system.getEmployeeDirectory().createEmployee("CM");
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        system.getUserAccountDirectory().createUserAccount("1", "1", e1, new CustomerRole());
        system.getUserAccountDirectory().createUserAccount("2","2", e2, new DeliverManRole());
        system.getUserAccountDirectory().createUserAccount("3","3", e3, new SellerRole());
//        
//        Customer c1 = system.getCustomerDirectory().createCustomer(1, "Name", "username", "password");
//        DeliveryMan m1 = system.getDeliveryManDirectory().createDeliveryMan(2, "Name", "username", "password");
//        system.getSellerDirectory().createRestaurant(3, "1", "2", "3");
//      Restaurant r1 = system.getRestaurantDirectory().createRestaurant(3, "Name", "username", "password");
        
        return system;
    }
    
}
