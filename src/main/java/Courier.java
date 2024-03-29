
import DbOperations.InsertUdateDelete;
import DbOperations.Products;
import DbOperations.Select;
import java.sql.*;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Courier extends javax.swing.JFrame {

    /**
     * Creates new form Courier
     */
    public Courier() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtOrderID = new javax.swing.JTextField();
        txtCourierID = new javax.swing.JTextField();
        txtCourierName = new javax.swing.JTextField();
        txtCourierPNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourierDetailsTble = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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
        jLabel1.setText("Couriers");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(157, 83, 83));
        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(157, 83, 83));
        jLabel3.setText("Courier Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(157, 83, 83));
        jLabel4.setText("Courier ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(157, 83, 83));
        jLabel5.setText("Courier Phone Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(157, 83, 83));
        jLabel6.setText("Order ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        txtCustomerID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCustomerID.setForeground(new java.awt.Color(157, 83, 83));
        txtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 200, -1));

        txtOrderID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOrderID.setForeground(new java.awt.Color(157, 83, 83));
        getContentPane().add(txtOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 200, -1));

        txtCourierID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCourierID.setForeground(new java.awt.Color(157, 83, 83));
        txtCourierID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourierIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCourierID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 200, -1));

        txtCourierName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCourierName.setForeground(new java.awt.Color(157, 83, 83));
        getContentPane().add(txtCourierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 200, -1));

        txtCourierPNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCourierPNumber.setForeground(new java.awt.Color(157, 83, 83));
        getContentPane().add(txtCourierPNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 200, -1));

        btnAdd.setBackground(new java.awt.Color(157, 83, 83));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 133, -1));

        CourierDetailsTble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Order ID", "Courier ID", "Courier Name", "Courier PNumber", "Delivery Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CourierDetailsTble.setColumnSelectionAllowed(true);
        CourierDetailsTble.setSelectionBackground(new java.awt.Color(157, 83, 83));
        CourierDetailsTble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourierDetailsTbleMouseClicked(evt);
            }
        });
        CourierDetailsTble.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CourierDetailsTbleComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(CourierDetailsTble);
        CourierDetailsTble.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 590, 410));

        jButton1.setBackground(new java.awt.Color(157, 83, 83));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\Java-Projects\\ChocolateDatabase\\src\\main\\java\\images\\TEMP-FINAL.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIDActionPerformed

    private void txtCourierIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourierIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourierIDActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String CID = txtCustomerID.getText();
        String OrderID = txtOrderID.getText();
        String CourierID = txtCourierID.getText();
        String CourierName = txtCourierName.getText();
        String CourierPhoneNumber = txtCourierPNumber.getText();
        if (CID.equals("") || OrderID.equals("") || CourierID.equals("") || CourierName.equals("") || CourierPhoneNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Every Field is required");
        } else {
            ResultSet rs = Select.getData("select * from orders where OrderID LIKE '%" + OrderID + "%'");
            try {
                while (rs.next()) {
                    String query;
                    query = "INSERT INTO Courier VALUES ('" + rs.getString(1) + "','" + rs.getString(3) + "','" + CourierID + "','" + CourierName + "','" + CourierPhoneNumber + "','Not Delivered')";
                    InsertUdateDelete.setData(query, "Courier Details Added Successfully!");
                    setVisible(false);
                    new Courier().setVisible(true);
                }
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs = Select.getData("select * from courier");
        DefaultTableModel model = (DefaultTableModel) CourierDetailsTble.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6)});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void CourierDetailsTbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourierDetailsTbleMouseClicked
        int index = CourierDetailsTble.getSelectedRow();
        TableModel model = CourierDetailsTble.getModel();
        String CourierID = model.getValueAt(index, 2).toString();
        String status = model.getValueAt(index, 5).toString();
        if (status.equals("Delivered")) {
            status = "Not Delivered";
        } else {
            status = "Delivered";
        }
        try {
            int a = JOptionPane.showConfirmDialog(null, "Do you want to change the status of " + CourierID + "", "Select", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                InsertUdateDelete.setData("update Courier set DeliveryStatus='" + status + "' where CourierID='" + CourierID + "'", "Status Changed Successfully");
                setVisible(false);
                new Courier().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CourierDetailsTbleMouseClicked

    private void CourierDetailsTbleComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CourierDetailsTbleComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_CourierDetailsTbleComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CourierDetailsTble;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCourierID;
    private javax.swing.JTextField txtCourierName;
    private javax.swing.JTextField txtCourierPNumber;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtOrderID;
    // End of variables declaration//GEN-END:variables
}
