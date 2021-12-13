
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.ProductManager.ProductManager;
import Business.Role.ProductManagerRole;
import Business.Role.SellerRole;
import Business.Seller.Seller;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageProductManagerJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    
    Network network;
    Seller seller;
    
    EcoSystem system;
    UserAccount useraccount;
    
    public ManageProductManagerJPanel(JPanel userProcessContainer, Network net, EcoSystem system, UserAccount useraccount) {
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

        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProductManagerName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblManageProductManager = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductManager = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnCreateRestaurantsManager = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 184, -1));

        jLabel6.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 184, -1));

        jLabel8.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel8.setText("Address:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel9.setText("Phone:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 184, -1));

        jLabel4.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel4.setText("Product Manager Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        txtProductManagerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductManagerNameActionPerformed(evt);
            }
        });
        add(txtProductManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 184, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 184, -1));

        jLabel5.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel5.setText("User Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        lblManageProductManager.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblManageProductManager.setText("Manage Product Manager");
        add(lblManageProductManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        btnBack.setFont(new java.awt.Font("黑体", 1, 14)); // NOI18N
        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        tblProductManager.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductManager);
        if (tblProductManager.getColumnModel().getColumnCount() > 0) {
            tblProductManager.getColumnModel().getColumn(0).setResizable(false);
            tblProductManager.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 458, 148));

        jButton1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        btnCreateRestaurantsManager.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnCreateRestaurantsManager.setText("Create");
        btnCreateRestaurantsManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRestaurantsManagerActionPerformed(evt);
            }
        });
        add(btnCreateRestaurantsManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, -1));

        btnModify.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        btnSave.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 80, -1));

        jLabel17.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductManagerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductManagerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductManagerNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int selectedRow = tblProductManager.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
      ProductManager pm = (ProductManager)tblProductManager.getValueAt(selectedRow, 0);
      seller.getProductManagerDir().getProductManagerList().remove(pm);
      
      system.getUserAccountDirectory().getUserAccountList().remove(pm.getUserAccount());
       
         
         JOptionPane.showMessageDialog(null, "Delete the ProductManager successfully!");
         refreshTable();      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCreateRestaurantsManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRestaurantsManagerActionPerformed
        String name = txtProductManagerName.getText();
        String username= txtUserName.getText();
        String password=txtPassword.getText();
        String address = txtAddress.getText();
        String telePhone= txtPhone.getText();
        
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){}
        else{
            JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid UserName!");
        }else if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Password!");
        }else if(txtProductManagerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Name!");}
        else if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Address!");}
        else if(txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Phone!");}
        
        else{
        

        ProductManager pm = new ProductManager();
        UserAccount useraccount1=new UserAccount();
        Employee e1 = system.getEmployeeDirectory().createEmployee(name);
        useraccount1=system.getUserAccountDirectory().createUserAccount(username, password, e1, new ProductManagerRole());
        
        pm.setName(name);
        pm.setTelephone(telePhone);
        pm.setUserAccount(useraccount1);
        pm.setAddress(address);
        seller.getProductManagerDir().getProductManagerList().add(pm);
        network.getUserAccountDirectory().getUserAccountList().add(useraccount1);
         

        txtUserName.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        txtProductManagerName.setText("");
         txtAddress.setText("");
        refreshTable();
       
       

        JOptionPane.showMessageDialog(null, "Create new price manager successfully!");        
     }  
    }//GEN-LAST:event_btnCreateRestaurantsManagerActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        int selectedRow = tblProductManager.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        ProductManager productmanager = ( ProductManager)tblProductManager.getValueAt(selectedRow, 0);
        txtProductManagerName.setText(productmanager.getName());
        txtUserName.setText(productmanager.getUserAccount().getUsername());
        txtPassword.setText(productmanager.getUserAccount().getPassword());
        txtPhone.setText(productmanager.getTelephone());
        txtAddress.setText(productmanager.getAddress());
        

        btnSave.setEnabled(true);
        btnModify.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductManager.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
       ProductManager productmanager = ( ProductManager)tblProductManager.getValueAt(selectedRow, 0);
        if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid UserName!");
        }else if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Password!");
        }else if(txtProductManagerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Name!");}
        else if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Address!");}
        else if(txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Phone!");}
        
        else{
        if(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){
             productmanager.setName( txtProductManagerName.getText());
        
        productmanager.setTelephone(txtPhone.getText());
        productmanager.getUserAccount().setPassword(txtPassword.getText());
        productmanager.getUserAccount().setUsername(txtUserName.getText());
        productmanager.setAddress(txtAddress.getText());

        txtProductManagerName.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtPhone.setText("");

        btnSave.setEnabled(false);
        btnModify.setEnabled(true);
        
        refreshTable();
        JOptionPane.showMessageDialog(null, "Modify Information successfully!");
        }
        else{JOptionPane.showMessageDialog(null, "This username has existed!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;}
            
        

       
        }      
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateRestaurantsManager;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageProductManager;
    private javax.swing.JTable tblProductManager;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtProductManagerName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
          DefaultTableModel model = (DefaultTableModel) tblProductManager.getModel();
        model.setRowCount(0);
        
        
         for(ProductManager pm: seller.getProductManagerDir().getProductManagerList()){
            
                Object row[] = new Object[5];
                row[0] = pm;
                row[1] =pm.getUserAccount().getUsername();
                row[2] =pm.getUserAccount().getPassword();
                row[3] =pm.getTelephone();
                row[4] = pm.getAddress();
                
                model.addRow(row);
        }
        
     
       
    }
    
}
