/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;

import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Seller("Seller"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin"),
        ProductManager("ProductManager"),
        PriceManager("PriceManager"),
        Feedback("Feedback");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        public String getType(){
        return "Sysadmin";
        }
        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,  
            EcoSystem business, Network net);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}