/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;


import Business.Item.Comment;
import Business.Item.Item;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TT1
 */
public class DetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DetailsJPanel
     */
    JPanel userProcessContainer;
    Item item;
    public DetailsJPanel(JPanel userProcessContainer,Item item) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.item = item;
        txtGood.setText(item.getItemName());
        txtPrice.setText(String.valueOf(item.getPrice()));
        txtSeller.setText(item.getSeller().getName());
        txtPosition.setText(item.getSeller().getAddress());
        txtQuantity.setText(String.valueOf(item.getQuantity()));
        txtDescrip.setText(item.getDiscribe());
        
        int rowCount = commentTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)commentTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Comment comment: item.getComments().getCommentList()){
            Object row[] = new Object[4];
            row[0] = comment.getBuyer();
            row[1] = comment.getScore();
            row[2] = comment.getDate();
            row[3] = comment.getWord();

            model.addRow(row);
        }  
        
        if(item.getImagePath()!=null){
//            ImageIcon photo = new ImageIcon(item.getImagePath());
//            Image image = photo.getImage();
//            image = image.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
//            lblImage.setIcon(new ImageIcon(image));
    Image im=Toolkit.getDefaultToolkit().createImage(item.getImagePath());// Returns an image which gets pixel data from the specified file.
        im=im.getScaledInstance(250, 200, Image.SCALE_SMOOTH);//Creates a scaled version of this image.
        ImageIcon ii=new ImageIcon(im);//Creates an uninitialized image icon.
        lblImage.setIcon(ii);
        }
        else{
            lblImage.setText("No picture!");
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

        txtSeller = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGood = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSeller.setEnabled(false);
        add(txtSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 192, 300, -1));

        jLabel6.setText("Seller:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 197, -1, -1));

        jLabel4.setText("Item:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 109, -1, -1));

        txtGood.setEnabled(false);
        add(txtGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 104, 300, -1));

        txtPrice.setEnabled(false);
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 148, 300, -1));

        jLabel5.setText("Price:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 153, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setText("More Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 31, 366, -1));

        btnBack.setText("< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 241, -1, -1));

        txtPosition.setEnabled(false);
        add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 236, 300, -1));

        jLabel8.setText("Inventory:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 285, -1, -1));

        txtQuantity.setEnabled(false);
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 280, 300, -1));

        jLabel2.setText("Comments:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel9.setText("Image:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lblImage.setText("jLabel3");
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 250, 200));

        commentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Buyer", "Score", "Date", "Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(commentTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 758, 138));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        jLabel12.setText("descrip:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 329, -1, -1));

        txtDescrip.setEnabled(false);
        add(txtDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 324, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable commentTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtGood;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSeller;
    // End of variables declaration//GEN-END:variables
}