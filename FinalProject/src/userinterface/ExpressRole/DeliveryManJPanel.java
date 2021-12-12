/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
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

/**
 *
 * @author 13522
 */
public class DeliveryManJPanel extends javax.swing.JPanel {
        JPanel userProcessContainer;
        Network net;
        EcoSystem system;
        UserAccount useraccount;
        DeliveryMan deliveryman;

    /**
     * Creates new form TransportJPanel
     */
  

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
         //To change body of generated methods, choose Tools | Templates.
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        btnRefuse = new javax.swing.JButton();
        btnUpdateStatus = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        cbxUpdateStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnRefuse.setText("Refuse");
        btnRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefuseActionPerformed(evt);
            }
        });

        btnUpdateStatus.setText("Update Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Delivery Man Work Area");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(refreshJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnAccept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefuse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(refreshJButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnRefuse)
                    .addComponent(btnFinish)
                    .addComponent(btnUpdateStatus)
                    .addComponent(cbxUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
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
            populateTable();
        }

    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefuseActionPerformed
        // TODO add your handling code here:
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
            populateTable();
        }
    }//GEN-LAST:event_btnRefuseActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        // TODO add your handling code here:
        String status = (String)cbxUpdateStatus.getSelectedItem();
        deliveryman.setStatus(status);
        JOptionPane.showMessageDialog(null, "The status has been changed to " + status);
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
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
            populateTable();
        }
    }//GEN-LAST:event_btnFinishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnRefuse;
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox<String> cbxUpdateStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable tblDeliveryMan;
    // End of variables declaration//GEN-END:variables
}
