package userinterface.ExpressRole;

import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Express.ExpressManager;
import Business.Express.Transport;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class TransportJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Network net;
    EcoSystem system;
    UserAccount useraccount;
    Transport transport;
    
  

    public TransportJPanel(JPanel userProcessContainer, EcoSystem business, Network net, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.useraccount = useraccount;
        this.net = net;
        for(ExpressManager em : net.getExpressManagerDir().getExpressManagerList()){
            for(Transport tr: em.getTransportDir().getDriverList()){
                if(tr.getUserAccount().getUsername().equals(useraccount.getUsername())){
                    transport = tr;
            }
        }
         
    }
    
    populateTable();
    cbxUpdateStatus.addItem("Work");
    cbxUpdateStatus.addItem("Rest");
  
    }
    
    public void populateTable(){
        int rowCount = tblTransport.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblTransport.getModel();
        for(int i = rowCount - 1; i >= 0; i--){
            model.removeRow(i);
        }
        for(BuyOrderItem buyOrderItem: transport.getBuyOrder().getOrderItemList()){
            Object row[] = new Object[5];
            row[0] = buyOrderItem;
            row[1] = buyOrderItem.getQuantity();
            row[2] = buyOrderItem.getCustomer().getAddress();
            row[3] = buyOrderItem.getOrderPosition();
            row[4] = buyOrderItem.getStatus();
            
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransport = new javax.swing.JTable();
        btnUpdateStatus = new javax.swing.JButton();
        cbxUpdateStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnRefuse = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Items", "Quantity", "Customer Address", "Item Position", "Status"
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
        jScrollPane1.setViewportView(tblTransport);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 589, 96));

        btnUpdateStatus.setText("Update Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });
        add(btnUpdateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 140, -1));

        add(cbxUpdateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 106, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Transport WorkArea");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        btnRefuse.setText("Refuse");
        btnRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefuseActionPerformed(evt);
            }
        });
        add(btnRefuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        
        String status = (String)cbxUpdateStatus.getSelectedItem();
        transport.setStatus(status);
        JOptionPane.showMessageDialog(null, "The status has been changed to " + status);
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem buyOrderItem = (BuyOrderItem)tblTransport.getValueAt(selectedRow, 0);
        if(buyOrderItem.getStatus().equals("Assign to Driver")){
            buyOrderItem.setStatus("Driver Delivering");
            JOptionPane.showMessageDialog(null, "Delivering Assigned!");
        }else{
            JOptionPane.showMessageDialog(null, "This Order cannot be Operated!", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefuseActionPerformed
        
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem buyOrderItem = (BuyOrderItem)tblTransport.getValueAt(selectedRow, 0);
        if(buyOrderItem.getStatus().equals("Assign to Driver")){
            buyOrderItem.setStatus("Driver Refused");
            transport.getBuyOrder().getOrderItemList().remove(buyOrderItem);
            JOptionPane.showMessageDialog(null, "Delivering Refused!");
        }else{
            JOptionPane.showMessageDialog(null, "This Order cannot be Operated!", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        populateTable();
    }//GEN-LAST:event_btnRefuseActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem buyOrderItem = (BuyOrderItem)tblTransport.getValueAt(selectedRow, 0);
        if(buyOrderItem.getStatus().equals("Driver Delivering")){
            buyOrderItem.setStatus("Driver Delivered");
            buyOrderItem.setOrderPosition(buyOrderItem.getCustomer().getAddress());
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
    private javax.swing.JTable tblTransport;
    // End of variables declaration//GEN-END:variables
}
