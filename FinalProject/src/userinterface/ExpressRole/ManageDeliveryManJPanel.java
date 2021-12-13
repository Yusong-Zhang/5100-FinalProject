package userinterface.ExpressRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Express.DeliveryMan;
import Business.Express.ExpressManager;
import Business.Network.Network;
import Business.Role.DeliveryManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SellerRole.*;


public class ManageDeliveryManJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Network net;
    EcoSystem system;
    UserAccount useraccount;
    ExpressManager expressmanager;
    
   

    ManageDeliveryManJPanel(JPanel userProcessContainer, Network net, EcoSystem system, UserAccount useraccount, ExpressManager expressmanager) {
          initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.system = system;
        this.net = net;
        this.expressmanager = expressmanager;
        populateTable();
    }

public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel)tblDeliveryMan.getModel();
        
        model.setRowCount(0);
        for(DeliveryMan dm : expressmanager.getDeliverymanDir().getDeliverymanList()){
            
                Object row[] = new Object[5];
                row[0] = dm;
                row[1] = dm.getUserAccount().getUsername();
                row[2] = dm.getUserAccount().getPassword();
                row[3] = dm.getAddress();
                row[4] = dm.getTelephone();
                model.addRow(row);
                }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        lblManageProductManager = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtDeliveryManName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryMan = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("User Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        lblManageProductManager.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblManageProductManager.setText("Manage Delivery Man");
        add(lblManageProductManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 184, -1));

        jLabel8.setText("Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, 20));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel9.setText("Phone");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, -1, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 184, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 184, -1));

        jLabel4.setText("Delivery Man Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtDeliveryManName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryManNameActionPerformed(evt);
            }
        });
        add(txtDeliveryManName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 184, -1));

        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 184, -1));

        tblDeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Password", "Address", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveryMan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 458, 148));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        int selectedRow = tblDeliveryMan.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DeliveryMan dm = (DeliveryMan)tblDeliveryMan.getValueAt(selectedRow, 0);
        expressmanager.getDeliverymanDir().getDeliverymanList().remove(dm);
        UserAccount ua = new UserAccount();
        ua = dm.getUserAccount();
        system.getUserAccountDirectory().getUserAccountList().remove(ua);
        JOptionPane.showMessageDialog(null, "Delete the delivery man successfully!");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String name = txtDeliveryManName.getText();
        String username = txtUserName.getText();
        String password = txtPassword.getText();
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
        }else if(txtDeliveryManName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Delivery Man Name!");
        }else if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Delivery Man Name!");
        }else if(txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Phone Number!");
        }else{
            DeliveryMan dm = new DeliveryMan();
            UserAccount useraccount3 = new UserAccount();
            Employee e1 = system.getEmployeeDirectory().createEmployee(name);
            useraccount3 = system.getUserAccountDirectory().createUserAccount(name, password, e1, new DeliveryManRole());

            dm.setName(name);
            dm.setTelephone(telePhone);
            dm.setUserAccount(useraccount3);
            dm.setAddress(address);
            expressmanager.getDeliverymanDir().getDeliverymanList().add(dm);
            net.getUserAccountDirectory().getUserAccountList().add(useraccount3);

            txtUserName.setText("");
            txtPassword.setText("");
            txtPhone.setText("");
            txtDeliveryManName.setText("");
            txtAddress.setText("");
            populateTable();

            JOptionPane.showMessageDialog(null, "Create new delivery man successfully!");        
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDeliveryManNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryManNameActionPerformed
       
    }//GEN-LAST:event_txtDeliveryManNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        
    }//GEN-LAST:event_txtPhoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageProductManager;
    private javax.swing.JTable tblDeliveryMan;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDeliveryManName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
