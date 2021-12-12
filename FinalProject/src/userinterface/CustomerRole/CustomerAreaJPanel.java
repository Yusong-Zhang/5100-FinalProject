/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Express.ExpressManager;
import Business.Item.Item;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.Tools.Email;
import Business.Tools.PieChart;
import Business.Tools.PieChart1;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;
import userinterface.SystemAdminWorkArea.ManageCustomerJPanel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount u;
    private WorkQueue wq;
    private Network net;
    private Customer customer1;
     ArrayList<Item> itemList = new ArrayList<Item>();
    ArrayList<BuyOrderItem> cart = new ArrayList<BuyOrderItem>();
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer,EcoSystem system,Network net, UserAccount useraccount) {
        initComponents();
//        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.net= net;
        this.u = useraccount;
//        lblCustomerName.setText(((u.getEmployee() != null) ? u.getEmployee().getName() : u.getUsername()) + "!");
//        //valueLabel.setText(enterprise.getName());
//        wq.getRequestList();
        
           populateTable();
    }
    
    public void populateTable(){
//          int rowCount = tblItem.getRowCount();
//        DefaultTableModel model = (DefaultTableModel)tblItem.getModel();
//        for(int i=rowCount-1;i>=0;i--) {
//            model.removeRow(i);
//        }
//      
//       for(Item buyitem:net.getItems().getItemCatalog()){
//          
//           Object row[] = new Object[5];
//           row[0] = buyitem;
//           row[1] = buyitem.getPrice();
//           row[2] = buyitem.getDiscribe();
//           row[3] = buyitem.getQuantity();
//           row[4] = buyitem.getSeller();
//           
//            model.addRow(row);
//       }
 int rowCount = tblItem.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblItem.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        itemList.clear();
        for(Seller seller: net.getSellerDirectory().getSellerList()){
            for(Item item: seller.getSellerGoodCatalog().getItemCatalog()){
                Object row[] = new Object[6];
                row[0] = item;
                row[1] = item.getPrice();
                row[2] = item.getDiscribe();
                row[3] = item.getQuantity();
                row[4] = seller;
                row[5] = seller.getAddress();
                
                model.addRow(row);
                itemList.add(item);
            }
        }
        
        lblmoneyleft.setText(String.valueOf( u.getEpaccount().getMoney()));
        lblorderprice.setText(String.valueOf(gettotalPrice()));
    }
    
    public void cartTable(ArrayList<BuyOrderItem> cart){
        int rowCount =tblCart.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblCart.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(BuyOrderItem item: cart){
            Object row[] = new Object[4];
            row[0] = item;
            row[1] = item.getQuantity();
            row[2] = item.getItem().getDiscribe();
            row[3] = (item.getItem().getPrice()*item.getQuantity());
            

            model.addRow(row);
        } 
    }
     
    public void searchGoodTable(ArrayList<Item> itemList){
        int rowCount = tblItem.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblItem.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Item item: itemList){
            Object row[] = new Object[6];
            row[0] = item;
            row[1] = item.getPrice();
            row[2] = item.getDiscribe();
            row[3] = item.getQuantity();
            row[4] = item.getSeller();
            row[5] = item.getSeller().getAddress();

            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        btnRequest = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        jSearch = new javax.swing.JButton();
        btnRequest1 = new javax.swing.JButton();
        btnHistoryOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSeller = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPriceLow = new javax.swing.JTextField();
        txtPriceHigh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btnDelete = new javax.swing.JButton();
        btnChangeQuantity = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        btnBack = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblmoneyleft = new javax.swing.JLabel();
        lblorderprice = new javax.swing.JLabel();
        jRoles = new javax.swing.JButton();

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ItemName", "Price", "Discribe", "quantity", "Seller", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItem);

        btnRequest.setText("Add Cart");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseLabel.setText("Welcome!");

        jSearch.setText("Search");
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        btnRequest1.setText("Place Order");
        btnRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequest1ActionPerformed(evt);
            }
        });

        btnHistoryOrder.setText("View Order History");
        btnHistoryOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryOrderActionPerformed(evt);
            }
        });

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ItemName", "Quantity", "Discribe", "Totalprice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        jLabel1.setText("quantity:");

        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });

        jLabel2.setText("Item:");

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Seller:");

        txtSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSellerActionPerformed(evt);
            }
        });

        jLabel4.setText("Address:");

        jLabel5.setText("Type:");

        txtPriceLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceLowActionPerformed(evt);
            }
        });

        jLabel6.setText("Price:");

        jLabel7.setText("to");

        btnDelete.setText("Delete item");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChangeQuantity.setText("Change Quantity");
        btnChangeQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeQuantityActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDetails.setText("More details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        jLabel8.setText("Money Left:");

        jLabel9.setText("Order total price:");

        jRoles.setText("View Rates ratio");
        jRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5))
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                .addComponent(jRoles))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(15, 15, 15)
                                                        .addComponent(jSearch))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(txtPriceLow, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPriceHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRequest))
                                    .addComponent(btnDetails))
                                .addGap(30, 30, 30)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChangeQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRequest1)
                    .addComponent(btnHistoryOrder))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmoneyleft, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblorderprice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(refreshTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRequest)
                                    .addComponent(jLabel1)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jRoles))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPriceLow, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPriceHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSearch)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addComponent(lblorderprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblmoneyleft, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequest1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnHistoryOrder)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
          int selectedRow = tblItem.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Item item = (Item)tblItem.getValueAt(selectedRow, 0);
        
