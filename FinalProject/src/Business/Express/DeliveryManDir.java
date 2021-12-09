/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Express;

import Business.Express.DeliveryMan;
import java.util.ArrayList;

/**
 *
 * @author 86133
 */
public class DeliveryManDir {
     private ArrayList<DeliveryMan> DeliverymanList;

    public  DeliveryManDir() {
        DeliverymanList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliverymanList() {
        return DeliverymanList;
    }
}
