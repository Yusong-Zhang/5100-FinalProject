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
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerMainJPanel;
import userinterface.CustomerRole.EpaymentJPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer,EcoSystem business,Network net, UserAccount account) {
        return new CustomerMainJPanel(userProcessContainer,net, business, account);
    }

    

   
    
    
}