//        int quantity = (Integer)jSpinner1.getValue();
        int quantity = (Integer)jSpinner1.getValue();
        System.out.println(quantity);
        if(quantity <=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than equal to 0!");
            return;
        }
        if(quantity > item.getQuantity()){
            JOptionPane.showMessageDialog(null, "Quantity cannot be more than Inventory!");
            return;
        }

        BuyOrderItem buyitem = new BuyOrderItem();
        buyitem.setItem(item);
        buyitem.setQuantity(quantity);
        for(BuyOrderItem i: cart){
            if(i.getItem().getItemName().equals(item.getItemName())&&i.getItem().getSeller().equals(item.getSeller())){
                JOptionPane.showMessageDialog(null, "You have added the good into cart!");
                return;
            }
        }
        cart.add(buyitem);
        cartTable(cart);
       populateTable();
     
//        RequestLabTestJPanel r = new RequestLabTestJPanel(userProcessContainer, system,u,wq);
//        userProcessContainer.add("RequestJPanel", r);
//
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        
        populateTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:
        
         String prudname = txtItem.getText();
         int priceLow=0;
         int priceHigh=0;
        if(txtPriceLow.getText().length()>0&&txtPriceHigh.getText().length()>0){
            try{
                
                priceHigh = Integer.parseInt(txtPriceHigh.getText());
               
                priceLow = Integer.parseInt(txtPriceLow.getText());
         
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Please input price correctly!", "Warning", JOptionPane.WARNING_MESSAGE);
//                txtPrice.setBorder(BorderFactory.createLineBorder(Color.red));
//                jLabel5.setForeground(Color.red);
                return;
            }
        }else if(txtPriceLow.getText().length()>0&&txtPriceHigh.getText().length()==0){
         try{
                
               
                priceLow = Integer.parseInt(txtPriceLow.getText());
         
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Please input price correctly!", "Warning", JOptionPane.WARNING_MESSAGE);
//                txtPrice.setBorder(BorderFactory.createLineBorder(Color.red));
//                jLabel5.setForeground(Color.red);
                return;
            }
        
        }else if(txtPriceLow.getText().length()==00&&txtPriceHigh.getText().length()>0){
         try{
                
               
                priceHigh = Integer.parseInt(txtPriceHigh.getText());
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Please input price correctly!", "Warning", JOptionPane.WARNING_MESSAGE);
//                txtPrice.setBorder(BorderFactory.createLineBorder(Color.red));
//                jLabel5.setForeground(Color.red);
                return;
            }
        
        }
       
       
        String sellername = txtSeller.getText();
        String Address = txtAddress.getText();
        String Type=txtType.getText();
        //star to filter no-empty requirement
        ArrayList<Item> itemList1 = new ArrayList<Item>();
        if(prudname.length()>0){
            for(Item p: itemList){
                if(p.getItemName().equals(prudname)){
                    itemList1.add(p);
                }
            }
        }
        else{
            itemList1 = itemList;
        }
        ArrayList<Item> itemList2 = new ArrayList<Item>();
        if(priceLow!=0&&priceHigh==0){
            for(Item p: itemList1){
                if(p.getPrice()>priceLow){
                    itemList2.add(p);
                }
            }
        }else if(priceLow==0&&priceHigh!=0){
            for(Item p: itemList1){
                if(p.getPrice()<priceHigh){
                    itemList2.add(p);
                }
            }
        }else if(priceLow!=0&&priceHigh!=0){
             for(Item p: itemList1){
                if(priceLow<p.getPrice()&&p.getPrice()<priceHigh){
                    itemList2.add(p);
                }
            }
        }
        else{
            itemList2 = itemList1;
        }
        ArrayList<Item> itemList3 = new ArrayList<Item>();
        if(sellername.length()>0){
            for(Item p: itemList2){
                if(p.getSeller().getName().equals(sellername)){
                    itemList3.add(p);
                }
            }
        }
        else{
            itemList3 = itemList2;
        }
        ArrayList<Item> itemList4 = new ArrayList<Item>();
        if(Address.length()>0){
            for(Item p: itemList3){
                if(p.getSeller().getAddress().equals(Address)){
                    itemList4.add(p);
                }
            }
        }
        else{
            itemList4 = itemList3;
        }
        ArrayList<Item> itemList5 = new ArrayList<Item>();
        if(Type.length()>0){
            for(Item p: itemList4){
                if(p.getSeller().getType().equals(Type)){
                    itemList5.add(p);
                }
            }
        }
        else{
            itemList5 = itemList4;
        }
        searchGoodTable(itemList4);
