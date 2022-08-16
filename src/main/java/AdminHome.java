
import javax.swing.JOptionPane;
import DbOperations.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdminHome extends javax.swing.JFrame {
    
    public AdminHome() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomerDetails = new javax.swing.JTable();
        btnManageProducts = new javax.swing.JButton();
        btnAddNewProducts = new javax.swing.JButton();
        btnViewOrderDetails = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 83, 83));
        jLabel1.setText("ADMIN HOME PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 370, 70));

        btnLogout.setBackground(new java.awt.Color(157, 83, 83));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1132, 36, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(157, 83, 83));
        jLabel2.setText("Search By Name to Delete or View");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 285, 262, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 412, -1));

        jButton1.setBackground(new java.awt.Color(157, 83, 83));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 90, -1));

        jButton2.setBackground(new java.awt.Color(157, 83, 83));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, -1));

        tableCustomerDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "CName", "Email ID", "Mobile Number", "Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCustomerDetails.setSelectionBackground(new java.awt.Color(157, 83, 83));
        tableCustomerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomerDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 910, 320));

        btnManageProducts.setBackground(new java.awt.Color(157, 83, 83));
        btnManageProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProducts.setText("View, Delete and Update Products");
        btnManageProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductsActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 310, -1));

        btnAddNewProducts.setBackground(new java.awt.Color(157, 83, 83));
        btnAddNewProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddNewProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewProducts.setText("Add New Product");
        btnAddNewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewProductsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddNewProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 208, 320, -1));

        btnViewOrderDetails.setBackground(new java.awt.Color(157, 83, 83));
        btnViewOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewOrderDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrderDetails.setText("View Order Details");
        btnViewOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 208, 317, -1));

        btnDeleteCustomer.setBackground(new java.awt.Color(157, 83, 83));
        btnDeleteCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCustomer.setText("Delete the Customer");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        jButton3.setBackground(new java.awt.Color(157, 83, 83));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View & Add Courier Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 310, -1));

        jLabel3.setBackground(new java.awt.Color(157, 83, 83));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Java-Projects\\ChocolateDatabase\\src\\main\\java\\images\\TEMP-FINAL.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs = Select.getData("select * from customer");
        DefaultTableModel model = (DefaultTableModel) tableCustomerDetails.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7)});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String NameOrEmail = txtName.getText();
        ResultSet rs = Select.getData("select * from customer where Cname LIKE '%" + NameOrEmail + "%' or Email_ID LIKE '%" + NameOrEmail + "%'");
        DefaultTableModel model = (DefaultTableModel) tableCustomerDetails.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getString(7)});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableCustomerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerDetailsMouseClicked
        int index = tableCustomerDetails.getSelectedRow();
        TableModel model = tableCustomerDetails.getModel();
        String email = model.getValueAt(index, 2).toString();
        String status = model.getValueAt(index, 5).toString();
        if (status.equals("true")) {
            status = "false";
        } else {
            status = "true";
        }
        try {
            int a = JOptionPane.showConfirmDialog(null, "Do you want to change the status of " + email + "", "Select", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                InsertUdateDelete.setData("update customer set Status='" + status + "' where Email_ID='" + email + "'", "Status Changed Successfully");
                setVisible(false);
                new AdminHome().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_tableCustomerDetailsMouseClicked

    private void btnManageProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductsActionPerformed
        setVisible(false);
        new ViewUpdateDeleteProducts().setVisible(true);
    }//GEN-LAST:event_btnManageProductsActionPerformed

    private void btnAddNewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewProductsActionPerformed
        setVisible(true);
        new AddNewProducts().setVisible(true);
    }//GEN-LAST:event_btnAddNewProductsActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
//        String chocoID = labelChocoID.getText();
        String CName = txtName.getText();
//        String price = txtPrice.getText();
//        String stock = txtStock.getText();
        String query;
        query = "DELETE FROM CUSTOMER WHERE Cname='" + CName + "'";
        InsertUdateDelete.setData(query, "Customer Deleted Successfully!");
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnViewOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderDetailsActionPerformed
        setVisible(false);
        new AdminViewOrderDetails().setVisible(true);
    }//GEN-LAST:event_btnViewOrderDetailsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
new Courier().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewProducts;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageProducts;
    private javax.swing.JButton btnViewOrderDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomerDetails;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
