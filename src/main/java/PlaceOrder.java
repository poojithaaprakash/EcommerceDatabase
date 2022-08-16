
import DbOperations.InsertUdateDelete;
import DbOperations.ProductDao;
import DbOperations.Products;
import DbOperations.Select;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
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
public class PlaceOrder extends javax.swing.JFrame {

    public int grandTotal = 0;
    public int productPrice = 0;

    public int productTotal = 0;
    public String userEmail;
    public long CID[];

    public PlaceOrder() {
        initComponents();
    }

    public PlaceOrder(String Email) {
        initComponents();
        txtProPrice.setEditable(false);
        txtProTotal.setEditable(false);
        btnAddToCart.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) SpinnerQuantity.getEditor()).getTextField();
        tf.setEditable(false);
        userEmail = Email;
        CID = new long[100];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SpinnerQuantity = new javax.swing.JSpinner();
        txtProPrice = new javax.swing.JTextField();
        txtProTotal = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        txtCName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        finalProductView = new javax.swing.JTable();
        lblGrandTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsAval = new javax.swing.JTable();
        txtChocolateName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtOrderDate = new javax.swing.JTextField();
        btnBuyNow = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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
        jLabel1.setText("Place Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(157, 83, 83));
        jLabel2.setText("Customer Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, -60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(157, 83, 83));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(157, 83, 83));
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(157, 83, 83));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(157, 83, 83));
        jLabel7.setText("Chocolate Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(157, 83, 83));
        jLabel8.setText("Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(157, 83, 83));
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(157, 83, 83));
        jLabel10.setText("Total");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        SpinnerQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SpinnerQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerQuantityStateChanged(evt);
            }
        });
        getContentPane().add(SpinnerQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 169, -1));

        txtProPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtProPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 169, -1));

        txtProTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtProTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 169, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 145, -1));

        txtMobileNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 145, -1));

        txtCName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 145, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(157, 83, 83));
        jLabel11.setText("Place Your Order Here");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(157, 83, 83));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 30, -1, -1));

        btnClear.setBackground(new java.awt.Color(157, 83, 83));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 121, -1));

        btnAddToCart.setBackground(new java.awt.Color(157, 83, 83));
        btnAddToCart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddToCart.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, -1));

        finalProductView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chocolate Name", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        finalProductView.setSelectionBackground(new java.awt.Color(157, 83, 83));
        jScrollPane2.setViewportView(finalProductView);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 490, 200));

        lblGrandTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGrandTotal.setForeground(new java.awt.Color(157, 83, 83));
        lblGrandTotal.setText("000 ");
        getContentPane().add(lblGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, -1, -1));

        ProductsAval.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductsAval.setSelectionBackground(new java.awt.Color(157, 83, 83));
        ProductsAval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsAvalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsAval);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 300, 390));

        txtChocolateName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtChocolateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 170, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(157, 83, 83));
        jLabel12.setText("Order Date");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(157, 83, 83));
        jLabel13.setText("Customer Details");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(157, 83, 83));
        jLabel14.setText("Grand Total Rs.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, -1));

        txtOrderDate.setText("YYYY- DD- MM");
        getContentPane().add(txtOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 170, -1));

        btnBuyNow.setBackground(new java.awt.Color(157, 83, 83));
        btnBuyNow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuyNow.setForeground(new java.awt.Color(255, 255, 255));
        btnBuyNow.setText("Buy Now");
        btnBuyNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyNowActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuyNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 540, -1, -1));

        btnExit.setBackground(new java.awt.Color(157, 83, 83));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 30, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\Java-Projects\\ChocolateDatabase\\src\\main\\java\\images\\TEMP-FINAL.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumberActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtChocolateName.setText("");
        txtProPrice.setText("");
        SpinnerQuantity.setValue(1);
        txtProTotal.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new Home(userEmail).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
//        Date Display        
//        SimpleDateFormat dFormart = new SimpleDateFormat("yyyy-mm-dd");
//        Date date = new Date();
//        String todayDate = dFormart.format(date);
//        lblOrderDate.setText(todayDate);

