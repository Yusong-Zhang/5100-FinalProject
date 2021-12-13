
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Item.Item;
import Business.Item.Items;
import Business.Network.Network;
import Business.ProductManager.ProductManager;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ProductManagerJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem system;
    Network network;
    Seller seller;
    
  
    public ProductManagerJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
     
        this.system = system;
    
        this.network = network;
        this.ua = useraccount;
        
         for(Seller sel: network.getSellerDirectory().getSellerList()){
            for(ProductManager productManager: sel.getProductManagerDir().getProductManagerList()){
                if(productManager.getUserAccount().getUsername().equals(useraccount.getUsername())){
                    seller = sel;
                }
            }
        }
         
        refreshtable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setText("Set Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 73, 30));

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setText("Set Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, 30));

        jLabel3.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel3.setText("Description:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, 30));

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "quantity", "Type", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItem);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 458, 160));

        jLabel5.setFont(new java.awt.Font("宋体", 3, 36)); // NOI18N
        jLabel5.setText("Manage Selling Product");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 40));

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });
        add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 184, 30));

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 184, 30));

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 184, 30));

        jButton1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, 40));

        jButton2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 40));

        jLabel4.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel4.setText("Type:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, 30));

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 184, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name =txtItemName.getText();
        String quantity= txtQuantity.getText();
        String description=txtDescription.getText();
        String type = txtType.getText();
        
         if(txtItemName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please set correct Product name");
        }else if(txtQuantity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please set correct quantity");
        }else{
            Item item = new Item();
            item.setItemName(name);
            item.setQuantity(Integer.parseInt(quantity));
            item.setDiscribe(description);
            item.setType(type);
            item.setSeller(seller);
            seller.getItems().addItem(item);
            refreshtable();
            
            txtItemName.setText("");
            txtQuantity.setText("");
            txtDescription.setText("");
            txtType.setText("");
            JOptionPane.showMessageDialog(null, "Add item  successfully");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tblItem.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
      Item pm = (Item)tblItem.getValueAt(selectedRow, 0);
      seller.getItems().removeItem(pm);
      
       
         
         JOptionPane.showMessageDialog(null, "Delete the Product successfully!");
         refreshtable();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtType;
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
            row[3] =item.getDiscribe();
            row[2] = item.getType();
                
                model.addRow(row);
            }
    }
}
