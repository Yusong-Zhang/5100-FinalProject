/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 13522
 */
public class CustomerMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerMainJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    private Network net;
   
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerMainJPanel(JPanel userProcessContainer,Network net,EcoSystem system, UserAccount useraccount) {
        initComponents();
//        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.net= net;
        this.useraccount = useraccount;
//        lblCustomerName.setText(((u.getEmployee() != null) ? u.getEmployee().getName() : u.getUsername()) + "!");
//        //valueLabel.setText(enterprise.getName());
//        wq.getRequestList();
        
          
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuy = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnBuy.setText("BuyBuyBuy!");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnHistory.setText("View History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit own profile");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(179, 179, 179))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuy)
                        .addComponent(btnHistory))
                    .addContainerGap(189, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(btnBack)
                    .addContainerGap(391, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBack)
                .addGap(63, 63, 63)
                .addComponent(btnBuy)
                .addGap(34, 34, 34)
                .addComponent(btnHistory)
                .addGap(36, 36, 36)
                .addComponent(btnEdit)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new EpaymentJPanel(userProcessContainer,net,system,useraccount));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
       CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new HistoryOrderJPanel(userProcessContainer,system,useraccount,net));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
         Customer c= new Customer();
        for(Customer customer: net.getCustomerDirectory().getCustomersList()){
            if(customer.getUserAccount().equals(useraccount)){
                c= customer;
            }
        }
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageCustomerInformationJPanel(userProcessContainer,c,net));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHistory;
    // End of variables declaration//GEN-END:variables
}
