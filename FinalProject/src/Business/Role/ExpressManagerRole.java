/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import javax.swing.JPanel;
import userinterface.ExpressRole.ExpressManagerWorkAreaJPanel;
import userinterface.ExpressRole.ExpressWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class ExpressManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem business, Network net) {
        return new ExpressWorkAreaJPanel(userProcessContainer,business,net);//To change body of generated methods, choose Tools | Templates.
    }
    
}
