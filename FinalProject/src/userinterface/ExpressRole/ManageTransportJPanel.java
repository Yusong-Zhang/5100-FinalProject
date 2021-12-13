package userinterface.ExpressRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Express.ExpressManager;
import Business.Express.Transport;
import Business.Network.Network;
import Business.Role.TransportRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageTransportJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Network net;
    EcoSystem system;
    UserAccount useraccount;
    ExpressManager expressmanager;
    
  
    ManageTransportJPanel(JPanel userProcessContainer, Network net, EcoSystem system, UserAccount useraccount,ExpressManager expressmanager) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.system = system;
        this.net = net; 
        this.expressmanager = expressmanager;
        populateTable();

    }
    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel)tblTransport.getModel();
        
        model.setRowCount(0);
        for(Transport tr : expressmanager.getTransportDir().getDriverList()){
            
                Object row[] = new Object[5];
                row[0] = tr;
                row[1] = tr.getUserAccount().getUsername();
                row[2] = tr.getUserAccount().getPassword();
                row[3] = tr.getAddress();
                row[4] = tr.getTelephone();
                model.addRow(row);
                }
            }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtDriverName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransport = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblManageTransport = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setText("Phone");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, -1));

        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 184, -1));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 184, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Driver Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setText("Back<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        txtDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDriverNameActionPerformed(evt);
            }
        });
        add(txtDriverName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 184, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 184, -1));

        tblTransport.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTransport);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 458, 148));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("User Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        lblManageTransport.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        lblManageTransport.setText("Manage Transport");
        add(lblManageTransport, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 184, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int selectedRow = tblTransport.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Transport tr = (Transport)tblTransport.getValueAt(selectedRow, 0);
        expressmanager.getTransportDir().getDriverList().remove(tr);
        UserAccount ua = new UserAccount();
        ua = tr.getUserAccount();
        system.getUserAccountDirectory().getUserAccountList().remove(ua);
        JOptionPane.showMessageDialog(null, "Delete the driver successfully!");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String name = txtDriverName.getText();
        String username= txtUserName.getText();
        String password= txtPassword.getText();
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
        }else if(txtDriverName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Driver Name!");
        }else if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Address!");
        }else if(txtPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Phone Number!");
        }else{
            
            Transport tr = new Transport();
            UserAccount useraccount2 = new UserAccount();
            Employee e1 = system.getEmployeeDirectory().createEmployee(username);
            useraccount2 = system.getUserAccountDirectory().createUserAccount(username, password, e1, new TransportRole());

            tr.setName(name);
            tr.setTelephone(telePhone);
            tr.setUserAccount(useraccount2);
            tr.setAddress(address);
            expressmanager.getTransportDir().getDriverList().add(tr);
            net.getUserAccountDirectory().getUserAccountList().add(useraccount2);

            txtUserName.setText("");
            txtPassword.setText("");
            txtPhone.setText("");
            txtDriverName.setText("");
            txtAddress.setText("");
            populateTable();

            JOptionPane.showMessageDialog(null, "Create new driver successfully!"); 
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDriverNameActionPerformed
        
    }//GEN-LAST:event_txtDriverNameActionPerformed

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
    private javax.swing.JLabel lblManageTransport;
    private javax.swing.JTable tblTransport;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDriverName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