////CID Display
//String Cname=txtName.getText();
//String query=("select CID from customer where Cname='"+Cname+"'");
//ResultSet CID=Select.getData(query);
//        String Cname = txtName.getText();
//        labelChocoID.setText(Select.getCID(Cname));
        DefaultTableModel dtm = (DefaultTableModel) ProductsAval.getModel();
        ArrayList<Products> productlist = null;
        try {
            productlist = ProductDao.getAllRecords();
        } catch (SQLException ex) {
            Logger.getLogger(ViewUpdateDeleteProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        Iterator<Products> itr = productlist.iterator();
        while (itr.hasNext()) {
            Products productObj = itr.next();
            dtm.addRow(new Object[]{
                productObj.getChocoName()});

        }
    }//GEN-LAST:event_formComponentShown

    private void ProductsAvalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsAvalMouseClicked
        int index = ProductsAval.getSelectedRow();
        TableModel model = ProductsAval.getModel();
        String ChocoName = model.getValueAt(index, 0).toString();
        Products product = ProductDao.getProductByName(ChocoName);
        txtChocolateName.setText(ChocoName);
        txtProPrice.setText(product.getPrice());
        SpinnerQuantity.setValue(1);
        txtProTotal.setText(product.getPrice());
        productPrice = Integer.parseInt(product.getPrice());
        productTotal = Integer.parseInt(product.getPrice());
        btnAddToCart.setEnabled(true);
    }//GEN-LAST:event_ProductsAvalMouseClicked

    private void SpinnerQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerQuantityStateChanged
        int quantity = (Integer) SpinnerQuantity.getValue();
        if (quantity <= 1) {
            SpinnerQuantity.setValue(1);
            quantity = 1;
        }
        productTotal = productPrice * quantity;
        txtProTotal.setText(String.valueOf(productTotal));
    }//GEN-LAST:event_SpinnerQuantityStateChanged

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
//CID Display
//String Cname=txtName.getText();
//String CIDquery=("select CID from customer where Email_ID='"+userEmail+"'");
//ResultSet CID=Select.getData(CIDquery);

        String price = txtProPrice.getText();
        String total = txtProTotal.getText();
        String name = txtChocolateName.getText();
        String Price = txtProPrice.getText();
        String quantity = String.valueOf(SpinnerQuantity.getValue());
        DefaultTableModel dtm = (DefaultTableModel) finalProductView.getModel();
        dtm.addRow(new Object[]{name, Price, quantity, productTotal});
        grandTotal = grandTotal + productTotal;
        lblGrandTotal.setText(String.valueOf(grandTotal));
//        String query;
//        query = "INSERT INTO ORDERS VALUES ('"+CID+"','OrderID','" + BillID + "','" + OrderDate + "','" + quantity + "','" + price + "','" + grandTotal + "')";
//        InsertUdateDelete.setData(query, "Product Added to Cart Successfully!");
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnBuyNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyNowActionPerformed
        String OrderDate = txtOrderDate.getText();
        String Quantity = String.valueOf(SpinnerQuantity.getValue());
        String Price = txtProPrice.getText();
        String TotalAmt = lblGrandTotal.getText();
        String CName = txtCName.getText();
        String ChocoName = txtChocolateName.getText();
        String MobileNumber = txtMobileNumber.getText();
        String Address = txtAddress.getText();

        ResultSet rs = Select.getData("select * from customer where Cname LIKE '%" + CName + "%'");
        ResultSet rst = Select.getData("select * from products where ChocoName LIKE '%" + ChocoName + "%'");
        try {
            while (rs.next() && rst.next()) {
                String query;
                query = "INSERT INTO ORDERS VALUES ('" + rs.getString(1) + "','" + rst.getString(1) + "',OrderID,'" + OrderDate + "','" + Quantity + "','" + Price + "','" + TotalAmt + "')";
                InsertUdateDelete.setData(query, "order placed Successfully!");

                InsertUdateDelete.setData("UPDATE PRODUCTS  SET Stock= stock-'"+Quantity+"' where  ChocoName='" + ChocoName + "'", "Stock updated");

//                String ChocoSelectquery;
//                ChocoSelectquery = "INSERT INTO chocoselects VALUES ('" + rs.getString(1) + "','" + rst.getString(1) + "')";
//                InsertUdateDelete.setData(ChocoSelectquery, "updated Successfully!");
                setVisible(false);
                new PlaceOrder().setVisible(true);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

//        try {
//            while (rst.next()) {
//                String ChocoSelectquery;
//                ChocoSelectquery = "INSERT INTO Selects VALUES ('" + rst.getString(1) + "','" + rst.getString(2) + "')";
//                InsertUdateDelete.setData(ChocoSelectquery, "updated Successfully!");
//                setVisible(false);
//                new PlaceOrder().setVisible(true);
//            }
//            rs.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        if (CName.equals("") || MobileNumber.equals("") || Address.equals("")) {
//            JOptionPane.showMessageDialog(null, "Every Field is required");
//        } else {
//            String query;
//            query = "INSERT INTO ORDERS VALUES ('" + CID + "',OrderID,'" + OrderDate + "','" + Quantity + "','" + Price + "','" + TotalAmt + "')";
//            InsertUdateDelete.setData(query, "order placed");
//        }
    }//GEN-LAST:event_btnBuyNowActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setVisible(false);
        new Home().setVisible(true);
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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductsAval;
    private javax.swing.JSpinner SpinnerQuantity;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBuyNow;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JTable finalProductView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtChocolateName;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtProPrice;
    private javax.swing.JTextField txtProTotal;
    // End of variables declaration//GEN-END:variables
}
