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
import userinterface.SellerRole.SellerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SellerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem business, Network net, UserAccount account) {
        return new SellerWorkAreaJPanel(userProcessContainer,business,net, account);
    }

    
    
}
