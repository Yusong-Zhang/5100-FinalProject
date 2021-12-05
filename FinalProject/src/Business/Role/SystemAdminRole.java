/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{
 
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,WorkQueue wq,Network net) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,account, business,wq,net);
    }
   
}
