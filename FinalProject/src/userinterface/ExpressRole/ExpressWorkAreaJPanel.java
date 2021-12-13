package userinterface.ExpressRole;


import userinterface.SellerRole.*;
import Business.EcoSystem;
import Business.Express.ExpressManager;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class ExpressWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    
    Network net;
    UserAccount useraccount;
    EcoSystem system;
    ExpressManager expressmanager;
    
    public ExpressWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system,Network net, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
        this.net= net;
        this.useraccount=useraccount;
        this.system=system;
        this.expressmanager = expressmanager;
        for(ExpressManager em: net.getExpressManagerDir().getExpressManagerList()){
            if(em.getUseraccount().equals(useraccount)){
                expressmanager = em;
            }
    }
    }
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        manageEmployeeJButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Express Manager Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        userJButton.setText("Manage Express Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 170, 50));

        manageOrganizationJButton.setText("Manage Transport");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, 50));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Function:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 120, 30));

        manageEmployeeJButton1.setText("Manage Deliveryman");
        manageEmployeeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButton1ActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 170, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageExpressInfoJPanel(userProcessContainer,net,system, useraccount,expressmanager));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageTransportJPanel(userProcessContainer,net,system,useraccount,expressmanager));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButton1ActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageDeliveryManJPanel(userProcessContainer,net,system, useraccount,expressmanager));
        layout.next(userProcessContainer);        
    }//GEN-LAST:event_manageEmployeeJButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JButton manageEmployeeJButton1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
    
}
