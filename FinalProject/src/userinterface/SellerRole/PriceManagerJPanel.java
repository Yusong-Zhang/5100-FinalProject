
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Item.Item;
import Business.Network.Network;
import Business.PriceManager.PriceManager;
import Business.ProductManager.ProductManager;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class PriceManagerJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;

    EcoSystem system;
    Seller seller;
    Network network;
    UserAccount useraccount;
    Item item;
    
    public PriceManagerJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
     
        this.system = system;
     
        this.network = network;
        this.useraccount = useraccount;
        
           for(Seller sel: network.getSellerDirectory().getSellerList()){
            for(PriceManager priceManager: sel.getPriceManagerDir().getPriceManageList()){
                if(priceManager.getUserAccount().getUsername().equals(useraccount.getUsername())){
                    seller = sel;
                }
            }
        }
         
        refreshtable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 69, -1));

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "quantity", "Price", "Desciption"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItem);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 458, 148));

        jLabel5.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel5.setText("Sales price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 184, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 3, 36)); // NOI18N
        jLabel1.setText("Manage Goods Price Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 490, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tblItem.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }else{
        
         int price = 0;
        
         price = Integer.parseInt(txtPrice.getText());
        

        if(price > 0){
           
        
        item = (Item)tblItem.getValueAt(selectedRow, 0);
        
        String Price = txtPrice.getText();
        item.setPrice(Integer.parseInt(Price));
        refreshtable();
        JOptionPane.showMessageDialog(null, "set Price successfully");
        }else{
            JOptionPane.showMessageDialog(null, "Please set Price correctly");
        }
        }     
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void refreshtable() {
         int rowCount = tblItem.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblItem.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Item item: seller.getItems().getItemCatalog()){
            Object row[] = new Object[4];
            row[0] =item;
            row[1] =item.getQuantity();
            row[2] =item.getPrice();
            row[3] = item.getDiscribe();
                
                model.addRow(row);
            }
    }
}
