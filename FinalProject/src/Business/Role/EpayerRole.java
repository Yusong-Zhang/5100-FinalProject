/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;
import userinterface.EpayerRole.EpayerAreaJPanel;

/**
 *
 * @author 13522
 */
public class EpayerRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem business,Network net, UserAccount account) {
        return new EpayerAreaJPanel(userProcessContainer,business,net, account);
    }
    
    

}
