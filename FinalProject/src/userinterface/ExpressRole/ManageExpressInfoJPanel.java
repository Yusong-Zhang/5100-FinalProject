
package userinterface.ExpressRole;

import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Express.DeliveryMan;
import Business.Express.ExpressManager;
import Business.Express.Transport;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageExpressInfoJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Network net;
    EcoSystem system;
    UserAccount useraccount;
    ExpressManager expressmanager;
    


    ManageExpressInfoJPanel(JPanel userProcessContainer, Network net, EcoSystem system, UserAccount useraccount, ExpressManager expressmanager) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.system = system;
        this.net = net;
        this.expressmanager = expressmanager;
        populateTable();
        populateTable2();
    }
    public void populateTable(){
        int rowCount = tblDriverOrder.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblDriverOrder.getModel();
        for(int i= rowCount - 1;i >= 0;i--) {
            model.removeRow(i);
        }
        for(BuyOrderItem buyOrderItem : expressmanager.getBuyOrder().getOrderItemList()){
            if(!buyOrderItem.getItem().getSeller().getAddress().equals(buyOrderItem.getCustomer().getAddress()) 
                    && !buyOrderItem.getStatus().equals("Delivered") ){
                Object row[] = new Object[5];
                row[0] = buyOrderItem;
                row[1] = buyOrderItem.getQuantity();
                row[2] = buyOrderItem.getCustomer().getAddress();
                row[3] = buyOrderItem.getItem().getSeller().getAddress();
                row[4] = buyOrderItem.getStatus(); 
                
                model.addRow(row);
                }
        }
    }
    public void populateTable2(){
        int rowCount = tblDeliveryManOrder.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblDeliveryManOrder.getModel();
        for(int i= rowCount - 1;i >= 0;i--) {
            model.removeRow(i);
        }
        for(BuyOrderItem buyOrderItem : expressmanager.getBuyOrder().getOrderItemList()){
            if(buyOrderItem.getOrderPosition().equals(buyOrderItem.getCustomer().getAddress()) 
                    && !buyOrderItem.getStatus().equals("Delivered")){
                Object row[] = new Object[5];
                row[0] = buyOrderItem;
                row[1] = buyOrderItem.getQuantity();
                row[2] = buyOrderItem.getCustomer().getAddress();
                row[3] = buyOrderItem.getOrderPosition();
                row[4] = buyOrderItem.getStatus(); 
                
                model.addRow(row);
                }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDriver = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDriverOrder = new javax.swing.JTable();
        cbxDriver = new javax.swing.JComboBox<>();
        btnChooseDriver = new javax.swing.JButton();
        btnAssigntoDriver = new javax.swing.JButton();
        lblDeliveryMan = new javax.swing.JLabel();
        cbxDeliveryMan = new javax.swing.JComboBox<>();
        btnChooseDeliveryMan = new javax.swing.JButton();
        btnAssigntoDeliveryMan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryManOrder = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDriver.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblDriver.setText("Driver:");
        add(lblDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        tblDriverOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Items", "Quantity", "Customer Address", "Seller Address", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDriverOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 623, 148));

        add(cbxDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 163, -1));

        btnChooseDriver.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnChooseDriver.setText("Choose Driver");
        btnChooseDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDriverActionPerformed(evt);
            }
        });
        add(btnChooseDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 173, -1));

        btnAssigntoDriver.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAssigntoDriver.setText("Assign to Driver");
        btnAssigntoDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigntoDriverActionPerformed(evt);
            }
        });
        add(btnAssigntoDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 242, -1));

        lblDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblDeliveryMan.setText("Delivery Man:");
        add(lblDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, -1));

        add(cbxDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 163, -1));

        btnChooseDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnChooseDeliveryMan.setText("Choose Delivery Man");
        btnChooseDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDeliveryManActionPerformed(evt);
            }
        });
        add(btnChooseDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        btnAssigntoDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAssigntoDeliveryMan.setText("Assign to Delivery Man");
        btnAssigntoDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigntoDeliveryManActionPerformed(evt);
            }
        });
        add(btnAssigntoDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 234, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        jLabel1.setText("Express Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setText("Back<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 22, -1, -1));

        tblDeliveryManOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Items", "Quantity", "Customer Address", "Seller Address", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDeliveryManOrder);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 623, 148));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDriverActionPerformed
       
        int selectedRow = tblDriverOrder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        BuyOrderItem buyOrderItem = (BuyOrderItem)tblDriverOrder.getValueAt(selectedRow, 0);

        if(!buyOrderItem.getItem().getSeller().getAddress().equals(buyOrderItem.getCustomer().getAddress())
               ||buyOrderItem.getStatus().equals("Driver Refused")){

            cbxDriver.setEnabled(true);
            btnChooseDriver.setEnabled(false);
            btnAssigntoDriver.setEnabled(true);
            cbxDriver.removeAllItems();

            for(Transport tr : expressmanager.getTransportDir().getDriverList()){
                if(tr.getStatus().equals("Work")) 
                cbxDriver.addItem(tr.getUserAccount().getUsername());
            }
        }
        
    }//GEN-LAST:event_btnChooseDriverActionPerformed

    private void btnAssigntoDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigntoDriverActionPerformed
       
        int selectedRow = tblDriverOrder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        BuyOrderItem buyOrderItem = (BuyOrderItem)tblDriverOrder.getValueAt(selectedRow, 0);
        String driverName = (String)cbxDriver.getSelectedItem();
        Transport transport = new Transport();
        for(Transport tr : expressmanager.getTransportDir().getDriverList()){
            if(tr.getUserAccount().getUsername().equals(driverName)){
                transport = tr;
            }
        }
         if(buyOrderItem.getStatus().equals("Assigned")){
        buyOrderItem.setStatus("Assign to Driver");
        transport.getBuyOrder().getOrderItemList().add(buyOrderItem);

        cbxDriver.setEnabled(false);
        btnChooseDriver.setEnabled(true);
        btnAssigntoDriver.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Driver Assigned!");
        populateTable();
         }else{
          JOptionPane.showMessageDialog(null, "The order item's status is not 'Assigned', you could not Assign", "Warning",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_btnAssigntoDriverActionPerformed

    private void btnChooseDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDeliveryManActionPerformed
        
        int selectedRow = tblDeliveryManOrder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        BuyOrderItem buyOrderItem = (BuyOrderItem)tblDeliveryManOrder.getValueAt(selectedRow, 0);

        if(buyOrderItem.getOrderPosition().equals(buyOrderItem.getCustomer().getAddress())
               ||buyOrderItem.getStatus().equals("Delivery Man Refused")){

            cbxDeliveryMan.setEnabled(true);
            btnChooseDeliveryMan.setEnabled(false);
            btnAssigntoDeliveryMan.setEnabled(true);
            cbxDeliveryMan.removeAllItems();

            for(DeliveryMan dm : expressmanager.getDeliverymanDir().getDeliverymanList()){
                if(dm.getStatus().equals("Work"))
                cbxDeliveryMan.addItem(dm.getUserAccount().getUsername());
            }
        }
        
    }//GEN-LAST:event_btnChooseDeliveryManActionPerformed

    private void btnAssigntoDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigntoDeliveryManActionPerformed
        
        
        int selectedRow = tblDeliveryManOrder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        BuyOrderItem buyOrderItem = (BuyOrderItem)tblDeliveryManOrder.getValueAt(selectedRow, 0);
        String deliverymanname = (String)cbxDeliveryMan.getSelectedItem();
        DeliveryMan deliveryman = new DeliveryMan();
        for(DeliveryMan d : expressmanager.getDeliverymanDir().getDeliverymanList()){
            if(d.getUserAccount().getUsername().equals(deliverymanname)){
                deliveryman = d;
            }
        }
        buyOrderItem.setStatus("Assign to Delivery Man");
        deliveryman.getBuyOrder().getOrderItemList().add(buyOrderItem);

        cbxDeliveryMan.setEnabled(false);
        btnChooseDeliveryMan.setEnabled(true);
        btnAssigntoDeliveryMan.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Delivery Man Assigned!");
        populateTable2();
    }//GEN-LAST:event_btnAssigntoDeliveryManActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssigntoDeliveryMan;
    private javax.swing.JButton btnAssigntoDriver;
    private javax.swing.JButton btnChooseDeliveryMan;
    private javax.swing.JButton btnChooseDriver;
    private javax.swing.JComboBox<String> cbxDeliveryMan;
    private javax.swing.JComboBox<String> cbxDriver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDeliveryMan;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JTable tblDeliveryManOrder;
    private javax.swing.JTable tblDriverOrder;
    // End of variables declaration//GEN-END:variables
}
