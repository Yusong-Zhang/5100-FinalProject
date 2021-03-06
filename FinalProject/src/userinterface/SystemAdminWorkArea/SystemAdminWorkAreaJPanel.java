/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;

import Business.Organization;
import Business.Tools.HistChart;
import Business.Tools.HistChart1;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount useraccount;
    WorkQueue wq;
    Network net;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem,Network net, UserAccount useraccount) {
        initComponents();
//         lblAdminName.setText(((ua.getEmployee() != null) ? ua.getEmployee().getName() : ua.getUsername()) + "!");
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.useraccount = useraccount;
        this.wq = wq;
        this.net=net;
       populateTable();
    }
     public void populateTable(){
        int rowCount = tblNetwork.getRowCount();
        DefaultTableModel model = (DefaultTableModel)tblNetwork.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Network network:ecosystem.getNetworkList()){
            
                Object row[] = new Object[1];
                row[0] = network;
                
                
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

        jLabel1 = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JButton();
        btnEpayManager = new javax.swing.JButton();
        btnExpressManager = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        btnCustomer1 = new javax.swing.JButton();
        txtNetwork = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSeller = new javax.swing.JButton();
        btnFeedbacker = new javax.swing.JButton();
        jSelling = new javax.swing.JButton();
        jRoles = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        add(lblAdminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 127, 13));

        btnCustomer.setText("Manage Customers");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 278, -1));

        btnEpayManager.setText("Manage E-Pay Manager");
        btnEpayManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEpayManagerActionPerformed(evt);
            }
        });
        add(btnEpayManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 278, -1));

        btnExpressManager.setText("Manage Express Manager");
        btnExpressManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpressManagerActionPerformed(evt);
            }
        });
        add(btnExpressManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 278, -1));

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNetwork);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 199));

        btnCustomer1.setText("----^");
        btnCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomer1ActionPerformed(evt);
            }
        });
        add(btnCustomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 96, -1));

        txtNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetworkActionPerformed(evt);
            }
        });
        add(txtNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 194, -1));

        jLabel2.setText("Create New Network HERE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        btnSeller.setText("Manage Seller");
        btnSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellerActionPerformed(evt);
            }
        });
        add(btnSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 278, -1));

        btnFeedbacker.setText("Manage Feedbacker");
        btnFeedbacker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackerActionPerformed(evt);
            }
        });
        add(btnFeedbacker, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 281, -1));

        jSelling.setText("View National Selling Number");
        jSelling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSellingActionPerformed(evt);
            }
        });
        add(jSelling, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jRoles.setText("View National Roles");
        jRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRolesActionPerformed(evt);
            }
        });
        add(jRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void btnExpressManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpressManagerActionPerformed
        int selectedRow = tblNetwork.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network network = (Network)tblNetwork.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
               userProcessContainer.add(new ManageExpressJPanel(userProcessContainer,ecosystem,network, useraccount));
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnExpressManagerActionPerformed

    private void btnEpayManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEpayManagerActionPerformed
      int selectedRow = tblNetwork.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network network = (Network)tblNetwork.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
               userProcessContainer.add(new ManageEpayJPanel(userProcessContainer,ecosystem,network, useraccount));
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEpayManagerActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
//        ManageCustomerJPanel mc = new ManageCustomerJPanel(userProcessContainer, ecosystem);
//        userProcessContainer.add("ManageUserAccountJPanel", mc);
//
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        int selectedRow = tblNetwork.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network network = (Network)tblNetwork.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
               userProcessContainer.add(new ManageCustomerJPanel(userProcessContainer,ecosystem,network, useraccount));
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomer1ActionPerformed
        // TODO add your handling code here:
        if(txtNetwork.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "You need to input a new Country", "Warning",JOptionPane.WARNING_MESSAGE);
        }else{
        ecosystem.createAndAddNetwork(txtNetwork.getText());
         populateTable();
        }
    }//GEN-LAST:event_btnCustomer1ActionPerformed

    private void txtNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetworkActionPerformed

    private void btnSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNetwork.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network network = (Network)tblNetwork.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
               userProcessContainer.add(new ManageSellerJPanel(userProcessContainer,ecosystem,wq,network, useraccount));
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSellerActionPerformed

    private void btnFeedbackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNetwork.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network network = (Network)tblNetwork.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
               userProcessContainer.add(new ManageFeedbackJPanel(userProcessContainer,ecosystem,network, useraccount));
                layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFeedbackerActionPerformed

    private void jSellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSellingActionPerformed
        HistChart demo = new HistChart( "Country's selling quantity",ecosystem );  
      demo.setSize( 700,700);    
      RefineryUtilities.centerFrameOnScreen( demo );   
      demo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      demo.setVisible( true );         // TODO add your handling code here:
    }//GEN-LAST:event_jSellingActionPerformed

    private void jRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRolesActionPerformed
        // TODO add your handling code here:
         HistChart1 demo = new HistChart1( "National Roles",ecosystem );  
      demo.setSize( 700,700);    
      RefineryUtilities.centerFrameOnScreen( demo );   
      demo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      demo.setVisible( true ); 
    }//GEN-LAST:event_jRolesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnCustomer1;
    private javax.swing.JButton btnEpayManager;
    private javax.swing.JButton btnExpressManager;
    private javax.swing.JButton btnFeedbacker;
    private javax.swing.JButton btnSeller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jRoles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSelling;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtNetwork;
    // End of variables declaration//GEN-END:variables
}
