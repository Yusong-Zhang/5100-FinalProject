/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SellerRole;

import Business.Customer.Customer;
import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Express.ExpressManager;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author austinliu
 */
public class ManageSellerInfoJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Network network;
    EcoSystem system;
    UserAccount useraccount;
    ArrayList<BuyOrderItem> itemList = new ArrayList<BuyOrderItem>();
    Seller seller;
    ExpressManager ec;
    /**
     * Creates new form ManageSellerInfoJPanel
     */
    public ManageSellerInfoJPanel(JPanel userProcessContainer, Network net, EcoSystem system, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = net;
        this.system = system;
        this.useraccount = useraccount;
            for(Seller s: network.getSellerDirectory().getSellerList()){
            if(s.getUserAccount().getUsername().equals(useraccount.getUsername())){
                seller = s;
            }
        }
        ArrayList<ExpressManager> list = network.getExpressManagerDir().getExpressManagerList();
        for(int i=0;i<list.size();i++){
             jComboBox1.addItem(list.get(i).getName());
        }
        
        refreshTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        txtBuyer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnhooseDeliveryCompany = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Buyer Order Screen");

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Creat Time", "Buyer", "Buyer Position", "Quantity", "Status", "Inventory"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInfo);

        jLabel6.setText("Buyer:");

        jLabel7.setText("Position:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("Product:");

        jLabel5.setText("Time:");

        jLabel8.setText("Status:");

        btnhooseDeliveryCompany.setText("Choose Delivery Company");
        btnhooseDeliveryCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhooseDeliveryCompanyActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Delivery Company:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnBack)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(390, 390, 390)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(392, 392, 392)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 281, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnhooseDeliveryCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhooseDeliveryCompany))
                .addGap(147, 147, 147)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String ItemName = txtProduct.getText();
        String buyer = txtBuyer.getText();
        String position = txtPosition.getText();
        String status = txtStatus.getText();
        String time = "";
        if(txtTime.getText().length()>0){
            try{
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date date = format.parse(txtTime.getText());
                time = format.format(date);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please input time on format:'yyyy-MM-dd HH:mm'!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        //star to filter no-empty requirement
        ArrayList<BuyOrderItem> orderItemList = new ArrayList<BuyOrderItem>();
        if(ItemName.length()>0){
            for(BuyOrderItem item: itemList){
                if(item.getItem().getItemName().equals(ItemName)){
                    orderItemList.add(item);
                }
            }
        }
        else{
            orderItemList = itemList;
        }
        ArrayList<BuyOrderItem> orderItemList1 = new ArrayList<BuyOrderItem>();
        if(buyer.length()>0){
            for(BuyOrderItem item: orderItemList){
                if(item.getCustomer().getUserAccount().getUsername().equals(buyer)){
                    orderItemList1.add(item);
                }
            }
        }
        else{
            orderItemList1 = orderItemList;
        }
        ArrayList<BuyOrderItem> orderItemList2 = new ArrayList<BuyOrderItem>();
        if(position.length()>0){
            for(BuyOrderItem item: orderItemList1){
                if(item.getCustomer().getAddress().equals(position)){
                    orderItemList2.add(item);
                }
            }
        }
        else{
            orderItemList2 = orderItemList1;
        }
        ArrayList<BuyOrderItem> orderItemList3 = new ArrayList<BuyOrderItem>();
        if(time.length()>0){
            for(BuyOrderItem item: orderItemList2){
                if(item.getCreateTime().equals(time)){
                    orderItemList3.add(item);
                }
            }
        }
        else{
            orderItemList3 = orderItemList2;
        }
        ArrayList<BuyOrderItem> orderItemList4 = new ArrayList<BuyOrderItem>();
        if(status.length()>0){
            for(BuyOrderItem item: orderItemList3){
                if(item.getStatus().equals(status)){
                    orderItemList4.add(item);
                }
            }
        }
        else{
            orderItemList4 = orderItemList3;
        }

        searchOrderItemTable(orderItemList4);
        orderItemList4.clear();
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnhooseDeliveryCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhooseDeliveryCompanyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblInfo.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)tblInfo.getValueAt(selectedRow, 0);
        
        //find choosed ExpressCompany
        String deliveryCompany=(String) jComboBox1.getSelectedItem();
        ArrayList<ExpressManager> list = network.getExpressManagerDir().getExpressManagerList();
        for(int i=0;i<list.size();i++){
            if(deliveryCompany.equals(list.get(i).getName())){
                ec = list.get(i);
            }
        }

        //judge orderitem status
//        if(item.getStatus().equals("Buyer submitted the order")){
//            item.setStatus("SELLER SHIPPED");
            ec.getBuyOrder().getOrderItemList().add(item);
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "The order item's status is not 'Buyer submitted the order', you could not distribute!", "Warning",JOptionPane.WARNING_MESSAGE);
            refreshTable();
//        }

        //judge orderitem position and express company position
        //        if(sellerPosition.equals(ec.getPosition())){}
        //        else{
            //            JOptionPane.showMessageDialog(null, "The order item's seller position is not suitable for this delivery company!", "Warning",JOptionPane.WARNING_MESSAGE);
            //            return;
            //        }

        
    
    }//GEN-LAST:event_btnhooseDeliveryCompanyActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnhooseDeliveryCompany;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtBuyer;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        int rowCount = tblInfo.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblInfo.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        itemList.clear();
    
        for(Customer buyer: network.getCustomerDirectory().getCustomersList()){
            for(BuyOrderItem item: buyer.getBuyOrder().getOrderItemList()){
                if(item.getItem().getSeller().equals(seller)){
                    Object row[] = new Object[8];
                    row[0] = item;
                    row[1] = item.getItem().getPrice();
                    row[2] = item.getCreateTime();
                    row[3] = buyer;
                    row[4] = buyer.getAddress();
                    row[5] = item.getQuantity();
                    row[7] = item.getItem().getQuantity();
                    row[6] = item.getStatus();
                    itemList.add(item);
                    model.addRow(row);
                }//To change body of generated methods, choose Tools | Templates.
    }
        }
    }
    public void searchOrderItemTable(ArrayList<BuyOrderItem> itemlist){
        int rowCount = tblInfo.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblInfo.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
    
        
            for(BuyOrderItem item: itemlist){
                
                    Object row[] = new Object[8];
                    row[0] = item;
                    row[1] = item.getItem().getPrice();
                    row[2] = item.getCreateTime();
                    row[3] = item.getCustomer();
                    row[4] = item.getCustomer().getAddress();
                    row[5] = item.getQuantity();
                    row[7] = item.getItem().getQuantity();
                    row[6] = item.getStatus();
                    
                    model.addRow(row);
                
            }
    }
}
