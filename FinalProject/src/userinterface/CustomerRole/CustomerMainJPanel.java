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
        jLabel17 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(886, 345));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuy.setText("BuyBuyBuy!");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, 60));

        btnHistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHistory.setText("View History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });
        add(btnHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 190, 60));

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEdit.setText("Edit own profile");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 190, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/B.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 630));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHistory;
    private javax.swing.JLabel jLabel17;
    // End of variables declaration//GEN-END:variables
}
