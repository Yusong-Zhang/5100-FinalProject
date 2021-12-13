
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.PriceManager.PriceManager;
import Business.ProductManager.ProductManager;
import Business.Role.PriceManagerRole;
import Business.Role.ProductManagerRole;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManagerPriceManagerJPanel extends javax.swing.JPanel {

    
    JPanel userProcessContainer;
    Network network;
    EcoSystem system;
    UserAccount useraccount;
    Seller seller;
    
    public ManagerPriceManagerJPanel(JPanel userProcessContainer, Network network, EcoSystem system, UserAccount useraccount) {
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.system = system;
        this.useraccount = useraccount;
        initComponents();
       
        
         for(Seller s: network.getSellerDirectory().getSellerList()){
            if(s.getUserAccount().getUsername().equals(useraccount.getUsername())){
                seller = s;
            }
        }
        
        refreshTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPriceManagerName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblManageProductManager = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPriceManager = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Address:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 232, -1, -1));

        jLabel9.setText("Phone:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, 20));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 235, 184, -1));

        jLabel4.setText("Price Manager Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 123, -1, -1));

        txtPriceManagerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceManagerNameActionPerformed(evt);
            }
        });
        add(txtPriceManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 120, 184, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 264, 184, -1));

        jLabel5.setText("User Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 158, -1, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 159, 184, -1));

        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 200, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 197, 184, -1));

        lblManageProductManager.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblManageProductManager.setText("Manage Price Manager");
        add(lblManageProductManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        btnBack.setFont(new java.awt.Font("黑体", 1, 11)); // NOI18N
        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 41, -1, -1));

        tblPriceManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Password", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPriceManager);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 107, 458, 148));

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 286, -1, -1));

        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 286, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 286, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceManagerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceManagerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceManagerNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tblPriceManager.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
      PriceManager pm = (PriceManager)tblPriceManager.getValueAt(selectedRow, 0);
      seller.getPriceManagerDir().getPriceManageList().remove(pm);
      UserAccount ua=new UserAccount();
      ua=pm.getUserAccount();
      system.getUserAccountDirectory().getUserAccountList().remove(ua);
       
         
      JOptionPane.showMessageDialog(null, "Delete the ProductManager successfully!");
      refreshTable();   // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name = txtPriceManagerName.getText();
        String username= txtUserName.getText();
        String password=txtPassword.getText();
        String address = txtAddress.getText();
        String telePhone= txtPhone.getText();
        //check If Username Is Unique
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){}
        else{
            JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
         if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid UserName!");
        }else if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Password!");
        }else if(txtPriceManagerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Name!");}
        else if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Address!");}
        else if(txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Phone!");}
        
        else{
        

        PriceManager pm = new PriceManager();
        UserAccount useraccount1=new UserAccount();
        Employee e1 = system.getEmployeeDirectory().createEmployee(name);
        useraccount1=system.getUserAccountDirectory().createUserAccount(name, password, e1, new PriceManagerRole());
        
        pm.setName(name);
        pm.setTelephone(telePhone);
        pm.setUserAccount(useraccount1);
        pm.setAddress(address);
        seller.getPriceManagerDir().getPriceManageList().add(pm);
        network.getUserAccountDirectory().getUserAccountList().add(useraccount1);
         

        txtUserName.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        txtPriceManagerName.setText("");
        txtAddress.setText("");
        refreshTable();
       
       

        JOptionPane.showMessageDialog(null, "Create new price manager successfully!");       
     }          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
   
        int selectedRow = tblPriceManager.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        PriceManager pricemanager = ( PriceManager)tblPriceManager.getValueAt(selectedRow, 0);
         if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid UserName!");
        }else if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Password!");
        }else if(txtPriceManagerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Name!");}
        else if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Address!");}
        else if(txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Phone!");}
        
        else{
                if(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){}
                else{
                        JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
                        return;
                    }

       

        pricemanager.setName( txtPriceManagerName.getText());
        pricemanager.setTelephone(txtPhone.getText());
        pricemanager.getUserAccount().setPassword(txtPassword.getText());
        pricemanager.getUserAccount().setUsername(txtUserName.getText());
        pricemanager.setAddress(txtAddress.getText());

        txtPriceManagerName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtPhone.setText("");

        btnSave.setEnabled(false);
        btnModify.setEnabled(true);

        refreshTable();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
         int selectedRow = tblPriceManager.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        PriceManager pricemanager = ( PriceManager)tblPriceManager.getValueAt(selectedRow, 0);
        txtPriceManagerName.setText(pricemanager.getName());
        txtUserName.setText(pricemanager.getUserAccount().getUsername());
        txtPassword.setText(pricemanager.getUserAccount().getPassword());
        txtPhone.setText(pricemanager.getTelephone());
        txtAddress.setText(pricemanager.getAddress());
        

        btnSave.setEnabled(true);
        btnModify.setEnabled(false);        
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageProductManager;
    private javax.swing.JTable tblPriceManager;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPriceManagerName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) tblPriceManager.getModel();
        model.setRowCount(0);
        
        
         for(PriceManager pc: seller.getPriceManagerDir().getPriceManageList()){
            
                Object row[] = new Object[5];
                row[0] = pc;
                row[1] =pc.getUserAccount().getUsername();
                row[2] =pc.getUserAccount().getPassword();
                row[3] =pc.getTelephone();
                row[4] = pc.getAddress();
                
                model.addRow(row);
        }
    }
}