//        txtPrice.setBorder(BorderFactory.createLineBorder(Color.gray));
//        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jSearchActionPerformed

    private void btnRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequest1ActionPerformed
        // TODO add your handling code here:
          Date date = new Date();
          int totalprice =0;
        
        for(Customer customer: net.getCustomerDirectory().getCustomersList()){
            if(customer.getUserAccount().equals(u)){
                customer1 = customer;
                for(BuyOrderItem buyitem: cart){
                    totalprice+= (buyitem.getItem().getPrice()*buyitem.getQuantity());
                }
            }
        }
        if(u.getEpaccount().getMoney()<totalprice){
          JOptionPane.showMessageDialog(null, "You are out of money!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }else{
        for(Customer customer: net.getCustomerDirectory().getCustomersList()){
            if(customer.getUserAccount().equals(u)){
                System.out.println(customer);
               
                for(BuyOrderItem buyitem: cart){
                    buyitem.setCreateTime(date);
                    buyitem.setStatus("Customer submitted the order");
                    buyitem.setCustomer(customer);
                    buyitem.setOrderPosition(buyitem.getItem().getSeller().getAddress());
                    customer.getBuyOrder().getOrderItemList().add(buyitem);
                    int newInventory = buyitem.getItem().getQuantity() - buyitem.getQuantity();
                    buyitem.getItem().setQuantity(newInventory);
                    
                }
            }
        }
        u.getEpaccount().setMoney(u.getEpaccount().getMoney()-totalprice);
        JOptionPane.showMessageDialog(null, "Place Order Successfully!", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        cart.clear();
        cartTable(cart);
        try {
                 Email.send_email("Shopping notice","Your goods are on the way! \n Plz check our app for further information ",customer1.getEmail());
             } catch (Exception ex) {
              
                  java.util.logging.Logger.getLogger(CustomerAreaJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
              }
             
         populateTable();
    }//GEN-LAST:event_btnRequest1ActionPerformed

    private void btnHistoryOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryOrderActionPerformed
       CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new HistoryOrderJPanel(userProcessContainer,system,u,net));
        layout.next(userProcessContainer);   
    }//GEN-LAST:event_btnHistoryOrderActionPerformed

    private void txtPriceLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceLowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceLowActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
               int selectedRow = tblCart.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem item = (BuyOrderItem)tblCart.getValueAt(selectedRow, 0);
        cart.remove(item);
        cartTable(cart);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChangeQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        BuyOrderItem buyitem = (BuyOrderItem)tblCart.getValueAt(selectedRow, 0);

        int quantity = (Integer)jSpinner2.getValue();
        if(quantity <=0){
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than equal to 0!");
            return;
        }
        if(quantity > buyitem.getItem().getQuantity()){
            JOptionPane.showMessageDialog(null, "Quantity cannot be more than Storage!");
            return;
        }
        buyitem.setQuantity(quantity);
        cartTable(cart);
    }//GEN-LAST:event_btnChangeQuantityActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblItem.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Item item = (Item)tblItem.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new DetailsJPanel(userProcessContainer,item));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void txtSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSellerActionPerformed

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemActionPerformed

    private void jRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRolesActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblItem.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Item item = (Item)tblItem.getValueAt(selectedRow, 0);
           PieChart demo = new PieChart( "Item Rates Ratio",item );  
      demo.setSize( 700,700);    
      RefineryUtilities.centerFrameOnScreen( demo );   
      demo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      demo.setVisible( true ); 
    }//GEN-LAST:event_jRolesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangeQuantity;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnHistoryOrder;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnRequest1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jRoles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSearch;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblmoneyleft;
    private javax.swing.JLabel lblorderprice;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPriceHigh;
    private javax.swing.JTextField txtPriceLow;
    private javax.swing.JTextField txtSeller;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
public int gettotalPrice(){
    int totalprice=0;
 for(Customer customer: net.getCustomerDirectory().getCustomersList()){
            if(customer.getUserAccount().equals(u)){
                for(BuyOrderItem buyitem: cart){
                    totalprice+= (buyitem.getItem().getPrice()*buyitem.getQuantity());
                }
            }
        }

return totalprice;
}
}
