/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;
import javax.swing.JPanel;
import userinterface.ExpressRole.DeliveryManJPanel;

/**
 *
 * @author 86133
 */
public class DeliveryManRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem business, Network net) {
        return new DeliveryManJPanel(userProcessContainer, business,net);//To change body of generated methods, choose Tools | Templates.
    }
    
}
