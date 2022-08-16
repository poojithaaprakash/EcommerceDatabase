
import DbOperations.InsertUdateDelete;
import DbOperations.ProductDao;
import DbOperations.Products;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;


public class ViewUpdateDeleteProducts extends javax.swing.JFrame {

    
    public ViewUpdateDeleteProducts() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelManageCategory = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        labelChocoID = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtChocoName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelManageCategory.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelManageCategory.setForeground(new java.awt.Color(157, 83, 83));
        labelManageCategory.setText("VIEW UPDATE DELETE PRODUCTS");
        getContentPane().add(labelManageCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        btnExit.setBackground(new java.awt.Color(157, 83, 83));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 83, 83));
        jLabel1.setText("VIEW HERE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 117, 29));

        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chocolate ID", "Chocolate Name", "Price", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detailsTable.setSelectionBackground(new java.awt.Color(157, 83, 83));
        detailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(detailsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 660, 390));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(157, 83, 83));
        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(157, 83, 83));
        jLabel6.setText("Chocolate Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(157, 83, 83));
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(157, 83, 83));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 300, -1));

        labelChocoID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelChocoID.setForeground(new java.awt.Color(157, 83, 83));
        labelChocoID.setText("00");
        getContentPane().add(labelChocoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 110, -1));

        btnClear.setBackground(new java.awt.Color(157, 83, 83));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 100, -1));

        btnDelete.setBackground(new java.awt.Color(157, 83, 83));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 100, -1));

        btnUpdate.setBackground(new java.awt.Color(157, 83, 83));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(157, 83, 83));
        jLabel2.setText("Stock");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        txtStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtStock.setForeground(new java.awt.Color(157, 83, 83));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 300, -1));

        txtChocoName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtChocoName.setForeground(new java.awt.Color(157, 83, 83));
        getContentPane().add(txtChocoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 300, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Java-Projects\\ChocolateDatabase\\src\\main\\java\\images\\TEMP-FINAL.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String chocoID = labelChocoID.getText();
        String ChocoName = txtChocoName.getText();
        String price = txtPrice.getText();
        String stock = txtStock.getText();
        String query;
        query = "DELETE FROM PRODUCTS WHERE ChocoName='" + ChocoName + "'";
        InsertUdateDelete.setData(query, "Product Deleted Successfully!");
        setVisible(false);
        new ViewUpdateDeleteProducts().setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String chocoID = labelChocoID.getText();
        String ChocoName = txtChocoName.getText();
        String price = txtPrice.getText();
        String stock = txtStock.getText();
        String query;
        query = "UPDATE PRODUCTS  SET Stock='" + stock + "' where  ChocoName='" + ChocoName + "'";
        InsertUdateDelete.setData(query, "Product Updated Successfully!");
        setVisible(false);
        new ViewUpdateDeleteProducts().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtChocoName.getText();
        txtPrice.setText("");
        txtStock.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel dtm = (DefaultTableModel) detailsTable.getModel();
        ArrayList<Products> productlist = null;
        try {
            productlist = ProductDao.getAllRecords();
        } catch (SQLException ex) {
            Logger.getLogger(ViewUpdateDeleteProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        Iterator<Products> itr = productlist.iterator();
        while (itr.hasNext()) {
            Products productObj = itr.next();
            dtm.addRow(new Object[]{productObj.getChocoID(),
                productObj.getChocoName(),
                productObj.getPrice(),
                productObj.getStock()

            });

        }

    }//GEN-LAST:event_formComponentShown

    private void detailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsTableMouseClicked
        int index = detailsTable.getSelectedRow();
        TableModel model = detailsTable.getModel();
        String ID = model.getValueAt(index, 0).toString();
        labelChocoID.setText(ID);
        String ChocoName = model.getValueAt(index, 1).toString();
        txtChocoName.setText(ChocoName);
        String Price = model.getValueAt(index, 2).toString();
        txtPrice.setText(Price);
        String Stock = model.getValueAt(index, 3).toString();
        txtStock.setText(Stock);

        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);


    }//GEN-LAST:event_detailsTableMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateDeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateDeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateDeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateDeleteProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUpdateDeleteProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelChocoID;
    private javax.swing.JLabel labelManageCategory;
    private javax.swing.JTextField txtChocoName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
