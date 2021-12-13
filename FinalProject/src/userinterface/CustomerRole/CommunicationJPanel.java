/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.CustomerOrder.BuyOrderItem;
import Business.EcoSystem;
import Business.Item.Item;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author 13522
 */
public class CommunicationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunicationJPanel
     */
   JPanel userProcessContainer;
    UserAccount account;
    BuyOrderItem item;
    public CommunicationJPanel(JPanel userProcessContainer, UserAccount account,BuyOrderItem item) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.item = item;
        
        populateChatRecord();
    }
    
    public void populateChatRecord(){
        String chatRecord = "";
        for(int i=0;i<item.getFeedbackends().size();i++){
             chatRecord=chatRecord +item.getFeedbackends().get(i)+"\r\n";
        }
           
           
        
        txtChatRecord.setLineWrap(true);
        txtChatRecord.setWrapStyleWord(true);
        txtChatRecord.setText(chatRecord);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    
                                   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtChatRecord = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChatBox = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtChatRecord.setColumns(20);
        txtChatRecord.setRows(5);
        txtChatRecord.setEnabled(false);
        jScrollPane1.setViewportView(txtChatRecord);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 228, 397));

        txtChatBox.setColumns(20);
        txtChatBox.setRows(5);
        jScrollPane2.setViewportView(txtChatBox);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 220, -1));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Chat BOX:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("History Chat:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/B.jpg"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String word = txtChatBox.getText();
        String message =account.getUsername() + " : " + word;
        item.getFeedbackends().add(message);
        txtChatBox.setText("");
        populateChatRecord();
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtChatBox;
    private javax.swing.JTextArea txtChatRecord;
    // End of variables declaration//GEN-END:variables
}