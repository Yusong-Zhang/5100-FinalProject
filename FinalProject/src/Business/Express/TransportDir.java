/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Express;

import java.util.ArrayList;

/**
 *
 * @author 13522
 */
public class TransportDir {
      private ArrayList<Transport>transportList;

    public  TransportDir() {
        transportList = new ArrayList();
    }

    public ArrayList<Transport> getDriverList() {
        return transportList;
    }
}
