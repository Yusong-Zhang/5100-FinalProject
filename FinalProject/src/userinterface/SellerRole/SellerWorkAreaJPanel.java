

package userinterface.SellerRole;


import Business.EcoSystem;
import Business.Network.Network;
import Business.Seller.Seller;
import Business.Tools.PieChart1;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.ui.RefineryUtilities;
import userinterface.SystemAdminWorkArea.ManageExpressJPanel;

public class SellerWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    
    Network net;
    
    EcoSystem system;
    UserAccount useraccount;
 
    public SellerWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system,Network net, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.net= net;
        this.system=system;
        this.useraccount = useraccount;
        
        
         
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnShowChart = new javax.swing.JButton();
        btnManageProductManager = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnManagePriceManager = new javax.swing.JButton();
        btnManageSellerInfo1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Seller Manager Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        btnShowChart.setFont(new java.awt.Font("宋体", 0, 13)); // NOI18N
        btnShowChart.setText("Show Selling Chart");
        btnShowChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowChartActionPerformed(evt);
            }
        });
        add(btnShowChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 200, -1));

        btnManageProductManager.setFont(new java.awt.Font("宋体", 0, 13)); // NOI18N
        btnManageProductManager.setText("Manage Product Manager");
        btnManageProductManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductManagerActionPerformed(evt);
            }
        });
        add(btnManageProductManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 200, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Function :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 120, 30));

        btnManagePriceManager.setFont(new java.awt.Font("宋体", 0, 13)); // NOI18N
        btnManagePriceManager.setText("Manage Price Manager");
        btnManagePriceManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePriceManagerActionPerformed(evt);
            }
        });
        add(btnManagePriceManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 200, -1));

        btnManageSellerInfo1.setFont(new java.awt.Font("宋体", 0, 13)); // NOI18N
        btnManageSellerInfo1.setText("Manage Seller Info");
        btnManageSellerInfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSellerInfo1ActionPerformed(evt);
            }
        });
        add(btnManageSellerInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 200, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/EBack.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowChartActionPerformed
      
      PieChart1 demo = new PieChart1( "Customer Preference",system,net,useraccount );  
      demo.setSize( 700,700);    
      RefineryUtilities.centerFrameOnScreen( demo );   
      demo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      demo.setVisible( true ); 
      
    }//GEN-LAST:event_btnShowChartActionPerformed

    private void btnManageProductManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductManagerActionPerformed
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageProductManagerJPanel(userProcessContainer,net,system,useraccount));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProductManagerActionPerformed

    private void btnManagePriceManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePriceManagerActionPerformed
       
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManagerPriceManagerJPanel(userProcessContainer,net,system,useraccount));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePriceManagerActionPerformed

    private void btnManageSellerInfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSellerInfo1ActionPerformed
      
     CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ManageSellerInfoJPanel(userProcessContainer,net,system,useraccount));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSellerInfo1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManagePriceManager;
    private javax.swing.JButton btnManageProductManager;
    private javax.swing.JButton btnManageSellerInfo1;
    private javax.swing.JButton btnShowChart;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    // End of variables declaration//GEN-END:variables
    
}
