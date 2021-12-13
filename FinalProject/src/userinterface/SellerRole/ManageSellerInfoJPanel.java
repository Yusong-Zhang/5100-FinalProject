
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


public class ManageSellerInfoJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Network network;
    EcoSystem system;
    UserAccount useraccount;
    ArrayList<BuyOrderItem> itemList = new ArrayList<BuyOrderItem>();
    Seller seller;
    ExpressManager ec;
   
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
        txtStatus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnhooseDeliveryCompany = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 32, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Buyer Order Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 25, 384, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 904, 147));
        add(txtBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 152, -1));

        jLabel6.setText("Buyer:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jLabel7.setText("Position:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));
        add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 152, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 152, -1));

        jLabel4.setText("Product:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 257, -1, -1));
        add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 152, -1));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 152, -1));

        jLabel8.setText("Status:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 636, 177, 162));

        btnhooseDeliveryCompany.setText("Choose Delivery Company");
        btnhooseDeliveryCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhooseDeliveryCompanyActionPerformed(evt);
            }
        });
        add(btnhooseDeliveryCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 200, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 152, -1));

        jLabel9.setText("Delivery Company:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 464, -1, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
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
        if(item.getStatus().equals("Customer submitted the order")){
             
            ec.getBuyOrder().getOrderItemList().add(item);
            item.setStatus("Assigned");
             refreshTable();
            JOptionPane.showMessageDialog(null, "You've already aassign to a Express Company");
        }
        else{
            JOptionPane.showMessageDialog(null, "The order item's status is not 'Customer submitted the order', you could not distribute!", "Warning",JOptionPane.WARNING_MESSAGE);
           
        }
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
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
