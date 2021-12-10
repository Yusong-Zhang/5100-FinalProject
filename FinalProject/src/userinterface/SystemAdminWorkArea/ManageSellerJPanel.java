/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Seller.Seller;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Role.CustomerRole;
import Business.Role.SellerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 30481
 */
public class ManageSellerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    private JPanel container;
    private EcoSystem system;
    private WorkQueue wq;
    private Network network;
    private UserAccount useraccount;
    public ManageSellerJPanel(JPanel userProcessContainer, EcoSystem ecosystem,WorkQueue wq,Network network, UserAccount useraccount) {
        initComponents();
        this.container = userProcessContainer;
        this.system = ecosystem;
        this.wq = wq;
        this.network=network;
        this.useraccount = useraccount;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeller = new javax.swing.JTable();
        btnCreateRestaurantsManager = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSellerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbllocation = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblSeller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "AccountName", "SellerName", "Address", "Phone", "SellingType"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSeller);

        btnCreateRestaurantsManager.setText("Create");
        btnCreateRestaurantsManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRestaurantsManagerActionPerformed(evt);
            }
        });

        jLabel1.setText("Seller List:");

        jLabel2.setText("New Seller");

        jLabel4.setText("Seller Name");

        txtSellerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSellerNameActionPerformed(evt);
            }
        });

        jLabel5.setText("User Name");

        jLabel6.setText("Password");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel7.setText("Location");

        jLabel8.setText("Address");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel9.setText("Phone");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        jLabel10.setText("Type");

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setText("Choose a row then press Modify so that you can change the profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnBack)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(btnModify)
                                .addGap(62, 62, 62)
                                .addComponent(btnSave)))
                        .addGap(157, 157, 157)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(lbllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSellerName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateRestaurantsManager)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbllocation, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSellerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(26, 26, 26)
                                .addComponent(btnCreateRestaurantsManager))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnModify)
                                    .addComponent(btnSave))))
                        .addContainerGap(75, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSellerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSellerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSellerNameActionPerformed

    private void btnCreateRestaurantsManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRestaurantsManagerActionPerformed
        // TODO add your handling code here:
          if(txtSellerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Name!");
        }else if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid UserName!");
        }else if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Password!");
        }else{
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String sellerName = txtSellerName.getText();
        String address=txtAddress.getText();
        String phone=txtPhone.getText();
        String type=txtType.getText();
        
        Seller seller = new Seller();
        UserAccount useraccount=new UserAccount();
        Employee e1 = system.getEmployeeDirectory().createEmployee(sellerName);
        useraccount=system.getUserAccountDirectory().createUserAccount(userName, password, e1, new SellerRole());
        seller.setName(sellerName);
        seller.setTelephone(phone);
        seller.setAddress(address);
        seller.setUserAccount(useraccount);
        seller.setType(type);
        network.getSellerDirectory().getSellerList().add(seller);
         network.getUserAccountDirectory().getUserAccountList().add(useraccount);
        
        JOptionPane.showMessageDialog(null, "User Account created successfully.");
       
        
        txtSellerName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtType.setText("");
        txtPhone.setText("");
        refreshTable();
    }//GEN-LAST:event_btnCreateRestaurantsManagerActionPerformed
 }
    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblSeller.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
      Seller seller = (Seller)tblSeller.getValueAt(selectedRow, 0);
      network.getSellerDirectory().getSellerList().remove(seller);
      UserAccount ua=new UserAccount();
      ua=seller.getUserAccount();
      system.getUserAccountDirectory().getUserAccountList().remove(ua);
       
          refreshTable();
         JOptionPane.showMessageDialog(null, "Delete the supplier successfully!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblSeller.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      Seller seller = ( Seller)tblSeller.getValueAt(selectedRow, 0);
      txtSellerName.setText(seller.getName());
      txtUserName.setText(seller.getUserAccount().getUsername());
      txtPassword.setText(seller.getUserAccount().getPassword());
      txtPhone.setText(seller.getTelephone());
      txtAddress.setText(seller.getAddress());
      txtType.setText(seller.getType());
      
      
       btnSave.setEnabled(true);
       btnModify.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblSeller.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
      Seller seller = ( Seller)tblSeller.getValueAt(selectedRow, 0);
      
     
      
       if(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){}
            else{
                JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
        
        
        
        //check format of username and password
        
      
      seller.setName( txtSellerName.getText());
      seller.setTelephone(txtPhone.getText());
      seller.getUserAccount().setPassword(txtPassword.getText());
      seller.getUserAccount().setUsername(txtUserName.getText());
      seller.setType(txtType.getText());
      seller.setAddress(txtAddress.getText());
       
      
        txtSellerName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtType.setText("");
        txtPhone.setText("");
        
        btnSave.setEnabled(false);
        btnModify.setEnabled(true);
        
        refreshTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateRestaurantsManager;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbllocation;
    private javax.swing.JTable tblSeller;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSellerName;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
      DefaultTableModel model = (DefaultTableModel) tblSeller.getModel();
        model.setRowCount(0);
     
       for(Seller s: network.getSellerDirectory().getSellerList()){
            Object row[] = new Object[5];
           row[0] = s;
           row[1] = s.getUserAccount().getUsername();
           row[2] = s.getAddress();
           row[3] = s.getTelephone();
           row[4] = s.getType();
           
            model.addRow(row);       
    }
       lbllocation.setText( network.getName());
    }
}
