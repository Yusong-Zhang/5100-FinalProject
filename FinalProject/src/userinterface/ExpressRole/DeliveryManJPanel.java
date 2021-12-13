package userinterface.ExpressRole;

import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Express.DeliveryMan;
import Business.Express.ExpressManager;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class DeliveryManJPanel extends javax.swing.JPanel {
        JPanel userProcessContainer;
        Network net;
        EcoSystem system;
        UserAccount useraccount;
        DeliveryMan deliveryman;

    
  

    public DeliveryManJPanel(JPanel userProcessContainer, EcoSystem business, Network net, UserAccount useraccount) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.system = system;
        this.net = net;
        for(ExpressManager em : net.getExpressManagerDir().getExpressManagerList()){
            for(DeliveryMan dm : em.getDeliverymanDir().getDeliverymanList()){
                if(dm.getUserAccount().getUsername().equals(useraccount.getUsername()))
                    deliveryman = dm;
  }
        }
        populateTable();
        cbxUpdateStatus.addItem("Work");
        cbxUpdateStatus.addItem("Rest");
        
    }
    public void populateTable(){
        int rowCount = tblDeliveryMan.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblDeliveryMan.getModel();
        for(int i = rowCount - 1; i >= 0; i--){
            model.removeRow(i);
        }
        for(BuyOrderItem buyOrderItem: deliveryman.getBuyOrder().getOrderItemList()){
            if(buyOrderItem.getOrderPosition().equals(buyOrderItem.getCustomer().getAddress())){
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

        btnAccept = new javax.swing.JButton();
        btnRefuse = new javax.swing.JButton();
        btnUpdateStatus = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        cbxUpdateStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        btnRefuse.setText("Refuse");
        btnRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefuseActionPerformed(evt);
            }
        });
        add(btnRefuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        btnUpdateStatus.setText("Update Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });
        add(btnUpdateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 147, -1));

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        add(cbxUpdateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 106, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Delivery Man Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveryMan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 550, 96));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int selectedRow = tblDeliveryMan.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem buyOrderItem = (BuyOrderItem)tblDeliveryMan.getValueAt(selectedRow, 0);
        if(buyOrderItem.getStatus().equals("Assign to Delivery Man")){
            buyOrderItem.setStatus("Delivery Man Delivering");
            JOptionPane.showMessageDialog(null, "Delivering Assigned!");
        }else{
            JOptionPane.showMessageDialog(null, "This Order cannot be Operated!", "Warning", JOptionPane.WARNING_MESSAGE);
           
        }
 populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefuseActionPerformed

        int selectedRow = tblDeliveryMan.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem buyOrderItem = (BuyOrderItem)tblDeliveryMan.getValueAt(selectedRow, 0);
        if(buyOrderItem.getStatus().equals("Assign to Delivery Man")){
            buyOrderItem.setStatus("Delivery Man Refused");
            deliveryman.getBuyOrder().getOrderItemList().remove(buyOrderItem);
            JOptionPane.showMessageDialog(null, "Delivering Refused!");
        }else{
            JOptionPane.showMessageDialog(null, "This Order cannot be Operated!", "Warning", JOptionPane.WARNING_MESSAGE);
          
        }
          populateTable();
    }//GEN-LAST:event_btnRefuseActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        
        String status = (String)cbxUpdateStatus.getSelectedItem();
        deliveryman.setStatus(status);
        JOptionPane.showMessageDialog(null, "The status has been changed to " + status);
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
       
        int selectedRow = tblDeliveryMan.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem buyOrderItem = (BuyOrderItem)tblDeliveryMan.getValueAt(selectedRow, 0);
        if(buyOrderItem.getStatus().equals("Delivery Man Delivering")){
            buyOrderItem.setStatus("Delivered");
            JOptionPane.showMessageDialog(null, "Delivering Finished!");
        }else{
            JOptionPane.showMessageDialog(null, "This Order cannot be Operated!", "Warning", JOptionPane.WARNING_MESSAGE);
           
        }
         populateTable();
    }//GEN-LAST:event_btnFinishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnRefuse;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox<String> cbxUpdateStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryMan;
    // End of variables declaration//GEN-END:variables
}
