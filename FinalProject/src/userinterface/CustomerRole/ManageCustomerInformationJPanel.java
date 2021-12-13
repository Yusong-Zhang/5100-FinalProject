/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;


import Business.Customer.Customer;
import Business.Network.Network;
import Business.Seller.Seller;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author TT1
 */
public class ManageCustomerInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBuyerInformationJPanel
     */
    JPanel userProcessContainer;
    Network network;
    Customer customer;
        
    public  ManageCustomerInformationJPanel(JPanel userProcessContainer, Customer customer, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.customer=customer;
        this.network=network;
        
        txtCustomer.setText(customer.toString());
        txtEmail.setText(customer.getAddress());
        txtTelephone.setText(customer.getPhone());
        txtCustomer.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelephone.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtCustomer = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 184, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("Manage Information Screen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        add(txtCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 184, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 96, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 96, -1));

        jLabel6.setText("username:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel9.setText("Telephone:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));
        add(txtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 184, -1));

        jLabel8.setText("Email:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 20));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel10.setText("Address:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 20));
        add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 184, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/B.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
      
        customer.setAddress(txtEmail.getText());
        customer.setPhone(txtTelephone.getText());
        customer.setEmail(txtEmail.getText());
        txtCustomer.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelephone.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        txtEmail.setEnabled(true);
        txtTelephone.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
